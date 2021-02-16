package gov.tn.dhs.opa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class WSSEHandler implements SOAPHandler <SOAPMessageContext> {
    private static String WSSE_NAMESPACE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static String PASSWORD_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";
    private static String NAMESPACE_PREFIX = "wss";

    private Logger logger = LoggerFactory.getLogger(WSSEHandler.class);

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        //only handle outbound requests
        boolean isRequest = (boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (isRequest) {
            try {

                SOAPMessage soapMessage = context.getMessage();
                SOAPPart soapPart = soapMessage.getSOAPPart();
                SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
                logger.info(soapEnvelope.toString());
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.addHeader();

                SOAPElement security = header.addChildElement("Security", NAMESPACE_PREFIX, WSSE_NAMESPACE);
                SOAPElement token = security.addChildElement("UsernameToken", NAMESPACE_PREFIX, WSSE_NAMESPACE);

                SOAPElement username = token.addChildElement("Username", NAMESPACE_PREFIX, WSSE_NAMESPACE);
                username.addTextNode("devapi"); //replace with actual username

                SOAPElement password = token.addChildElement("Password", NAMESPACE_PREFIX, WSSE_NAMESPACE);
                token.addChildElement(password);
                password.setAttribute("Type", PASSWORD_TYPE);
                password.addTextNode("976DyY#q"); //replace with actual password

            } catch (SOAPException ex) {
                throw new RuntimeException("Error adding WS-Security Token: " + ex.getMessage(), ex);
            }
        }

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
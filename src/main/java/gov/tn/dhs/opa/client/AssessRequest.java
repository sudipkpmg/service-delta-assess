
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An assess-request contains an optional config node and a mandatory global-instance node.
 * 
 * &lt;p&gt;Java class for AssessRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AssessRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="config" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AssessmentConfiguration" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="global-instance" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}GlobalInstanceType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessRequest", propOrder = {
    "config",
    "globalInstance"
})
public class AssessRequest {

    protected AssessmentConfiguration config;
    @XmlElement(name = "global-instance", required = true)
    protected GlobalInstanceType globalInstance;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentConfiguration }
     *     
     */
    public AssessmentConfiguration getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentConfiguration }
     *     
     */
    public void setConfig(AssessmentConfiguration value) {
        this.config = value;
    }

    /**
     * Gets the value of the globalInstance property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalInstanceType }
     *     
     */
    public GlobalInstanceType getGlobalInstance() {
        return globalInstance;
    }

    /**
     * Sets the value of the globalInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalInstanceType }
     *     
     */
    public void setGlobalInstance(GlobalInstanceType value) {
        this.globalInstance = value;
    }

}

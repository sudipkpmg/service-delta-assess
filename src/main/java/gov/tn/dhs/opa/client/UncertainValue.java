
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to indicate the uncertain value for attribute values (and change points) provided to and returned from an Assess action. Unlike unknown, uncertain is considered a value, and prevents any further attempts to ask for or determine a value of that attribute.
 * Uncertain is most often used when a question has been asked of a real person, and the response is given that no answer is available. For example, if the question is "have you been vaccinated against measles" and the answer is "I don't know" you might use the uncertain value to indicate that the individual has neither definitely been vaccinated nor definitely not been vaccinated against measles.
 * 
 * &lt;p&gt;Java class for UncertainValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UncertainValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UncertainValue")
public class UncertainValue {


}

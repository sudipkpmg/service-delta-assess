
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Configuration of how outcomes in an entity should be included in the response for an Assess action.
 * 
 * &lt;p&gt;Java class for OutcomeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OutcomeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="outcome-style" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}OutcomeStyleEnum" /&amp;gt;
 *       &amp;lt;attribute name="unknown-outcome-style" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}OutcomeStyleEnum" /&amp;gt;
 *       &amp;lt;attribute name="known-outcome-style" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}OutcomeStyleEnum" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutcomeType")
public class OutcomeType {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "outcome-style")
    protected OutcomeStyleEnum outcomeStyle;
    @XmlAttribute(name = "unknown-outcome-style")
    protected OutcomeStyleEnum unknownOutcomeStyle;
    @XmlAttribute(name = "known-outcome-style")
    protected OutcomeStyleEnum knownOutcomeStyle;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the outcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getOutcomeStyle() {
        return outcomeStyle;
    }

    /**
     * Sets the value of the outcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setOutcomeStyle(OutcomeStyleEnum value) {
        this.outcomeStyle = value;
    }

    /**
     * Gets the value of the unknownOutcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getUnknownOutcomeStyle() {
        return unknownOutcomeStyle;
    }

    /**
     * Sets the value of the unknownOutcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setUnknownOutcomeStyle(OutcomeStyleEnum value) {
        this.unknownOutcomeStyle = value;
    }

    /**
     * Gets the value of the knownOutcomeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public OutcomeStyleEnum getKnownOutcomeStyle() {
        return knownOutcomeStyle;
    }

    /**
     * Sets the value of the knownOutcomeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeStyleEnum }
     *     
     */
    public void setKnownOutcomeStyle(OutcomeStyleEnum value) {
        this.knownOutcomeStyle = value;
    }

}

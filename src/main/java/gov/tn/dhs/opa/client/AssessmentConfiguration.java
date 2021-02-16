
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Configuration information for an Assess action.
 * 
 * &lt;p&gt;Java class for AssessmentConfiguration complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AssessmentConfiguration"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="show-silent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="show-invisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="show-properties" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="show-events" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="resolve-indecision-relationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="show-version" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="outcome" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ResponseOutcome" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentConfiguration", propOrder = {
    "showSilent",
    "showInvisible",
    "showProperties",
    "showEvents",
    "resolveIndecisionRelationships",
    "showVersion",
    "outcome"
})
public class AssessmentConfiguration {

    @XmlElement(name = "show-silent")
    protected Boolean showSilent;
    @XmlElement(name = "show-invisible")
    protected Boolean showInvisible;
    @XmlElement(name = "show-properties")
    protected Boolean showProperties;
    @XmlElement(name = "show-events")
    protected Boolean showEvents;
    @XmlElement(name = "resolve-indecision-relationships")
    protected Boolean resolveIndecisionRelationships;
    @XmlElement(name = "show-version")
    protected Boolean showVersion;
    protected ResponseOutcome outcome;

    /**
     * Gets the value of the showSilent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSilent() {
        return showSilent;
    }

    /**
     * Sets the value of the showSilent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSilent(Boolean value) {
        this.showSilent = value;
    }

    /**
     * Gets the value of the showInvisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowInvisible() {
        return showInvisible;
    }

    /**
     * Sets the value of the showInvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowInvisible(Boolean value) {
        this.showInvisible = value;
    }

    /**
     * Gets the value of the showProperties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowProperties() {
        return showProperties;
    }

    /**
     * Sets the value of the showProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowProperties(Boolean value) {
        this.showProperties = value;
    }

    /**
     * Gets the value of the showEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowEvents() {
        return showEvents;
    }

    /**
     * Sets the value of the showEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEvents(Boolean value) {
        this.showEvents = value;
    }

    /**
     * Gets the value of the resolveIndecisionRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResolveIndecisionRelationships() {
        return resolveIndecisionRelationships;
    }

    /**
     * Sets the value of the resolveIndecisionRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolveIndecisionRelationships(Boolean value) {
        this.resolveIndecisionRelationships = value;
    }

    /**
     * Gets the value of the showVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowVersion() {
        return showVersion;
    }

    /**
     * Sets the value of the showVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowVersion(Boolean value) {
        this.showVersion = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseOutcome }
     *     
     */
    public ResponseOutcome getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseOutcome }
     *     
     */
    public void setOutcome(ResponseOutcome value) {
        this.outcome = value;
    }

}

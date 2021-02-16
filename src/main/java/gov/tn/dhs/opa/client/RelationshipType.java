
package gov.tn.dhs.opa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about entity reference relationships provided to and returned from an Assess action.
 * Reference relationships are any relationship other than the primary containment relationship for an entity.
 * Note: Relationships which are inferred by rules in the policy model can not be supplied in an assess request.
 * 
 * &lt;p&gt;Java class for RelationshipType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelationshipType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="target" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}RelationshipTargetType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="properties" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ListCustomPropertiesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="decision-report" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}DecisionReportType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="state" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}StateEnum" /&amp;gt;
 *       &amp;lt;attribute name="inferred" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
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
@XmlType(name = "RelationshipType", propOrder = {
    "target",
    "properties",
    "decisionReport"
})
public class RelationshipType {

    protected List<RelationshipTargetType> target;
    protected ListCustomPropertiesType properties;
    @XmlElement(name = "decision-report")
    protected DecisionReportType decisionReport;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "state")
    protected StateEnum state;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "outcome-style")
    protected OutcomeStyleEnum outcomeStyle;
    @XmlAttribute(name = "unknown-outcome-style")
    protected OutcomeStyleEnum unknownOutcomeStyle;
    @XmlAttribute(name = "known-outcome-style")
    protected OutcomeStyleEnum knownOutcomeStyle;

    /**
     * Gets the value of the target property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the target property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTarget().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipTargetType }
     * 
     * 
     */
    public List<RelationshipTargetType> getTarget() {
        if (target == null) {
            target = new ArrayList<RelationshipTargetType>();
        }
        return this.target;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ListCustomPropertiesType }
     *     
     */
    public ListCustomPropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCustomPropertiesType }
     *     
     */
    public void setProperties(ListCustomPropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the decisionReport property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionReportType }
     *     
     */
    public DecisionReportType getDecisionReport() {
        return decisionReport;
    }

    /**
     * Sets the value of the decisionReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionReportType }
     *     
     */
    public void setDecisionReport(DecisionReportType value) {
        this.decisionReport = value;
    }

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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateEnum }
     *     
     */
    public StateEnum getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateEnum }
     *     
     */
    public void setState(StateEnum value) {
        this.state = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInferred(Boolean value) {
        this.inferred = value;
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

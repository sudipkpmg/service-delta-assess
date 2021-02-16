
package gov.tn.dhs.opa.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Attribute values and metadata provided to and returned from an Assess action.
 * Attribute nodes are used either to:
 *  1. Set an attribute's input value
 *  2. Indicate the level of outcome detail to include in the response for an attribute
 * A value must be provided if no outcome-style is specified, and that value will be used (and returned in the response) even if the attribute is able to be inferred by the policy model. If an outcome-style is specified, any value provided for the attribute is ignored.
 * Where an attribute is linked to a value list, ensure that any value you set for the attribute is a value on the value list. Otherwise, the web service will return an error: "The value for attribute &lt;attribute&gt; should be an enumerated value".
 * On input, for attributes with an unknown value, either leave the attribute out of the request entirely, or use the unknown-val element.
 * Notes:
 * * Do not attempt to simultaneously set a value and specify an outcome style for the same attribute.
 * * Where an attribute is linked to a value list, and you attempt to set a value for that attribute which is not in the value list, the web service will return an error: "The value for attribute &lt;attribute&gt; should be an enumerated value".
 * 
 * 
 * &lt;p&gt;Java class for AttributeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AttributeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="boolean-val" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *           &amp;lt;element name="date-val" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *           &amp;lt;element name="datetime-val" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *           &amp;lt;element name="time-val" type="{http://www.w3.org/2001/XMLSchema}time"/&amp;gt;
 *           &amp;lt;element name="number-val" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
 *           &amp;lt;element name="text-val" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *           &amp;lt;element name="uncertain-val" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}UncertainValue"/&amp;gt;
 *           &amp;lt;element name="unknown-val" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}UnknownValue"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="change-point" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ChangePoint" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="properties" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ListCustomPropertiesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="decision-report" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}DecisionReportType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="type" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AttributeTypeEnum" /&amp;gt;
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
@XmlType(name = "AttributeType", propOrder = {
    "booleanVal",
    "dateVal",
    "datetimeVal",
    "timeVal",
    "numberVal",
    "textVal",
    "uncertainVal",
    "unknownVal",
    "changePoint",
    "properties",
    "decisionReport"
})
public class AttributeType {

    @XmlElement(name = "boolean-val")
    protected Boolean booleanVal;
    @XmlElement(name = "date-val")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateVal;
    @XmlElement(name = "datetime-val")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetimeVal;
    @XmlElement(name = "time-val")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar timeVal;
    @XmlElement(name = "number-val")
    protected BigDecimal numberVal;
    @XmlElement(name = "text-val")
    protected String textVal;
    @XmlElement(name = "uncertain-val")
    protected UncertainValue uncertainVal;
    @XmlElement(name = "unknown-val")
    protected UnknownValue unknownVal;
    @XmlElement(name = "change-point")
    protected List<ChangePoint> changePoint;
    protected ListCustomPropertiesType properties;
    @XmlElement(name = "decision-report")
    protected DecisionReportType decisionReport;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "type")
    protected AttributeTypeEnum type;
    @XmlAttribute(name = "inferred")
    protected Boolean inferred;
    @XmlAttribute(name = "outcome-style")
    protected OutcomeStyleEnum outcomeStyle;
    @XmlAttribute(name = "unknown-outcome-style")
    protected OutcomeStyleEnum unknownOutcomeStyle;
    @XmlAttribute(name = "known-outcome-style")
    protected OutcomeStyleEnum knownOutcomeStyle;

    /**
     * Gets the value of the booleanVal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanVal() {
        return booleanVal;
    }

    /**
     * Sets the value of the booleanVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanVal(Boolean value) {
        this.booleanVal = value;
    }

    /**
     * Gets the value of the dateVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateVal() {
        return dateVal;
    }

    /**
     * Sets the value of the dateVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateVal(XMLGregorianCalendar value) {
        this.dateVal = value;
    }

    /**
     * Gets the value of the datetimeVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeVal() {
        return datetimeVal;
    }

    /**
     * Sets the value of the datetimeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeVal(XMLGregorianCalendar value) {
        this.datetimeVal = value;
    }

    /**
     * Gets the value of the timeVal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeVal() {
        return timeVal;
    }

    /**
     * Sets the value of the timeVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeVal(XMLGregorianCalendar value) {
        this.timeVal = value;
    }

    /**
     * Gets the value of the numberVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberVal() {
        return numberVal;
    }

    /**
     * Sets the value of the numberVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberVal(BigDecimal value) {
        this.numberVal = value;
    }

    /**
     * Gets the value of the textVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextVal() {
        return textVal;
    }

    /**
     * Sets the value of the textVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextVal(String value) {
        this.textVal = value;
    }

    /**
     * Gets the value of the uncertainVal property.
     * 
     * @return
     *     possible object is
     *     {@link UncertainValue }
     *     
     */
    public UncertainValue getUncertainVal() {
        return uncertainVal;
    }

    /**
     * Sets the value of the uncertainVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertainValue }
     *     
     */
    public void setUncertainVal(UncertainValue value) {
        this.uncertainVal = value;
    }

    /**
     * Gets the value of the unknownVal property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownValue }
     *     
     */
    public UnknownValue getUnknownVal() {
        return unknownVal;
    }

    /**
     * Sets the value of the unknownVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownValue }
     *     
     */
    public void setUnknownVal(UnknownValue value) {
        this.unknownVal = value;
    }

    /**
     * Gets the value of the changePoint property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changePoint property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getChangePoint().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ChangePoint }
     * 
     * 
     */
    public List<ChangePoint> getChangePoint() {
        if (changePoint == null) {
            changePoint = new ArrayList<ChangePoint>();
        }
        return this.changePoint;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public AttributeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeTypeEnum }
     *     
     */
    public void setType(AttributeTypeEnum value) {
        this.type = value;
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


package gov.tn.dhs.opa.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for AttributeNodeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AttributeNodeType"&amp;gt;
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
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element name="relationship-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}RelationshipNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="attribute-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AttributeNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="already-proven-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AlreadyProvenNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="reference-tags" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ReferenceTagList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="entity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="instance-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="hypothetical-instance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="attribute-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="type" use="required" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AttributeTypeEnum" /&amp;gt;
 *       &amp;lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="inferred" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="start-relevance" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *       &amp;lt;attribute name="end-relevance" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeNodeType", propOrder = {
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
    "relationshipNodeOrAttributeNodeOrAlreadyProvenNode",
    "referenceTags"
})
public class AttributeNodeType {

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
    @XmlElements({
        @XmlElement(name = "relationship-node", type = RelationshipNodeType.class),
        @XmlElement(name = "attribute-node", type = AttributeNodeType.class),
        @XmlElement(name = "already-proven-node", type = AlreadyProvenNodeType.class)
    })
    protected List<Object> relationshipNodeOrAttributeNodeOrAlreadyProvenNode;
    @XmlElement(name = "reference-tags")
    protected ReferenceTagList referenceTags;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "entity-id", required = true)
    protected String entityId;
    @XmlAttribute(name = "instance-id", required = true)
    protected String instanceId;
    @XmlAttribute(name = "hypothetical-instance", required = true)
    protected boolean hypotheticalInstance;
    @XmlAttribute(name = "attribute-id", required = true)
    protected String attributeId;
    @XmlAttribute(name = "type", required = true)
    protected AttributeTypeEnum type;
    @XmlAttribute(name = "text", required = true)
    protected String text;
    @XmlAttribute(name = "inferred", required = true)
    protected boolean inferred;
    @XmlAttribute(name = "start-relevance")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startRelevance;
    @XmlAttribute(name = "end-relevance")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endRelevance;

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
     * Gets the value of the relationshipNodeOrAttributeNodeOrAlreadyProvenNode property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the relationshipNodeOrAttributeNodeOrAlreadyProvenNode property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRelationshipNodeOrAttributeNodeOrAlreadyProvenNode().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipNodeType }
     * {@link AttributeNodeType }
     * {@link AlreadyProvenNodeType }
     * 
     * 
     */
    public List<Object> getRelationshipNodeOrAttributeNodeOrAlreadyProvenNode() {
        if (relationshipNodeOrAttributeNodeOrAlreadyProvenNode == null) {
            relationshipNodeOrAttributeNodeOrAlreadyProvenNode = new ArrayList<Object>();
        }
        return this.relationshipNodeOrAttributeNodeOrAlreadyProvenNode;
    }

    /**
     * Gets the value of the referenceTags property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTagList }
     *     
     */
    public ReferenceTagList getReferenceTags() {
        return referenceTags;
    }

    /**
     * Sets the value of the referenceTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTagList }
     *     
     */
    public void setReferenceTags(ReferenceTagList value) {
        this.referenceTags = value;
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
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the hypotheticalInstance property.
     * 
     */
    public boolean isHypotheticalInstance() {
        return hypotheticalInstance;
    }

    /**
     * Sets the value of the hypotheticalInstance property.
     * 
     */
    public void setHypotheticalInstance(boolean value) {
        this.hypotheticalInstance = value;
    }

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the inferred property.
     * 
     */
    public boolean isInferred() {
        return inferred;
    }

    /**
     * Sets the value of the inferred property.
     * 
     */
    public void setInferred(boolean value) {
        this.inferred = value;
    }

    /**
     * Gets the value of the startRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartRelevance() {
        return startRelevance;
    }

    /**
     * Sets the value of the startRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartRelevance(XMLGregorianCalendar value) {
        this.startRelevance = value;
    }

    /**
     * Gets the value of the endRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndRelevance() {
        return endRelevance;
    }

    /**
     * Sets the value of the endRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndRelevance(XMLGregorianCalendar value) {
        this.endRelevance = value;
    }

}

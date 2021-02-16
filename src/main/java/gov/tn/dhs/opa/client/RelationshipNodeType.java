
package gov.tn.dhs.opa.client;

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
 * &lt;p&gt;Java class for RelationshipNodeType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelationshipNodeType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="target" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}RelationshipTargetType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="properties" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ListCustomPropertiesType" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element name="relationship-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}RelationshipNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="attribute-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AttributeNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="already-proven-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AlreadyProvenNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="reference-tags" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ReferenceTagList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="relationship-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="source-entity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="source-instance-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="hypothetical-instance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="target-entity-id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="state" use="required" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}StateEnum" /&amp;gt;
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
@XmlType(name = "RelationshipNodeType", propOrder = {
    "target",
    "properties",
    "relationshipNodeOrAttributeNodeOrAlreadyProvenNode",
    "referenceTags"
})
public class RelationshipNodeType {

    protected List<RelationshipTargetType> target;
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
    @XmlAttribute(name = "relationship-id", required = true)
    protected String relationshipId;
    @XmlAttribute(name = "source-entity-id", required = true)
    protected String sourceEntityId;
    @XmlAttribute(name = "source-instance-id", required = true)
    protected String sourceInstanceId;
    @XmlAttribute(name = "hypothetical-instance", required = true)
    protected boolean hypotheticalInstance;
    @XmlAttribute(name = "target-entity-id", required = true)
    protected String targetEntityId;
    @XmlAttribute(name = "state", required = true)
    protected StateEnum state;
    @XmlAttribute(name = "inferred", required = true)
    protected boolean inferred;
    @XmlAttribute(name = "start-relevance")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startRelevance;
    @XmlAttribute(name = "end-relevance")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endRelevance;

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
     * Gets the value of the relationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipId() {
        return relationshipId;
    }

    /**
     * Sets the value of the relationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipId(String value) {
        this.relationshipId = value;
    }

    /**
     * Gets the value of the sourceEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEntityId() {
        return sourceEntityId;
    }

    /**
     * Sets the value of the sourceEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEntityId(String value) {
        this.sourceEntityId = value;
    }

    /**
     * Gets the value of the sourceInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInstanceId() {
        return sourceInstanceId;
    }

    /**
     * Sets the value of the sourceInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInstanceId(String value) {
        this.sourceInstanceId = value;
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
     * Gets the value of the targetEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntityId() {
        return targetEntityId;
    }

    /**
     * Sets the value of the targetEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntityId(String value) {
        this.targetEntityId = value;
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

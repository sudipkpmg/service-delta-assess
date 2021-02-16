
package gov.tn.dhs.opa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Decision report data returned in the response from an Assess action, for attributes and relationships with a decision report outcome style that is not value-only.
 * A decision report provides information on how the value of an attribute was determined (or why it is unknown).
 * 
 * &lt;p&gt;Java class for DecisionReportType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DecisionReportType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *         &amp;lt;element name="relationship-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}RelationshipNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="attribute-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AttributeNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="already-proven-node" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}AlreadyProvenNodeType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="report-style" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionReportType", propOrder = {
    "relationshipNodeOrAttributeNodeOrAlreadyProvenNode"
})
public class DecisionReportType {

    @XmlElements({
        @XmlElement(name = "relationship-node", type = RelationshipNodeType.class),
        @XmlElement(name = "attribute-node", type = AttributeNodeType.class),
        @XmlElement(name = "already-proven-node", type = AlreadyProvenNodeType.class)
    })
    protected List<Object> relationshipNodeOrAttributeNodeOrAlreadyProvenNode;
    @XmlAttribute(name = "report-style")
    protected String reportStyle;

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
     * Gets the value of the reportStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportStyle() {
        return reportStyle;
    }

    /**
     * Sets the value of the reportStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportStyle(String value) {
        this.reportStyle = value;
    }

}


package gov.tn.dhs.opa.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Temporal change points for attribute values and decision report nodes provided to and returned from an action.
 * 
 * &lt;p&gt;Java class for ChangePoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ChangePoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice minOccurs="0"&amp;gt;
 *         &amp;lt;element name="boolean-val" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="date-val" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;element name="datetime-val" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="time-val" type="{http://www.w3.org/2001/XMLSchema}time"/&amp;gt;
 *         &amp;lt;element name="number-val" type="{http://www.w3.org/2001/XMLSchema}decimal"/&amp;gt;
 *         &amp;lt;element name="text-val" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="uncertain-val" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}UncertainValue"/&amp;gt;
 *         &amp;lt;element name="unknown-val" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}UnknownValue"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePoint", propOrder = {
    "booleanVal",
    "dateVal",
    "datetimeVal",
    "timeVal",
    "numberVal",
    "textVal",
    "uncertainVal",
    "unknownVal"
})
public class ChangePoint {

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
    @XmlAttribute(name = "date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}

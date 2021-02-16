
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AssessResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AssessResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="version-info" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}VersionInfoType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="events" type="{http://oracle.com/determinations/server/12.2.1/rulebase/assess/types}ListEventsType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "AssessResponse", propOrder = {
    "versionInfo",
    "events",
    "globalInstance"
})
public class AssessResponse {

    @XmlElement(name = "version-info")
    protected VersionInfoType versionInfo;
    protected ListEventsType events;
    @XmlElement(name = "global-instance", required = true)
    protected GlobalInstanceType globalInstance;

    /**
     * Gets the value of the versionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VersionInfoType }
     *     
     */
    public VersionInfoType getVersionInfo() {
        return versionInfo;
    }

    /**
     * Sets the value of the versionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionInfoType }
     *     
     */
    public void setVersionInfo(VersionInfoType value) {
        this.versionInfo = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link ListEventsType }
     *     
     */
    public ListEventsType getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListEventsType }
     *     
     */
    public void setEvents(ListEventsType value) {
        this.events = value;
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

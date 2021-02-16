
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The version information of a deployed policy model
 * 
 * &lt;p&gt;Java class for VersionInfoType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VersionInfoType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="deployment-version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version-uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="build-time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="policy-modeling-version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionInfoType", propOrder = {
    "deploymentVersion",
    "versionUid",
    "buildTime",
    "policyModelingVersion"
})
public class VersionInfoType {

    @XmlElement(name = "deployment-version")
    protected Integer deploymentVersion;
    @XmlElement(name = "version-uid")
    protected String versionUid;
    @XmlElement(name = "build-time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildTime;
    @XmlElement(name = "policy-modeling-version")
    protected String policyModelingVersion;

    /**
     * Gets the value of the deploymentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeploymentVersion() {
        return deploymentVersion;
    }

    /**
     * Sets the value of the deploymentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeploymentVersion(Integer value) {
        this.deploymentVersion = value;
    }

    /**
     * Gets the value of the versionUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionUid() {
        return versionUid;
    }

    /**
     * Sets the value of the versionUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionUid(String value) {
        this.versionUid = value;
    }

    /**
     * Gets the value of the buildTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildTime() {
        return buildTime;
    }

    /**
     * Sets the value of the buildTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildTime(XMLGregorianCalendar value) {
        this.buildTime = value;
    }

    /**
     * Gets the value of the policyModelingVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyModelingVersion() {
        return policyModelingVersion;
    }

    /**
     * Sets the value of the policyModelingVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyModelingVersion(String value) {
        this.policyModelingVersion = value;
    }

}

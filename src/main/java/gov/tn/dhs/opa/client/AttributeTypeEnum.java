
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AttributeTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AttributeTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="boolean"/&amp;gt;
 *     &amp;lt;enumeration value="text"/&amp;gt;
 *     &amp;lt;enumeration value="number"/&amp;gt;
 *     &amp;lt;enumeration value="currency"/&amp;gt;
 *     &amp;lt;enumeration value="date"/&amp;gt;
 *     &amp;lt;enumeration value="datetime"/&amp;gt;
 *     &amp;lt;enumeration value="timeofday"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AttributeTypeEnum")
@XmlEnum
public enum AttributeTypeEnum {


    /**
     * Attribute is type Boolean
     * 
     */
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),

    /**
     * Attribute is type Text
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * Attribute is type Number
     * 
     */
    @XmlEnumValue("number")
    NUMBER("number"),

    /**
     * Attribute is type Currency
     * 
     */
    @XmlEnumValue("currency")
    CURRENCY("currency"),

    /**
     * Attribute is type Date
     * 
     */
    @XmlEnumValue("date")
    DATE("date"),

    /**
     * Attribute is type Datetime
     * 
     */
    @XmlEnumValue("datetime")
    DATETIME("datetime"),

    /**
     * Attribute is type Timeofday
     * 
     */
    @XmlEnumValue("timeofday")
    TIMEOFDAY("timeofday");
    private final String value;

    AttributeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeTypeEnum fromValue(String v) {
        for (AttributeTypeEnum c: AttributeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

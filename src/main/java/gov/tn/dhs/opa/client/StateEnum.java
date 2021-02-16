
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StateEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="StateEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="known"/&amp;gt;
 *     &amp;lt;enumeration value="unknown"/&amp;gt;
 *     &amp;lt;enumeration value="uncertain"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "StateEnum")
@XmlEnum
public enum StateEnum {


    /**
     * The relationship is known
     * 
     */
    @XmlEnumValue("known")
    KNOWN("known"),

    /**
     * The relationship is unknown
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),

    /**
     * The relationship is uncertain
     * 
     */
    @XmlEnumValue("uncertain")
    UNCERTAIN("uncertain");
    private final String value;

    StateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StateEnum fromValue(String v) {
        for (StateEnum c: StateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

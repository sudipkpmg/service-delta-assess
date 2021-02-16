
package gov.tn.dhs.opa.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OutcomeStyleEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OutcomeStyleEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="value-only"/&amp;gt;
 *     &amp;lt;enumeration value="decision-report"/&amp;gt;
 *     &amp;lt;enumeration value="base-attributes"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "OutcomeStyleEnum")
@XmlEnum
public enum OutcomeStyleEnum {


    /**
     * Do not return a decision report for the attribute or relationship, just its value.
     * 
     */
    @XmlEnumValue("value-only")
    VALUE_ONLY("value-only"),

    /**
     * Return the value, and a full decision report for the attribute or relationship.
     * 
     */
    @XmlEnumValue("decision-report")
    DECISION_REPORT("decision-report"),

    /**
     * Return the value, and a decision report containing only the relevant base attributes. I.e. the inputs that influenced the attribute or relationship's outcome.
     * 
     */
    @XmlEnumValue("base-attributes")
    BASE_ATTRIBUTES("base-attributes");
    private final String value;

    OutcomeStyleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutcomeStyleEnum fromValue(String v) {
        for (OutcomeStyleEnum c: OutcomeStyleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package zimbramail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="importance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "importance")
@XmlEnum
public enum Importance {

    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("low")
    LOW("low");
    private final String value;

    Importance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Importance fromValue(String v) {
        for (Importance c: Importance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

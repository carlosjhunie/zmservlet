
package zimbra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mailboxMoveType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mailboxMoveType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="out"/>
 *     &lt;enumeration value="in"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mailboxMoveType")
@XmlEnum
public enum MailboxMoveType {

    @XmlEnumValue("out")
    OUT("out"),
    @XmlEnumValue("in")
    IN("in");
    private final String value;

    MailboxMoveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MailboxMoveType fromValue(String v) {
        for (MailboxMoveType c: MailboxMoveType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

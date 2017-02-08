
package zimbra;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="licenseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_INSTALLED"/>
 *     &lt;enumeration value="NOT_ACTIVATED"/>
 *     &lt;enumeration value="IN_FUTURE"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="LICENSE_GRACE_PERIOD"/>
 *     &lt;enumeration value="ACTIVATION_GRACE_PERIOD"/>
 *     &lt;enumeration value="OK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "licenseStatus")
@XmlEnum
public enum LicenseStatus {

    NOT_INSTALLED,
    NOT_ACTIVATED,
    IN_FUTURE,
    EXPIRED,
    INVALID,
    LICENSE_GRACE_PERIOD,
    ACTIVATION_GRACE_PERIOD,
    OK;

    public String value() {
        return name();
    }

    public static LicenseStatus fromValue(String v) {
        return valueOf(v);
    }

}

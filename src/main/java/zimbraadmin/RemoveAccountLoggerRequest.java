
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import zimbra.AccountSelector;


/**
 * <p>Java class for removeAccountLoggerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeAccountLoggerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="account" type="{urn:zimbra}accountSelector" minOccurs="0"/>
 *         &lt;element name="logger" type="{urn:zimbraAdmin}loggerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeAccountLoggerRequest", propOrder = {
    "id",
    "account",
    "logger"
})
public class RemoveAccountLoggerRequest {

    protected String id;
    protected AccountSelector account;
    protected LoggerInfo logger;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSelector }
     *     
     */
    public AccountSelector getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSelector }
     *     
     */
    public void setAccount(AccountSelector value) {
        this.account = value;
    }

    /**
     * Gets the value of the logger property.
     * 
     * @return
     *     possible object is
     *     {@link LoggerInfo }
     *     
     */
    public LoggerInfo getLogger() {
        return logger;
    }

    /**
     * Sets the value of the logger property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoggerInfo }
     *     
     */
    public void setLogger(LoggerInfo value) {
        this.logger = value;
    }

}

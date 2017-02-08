
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMailboxVolumesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMailboxVolumesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn:zimbraAdmin}mailboxVolumesInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMailboxVolumesResponse", propOrder = {
    "account"
})
public class GetMailboxVolumesResponse {

    @XmlElement(required = true)
    protected MailboxVolumesInfo account;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link MailboxVolumesInfo }
     *     
     */
    public MailboxVolumesInfo getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxVolumesInfo }
     *     
     */
    public void setAccount(MailboxVolumesInfo value) {
        this.account = value;
    }

}


package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zimbra.AccountSelector;


/**
 * <p>Java class for createArchiveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createArchiveRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn:zimbra}accountSelector"/>
 *         &lt;element name="archive" type="{urn:zimbraAdmin}archiveSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createArchiveRequest", propOrder = {
    "account",
    "archive"
})
public class CreateArchiveRequest {

    @XmlElement(required = true)
    protected AccountSelector account;
    protected ArchiveSpec archive;

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
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveSpec }
     *     
     */
    public ArchiveSpec getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveSpec }
     *     
     */
    public void setArchive(ArchiveSpec value) {
        this.archive = value;
    }

}

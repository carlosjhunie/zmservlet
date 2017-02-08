
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zimbra.AccountSelector;


/**
 * <p>Java class for deleteXMbxSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteXMbxSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchtask" type="{urn:zimbraAdmin}searchID"/>
 *         &lt;element name="account" type="{urn:zimbra}accountSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteXMbxSearchRequest", propOrder = {
    "searchtask",
    "account"
})
public class DeleteXMbxSearchRequest {

    @XmlElement(required = true)
    protected SearchID searchtask;
    protected AccountSelector account;

    /**
     * Gets the value of the searchtask property.
     * 
     * @return
     *     possible object is
     *     {@link SearchID }
     *     
     */
    public SearchID getSearchtask() {
        return searchtask;
    }

    /**
     * Sets the value of the searchtask property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchID }
     *     
     */
    public void setSearchtask(SearchID value) {
        this.searchtask = value;
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

}

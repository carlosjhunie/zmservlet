
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import zimbra.AccountSelector;
import zimbrasync.DeviceId;


/**
 * <p>Java class for getSyncStateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSyncStateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{urn:zimbra}accountSelector"/>
 *         &lt;element name="device" type="{urn:zimbraSync}deviceId"/>
 *         &lt;element name="folder" type="{urn:zimbraAdmin}folderId" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:zimbraAdmin}itemId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSyncStateRequest", propOrder = {
    "account",
    "device",
    "folder",
    "item"
})
public class GetSyncStateRequest {

    @XmlElement(required = true)
    protected AccountSelector account;
    @XmlElement(required = true)
    protected DeviceId device;
    protected FolderId folder;
    protected ItemId item;

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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceId }
     *     
     */
    public DeviceId getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceId }
     *     
     */
    public void setDevice(DeviceId value) {
        this.device = value;
    }

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link FolderId }
     *     
     */
    public FolderId getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderId }
     *     
     */
    public void setFolder(FolderId value) {
        this.folder = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemId }
     *     
     */
    public ItemId getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemId }
     *     
     */
    public void setItem(ItemId value) {
        this.item = value;
    }

}

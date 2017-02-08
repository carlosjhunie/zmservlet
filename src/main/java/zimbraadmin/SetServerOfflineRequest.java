
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import zimbra.AttributeSelectorImpl;


/**
 * <p>Java class for setServerOfflineRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setServerOfflineRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbra}attributeSelectorImpl">
 *       &lt;sequence>
 *         &lt;element name="server" type="{urn:zimbraAdmin}serverSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setServerOfflineRequest", propOrder = {
    "server"
})
public class SetServerOfflineRequest
    extends AttributeSelectorImpl
{

    protected ServerSelector server;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link ServerSelector }
     *     
     */
    public ServerSelector getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerSelector }
     *     
     */
    public void setServer(ServerSelector value) {
        this.server = value;
    }

}

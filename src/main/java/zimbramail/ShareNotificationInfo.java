
package zimbramail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shareNotificationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shareNotificationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grantor" type="{urn:zimbraMail}grantor"/>
 *         &lt;element name="link" type="{urn:zimbraMail}linkInfo"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="d" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shareNotificationInfo", propOrder = {
    "grantor",
    "link"
})
public class ShareNotificationInfo {

    @XmlElement(required = true)
    protected Grantor grantor;
    @XmlElement(required = true)
    protected LinkInfo link;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "d", required = true)
    protected long d;

    /**
     * Gets the value of the grantor property.
     * 
     * @return
     *     possible object is
     *     {@link Grantor }
     *     
     */
    public Grantor getGrantor() {
        return grantor;
    }

    /**
     * Sets the value of the grantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Grantor }
     *     
     */
    public void setGrantor(Grantor value) {
        this.grantor = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link LinkInfo }
     *     
     */
    public LinkInfo getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkInfo }
     *     
     */
    public void setLink(LinkInfo value) {
        this.link = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     * Gets the value of the d property.
     * 
     */
    public long getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(long value) {
        this.d = value;
    }

}

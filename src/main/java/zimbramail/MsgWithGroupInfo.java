
package zimbramail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import zimbra.KeyValuePair;
import zimbra.UrlAndValue;


/**
 * <p>Java class for msgWithGroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="msgWithGroupInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraMail}messageCommon">
 *       &lt;sequence>
 *         &lt;element name="fr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="e" type="{urn:zimbraMail}emailInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="su" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="irt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inv" type="{urn:zimbraMail}inviteWithGroupInfo" minOccurs="0"/>
 *         &lt;element name="header" type="{urn:zimbra}keyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="mp" type="{urn:zimbraMail}partInfo"/>
 *           &lt;element name="shr" type="{urn:zimbraMail}shareNotification"/>
 *           &lt;element name="dlSubs" type="{urn:zimbraMail}dlSubscriptionNotification"/>
 *         &lt;/choice>
 *         &lt;element name="content" type="{urn:zimbra}urlAndValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cif" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="origid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idnt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="forAcct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="autoSendTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sd" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="rd" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="part" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "msgWithGroupInfo", propOrder = {
    "fr",
    "e",
    "su",
    "mid",
    "irt",
    "inv",
    "header",
    "mpOrShrOrDlSubs",
    "content"
})
public class MsgWithGroupInfo
    extends MessageCommon
{

    protected String fr;
    protected List<EmailInfo> e;
    protected String su;
    protected String mid;
    protected String irt;
    protected InviteWithGroupInfo inv;
    protected List<KeyValuePair> header;
    @XmlElements({
        @XmlElement(name = "mp", type = PartInfo.class),
        @XmlElement(name = "shr", type = ShareNotification.class),
        @XmlElement(name = "dlSubs", type = DlSubscriptionNotification.class)
    })
    protected List<Object> mpOrShrOrDlSubs;
    protected UrlAndValue content;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "cif")
    protected String cif;
    @XmlAttribute(name = "origid")
    protected String origid;
    @XmlAttribute(name = "rt")
    protected String rt;
    @XmlAttribute(name = "idnt")
    protected String idnt;
    @XmlAttribute(name = "forAcct")
    protected String forAcct;
    @XmlAttribute(name = "autoSendTime")
    protected Long autoSendTime;
    @XmlAttribute(name = "sd")
    protected Long sd;
    @XmlAttribute(name = "rd")
    protected Long rd;
    @XmlAttribute(name = "part")
    protected String part;

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr(String value) {
        this.fr = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailInfo }
     * 
     * 
     */
    public List<EmailInfo> getE() {
        if (e == null) {
            e = new ArrayList<EmailInfo>();
        }
        return this.e;
    }

    /**
     * Gets the value of the su property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSu() {
        return su;
    }

    /**
     * Sets the value of the su property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSu(String value) {
        this.su = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMid(String value) {
        this.mid = value;
    }

    /**
     * Gets the value of the irt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrt() {
        return irt;
    }

    /**
     * Sets the value of the irt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrt(String value) {
        this.irt = value;
    }

    /**
     * Gets the value of the inv property.
     * 
     * @return
     *     possible object is
     *     {@link InviteWithGroupInfo }
     *     
     */
    public InviteWithGroupInfo getInv() {
        return inv;
    }

    /**
     * Sets the value of the inv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InviteWithGroupInfo }
     *     
     */
    public void setInv(InviteWithGroupInfo value) {
        this.inv = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the header property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getHeader() {
        if (header == null) {
            header = new ArrayList<KeyValuePair>();
        }
        return this.header;
    }

    /**
     * Gets the value of the mpOrShrOrDlSubs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpOrShrOrDlSubs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpOrShrOrDlSubs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInfo }
     * {@link ShareNotification }
     * {@link DlSubscriptionNotification }
     * 
     * 
     */
    public List<Object> getMpOrShrOrDlSubs() {
        if (mpOrShrOrDlSubs == null) {
            mpOrShrOrDlSubs = new ArrayList<Object>();
        }
        return this.mpOrShrOrDlSubs;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link UrlAndValue }
     *     
     */
    public UrlAndValue getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlAndValue }
     *     
     */
    public void setContent(UrlAndValue value) {
        this.content = value;
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
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the origid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigid() {
        return origid;
    }

    /**
     * Sets the value of the origid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigid(String value) {
        this.origid = value;
    }

    /**
     * Gets the value of the rt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRt() {
        return rt;
    }

    /**
     * Sets the value of the rt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRt(String value) {
        this.rt = value;
    }

    /**
     * Gets the value of the idnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdnt() {
        return idnt;
    }

    /**
     * Sets the value of the idnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdnt(String value) {
        this.idnt = value;
    }

    /**
     * Gets the value of the forAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForAcct() {
        return forAcct;
    }

    /**
     * Sets the value of the forAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForAcct(String value) {
        this.forAcct = value;
    }

    /**
     * Gets the value of the autoSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAutoSendTime() {
        return autoSendTime;
    }

    /**
     * Sets the value of the autoSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAutoSendTime(Long value) {
        this.autoSendTime = value;
    }

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSd() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSd(Long value) {
        this.sd = value;
    }

    /**
     * Gets the value of the rd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRd() {
        return rd;
    }

    /**
     * Sets the value of the rd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRd(Long value) {
        this.rd = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPart(String value) {
        this.part = value;
    }

}

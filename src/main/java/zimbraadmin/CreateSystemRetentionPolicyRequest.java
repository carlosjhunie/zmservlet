
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createSystemRetentionPolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createSystemRetentionPolicyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cos" type="{urn:zimbraAdmin}cosSelector" minOccurs="0"/>
 *         &lt;element name="keep" type="{urn:zimbraAdmin}policyHolder" minOccurs="0"/>
 *         &lt;element name="purge" type="{urn:zimbraAdmin}policyHolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSystemRetentionPolicyRequest", propOrder = {
    "cos",
    "keep",
    "purge"
})
public class CreateSystemRetentionPolicyRequest {

    protected CosSelector cos;
    protected PolicyHolder keep;
    protected PolicyHolder purge;

    /**
     * Gets the value of the cos property.
     * 
     * @return
     *     possible object is
     *     {@link CosSelector }
     *     
     */
    public CosSelector getCos() {
        return cos;
    }

    /**
     * Sets the value of the cos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CosSelector }
     *     
     */
    public void setCos(CosSelector value) {
        this.cos = value;
    }

    /**
     * Gets the value of the keep property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyHolder }
     *     
     */
    public PolicyHolder getKeep() {
        return keep;
    }

    /**
     * Sets the value of the keep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyHolder }
     *     
     */
    public void setKeep(PolicyHolder value) {
        this.keep = value;
    }

    /**
     * Gets the value of the purge property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyHolder }
     *     
     */
    public PolicyHolder getPurge() {
        return purge;
    }

    /**
     * Sets the value of the purge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyHolder }
     *     
     */
    public void setPurge(PolicyHolder value) {
        this.purge = value;
    }

}

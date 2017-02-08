
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSystemRetentionPolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSystemRetentionPolicyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cos" type="{urn:zimbraAdmin}cosSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSystemRetentionPolicyRequest", propOrder = {
    "cos"
})
public class GetSystemRetentionPolicyRequest {

    protected CosSelector cos;

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

}

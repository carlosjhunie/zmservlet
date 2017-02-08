
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import zimbra.AttributeSelectorImpl;


/**
 * <p>Java class for getUCServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUCServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbra}attributeSelectorImpl">
 *       &lt;sequence>
 *         &lt;element name="ucservice" type="{urn:zimbraAdmin}ucServiceSelector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUCServiceRequest", propOrder = {
    "ucservice"
})
public class GetUCServiceRequest
    extends AttributeSelectorImpl
{

    protected UcServiceSelector ucservice;

    /**
     * Gets the value of the ucservice property.
     * 
     * @return
     *     possible object is
     *     {@link UcServiceSelector }
     *     
     */
    public UcServiceSelector getUcservice() {
        return ucservice;
    }

    /**
     * Sets the value of the ucservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcServiceSelector }
     *     
     */
    public void setUcservice(UcServiceSelector value) {
        this.ucservice = value;
    }

}

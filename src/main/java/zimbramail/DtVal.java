
package zimbramail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dtVal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtVal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="s" type="{urn:zimbraMail}dtTimeInfo" minOccurs="0"/>
 *         &lt;element name="e" type="{urn:zimbraMail}dtTimeInfo" minOccurs="0"/>
 *         &lt;element name="dur" type="{urn:zimbraMail}durationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtVal", propOrder = {
    "s",
    "e",
    "dur"
})
public class DtVal {

    protected DtTimeInfo s;
    protected DtTimeInfo e;
    protected DurationInfo dur;

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link DtTimeInfo }
     *     
     */
    public DtTimeInfo getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtTimeInfo }
     *     
     */
    public void setS(DtTimeInfo value) {
        this.s = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link DtTimeInfo }
     *     
     */
    public DtTimeInfo getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtTimeInfo }
     *     
     */
    public void setE(DtTimeInfo value) {
        this.e = value;
    }

    /**
     * Gets the value of the dur property.
     * 
     * @return
     *     possible object is
     *     {@link DurationInfo }
     *     
     */
    public DurationInfo getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationInfo }
     *     
     */
    public void setDur(DurationInfo value) {
        this.dur = value;
    }

}

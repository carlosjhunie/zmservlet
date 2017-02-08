
package zimbraadmin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAndDeleteItemsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportAndDeleteItemsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mbox" type="{urn:zimbraAdmin}exportAndDeleteMailboxSpec"/>
 *       &lt;/sequence>
 *       &lt;attribute name="exportDir" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportFilenamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAndDeleteItemsRequest", propOrder = {
    "mbox"
})
public class ExportAndDeleteItemsRequest {

    @XmlElement(required = true)
    protected ExportAndDeleteMailboxSpec mbox;
    @XmlAttribute(name = "exportDir")
    protected String exportDir;
    @XmlAttribute(name = "exportFilenamePrefix")
    protected String exportFilenamePrefix;

    /**
     * Gets the value of the mbox property.
     * 
     * @return
     *     possible object is
     *     {@link ExportAndDeleteMailboxSpec }
     *     
     */
    public ExportAndDeleteMailboxSpec getMbox() {
        return mbox;
    }

    /**
     * Sets the value of the mbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAndDeleteMailboxSpec }
     *     
     */
    public void setMbox(ExportAndDeleteMailboxSpec value) {
        this.mbox = value;
    }

    /**
     * Gets the value of the exportDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDir() {
        return exportDir;
    }

    /**
     * Sets the value of the exportDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDir(String value) {
        this.exportDir = value;
    }

    /**
     * Gets the value of the exportFilenamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportFilenamePrefix() {
        return exportFilenamePrefix;
    }

    /**
     * Sets the value of the exportFilenamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportFilenamePrefix(String value) {
        this.exportFilenamePrefix = value;
    }

}

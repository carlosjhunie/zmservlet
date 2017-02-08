
package zimbraadmin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adminAttrsImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adminAttrsImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:zimbraAdmin}a" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unusedCodeGenHelper" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adminAttrsImpl", propOrder = {
    "a"
})
@XmlSeeAlso({
    CreateDistributionListRequest.class,
    ModifyLDAPEntryRequest.class,
    CreateDomainRequest.class,
    CheckRightRequest.class,
    CreateServerRequest.class,
    CheckGalConfigRequest.class,
    CreateCalendarResourceRequest.class,
    CreateAlwaysOnClusterRequest.class,
    ModifyDomainRequest.class,
    ModifyAlwaysOnClusterRequest.class,
    CreateLDAPEntryRequest.class,
    DeleteDataSourceRequest.class,
    ModifyConfigRequest.class,
    GetConfigResponse.class,
    CreateUCServiceRequest.class,
    ModifyDataSourceRequest.class,
    CreateCosRequest.class,
    ModifyServerRequest.class,
    CheckAuthConfigRequest.class,
    CreateZimletRequest.class,
    ModifyCosRequest.class,
    GetDataSourcesRequest.class,
    UpdatePresenceSessionIdRequest.class,
    AddGalSyncDataSourceRequest.class,
    ModifyCalendarResourceRequest.class,
    CreateAccountRequest.class,
    GetAllConfigResponse.class,
    CreateGalSyncAccountRequest.class,
    ModifyDistributionListRequest.class,
    ModifyAccountRequest.class,
    ModifyUCServiceRequest.class,
    NetworkInformation.class,
    XmppComponentInfo.class,
    GalContactInfo.class,
    SmimeConfigInfo.class,
    ArchiveSpec.class,
    XmppComponentSpec.class,
    DataSourceSpecifier.class,
    SmimeConfigModifications.class,
    LdapEntryInfo.class,
    SearchNode.class,
    DataSourceInfo.class
})
public class AdminAttrsImpl {

    protected List<Attr> a;
    @XmlAttribute(name = "unusedCodeGenHelper")
    protected String unusedCodeGenHelper;

    /**
     * Gets the value of the a property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attr }
     * 
     * 
     */
    public List<Attr> getA() {
        if (a == null) {
            a = new ArrayList<Attr>();
        }
        return this.a;
    }

    /**
     * Gets the value of the unusedCodeGenHelper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnusedCodeGenHelper() {
        return unusedCodeGenHelper;
    }

    /**
     * Sets the value of the unusedCodeGenHelper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnusedCodeGenHelper(String value) {
        this.unusedCodeGenHelper = value;
    }

}

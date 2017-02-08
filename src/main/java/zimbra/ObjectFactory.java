
package zimbra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zimbra package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Context_QNAME = new QName("urn:zimbra", "context");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zimbra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HeaderContext }
     * 
     */
    public HeaderContext createHeaderContext() {
        return new HeaderContext();
    }

    /**
     * Create an instance of {@link ShareInfo }
     * 
     */
    public ShareInfo createShareInfo() {
        return new ShareInfo();
    }

    /**
     * Create an instance of {@link HeaderUserAgentInfo }
     * 
     */
    public HeaderUserAgentInfo createHeaderUserAgentInfo() {
        return new HeaderUserAgentInfo();
    }

    /**
     * Create an instance of {@link HeaderAccountInfo }
     * 
     */
    public HeaderAccountInfo createHeaderAccountInfo() {
        return new HeaderAccountInfo();
    }

    /**
     * Create an instance of {@link GranteeChooser }
     * 
     */
    public GranteeChooser createGranteeChooser() {
        return new GranteeChooser();
    }

    /**
     * Create an instance of {@link WildcardExpansionQueryInfo }
     * 
     */
    public WildcardExpansionQueryInfo createWildcardExpansionQueryInfo() {
        return new WildcardExpansionQueryInfo();
    }

    /**
     * Create an instance of {@link CursorInfo }
     * 
     */
    public CursorInfo createCursorInfo() {
        return new CursorInfo();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link DataSources }
     * 
     */
    public DataSources createDataSources() {
        return new DataSources();
    }

    /**
     * Create an instance of {@link HeaderFormatInfo }
     * 
     */
    public HeaderFormatInfo createHeaderFormatInfo() {
        return new HeaderFormatInfo();
    }

    /**
     * Create an instance of {@link UrlAndValue }
     * 
     */
    public UrlAndValue createUrlAndValue() {
        return new UrlAndValue();
    }

    /**
     * Create an instance of {@link KeyValuePair }
     * 
     */
    public KeyValuePair createKeyValuePair() {
        return new KeyValuePair();
    }

    /**
     * Create an instance of {@link HeaderSessionInfo }
     * 
     */
    public HeaderSessionInfo createHeaderSessionInfo() {
        return new HeaderSessionInfo();
    }

    /**
     * Create an instance of {@link AccountSelector }
     * 
     */
    public AccountSelector createAccountSelector() {
        return new AccountSelector();
    }

    /**
     * Create an instance of {@link TzOnsetInfo }
     * 
     */
    public TzOnsetInfo createTzOnsetInfo() {
        return new TzOnsetInfo();
    }

    /**
     * Create an instance of {@link OpValue }
     * 
     */
    public OpValue createOpValue() {
        return new OpValue();
    }

    /**
     * Create an instance of {@link IdAndType }
     * 
     */
    public IdAndType createIdAndType() {
        return new IdAndType();
    }

    /**
     * Create an instance of {@link SectionAttr }
     * 
     */
    public SectionAttr createSectionAttr() {
        return new SectionAttr();
    }

    /**
     * Create an instance of {@link NamedElement }
     * 
     */
    public NamedElement createNamedElement() {
        return new NamedElement();
    }

    /**
     * Create an instance of {@link HeaderNotifyInfo }
     * 
     */
    public HeaderNotifyInfo createHeaderNotifyInfo() {
        return new HeaderNotifyInfo();
    }

    /**
     * Create an instance of {@link ContactAttr }
     * 
     */
    public ContactAttr createContactAttr() {
        return new ContactAttr();
    }

    /**
     * Create an instance of {@link SimpleSearchHit }
     * 
     */
    public SimpleSearchHit createSimpleSearchHit() {
        return new SimpleSearchHit();
    }

    /**
     * Create an instance of {@link HeaderChangeInfo }
     * 
     */
    public HeaderChangeInfo createHeaderChangeInfo() {
        return new HeaderChangeInfo();
    }

    /**
     * Create an instance of {@link WaitSetAddSpec }
     * 
     */
    public WaitSetAddSpec createWaitSetAddSpec() {
        return new WaitSetAddSpec();
    }

    /**
     * Create an instance of {@link AttributeName }
     * 
     */
    public AttributeName createAttributeName() {
        return new AttributeName();
    }

    /**
     * Create an instance of {@link AuthTokenControl }
     * 
     */
    public AuthTokenControl createAuthTokenControl() {
        return new AuthTokenControl();
    }

    /**
     * Create an instance of {@link NamedValue }
     * 
     */
    public NamedValue createNamedValue() {
        return new NamedValue();
    }

    /**
     * Create an instance of {@link DistributionListSelector }
     * 
     */
    public DistributionListSelector createDistributionListSelector() {
        return new DistributionListSelector();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbra", name = "context")
    public JAXBElement<HeaderContext> createContext(HeaderContext value) {
        return new JAXBElement<HeaderContext>(_Context_QNAME, HeaderContext.class, null, value);
    }

}


package zimbraadminext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zimbraadminext package. 
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

    private final static QName _GenerateBulkProvisionFileFromLDAPRequest_QNAME = new QName("urn:zimbraAdminExt", "GenerateBulkProvisionFileFromLDAPRequest");
    private final static QName _GenerateBulkProvisionFileFromLDAPResponse_QNAME = new QName("urn:zimbraAdminExt", "GenerateBulkProvisionFileFromLDAPResponse");
    private final static QName _PurgeBulkIMAPImportTasksResponse_QNAME = new QName("urn:zimbraAdminExt", "PurgeBulkIMAPImportTasksResponse");
    private final static QName _GetBulkIMAPImportTaskListResponse_QNAME = new QName("urn:zimbraAdminExt", "GetBulkIMAPImportTaskListResponse");
    private final static QName _BulkIMAPDataImportRequest_QNAME = new QName("urn:zimbraAdminExt", "BulkIMAPDataImportRequest");
    private final static QName _GetBulkIMAPImportTaskListRequest_QNAME = new QName("urn:zimbraAdminExt", "GetBulkIMAPImportTaskListRequest");
    private final static QName _BulkIMAPDataImportResponse_QNAME = new QName("urn:zimbraAdminExt", "BulkIMAPDataImportResponse");
    private final static QName _BulkImportAccountsRequest_QNAME = new QName("urn:zimbraAdminExt", "BulkImportAccountsRequest");
    private final static QName _PurgeBulkIMAPImportTasksRequest_QNAME = new QName("urn:zimbraAdminExt", "PurgeBulkIMAPImportTasksRequest");
    private final static QName _BulkImportAccountsResponse_QNAME = new QName("urn:zimbraAdminExt", "BulkImportAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zimbraadminext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BulkIMAPDataImportResponse }
     * 
     */
    public BulkIMAPDataImportResponse createBulkIMAPDataImportResponse() {
        return new BulkIMAPDataImportResponse();
    }

    /**
     * Create an instance of {@link BulkIMAPDataImportRequest }
     * 
     */
    public BulkIMAPDataImportRequest createBulkIMAPDataImportRequest() {
        return new BulkIMAPDataImportRequest();
    }

    /**
     * Create an instance of {@link PurgeBulkIMAPImportTasksRequest }
     * 
     */
    public PurgeBulkIMAPImportTasksRequest createPurgeBulkIMAPImportTasksRequest() {
        return new PurgeBulkIMAPImportTasksRequest();
    }

    /**
     * Create an instance of {@link GenerateBulkProvisionFileFromLDAPResponse }
     * 
     */
    public GenerateBulkProvisionFileFromLDAPResponse createGenerateBulkProvisionFileFromLDAPResponse() {
        return new GenerateBulkProvisionFileFromLDAPResponse();
    }

    /**
     * Create an instance of {@link GenerateBulkProvisionFileFromLDAPRequest }
     * 
     */
    public GenerateBulkProvisionFileFromLDAPRequest createGenerateBulkProvisionFileFromLDAPRequest() {
        return new GenerateBulkProvisionFileFromLDAPRequest();
    }

    /**
     * Create an instance of {@link GetBulkIMAPImportTaskListRequest }
     * 
     */
    public GetBulkIMAPImportTaskListRequest createGetBulkIMAPImportTaskListRequest() {
        return new GetBulkIMAPImportTaskListRequest();
    }

    /**
     * Create an instance of {@link BulkImportAccountsResponse }
     * 
     */
    public BulkImportAccountsResponse createBulkImportAccountsResponse() {
        return new BulkImportAccountsResponse();
    }

    /**
     * Create an instance of {@link GetBulkIMAPImportTaskListResponse }
     * 
     */
    public GetBulkIMAPImportTaskListResponse createGetBulkIMAPImportTaskListResponse() {
        return new GetBulkIMAPImportTaskListResponse();
    }

    /**
     * Create an instance of {@link PurgeBulkIMAPImportTasksResponse }
     * 
     */
    public PurgeBulkIMAPImportTasksResponse createPurgeBulkIMAPImportTasksResponse() {
        return new PurgeBulkIMAPImportTasksResponse();
    }

    /**
     * Create an instance of {@link BulkImportAccountsRequest }
     * 
     */
    public BulkImportAccountsRequest createBulkImportAccountsRequest() {
        return new BulkImportAccountsRequest();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NameId }
     * 
     */
    public NameId createNameId() {
        return new NameId();
    }

    /**
     * Create an instance of {@link BulkIMAPImportTaskInfo }
     * 
     */
    public BulkIMAPImportTaskInfo createBulkIMAPImportTaskInfo() {
        return new BulkIMAPImportTaskInfo();
    }

    /**
     * Create an instance of {@link Attr }
     * 
     */
    public Attr createAttr() {
        return new Attr();
    }

    /**
     * Create an instance of {@link BulkIMAPDataImportResponse.RunningAccounts }
     * 
     */
    public BulkIMAPDataImportResponse.RunningAccounts createBulkIMAPDataImportResponseRunningAccounts() {
        return new BulkIMAPDataImportResponse.RunningAccounts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateBulkProvisionFileFromLDAPRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "GenerateBulkProvisionFileFromLDAPRequest")
    public JAXBElement<GenerateBulkProvisionFileFromLDAPRequest> createGenerateBulkProvisionFileFromLDAPRequest(GenerateBulkProvisionFileFromLDAPRequest value) {
        return new JAXBElement<GenerateBulkProvisionFileFromLDAPRequest>(_GenerateBulkProvisionFileFromLDAPRequest_QNAME, GenerateBulkProvisionFileFromLDAPRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateBulkProvisionFileFromLDAPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "GenerateBulkProvisionFileFromLDAPResponse")
    public JAXBElement<GenerateBulkProvisionFileFromLDAPResponse> createGenerateBulkProvisionFileFromLDAPResponse(GenerateBulkProvisionFileFromLDAPResponse value) {
        return new JAXBElement<GenerateBulkProvisionFileFromLDAPResponse>(_GenerateBulkProvisionFileFromLDAPResponse_QNAME, GenerateBulkProvisionFileFromLDAPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeBulkIMAPImportTasksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "PurgeBulkIMAPImportTasksResponse")
    public JAXBElement<PurgeBulkIMAPImportTasksResponse> createPurgeBulkIMAPImportTasksResponse(PurgeBulkIMAPImportTasksResponse value) {
        return new JAXBElement<PurgeBulkIMAPImportTasksResponse>(_PurgeBulkIMAPImportTasksResponse_QNAME, PurgeBulkIMAPImportTasksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulkIMAPImportTaskListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "GetBulkIMAPImportTaskListResponse")
    public JAXBElement<GetBulkIMAPImportTaskListResponse> createGetBulkIMAPImportTaskListResponse(GetBulkIMAPImportTaskListResponse value) {
        return new JAXBElement<GetBulkIMAPImportTaskListResponse>(_GetBulkIMAPImportTaskListResponse_QNAME, GetBulkIMAPImportTaskListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkIMAPDataImportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "BulkIMAPDataImportRequest")
    public JAXBElement<BulkIMAPDataImportRequest> createBulkIMAPDataImportRequest(BulkIMAPDataImportRequest value) {
        return new JAXBElement<BulkIMAPDataImportRequest>(_BulkIMAPDataImportRequest_QNAME, BulkIMAPDataImportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulkIMAPImportTaskListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "GetBulkIMAPImportTaskListRequest")
    public JAXBElement<GetBulkIMAPImportTaskListRequest> createGetBulkIMAPImportTaskListRequest(GetBulkIMAPImportTaskListRequest value) {
        return new JAXBElement<GetBulkIMAPImportTaskListRequest>(_GetBulkIMAPImportTaskListRequest_QNAME, GetBulkIMAPImportTaskListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkIMAPDataImportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "BulkIMAPDataImportResponse")
    public JAXBElement<BulkIMAPDataImportResponse> createBulkIMAPDataImportResponse(BulkIMAPDataImportResponse value) {
        return new JAXBElement<BulkIMAPDataImportResponse>(_BulkIMAPDataImportResponse_QNAME, BulkIMAPDataImportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkImportAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "BulkImportAccountsRequest")
    public JAXBElement<BulkImportAccountsRequest> createBulkImportAccountsRequest(BulkImportAccountsRequest value) {
        return new JAXBElement<BulkImportAccountsRequest>(_BulkImportAccountsRequest_QNAME, BulkImportAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeBulkIMAPImportTasksRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "PurgeBulkIMAPImportTasksRequest")
    public JAXBElement<PurgeBulkIMAPImportTasksRequest> createPurgeBulkIMAPImportTasksRequest(PurgeBulkIMAPImportTasksRequest value) {
        return new JAXBElement<PurgeBulkIMAPImportTasksRequest>(_PurgeBulkIMAPImportTasksRequest_QNAME, PurgeBulkIMAPImportTasksRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkImportAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdminExt", name = "BulkImportAccountsResponse")
    public JAXBElement<BulkImportAccountsResponse> createBulkImportAccountsResponse(BulkImportAccountsResponse value) {
        return new JAXBElement<BulkImportAccountsResponse>(_BulkImportAccountsResponse_QNAME, BulkImportAccountsResponse.class, null, value);
    }

}

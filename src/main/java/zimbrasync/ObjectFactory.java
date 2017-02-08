
package zimbrasync;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zimbrasync package. 
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

    private final static QName _RemoveDeviceResponse_QNAME = new QName("urn:zimbraSync", "RemoveDeviceResponse");
    private final static QName _GetDeviceStatusResponse_QNAME = new QName("urn:zimbraSync", "GetDeviceStatusResponse");
    private final static QName _RemoteWipeRequest_QNAME = new QName("urn:zimbraSync", "RemoteWipeRequest");
    private final static QName _ResumeDeviceResponse_QNAME = new QName("urn:zimbraSync", "ResumeDeviceResponse");
    private final static QName _RemoteWipeResponse_QNAME = new QName("urn:zimbraSync", "RemoteWipeResponse");
    private final static QName _GetDeviceStatusRequest_QNAME = new QName("urn:zimbraSync", "GetDeviceStatusRequest");
    private final static QName _CancelPendingRemoteWipeResponse_QNAME = new QName("urn:zimbraSync", "CancelPendingRemoteWipeResponse");
    private final static QName _RemoveDeviceRequest_QNAME = new QName("urn:zimbraSync", "RemoveDeviceRequest");
    private final static QName _SuspendDeviceResponse_QNAME = new QName("urn:zimbraSync", "SuspendDeviceResponse");
    private final static QName _CancelPendingRemoteWipeRequest_QNAME = new QName("urn:zimbraSync", "CancelPendingRemoteWipeRequest");
    private final static QName _SuspendDeviceRequest_QNAME = new QName("urn:zimbraSync", "SuspendDeviceRequest");
    private final static QName _ResumeDeviceRequest_QNAME = new QName("urn:zimbraSync", "ResumeDeviceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zimbrasync
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelPendingRemoteWipeRequest }
     * 
     */
    public CancelPendingRemoteWipeRequest createCancelPendingRemoteWipeRequest() {
        return new CancelPendingRemoteWipeRequest();
    }

    /**
     * Create an instance of {@link RemoteWipeResponse }
     * 
     */
    public RemoteWipeResponse createRemoteWipeResponse() {
        return new RemoteWipeResponse();
    }

    /**
     * Create an instance of {@link ResumeDeviceRequest }
     * 
     */
    public ResumeDeviceRequest createResumeDeviceRequest() {
        return new ResumeDeviceRequest();
    }

    /**
     * Create an instance of {@link SuspendDeviceResponse }
     * 
     */
    public SuspendDeviceResponse createSuspendDeviceResponse() {
        return new SuspendDeviceResponse();
    }

    /**
     * Create an instance of {@link SuspendDeviceRequest }
     * 
     */
    public SuspendDeviceRequest createSuspendDeviceRequest() {
        return new SuspendDeviceRequest();
    }

    /**
     * Create an instance of {@link RemoveDeviceResponse }
     * 
     */
    public RemoveDeviceResponse createRemoveDeviceResponse() {
        return new RemoveDeviceResponse();
    }

    /**
     * Create an instance of {@link CancelPendingRemoteWipeResponse }
     * 
     */
    public CancelPendingRemoteWipeResponse createCancelPendingRemoteWipeResponse() {
        return new CancelPendingRemoteWipeResponse();
    }

    /**
     * Create an instance of {@link RemoteWipeRequest }
     * 
     */
    public RemoteWipeRequest createRemoteWipeRequest() {
        return new RemoteWipeRequest();
    }

    /**
     * Create an instance of {@link GetDeviceStatusResponse }
     * 
     */
    public GetDeviceStatusResponse createGetDeviceStatusResponse() {
        return new GetDeviceStatusResponse();
    }

    /**
     * Create an instance of {@link ResumeDeviceResponse }
     * 
     */
    public ResumeDeviceResponse createResumeDeviceResponse() {
        return new ResumeDeviceResponse();
    }

    /**
     * Create an instance of {@link GetDeviceStatusRequest }
     * 
     */
    public GetDeviceStatusRequest createGetDeviceStatusRequest() {
        return new GetDeviceStatusRequest();
    }

    /**
     * Create an instance of {@link RemoveDeviceRequest }
     * 
     */
    public RemoveDeviceRequest createRemoveDeviceRequest() {
        return new RemoveDeviceRequest();
    }

    /**
     * Create an instance of {@link DeviceId }
     * 
     */
    public DeviceId createDeviceId() {
        return new DeviceId();
    }

    /**
     * Create an instance of {@link DeviceStatusInfo }
     * 
     */
    public DeviceStatusInfo createDeviceStatusInfo() {
        return new DeviceStatusInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "RemoveDeviceResponse")
    public JAXBElement<RemoveDeviceResponse> createRemoveDeviceResponse(RemoveDeviceResponse value) {
        return new JAXBElement<RemoveDeviceResponse>(_RemoveDeviceResponse_QNAME, RemoveDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "GetDeviceStatusResponse")
    public JAXBElement<GetDeviceStatusResponse> createGetDeviceStatusResponse(GetDeviceStatusResponse value) {
        return new JAXBElement<GetDeviceStatusResponse>(_GetDeviceStatusResponse_QNAME, GetDeviceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteWipeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "RemoteWipeRequest")
    public JAXBElement<RemoteWipeRequest> createRemoteWipeRequest(RemoteWipeRequest value) {
        return new JAXBElement<RemoteWipeRequest>(_RemoteWipeRequest_QNAME, RemoteWipeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "ResumeDeviceResponse")
    public JAXBElement<ResumeDeviceResponse> createResumeDeviceResponse(ResumeDeviceResponse value) {
        return new JAXBElement<ResumeDeviceResponse>(_ResumeDeviceResponse_QNAME, ResumeDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteWipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "RemoteWipeResponse")
    public JAXBElement<RemoteWipeResponse> createRemoteWipeResponse(RemoteWipeResponse value) {
        return new JAXBElement<RemoteWipeResponse>(_RemoteWipeResponse_QNAME, RemoteWipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "GetDeviceStatusRequest")
    public JAXBElement<GetDeviceStatusRequest> createGetDeviceStatusRequest(GetDeviceStatusRequest value) {
        return new JAXBElement<GetDeviceStatusRequest>(_GetDeviceStatusRequest_QNAME, GetDeviceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingRemoteWipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "CancelPendingRemoteWipeResponse")
    public JAXBElement<CancelPendingRemoteWipeResponse> createCancelPendingRemoteWipeResponse(CancelPendingRemoteWipeResponse value) {
        return new JAXBElement<CancelPendingRemoteWipeResponse>(_CancelPendingRemoteWipeResponse_QNAME, CancelPendingRemoteWipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "RemoveDeviceRequest")
    public JAXBElement<RemoveDeviceRequest> createRemoveDeviceRequest(RemoveDeviceRequest value) {
        return new JAXBElement<RemoveDeviceRequest>(_RemoveDeviceRequest_QNAME, RemoveDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "SuspendDeviceResponse")
    public JAXBElement<SuspendDeviceResponse> createSuspendDeviceResponse(SuspendDeviceResponse value) {
        return new JAXBElement<SuspendDeviceResponse>(_SuspendDeviceResponse_QNAME, SuspendDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingRemoteWipeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "CancelPendingRemoteWipeRequest")
    public JAXBElement<CancelPendingRemoteWipeRequest> createCancelPendingRemoteWipeRequest(CancelPendingRemoteWipeRequest value) {
        return new JAXBElement<CancelPendingRemoteWipeRequest>(_CancelPendingRemoteWipeRequest_QNAME, CancelPendingRemoteWipeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "SuspendDeviceRequest")
    public JAXBElement<SuspendDeviceRequest> createSuspendDeviceRequest(SuspendDeviceRequest value) {
        return new JAXBElement<SuspendDeviceRequest>(_SuspendDeviceRequest_QNAME, SuspendDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraSync", name = "ResumeDeviceRequest")
    public JAXBElement<ResumeDeviceRequest> createResumeDeviceRequest(ResumeDeviceRequest value) {
        return new JAXBElement<ResumeDeviceRequest>(_ResumeDeviceRequest_QNAME, ResumeDeviceRequest.class, null, value);
    }

}

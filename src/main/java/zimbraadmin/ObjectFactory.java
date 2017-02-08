
package zimbraadmin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the zimbraadmin package. 
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

    private final static QName _GetVersionInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetVersionInfoRequest");
    private final static QName _ModifySMIMEConfigResponse_QNAME = new QName("urn:zimbraAdmin", "ModifySMIMEConfigResponse");
    private final static QName _AutoProvAccountRequest_QNAME = new QName("urn:zimbraAdmin", "AutoProvAccountRequest");
    private final static QName _UnloadMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "UnloadMailboxRequest");
    private final static QName _GetServerStatsResponse_QNAME = new QName("urn:zimbraAdmin", "GetServerStatsResponse");
    private final static QName _RolloverRedoLogRequest_QNAME = new QName("urn:zimbraAdmin", "RolloverRedoLogRequest");
    private final static QName _ReloadMemcachedClientConfigRequest_QNAME = new QName("urn:zimbraAdmin", "ReloadMemcachedClientConfigRequest");
    private final static QName _SyncGalAccountRequest_QNAME = new QName("urn:zimbraAdmin", "SyncGalAccountRequest");
    private final static QName _GrantRightRequest_QNAME = new QName("urn:zimbraAdmin", "GrantRightRequest");
    private final static QName _PurgeMovedMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "PurgeMovedMailboxResponse");
    private final static QName _GetAllMailboxesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllMailboxesResponse");
    private final static QName _RenameCosRequest_QNAME = new QName("urn:zimbraAdmin", "RenameCosRequest");
    private final static QName _ModifyAlwaysOnClusterResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyAlwaysOnClusterResponse");
    private final static QName _AdminCreateWaitSetResponse_QNAME = new QName("urn:zimbraAdmin", "AdminCreateWaitSetResponse");
    private final static QName _DeleteDataSourceResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteDataSourceResponse");
    private final static QName _SearchCalendarResourcesRequest_QNAME = new QName("urn:zimbraAdmin", "SearchCalendarResourcesRequest");
    private final static QName _GenCSRRequest_QNAME = new QName("urn:zimbraAdmin", "GenCSRRequest");
    private final static QName _RemoveDistributionListMemberRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveDistributionListMemberRequest");
    private final static QName _GetServerNIfsRequest_QNAME = new QName("urn:zimbraAdmin", "GetServerNIfsRequest");
    private final static QName _ConfigureZimletRequest_QNAME = new QName("urn:zimbraAdmin", "ConfigureZimletRequest");
    private final static QName _ExportMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "ExportMailboxResponse");
    private final static QName _GetAllAlwaysOnClustersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllAlwaysOnClustersResponse");
    private final static QName _SearchDirectoryResponse_QNAME = new QName("urn:zimbraAdmin", "SearchDirectoryResponse");
    private final static QName _CreateVolumeResponse_QNAME = new QName("urn:zimbraAdmin", "CreateVolumeResponse");
    private final static QName _CheckExchangeAuthRequest_QNAME = new QName("urn:zimbraAdmin", "CheckExchangeAuthRequest");
    private final static QName _CreateCalendarResourceRequest_QNAME = new QName("urn:zimbraAdmin", "CreateCalendarResourceRequest");
    private final static QName _GetServerStatsRequest_QNAME = new QName("urn:zimbraAdmin", "GetServerStatsRequest");
    private final static QName _RemoveAccountLoggerRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveAccountLoggerRequest");
    private final static QName _QueryMailboxMoveResponse_QNAME = new QName("urn:zimbraAdmin", "QueryMailboxMoveResponse");
    private final static QName _GetAllServersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllServersRequest");
    private final static QName _SearchAccountsResponse_QNAME = new QName("urn:zimbraAdmin", "SearchAccountsResponse");
    private final static QName _GetCalendarResourceResponse_QNAME = new QName("urn:zimbraAdmin", "GetCalendarResourceResponse");
    private final static QName _CompactIndexRequest_QNAME = new QName("urn:zimbraAdmin", "CompactIndexRequest");
    private final static QName _GetAccountLoggersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAccountLoggersRequest");
    private final static QName _GetAllXMPPComponentsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllXMPPComponentsRequest");
    private final static QName _SetServerOfflineResponse_QNAME = new QName("urn:zimbraAdmin", "SetServerOfflineResponse");
    private final static QName _GetAllAdminAccountsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllAdminAccountsRequest");
    private final static QName _ModifyDelegatedAdminConstraintsRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyDelegatedAdminConstraintsRequest");
    private final static QName _VerifyCertKeyResponse_QNAME = new QName("urn:zimbraAdmin", "VerifyCertKeyResponse");
    private final static QName _GetShareInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetShareInfoRequest");
    private final static QName _AdminDestroyWaitSetResponse_QNAME = new QName("urn:zimbraAdmin", "AdminDestroyWaitSetResponse");
    private final static QName _CheckHostnameResolveRequest_QNAME = new QName("urn:zimbraAdmin", "CheckHostnameResolveRequest");
    private final static QName _CreateXMbxSearchResponse_QNAME = new QName("urn:zimbraAdmin", "CreateXMbxSearchResponse");
    private final static QName _AbortXMbxSearchRequest_QNAME = new QName("urn:zimbraAdmin", "AbortXMbxSearchRequest");
    private final static QName _GetRightsDocRequest_QNAME = new QName("urn:zimbraAdmin", "GetRightsDocRequest");
    private final static QName _CreateDomainRequest_QNAME = new QName("urn:zimbraAdmin", "CreateDomainRequest");
    private final static QName _GetMemcachedClientConfigRequest_QNAME = new QName("urn:zimbraAdmin", "GetMemcachedClientConfigRequest");
    private final static QName _CountAccountResponse_QNAME = new QName("urn:zimbraAdmin", "CountAccountResponse");
    private final static QName _MigrateAccountRequest_QNAME = new QName("urn:zimbraAdmin", "MigrateAccountRequest");
    private final static QName _PushFreeBusyResponse_QNAME = new QName("urn:zimbraAdmin", "PushFreeBusyResponse");
    private final static QName _RestoreResponse_QNAME = new QName("urn:zimbraAdmin", "RestoreResponse");
    private final static QName _DeleteDomainResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteDomainResponse");
    private final static QName _ModifyVolumeResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyVolumeResponse");
    private final static QName _DeleteCalendarResourceRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteCalendarResourceRequest");
    private final static QName _MoveMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "MoveMailboxRequest");
    private final static QName _GetAllUCProvidersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllUCProvidersResponse");
    private final static QName _A_QNAME = new QName("urn:zimbraAdmin", "a");
    private final static QName _EnableArchiveRequest_QNAME = new QName("urn:zimbraAdmin", "EnableArchiveRequest");
    private final static QName _GetDevicesCountSinceLastUsedRequest_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountSinceLastUsedRequest");
    private final static QName _GetAllZimletsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllZimletsResponse");
    private final static QName _GrantRightResponse_QNAME = new QName("urn:zimbraAdmin", "GrantRightResponse");
    private final static QName _Cos_QNAME = new QName("urn:zimbraAdmin", "cos");
    private final static QName _RemoveDeviceResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveDeviceResponse");
    private final static QName _GetDeviceStatusResponse_QNAME = new QName("urn:zimbraAdmin", "GetDeviceStatusResponse");
    private final static QName _RestoreRequest_QNAME = new QName("urn:zimbraAdmin", "RestoreRequest");
    private final static QName _ModifyCosResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyCosResponse");
    private final static QName _GetAllRightsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllRightsResponse");
    private final static QName _ModifyDelegatedAdminConstraintsResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyDelegatedAdminConstraintsResponse");
    private final static QName _DeleteGalSyncAccountResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteGalSyncAccountResponse");
    private final static QName _AdminWaitSetRequest_QNAME = new QName("urn:zimbraAdmin", "AdminWaitSetRequest");
    private final static QName _GetAccountLoggersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAccountLoggersResponse");
    private final static QName _GetDistributionListResponse_QNAME = new QName("urn:zimbraAdmin", "GetDistributionListResponse");
    private final static QName _RegisterMailboxMoveOutRequest_QNAME = new QName("urn:zimbraAdmin", "RegisterMailboxMoveOutRequest");
    private final static QName _RevokeRightRequest_QNAME = new QName("urn:zimbraAdmin", "RevokeRightRequest");
    private final static QName _ReloadAccountResponse_QNAME = new QName("urn:zimbraAdmin", "ReloadAccountResponse");
    private final static QName _GetDelegatedAdminConstraintsRequest_QNAME = new QName("urn:zimbraAdmin", "GetDelegatedAdminConstraintsRequest");
    private final static QName _ModifyConfigRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyConfigRequest");
    private final static QName _GetApplianceHSMFSResponse_QNAME = new QName("urn:zimbraAdmin", "GetApplianceHSMFSResponse");
    private final static QName _AbortXMbxSearchResponse_QNAME = new QName("urn:zimbraAdmin", "AbortXMbxSearchResponse");
    private final static QName _GetClusterStatusRequest_QNAME = new QName("urn:zimbraAdmin", "GetClusterStatusRequest");
    private final static QName _GetConfigResponse_QNAME = new QName("urn:zimbraAdmin", "GetConfigResponse");
    private final static QName _ModifyDataSourceRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyDataSourceRequest");
    private final static QName _Ucservice_QNAME = new QName("urn:zimbraAdmin", "ucservice");
    private final static QName _DeleteMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteMailboxResponse");
    private final static QName _AbortHsmResponse_QNAME = new QName("urn:zimbraAdmin", "AbortHsmResponse");
    private final static QName _RenameUCServiceResponse_QNAME = new QName("urn:zimbraAdmin", "RenameUCServiceResponse");
    private final static QName _ResetAllLoggersRequest_QNAME = new QName("urn:zimbraAdmin", "ResetAllLoggersRequest");
    private final static QName _ActivateLicenseResponse_QNAME = new QName("urn:zimbraAdmin", "ActivateLicenseResponse");
    private final static QName _GetServiceStatusRequest_QNAME = new QName("urn:zimbraAdmin", "GetServiceStatusRequest");
    private final static QName _GetZimletResponse_QNAME = new QName("urn:zimbraAdmin", "GetZimletResponse");
    private final static QName _CreateAlwaysOnClusterRequest_QNAME = new QName("urn:zimbraAdmin", "CreateAlwaysOnClusterRequest");
    private final static QName _DeleteGalSyncAccountRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteGalSyncAccountRequest");
    private final static QName _GetGrantsResponse_QNAME = new QName("urn:zimbraAdmin", "GetGrantsResponse");
    private final static QName _DeleteLDAPEntryResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteLDAPEntryResponse");
    private final static QName _RemoteWipeRequest_QNAME = new QName("urn:zimbraAdmin", "RemoteWipeRequest");
    private final static QName _CreateUCServiceResponse_QNAME = new QName("urn:zimbraAdmin", "CreateUCServiceResponse");
    private final static QName _NoOpRequest_QNAME = new QName("urn:zimbraAdmin", "NoOpRequest");
    private final static QName _GetAllCalendarResourcesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllCalendarResourcesResponse");
    private final static QName _MailQueueFlushResponse_QNAME = new QName("urn:zimbraAdmin", "MailQueueFlushResponse");
    private final static QName _GetDevicesCountUsedTodayResponse_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountUsedTodayResponse");
    private final static QName _DeleteZimletRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteZimletRequest");
    private final static QName _GetSyncStateResponse_QNAME = new QName("urn:zimbraAdmin", "GetSyncStateResponse");
    private final static QName _CopyCosRequest_QNAME = new QName("urn:zimbraAdmin", "CopyCosRequest");
    private final static QName _ModifyDataSourceResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyDataSourceResponse");
    private final static QName _ModifyAccountResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyAccountResponse");
    private final static QName _RevokeRightResponse_QNAME = new QName("urn:zimbraAdmin", "RevokeRightResponse");
    private final static QName _ModifyAlwaysOnClusterRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyAlwaysOnClusterRequest");
    private final static QName _RunUnitTestsResponse_QNAME = new QName("urn:zimbraAdmin", "RunUnitTestsResponse");
    private final static QName _GetSyncStateRequest_QNAME = new QName("urn:zimbraAdmin", "GetSyncStateRequest");
    private final static QName _CreateDistributionListResponse_QNAME = new QName("urn:zimbraAdmin", "CreateDistributionListResponse");
    private final static QName _AdminWaitSetResponse_QNAME = new QName("urn:zimbraAdmin", "AdminWaitSetResponse");
    private final static QName _CreateLDAPEntryRequest_QNAME = new QName("urn:zimbraAdmin", "CreateLDAPEntryRequest");
    private final static QName _GetAllLocalesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllLocalesRequest");
    private final static QName _GetMailboxVersionResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailboxVersionResponse");
    private final static QName _ModifySystemRetentionPolicyRequest_QNAME = new QName("urn:zimbraAdmin", "ModifySystemRetentionPolicyRequest");
    private final static QName _GetDomainRequest_QNAME = new QName("urn:zimbraAdmin", "GetDomainRequest");
    private final static QName _NoOpResponse_QNAME = new QName("urn:zimbraAdmin", "NoOpResponse");
    private final static QName _RenameAccountRequest_QNAME = new QName("urn:zimbraAdmin", "RenameAccountRequest");
    private final static QName _UpdatePresenceSessionIdRequest_QNAME = new QName("urn:zimbraAdmin", "UpdatePresenceSessionIdRequest");
    private final static QName _DedupeBlobsRequest_QNAME = new QName("urn:zimbraAdmin", "DedupeBlobsRequest");
    private final static QName _GetAllAccountLoggersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllAccountLoggersRequest");
    private final static QName _GetLDAPEntriesResponse_QNAME = new QName("urn:zimbraAdmin", "GetLDAPEntriesResponse");
    private final static QName _CountAccountRequest_QNAME = new QName("urn:zimbraAdmin", "CountAccountRequest");
    private final static QName _GetSessionsRequest_QNAME = new QName("urn:zimbraAdmin", "GetSessionsRequest");
    private final static QName _ComputeAggregateQuotaUsageResponse_QNAME = new QName("urn:zimbraAdmin", "ComputeAggregateQuotaUsageResponse");
    private final static QName _GetAllUCProvidersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllUCProvidersRequest");
    private final static QName _MailQueueFlushRequest_QNAME = new QName("urn:zimbraAdmin", "MailQueueFlushRequest");
    private final static QName _GetZimletRequest_QNAME = new QName("urn:zimbraAdmin", "GetZimletRequest");
    private final static QName _CreateGalSyncAccountResponse_QNAME = new QName("urn:zimbraAdmin", "CreateGalSyncAccountResponse");
    private final static QName _GenCSRResponse_QNAME = new QName("urn:zimbraAdmin", "GenCSRResponse");
    private final static QName _GetDistributionListMembershipResponse_QNAME = new QName("urn:zimbraAdmin", "GetDistributionListMembershipResponse");
    private final static QName _GetCurrentVolumesRequest_QNAME = new QName("urn:zimbraAdmin", "GetCurrentVolumesRequest");
    private final static QName _DumpSessionsResponse_QNAME = new QName("urn:zimbraAdmin", "DumpSessionsResponse");
    private final static QName _GetAdminSavedSearchesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAdminSavedSearchesRequest");
    private final static QName _GetDomainResponse_QNAME = new QName("urn:zimbraAdmin", "GetDomainResponse");
    private final static QName _UploadDomCertResponse_QNAME = new QName("urn:zimbraAdmin", "UploadDomCertResponse");
    private final static QName _QueryWaitSetRequest_QNAME = new QName("urn:zimbraAdmin", "QueryWaitSetRequest");
    private final static QName _GetAllSkinsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllSkinsRequest");
    private final static QName _ExportAndDeleteItemsResponse_QNAME = new QName("urn:zimbraAdmin", "ExportAndDeleteItemsResponse");
    private final static QName _GetAllConfigRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllConfigRequest");
    private final static QName _CreateDataSourceResponse_QNAME = new QName("urn:zimbraAdmin", "CreateDataSourceResponse");
    private final static QName _SearchGalRequest_QNAME = new QName("urn:zimbraAdmin", "SearchGalRequest");
    private final static QName _GetCreateObjectAttrsRequest_QNAME = new QName("urn:zimbraAdmin", "GetCreateObjectAttrsRequest");
    private final static QName _Target_QNAME = new QName("urn:zimbraAdmin", "target");
    private final static QName _DeleteAlwaysOnClusterResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteAlwaysOnClusterResponse");
    private final static QName _GetCurrentVolumesResponse_QNAME = new QName("urn:zimbraAdmin", "GetCurrentVolumesResponse");
    private final static QName _AddGalSyncDataSourceRequest_QNAME = new QName("urn:zimbraAdmin", "AddGalSyncDataSourceRequest");
    private final static QName _GetAccountMembershipResponse_QNAME = new QName("urn:zimbraAdmin", "GetAccountMembershipResponse");
    private final static QName _GetAlwaysOnClusterResponse_QNAME = new QName("urn:zimbraAdmin", "GetAlwaysOnClusterResponse");
    private final static QName _LockoutMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "LockoutMailboxRequest");
    private final static QName _MoveMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "MoveMailboxResponse");
    private final static QName _RefreshRegisteredAuthTokensResponse_QNAME = new QName("urn:zimbraAdmin", "RefreshRegisteredAuthTokensResponse");
    private final static QName _GetIndexStatsRequest_QNAME = new QName("urn:zimbraAdmin", "GetIndexStatsRequest");
    private final static QName _ModifyCalendarResourceRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyCalendarResourceRequest");
    private final static QName _ReloadMemcachedClientConfigResponse_QNAME = new QName("urn:zimbraAdmin", "ReloadMemcachedClientConfigResponse");
    private final static QName _Mbox_QNAME = new QName("urn:zimbraAdmin", "mbox");
    private final static QName _GetAllVolumesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllVolumesRequest");
    private final static QName _GetAllActiveServersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllActiveServersResponse");
    private final static QName _GetAdminConsoleUICompResponse_QNAME = new QName("urn:zimbraAdmin", "GetAdminConsoleUICompResponse");
    private final static QName _InstallLicenseRequest_QNAME = new QName("urn:zimbraAdmin", "InstallLicenseRequest");
    private final static QName _SetPasswordRequest_QNAME = new QName("urn:zimbraAdmin", "SetPasswordRequest");
    private final static QName _GetEffectiveRightsResponse_QNAME = new QName("urn:zimbraAdmin", "GetEffectiveRightsResponse");
    private final static QName _CreateCosRequest_QNAME = new QName("urn:zimbraAdmin", "CreateCosRequest");
    private final static QName _CreateServerResponse_QNAME = new QName("urn:zimbraAdmin", "CreateServerResponse");
    private final static QName _DeleteVolumeResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteVolumeResponse");
    private final static QName _IncludeCSS_QNAME = new QName("urn:zimbraAdmin", "includeCSS");
    private final static QName _CheckAuthConfigRequest_QNAME = new QName("urn:zimbraAdmin", "CheckAuthConfigRequest");
    private final static QName _RemoteWipeResponse_QNAME = new QName("urn:zimbraAdmin", "RemoteWipeResponse");
    private final static QName _GetCertRequest_QNAME = new QName("urn:zimbraAdmin", "GetCertRequest");
    private final static QName _ReloadAccountRequest_QNAME = new QName("urn:zimbraAdmin", "ReloadAccountRequest");
    private final static QName _GetAllCosRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllCosRequest");
    private final static QName _UnregisterMailboxMoveOutRequest_QNAME = new QName("urn:zimbraAdmin", "UnregisterMailboxMoveOutRequest");
    private final static QName _MoveBlobsRequest_QNAME = new QName("urn:zimbraAdmin", "MoveBlobsRequest");
    private final static QName _GetAllXMPPComponentsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllXMPPComponentsResponse");
    private final static QName _ModifyServerResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyServerResponse");
    private final static QName _RemoveAccountAliasResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveAccountAliasResponse");
    private final static QName _GetServiceStatusResponse_QNAME = new QName("urn:zimbraAdmin", "GetServiceStatusResponse");
    private final static QName _GetDomainInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetDomainInfoRequest");
    private final static QName _CreateZimletRequest_QNAME = new QName("urn:zimbraAdmin", "CreateZimletRequest");
    private final static QName _GetMailboxVersionRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailboxVersionRequest");
    private final static QName _CheckHealthResponse_QNAME = new QName("urn:zimbraAdmin", "CheckHealthResponse");
    private final static QName _ModifySMIMEConfigRequest_QNAME = new QName("urn:zimbraAdmin", "ModifySMIMEConfigRequest");
    private final static QName _GetXMbxSearchesListRequest_QNAME = new QName("urn:zimbraAdmin", "GetXMbxSearchesListRequest");
    private final static QName _ModifyCalendarResourceResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyCalendarResourceResponse");
    private final static QName _VerifyStoreManagerResponse_QNAME = new QName("urn:zimbraAdmin", "VerifyStoreManagerResponse");
    private final static QName _GetUCServiceResponse_QNAME = new QName("urn:zimbraAdmin", "GetUCServiceResponse");
    private final static QName _GetAllVolumesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllVolumesResponse");
    private final static QName _FlushCacheRequest_QNAME = new QName("urn:zimbraAdmin", "FlushCacheRequest");
    private final static QName _GetAllDomainsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllDomainsResponse");
    private final static QName _SearchDirectoryRequest_QNAME = new QName("urn:zimbraAdmin", "SearchDirectoryRequest");
    private final static QName _GetDevicesCountResponse_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountResponse");
    private final static QName _FixCalendarPriorityResponse_QNAME = new QName("urn:zimbraAdmin", "FixCalendarPriorityResponse");
    private final static QName _SearchCalendarResourcesResponse_QNAME = new QName("urn:zimbraAdmin", "SearchCalendarResourcesResponse");
    private final static QName _AddAccountAliasRequest_QNAME = new QName("urn:zimbraAdmin", "AddAccountAliasRequest");
    private final static QName _AddDistributionListMemberRequest_QNAME = new QName("urn:zimbraAdmin", "AddDistributionListMemberRequest");
    private final static QName _GetAdminSavedSearchesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAdminSavedSearchesResponse");
    private final static QName _CountObjectsResponse_QNAME = new QName("urn:zimbraAdmin", "CountObjectsResponse");
    private final static QName _GetDataSourcesRequest_QNAME = new QName("urn:zimbraAdmin", "GetDataSourcesRequest");
    private final static QName _DeleteUCServiceResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteUCServiceResponse");
    private final static QName _GetDistributionListRequest_QNAME = new QName("urn:zimbraAdmin", "GetDistributionListRequest");
    private final static QName _ModifyAdminSavedSearchesResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyAdminSavedSearchesResponse");
    private final static QName _PingRequest_QNAME = new QName("urn:zimbraAdmin", "PingRequest");
    private final static QName _RenameCosResponse_QNAME = new QName("urn:zimbraAdmin", "RenameCosResponse");
    private final static QName _AddAccountAliasResponse_QNAME = new QName("urn:zimbraAdmin", "AddAccountAliasResponse");
    private final static QName _GetAggregateQuotaUsageOnServerRequest_QNAME = new QName("urn:zimbraAdmin", "GetAggregateQuotaUsageOnServerRequest");
    private final static QName _GetSMIMEConfigRequest_QNAME = new QName("urn:zimbraAdmin", "GetSMIMEConfigRequest");
    private final static QName _DeleteXMbxSearchRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteXMbxSearchRequest");
    private final static QName _CountObjectsRequest_QNAME = new QName("urn:zimbraAdmin", "CountObjectsRequest");
    private final static QName _GetAdminExtensionZimletsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAdminExtensionZimletsRequest");
    private final static QName _PurgeFreeBusyQueueResponse_QNAME = new QName("urn:zimbraAdmin", "PurgeFreeBusyQueueResponse");
    private final static QName _GetLicenseResponse_QNAME = new QName("urn:zimbraAdmin", "GetLicenseResponse");
    private final static QName _ReIndexResponse_QNAME = new QName("urn:zimbraAdmin", "ReIndexResponse");
    private final static QName _ActivateLicenseRequest_QNAME = new QName("urn:zimbraAdmin", "ActivateLicenseRequest");
    private final static QName _Values_QNAME = new QName("urn:zimbraAdmin", "values");
    private final static QName _Alias_QNAME = new QName("urn:zimbraAdmin", "alias");
    private final static QName _AdminDestroyWaitSetRequest_QNAME = new QName("urn:zimbraAdmin", "AdminDestroyWaitSetRequest");
    private final static QName _VersionCheckRequest_QNAME = new QName("urn:zimbraAdmin", "VersionCheckRequest");
    private final static QName _RecalculateMailboxCountsResponse_QNAME = new QName("urn:zimbraAdmin", "RecalculateMailboxCountsResponse");
    private final static QName _CheckDomainMXRecordResponse_QNAME = new QName("urn:zimbraAdmin", "CheckDomainMXRecordResponse");
    private final static QName _AddDistributionListAliasRequest_QNAME = new QName("urn:zimbraAdmin", "AddDistributionListAliasRequest");
    private final static QName _PushFreeBusyRequest_QNAME = new QName("urn:zimbraAdmin", "PushFreeBusyRequest");
    private final static QName _ExportAndDeleteItemsRequest_QNAME = new QName("urn:zimbraAdmin", "ExportAndDeleteItemsRequest");
    private final static QName _RenameCalendarResourceRequest_QNAME = new QName("urn:zimbraAdmin", "RenameCalendarResourceRequest");
    private final static QName _GetMailQueueInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailQueueInfoRequest");
    private final static QName _UnregisterMailboxMoveOutResponse_QNAME = new QName("urn:zimbraAdmin", "UnregisterMailboxMoveOutResponse");
    private final static QName _GetAccountMembershipRequest_QNAME = new QName("urn:zimbraAdmin", "GetAccountMembershipRequest");
    private final static QName _GetClusterStatusResponse_QNAME = new QName("urn:zimbraAdmin", "GetClusterStatusResponse");
    private final static QName _InstallCertResponse_QNAME = new QName("urn:zimbraAdmin", "InstallCertResponse");
    private final static QName _FlushCacheResponse_QNAME = new QName("urn:zimbraAdmin", "FlushCacheResponse");
    private final static QName _AddAccountLoggerResponse_QNAME = new QName("urn:zimbraAdmin", "AddAccountLoggerResponse");
    private final static QName _FailoverClusterServiceRequest_QNAME = new QName("urn:zimbraAdmin", "FailoverClusterServiceRequest");
    private final static QName _CreateVolumeRequest_QNAME = new QName("urn:zimbraAdmin", "CreateVolumeRequest");
    private final static QName _DeleteAccountResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteAccountResponse");
    private final static QName _UpdateDeviceStatusResponse_QNAME = new QName("urn:zimbraAdmin", "UpdateDeviceStatusResponse");
    private final static QName _ModifyZimletRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyZimletRequest");
    private final static QName _DisableArchiveRequest_QNAME = new QName("urn:zimbraAdmin", "DisableArchiveRequest");
    private final static QName _GetAllAccountsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllAccountsRequest");
    private final static QName _GetAllUCServicesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllUCServicesRequest");
    private final static QName _ReloadLocalConfigRequest_QNAME = new QName("urn:zimbraAdmin", "ReloadLocalConfigRequest");
    private final static QName _CreateGalSyncAccountRequest_QNAME = new QName("urn:zimbraAdmin", "CreateGalSyncAccountRequest");
    private final static QName _GetRightResponse_QNAME = new QName("urn:zimbraAdmin", "GetRightResponse");
    private final static QName _RemoveDistributionListAliasRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveDistributionListAliasRequest");
    private final static QName _ReIndexRequest_QNAME = new QName("urn:zimbraAdmin", "ReIndexRequest");
    private final static QName _DeleteXMbxSearchResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteXMbxSearchResponse");
    private final static QName _VerifyIndexResponse_QNAME = new QName("urn:zimbraAdmin", "VerifyIndexResponse");
    private final static QName _GetZimletStatusResponse_QNAME = new QName("urn:zimbraAdmin", "GetZimletStatusResponse");
    private final static QName _ResumeDeviceResponse_QNAME = new QName("urn:zimbraAdmin", "ResumeDeviceResponse");
    private final static QName _GetApplianceHSMFSRequest_QNAME = new QName("urn:zimbraAdmin", "GetApplianceHSMFSRequest");
    private final static QName _AddDistributionListMemberResponse_QNAME = new QName("urn:zimbraAdmin", "AddDistributionListMemberResponse");
    private final static QName _CheckDirectoryRequest_QNAME = new QName("urn:zimbraAdmin", "CheckDirectoryRequest");
    private final static QName _VerifyCertKeyRequest_QNAME = new QName("urn:zimbraAdmin", "VerifyCertKeyRequest");
    private final static QName _BackupResponse_QNAME = new QName("urn:zimbraAdmin", "BackupResponse");
    private final static QName _SearchAutoProvDirectoryRequest_QNAME = new QName("urn:zimbraAdmin", "SearchAutoProvDirectoryRequest");
    private final static QName _GetDelegatedAdminConstraintsResponse_QNAME = new QName("urn:zimbraAdmin", "GetDelegatedAdminConstraintsResponse");
    private final static QName _GetVolumeRequest_QNAME = new QName("urn:zimbraAdmin", "GetVolumeRequest");
    private final static QName _UnloadMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "UnloadMailboxResponse");
    private final static QName _DeleteUCServiceRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteUCServiceRequest");
    private final static QName _GetRightRequest_QNAME = new QName("urn:zimbraAdmin", "GetRightRequest");
    private final static QName _AutoCompleteGalRequest_QNAME = new QName("urn:zimbraAdmin", "AutoCompleteGalRequest");
    private final static QName _GetAllEffectiveRightsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllEffectiveRightsResponse");
    private final static QName _Dl_QNAME = new QName("urn:zimbraAdmin", "dl");
    private final static QName _UploadProxyCARequest_QNAME = new QName("urn:zimbraAdmin", "UploadProxyCARequest");
    private final static QName _DeleteVolumeRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteVolumeRequest");
    private final static QName _GetAdminExtensionZimletsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAdminExtensionZimletsResponse");
    private final static QName _DeleteSystemRetentionPolicyResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteSystemRetentionPolicyResponse");
    private final static QName _QueryWaitSetResponse_QNAME = new QName("urn:zimbraAdmin", "QueryWaitSetResponse");
    private final static QName _UpdatePresenceSessionIdResponse_QNAME = new QName("urn:zimbraAdmin", "UpdatePresenceSessionIdResponse");
    private final static QName _DelegateAuthRequest_QNAME = new QName("urn:zimbraAdmin", "DelegateAuthRequest");
    private final static QName _GetAggregateQuotaUsageOnServerResponse_QNAME = new QName("urn:zimbraAdmin", "GetAggregateQuotaUsageOnServerResponse");
    private final static QName _GetAllDistributionListsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllDistributionListsRequest");
    private final static QName _GetCSRResponse_QNAME = new QName("urn:zimbraAdmin", "GetCSRResponse");
    private final static QName _GetDevicesCountSinceLastUsedResponse_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountSinceLastUsedResponse");
    private final static QName _GetLicenseInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetLicenseInfoResponse");
    private final static QName _GetServerRequest_QNAME = new QName("urn:zimbraAdmin", "GetServerRequest");
    private final static QName _GetZimletStatusRequest_QNAME = new QName("urn:zimbraAdmin", "GetZimletStatusRequest");
    private final static QName _RemoveDistributionListAliasResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveDistributionListAliasResponse");
    private final static QName _CheckRightRequest_QNAME = new QName("urn:zimbraAdmin", "CheckRightRequest");
    private final static QName _FixCalendarTZRequest_QNAME = new QName("urn:zimbraAdmin", "FixCalendarTZRequest");
    private final static QName _GetMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailboxRequest");
    private final static QName _CreateSystemRetentionPolicyResponse_QNAME = new QName("urn:zimbraAdmin", "CreateSystemRetentionPolicyResponse");
    private final static QName _SetLocalServerOnlineRequest_QNAME = new QName("urn:zimbraAdmin", "SetLocalServerOnlineRequest");
    private final static QName _CreateAlwaysOnClusterResponse_QNAME = new QName("urn:zimbraAdmin", "CreateAlwaysOnClusterResponse");
    private final static QName _GetMailboxVolumesRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailboxVolumesRequest");
    private final static QName _CreateServerRequest_QNAME = new QName("urn:zimbraAdmin", "CreateServerRequest");
    private final static QName _GetConfigRequest_QNAME = new QName("urn:zimbraAdmin", "GetConfigRequest");
    private final static QName _FixCalendarEndTimeResponse_QNAME = new QName("urn:zimbraAdmin", "FixCalendarEndTimeResponse");
    private final static QName _CheckGalConfigRequest_QNAME = new QName("urn:zimbraAdmin", "CheckGalConfigRequest");
    private final static QName _DeleteDistributionListResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteDistributionListResponse");
    private final static QName _DeleteServerResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteServerResponse");
    private final static QName _ModifyVolumeRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyVolumeRequest");
    private final static QName _GetCreateObjectAttrsResponse_QNAME = new QName("urn:zimbraAdmin", "GetCreateObjectAttrsResponse");
    private final static QName _RemoveDistributionListMemberResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveDistributionListMemberResponse");
    private final static QName _DeleteCosRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteCosRequest");
    private final static QName _GetIndexStatsResponse_QNAME = new QName("urn:zimbraAdmin", "GetIndexStatsResponse");
    private final static QName _GetMailQueueInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailQueueInfoResponse");
    private final static QName _LockoutMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "LockoutMailboxResponse");
    private final static QName _RenameCalendarResourceResponse_QNAME = new QName("urn:zimbraAdmin", "RenameCalendarResourceResponse");
    private final static QName _DeleteMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteMailboxRequest");
    private final static QName _InstallCertRequest_QNAME = new QName("urn:zimbraAdmin", "InstallCertRequest");
    private final static QName _PurgeMovedMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "PurgeMovedMailboxRequest");
    private final static QName _GetDevicesCountRequest_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountRequest");
    private final static QName _RenameUCServiceRequest_QNAME = new QName("urn:zimbraAdmin", "RenameUCServiceRequest");
    private final static QName _CheckExchangeAuthResponse_QNAME = new QName("urn:zimbraAdmin", "CheckExchangeAuthResponse");
    private final static QName _AutoProvTaskControlRequest_QNAME = new QName("urn:zimbraAdmin", "AutoProvTaskControlRequest");
    private final static QName _PingResponse_QNAME = new QName("urn:zimbraAdmin", "PingResponse");
    private final static QName _CheckHostnameResolveResponse_QNAME = new QName("urn:zimbraAdmin", "CheckHostnameResolveResponse");
    private final static QName _RolloverRedoLogResponse_QNAME = new QName("urn:zimbraAdmin", "RolloverRedoLogResponse");
    private final static QName _PurgeAccountCalendarCacheResponse_QNAME = new QName("urn:zimbraAdmin", "PurgeAccountCalendarCacheResponse");
    private final static QName _ClearCookieResponse_QNAME = new QName("urn:zimbraAdmin", "ClearCookieResponse");
    private final static QName _GetHsmStatusResponse_QNAME = new QName("urn:zimbraAdmin", "GetHsmStatusResponse");
    private final static QName _ModifyUCServiceResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyUCServiceResponse");
    private final static QName _ModifyLDAPEntryRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyLDAPEntryRequest");
    private final static QName _CompactIndexResponse_QNAME = new QName("urn:zimbraAdmin", "CompactIndexResponse");
    private final static QName _RenameDistributionListRequest_QNAME = new QName("urn:zimbraAdmin", "RenameDistributionListRequest");
    private final static QName _RenameDistributionListResponse_QNAME = new QName("urn:zimbraAdmin", "RenameDistributionListResponse");
    private final static QName _DedupeBlobsResponse_QNAME = new QName("urn:zimbraAdmin", "DedupeBlobsResponse");
    private final static QName _CreateDistributionListRequest_QNAME = new QName("urn:zimbraAdmin", "CreateDistributionListRequest");
    private final static QName _PurgeAccountCalendarCacheRequest_QNAME = new QName("urn:zimbraAdmin", "PurgeAccountCalendarCacheRequest");
    private final static QName _GetAllCalendarResourcesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllCalendarResourcesRequest");
    private final static QName _ScheduleBackupsResponse_QNAME = new QName("urn:zimbraAdmin", "ScheduleBackupsResponse");
    private final static QName _RenameLDAPEntryResponse_QNAME = new QName("urn:zimbraAdmin", "RenameLDAPEntryResponse");
    private final static QName _GetFreeBusyQueueInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetFreeBusyQueueInfoResponse");
    private final static QName _FailoverClusterServiceResponse_QNAME = new QName("urn:zimbraAdmin", "FailoverClusterServiceResponse");
    private final static QName _GetLicenseInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetLicenseInfoRequest");
    private final static QName _Domain_QNAME = new QName("urn:zimbraAdmin", "domain");
    private final static QName _GetEffectiveRightsRequest_QNAME = new QName("urn:zimbraAdmin", "GetEffectiveRightsRequest");
    private final static QName _CreateXMPPComponentRequest_QNAME = new QName("urn:zimbraAdmin", "CreateXMPPComponentRequest");
    private final static QName _GetSessionsResponse_QNAME = new QName("urn:zimbraAdmin", "GetSessionsResponse");
    private final static QName _FixCalendarTZResponse_QNAME = new QName("urn:zimbraAdmin", "FixCalendarTZResponse");
    private final static QName _GetShareInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetShareInfoResponse");
    private final static QName _GetAttributeInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetAttributeInfoResponse");
    private final static QName _GetCertResponse_QNAME = new QName("urn:zimbraAdmin", "GetCertResponse");
    private final static QName _GetAllDomainsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllDomainsRequest");
    private final static QName _DumpSessionsRequest_QNAME = new QName("urn:zimbraAdmin", "DumpSessionsRequest");
    private final static QName _VerifyStoreManagerRequest_QNAME = new QName("urn:zimbraAdmin", "VerifyStoreManagerRequest");
    private final static QName _GetCosRequest_QNAME = new QName("urn:zimbraAdmin", "GetCosRequest");
    private final static QName _DeleteCalendarResourceResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteCalendarResourceResponse");
    private final static QName _GetAllSkinsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllSkinsResponse");
    private final static QName _ScheduleBackupsRequest_QNAME = new QName("urn:zimbraAdmin", "ScheduleBackupsRequest");
    private final static QName _CheckDomainMXRecordRequest_QNAME = new QName("urn:zimbraAdmin", "CheckDomainMXRecordRequest");
    private final static QName _AutoCompleteGalResponse_QNAME = new QName("urn:zimbraAdmin", "AutoCompleteGalResponse");
    private final static QName _AddAccountLoggerRequest_QNAME = new QName("urn:zimbraAdmin", "AddAccountLoggerRequest");
    private final static QName _SetCurrentVolumeRequest_QNAME = new QName("urn:zimbraAdmin", "SetCurrentVolumeRequest");
    private final static QName _GetAllAccountLoggersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllAccountLoggersResponse");
    private final static QName _GetDeviceStatusRequest_QNAME = new QName("urn:zimbraAdmin", "GetDeviceStatusRequest");
    private final static QName _CreateSystemRetentionPolicyRequest_QNAME = new QName("urn:zimbraAdmin", "CreateSystemRetentionPolicyRequest");
    private final static QName _GetMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailboxResponse");
    private final static QName _GetAttributeInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetAttributeInfoRequest");
    private final static QName _DeleteDataSourceRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteDataSourceRequest");
    private final static QName _GetLDAPEntriesRequest_QNAME = new QName("urn:zimbraAdmin", "GetLDAPEntriesRequest");
    private final static QName _GetMailboxStatsResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailboxStatsResponse");
    private final static QName _PurgeMessagesResponse_QNAME = new QName("urn:zimbraAdmin", "PurgeMessagesResponse");
    private final static QName _GetAllRightsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllRightsRequest");
    private final static QName _DeployZimletRequest_QNAME = new QName("urn:zimbraAdmin", "DeployZimletRequest");
    private final static QName _GetMailboxVolumesResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailboxVolumesResponse");
    private final static QName _SetLocalServerOnlineResponse_QNAME = new QName("urn:zimbraAdmin", "SetLocalServerOnlineResponse");
    private final static QName _GetAllZimletsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllZimletsRequest");
    private final static QName _GetUCServiceRequest_QNAME = new QName("urn:zimbraAdmin", "GetUCServiceRequest");
    private final static QName _UpdateDeviceStatusRequest_QNAME = new QName("urn:zimbraAdmin", "UpdateDeviceStatusRequest");
    private final static QName _GetSystemRetentionPolicyResponse_QNAME = new QName("urn:zimbraAdmin", "GetSystemRetentionPolicyResponse");
    private final static QName _BackupQueryResponse_QNAME = new QName("urn:zimbraAdmin", "BackupQueryResponse");
    private final static QName _DeleteServerRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteServerRequest");
    private final static QName _ExportMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "ExportMailboxRequest");
    private final static QName _CreateLDAPEntryResponse_QNAME = new QName("urn:zimbraAdmin", "CreateLDAPEntryResponse");
    private final static QName _CheckPasswordStrengthResponse_QNAME = new QName("urn:zimbraAdmin", "CheckPasswordStrengthResponse");
    private final static QName _DeleteDistributionListRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteDistributionListRequest");
    private final static QName _CheckRightResponse_QNAME = new QName("urn:zimbraAdmin", "CheckRightResponse");
    private final static QName _GetAllCosResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllCosResponse");
    private final static QName _CopyCosResponse_QNAME = new QName("urn:zimbraAdmin", "CopyCosResponse");
    private final static QName _CreateUCServiceRequest_QNAME = new QName("urn:zimbraAdmin", "CreateUCServiceRequest");
    private final static QName _FixCalendarPriorityRequest_QNAME = new QName("urn:zimbraAdmin", "FixCalendarPriorityRequest");
    private final static QName _GetAccountRequest_QNAME = new QName("urn:zimbraAdmin", "GetAccountRequest");
    private final static QName _GetAllFreeBusyProvidersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllFreeBusyProvidersResponse");
    private final static QName _GetRightsDocResponse_QNAME = new QName("urn:zimbraAdmin", "GetRightsDocResponse");
    private final static QName _AuthRequest_QNAME = new QName("urn:zimbraAdmin", "AuthRequest");
    private final static QName _HsmResponse_QNAME = new QName("urn:zimbraAdmin", "HsmResponse");
    private final static QName _GetCSRRequest_QNAME = new QName("urn:zimbraAdmin", "GetCSRRequest");
    private final static QName _QueryMailboxMoveRequest_QNAME = new QName("urn:zimbraAdmin", "QueryMailboxMoveRequest");
    private final static QName _SearchAutoProvDirectoryResponse_QNAME = new QName("urn:zimbraAdmin", "SearchAutoProvDirectoryResponse");
    private final static QName _RecalculateMailboxCountsRequest_QNAME = new QName("urn:zimbraAdmin", "RecalculateMailboxCountsRequest");
    private final static QName _MoveBlobsResponse_QNAME = new QName("urn:zimbraAdmin", "MoveBlobsResponse");
    private final static QName _SearchMultiMailboxRequest_QNAME = new QName("urn:zimbraAdmin", "SearchMultiMailboxRequest");
    private final static QName _RunUnitTestsRequest_QNAME = new QName("urn:zimbraAdmin", "RunUnitTestsRequest");
    private final static QName _MailQueueActionRequest_QNAME = new QName("urn:zimbraAdmin", "MailQueueActionRequest");
    private final static QName _ModifyDomainRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyDomainRequest");
    private final static QName _MailQueueActionResponse_QNAME = new QName("urn:zimbraAdmin", "MailQueueActionResponse");
    private final static QName _GetSystemRetentionPolicyRequest_QNAME = new QName("urn:zimbraAdmin", "GetSystemRetentionPolicyRequest");
    private final static QName _DeleteXMPPComponentRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteXMPPComponentRequest");
    private final static QName _GetAdminConsoleUICompRequest_QNAME = new QName("urn:zimbraAdmin", "GetAdminConsoleUICompRequest");
    private final static QName _SearchAccountsRequest_QNAME = new QName("urn:zimbraAdmin", "SearchAccountsRequest");
    private final static QName _SyncGalAccountResponse_QNAME = new QName("urn:zimbraAdmin", "SyncGalAccountResponse");
    private final static QName _GetAllServersResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllServersResponse");
    private final static QName _RemoveAccountLoggerResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveAccountLoggerResponse");
    private final static QName _InstallLicenseResponse_QNAME = new QName("urn:zimbraAdmin", "InstallLicenseResponse");
    private final static QName _GetQuotaUsageResponse_QNAME = new QName("urn:zimbraAdmin", "GetQuotaUsageResponse");
    private final static QName _ConfigureZimletResponse_QNAME = new QName("urn:zimbraAdmin", "ConfigureZimletResponse");
    private final static QName _GetMailQueueResponse_QNAME = new QName("urn:zimbraAdmin", "GetMailQueueResponse");
    private final static QName _Server_QNAME = new QName("urn:zimbraAdmin", "server");
    private final static QName _GetXMbxSearchesListResponse_QNAME = new QName("urn:zimbraAdmin", "GetXMbxSearchesListResponse");
    private final static QName _HsmRequest_QNAME = new QName("urn:zimbraAdmin", "HsmRequest");
    private final static QName _GetDistributionListMembershipRequest_QNAME = new QName("urn:zimbraAdmin", "GetDistributionListMembershipRequest");
    private final static QName _SearchGalResponse_QNAME = new QName("urn:zimbraAdmin", "SearchGalResponse");
    private final static QName _ModifySystemRetentionPolicyResponse_QNAME = new QName("urn:zimbraAdmin", "ModifySystemRetentionPolicyResponse");
    private final static QName _RemoveStaleDeviceMetadataResponse_QNAME = new QName("urn:zimbraAdmin", "RemoveStaleDeviceMetadataResponse");
    private final static QName _DelegateAuthResponse_QNAME = new QName("urn:zimbraAdmin", "DelegateAuthResponse");
    private final static QName _GetDataSourcesResponse_QNAME = new QName("urn:zimbraAdmin", "GetDataSourcesResponse");
    private final static QName _GetFreeBusyQueueInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetFreeBusyQueueInfoRequest");
    private final static QName _GetAllLocalesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllLocalesResponse");
    private final static QName _GetAllDistributionListsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllDistributionListsResponse");
    private final static QName _VerifyIndexRequest_QNAME = new QName("urn:zimbraAdmin", "VerifyIndexRequest");
    private final static QName _DeleteAlwaysOnClusterRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteAlwaysOnClusterRequest");
    private final static QName _GetCosResponse_QNAME = new QName("urn:zimbraAdmin", "GetCosResponse");
    private final static QName _RemoveStaleDeviceMetadataRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveStaleDeviceMetadataRequest");
    private final static QName _GetMailboxStatsRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailboxStatsRequest");
    private final static QName _RegisterMailboxMoveOutResponse_QNAME = new QName("urn:zimbraAdmin", "RegisterMailboxMoveOutResponse");
    private final static QName _DeleteXMPPComponentResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteXMPPComponentResponse");
    private final static QName _AutoProvAccountResponse_QNAME = new QName("urn:zimbraAdmin", "AutoProvAccountResponse");
    private final static QName _UndeployZimletRequest_QNAME = new QName("urn:zimbraAdmin", "UndeployZimletRequest");
    private final static QName _DeployZimletResponse_QNAME = new QName("urn:zimbraAdmin", "DeployZimletResponse");
    private final static QName _GetAllEffectiveRightsRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllEffectiveRightsRequest");
    private final static QName _SetServerOfflineRequest_QNAME = new QName("urn:zimbraAdmin", "SetServerOfflineRequest");
    private final static QName _Query_QNAME = new QName("urn:zimbraAdmin", "query");
    private final static QName _GetLicenseRequest_QNAME = new QName("urn:zimbraAdmin", "GetLicenseRequest");
    private final static QName _ModifyDomainResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyDomainResponse");
    private final static QName _BackupAccountQueryRequest_QNAME = new QName("urn:zimbraAdmin", "BackupAccountQueryRequest");
    private final static QName _GetDevicesRequest_QNAME = new QName("urn:zimbraAdmin", "GetDevicesRequest");
    private final static QName _ModifyDistributionListResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyDistributionListResponse");
    private final static QName _CreateArchiveRequest_QNAME = new QName("urn:zimbraAdmin", "CreateArchiveRequest");
    private final static QName _CreateDataSourceRequest_QNAME = new QName("urn:zimbraAdmin", "CreateDataSourceRequest");
    private final static QName _AlwaysOnCluster_QNAME = new QName("urn:zimbraAdmin", "alwaysOnCluster");
    private final static QName _GetXMPPComponentResponse_QNAME = new QName("urn:zimbraAdmin", "GetXMPPComponentResponse");
    private final static QName _CreateZimletResponse_QNAME = new QName("urn:zimbraAdmin", "CreateZimletResponse");
    private final static QName _RefreshRegisteredAuthTokensRequest_QNAME = new QName("urn:zimbraAdmin", "RefreshRegisteredAuthTokensRequest");
    private final static QName _FixCalendarEndTimeRequest_QNAME = new QName("urn:zimbraAdmin", "FixCalendarEndTimeRequest");
    private final static QName _UndeployZimletResponse_QNAME = new QName("urn:zimbraAdmin", "UndeployZimletResponse");
    private final static QName _AddDistributionListAliasResponse_QNAME = new QName("urn:zimbraAdmin", "AddDistributionListAliasResponse");
    private final static QName _GetGrantsRequest_QNAME = new QName("urn:zimbraAdmin", "GetGrantsRequest");
    private final static QName _DeleteLDAPEntryRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteLDAPEntryRequest");
    private final static QName _CreateAccountRequest_QNAME = new QName("urn:zimbraAdmin", "CreateAccountRequest");
    private final static QName _VersionCheckResponse_QNAME = new QName("urn:zimbraAdmin", "VersionCheckResponse");
    private final static QName _UploadProxyCAResponse_QNAME = new QName("urn:zimbraAdmin", "UploadProxyCAResponse");
    private final static QName _GetAllConfigResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllConfigResponse");
    private final static QName _SetCurrentVolumeResponse_QNAME = new QName("urn:zimbraAdmin", "SetCurrentVolumeResponse");
    private final static QName _ModifyAdminSavedSearchesRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyAdminSavedSearchesRequest");
    private final static QName _PurgeFreeBusyQueueRequest_QNAME = new QName("urn:zimbraAdmin", "PurgeFreeBusyQueueRequest");
    private final static QName _MigrateAccountResponse_QNAME = new QName("urn:zimbraAdmin", "MigrateAccountResponse");
    private final static QName _ModifyServerRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyServerRequest");
    private final static QName _ServerExtension_QNAME = new QName("urn:zimbraAdmin", "serverExtension");
    private final static QName _GetAllUCServicesResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllUCServicesResponse");
    private final static QName _GetAllAdminAccountsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllAdminAccountsResponse");
    private final static QName _GetCalendarResourceRequest_QNAME = new QName("urn:zimbraAdmin", "GetCalendarResourceRequest");
    private final static QName _SearchMultiMailboxResponse_QNAME = new QName("urn:zimbraAdmin", "SearchMultiMailboxResponse");
    private final static QName _Meta_QNAME = new QName("urn:zimbraAdmin", "meta");
    private final static QName _GetServerResponse_QNAME = new QName("urn:zimbraAdmin", "GetServerResponse");
    private final static QName _RenameAccountResponse_QNAME = new QName("urn:zimbraAdmin", "RenameAccountResponse");
    private final static QName _GetHsmStatusRequest_QNAME = new QName("urn:zimbraAdmin", "GetHsmStatusRequest");
    private final static QName _ModifyCosRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyCosRequest");
    private final static QName _CreateCosResponse_QNAME = new QName("urn:zimbraAdmin", "CreateCosResponse");
    private final static QName _GetVersionInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetVersionInfoResponse");
    private final static QName _ReloadLocalConfigResponse_QNAME = new QName("urn:zimbraAdmin", "ReloadLocalConfigResponse");
    private final static QName _GetServerNIfsResponse_QNAME = new QName("urn:zimbraAdmin", "GetServerNIfsResponse");
    private final static QName _RenameLDAPEntryRequest_QNAME = new QName("urn:zimbraAdmin", "RenameLDAPEntryRequest");
    private final static QName _GetDevicesResponse_QNAME = new QName("urn:zimbraAdmin", "GetDevicesResponse");
    private final static QName _GetAccountInfoRequest_QNAME = new QName("urn:zimbraAdmin", "GetAccountInfoRequest");
    private final static QName _GetMailQueueRequest_QNAME = new QName("urn:zimbraAdmin", "GetMailQueueRequest");
    private final static QName _CreateDomainResponse_QNAME = new QName("urn:zimbraAdmin", "CreateDomainResponse");
    private final static QName _RemoveDeviceRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveDeviceRequest");
    private final static QName _ModifyConfigResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyConfigResponse");
    private final static QName _DeleteAccountRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteAccountRequest");
    private final static QName _DeleteSystemRetentionPolicyRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteSystemRetentionPolicyRequest");
    private final static QName _DeleteZimletResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteZimletResponse");
    private final static QName _CheckAuthConfigResponse_QNAME = new QName("urn:zimbraAdmin", "CheckAuthConfigResponse");
    private final static QName _ResetAllLoggersResponse_QNAME = new QName("urn:zimbraAdmin", "ResetAllLoggersResponse");
    private final static QName _CheckPasswordStrengthRequest_QNAME = new QName("urn:zimbraAdmin", "CheckPasswordStrengthRequest");
    private final static QName _CheckBlobConsistencyResponse_QNAME = new QName("urn:zimbraAdmin", "CheckBlobConsistencyResponse");
    private final static QName _ComputeAggregateQuotaUsageRequest_QNAME = new QName("urn:zimbraAdmin", "ComputeAggregateQuotaUsageRequest");
    private final static QName _GetAllMailboxesRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllMailboxesRequest");
    private final static QName _ClearCookieRequest_QNAME = new QName("urn:zimbraAdmin", "ClearCookieRequest");
    private final static QName _BackupRequest_QNAME = new QName("urn:zimbraAdmin", "BackupRequest");
    private final static QName _CreateArchiveResponse_QNAME = new QName("urn:zimbraAdmin", "CreateArchiveResponse");
    private final static QName _PurgeMessagesRequest_QNAME = new QName("urn:zimbraAdmin", "PurgeMessagesRequest");
    private final static QName _RemoveAccountAliasRequest_QNAME = new QName("urn:zimbraAdmin", "RemoveAccountAliasRequest");
    private final static QName _GetAllAlwaysOnClustersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllAlwaysOnClustersRequest");
    private final static QName _CancelPendingRemoteWipeResponse_QNAME = new QName("urn:zimbraAdmin", "CancelPendingRemoteWipeResponse");
    private final static QName _ModifyUCServiceRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyUCServiceRequest");
    private final static QName _GetAllActiveServersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllActiveServersRequest");
    private final static QName _AutoProvTaskControlResponse_QNAME = new QName("urn:zimbraAdmin", "AutoProvTaskControlResponse");
    private final static QName _GetQuotaUsageRequest_QNAME = new QName("urn:zimbraAdmin", "GetQuotaUsageRequest");
    private final static QName _EnableArchiveResponse_QNAME = new QName("urn:zimbraAdmin", "EnableArchiveResponse");
    private final static QName _GetVolumeResponse_QNAME = new QName("urn:zimbraAdmin", "GetVolumeResponse");
    private final static QName _SetPasswordResponse_QNAME = new QName("urn:zimbraAdmin", "SetPasswordResponse");
    private final static QName _GetLoggerStatsResponse_QNAME = new QName("urn:zimbraAdmin", "GetLoggerStatsResponse");
    private final static QName _AddGalSyncDataSourceResponse_QNAME = new QName("urn:zimbraAdmin", "AddGalSyncDataSourceResponse");
    private final static QName _GetAccountInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetAccountInfoResponse");
    private final static QName _UploadDomCertRequest_QNAME = new QName("urn:zimbraAdmin", "UploadDomCertRequest");
    private final static QName _GetDomainInfoResponse_QNAME = new QName("urn:zimbraAdmin", "GetDomainInfoResponse");
    private final static QName _GetDevicesCountUsedTodayRequest_QNAME = new QName("urn:zimbraAdmin", "GetDevicesCountUsedTodayRequest");
    private final static QName _GetAccountResponse_QNAME = new QName("urn:zimbraAdmin", "GetAccountResponse");
    private final static QName _DeleteCosResponse_QNAME = new QName("urn:zimbraAdmin", "DeleteCosResponse");
    private final static QName _CreateXMPPComponentResponse_QNAME = new QName("urn:zimbraAdmin", "CreateXMPPComponentResponse");
    private final static QName _CreateAccountResponse_QNAME = new QName("urn:zimbraAdmin", "CreateAccountResponse");
    private final static QName _GetAllFreeBusyProvidersRequest_QNAME = new QName("urn:zimbraAdmin", "GetAllFreeBusyProvidersRequest");
    private final static QName _DisableArchiveResponse_QNAME = new QName("urn:zimbraAdmin", "DisableArchiveResponse");
    private final static QName _ModifyLDAPEntryResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyLDAPEntryResponse");
    private final static QName _CheckBlobConsistencyRequest_QNAME = new QName("urn:zimbraAdmin", "CheckBlobConsistencyRequest");
    private final static QName _CreateCalendarResourceResponse_QNAME = new QName("urn:zimbraAdmin", "CreateCalendarResourceResponse");
    private final static QName _CheckDirectoryResponse_QNAME = new QName("urn:zimbraAdmin", "CheckDirectoryResponse");
    private final static QName _GetAllAccountsResponse_QNAME = new QName("urn:zimbraAdmin", "GetAllAccountsResponse");
    private final static QName _AdminCreateWaitSetRequest_QNAME = new QName("urn:zimbraAdmin", "AdminCreateWaitSetRequest");
    private final static QName _BackupAccountQueryResponse_QNAME = new QName("urn:zimbraAdmin", "BackupAccountQueryResponse");
    private final static QName _GetMemcachedClientConfigResponse_QNAME = new QName("urn:zimbraAdmin", "GetMemcachedClientConfigResponse");
    private final static QName _BackupQueryRequest_QNAME = new QName("urn:zimbraAdmin", "BackupQueryRequest");
    private final static QName _ResumeDeviceRequest_QNAME = new QName("urn:zimbraAdmin", "ResumeDeviceRequest");
    private final static QName _CheckGalConfigResponse_QNAME = new QName("urn:zimbraAdmin", "CheckGalConfigResponse");
    private final static QName _GetAlwaysOnClusterRequest_QNAME = new QName("urn:zimbraAdmin", "GetAlwaysOnClusterRequest");
    private final static QName _AbortHsmRequest_QNAME = new QName("urn:zimbraAdmin", "AbortHsmRequest");
    private final static QName _CheckHealthRequest_QNAME = new QName("urn:zimbraAdmin", "CheckHealthRequest");
    private final static QName _AuthResponse_QNAME = new QName("urn:zimbraAdmin", "AuthResponse");
    private final static QName _Include_QNAME = new QName("urn:zimbraAdmin", "include");
    private final static QName _SuspendDeviceResponse_QNAME = new QName("urn:zimbraAdmin", "SuspendDeviceResponse");
    private final static QName _CancelPendingRemoteWipeRequest_QNAME = new QName("urn:zimbraAdmin", "CancelPendingRemoteWipeRequest");
    private final static QName _GetXMPPComponentRequest_QNAME = new QName("urn:zimbraAdmin", "GetXMPPComponentRequest");
    private final static QName _CreateXMbxSearchRequest_QNAME = new QName("urn:zimbraAdmin", "CreateXMbxSearchRequest");
    private final static QName _DeleteDomainRequest_QNAME = new QName("urn:zimbraAdmin", "DeleteDomainRequest");
    private final static QName _ModifyDistributionListRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyDistributionListRequest");
    private final static QName _GetSMIMEConfigResponse_QNAME = new QName("urn:zimbraAdmin", "GetSMIMEConfigResponse");
    private final static QName _ModifyZimletResponse_QNAME = new QName("urn:zimbraAdmin", "ModifyZimletResponse");
    private final static QName _SuspendDeviceRequest_QNAME = new QName("urn:zimbraAdmin", "SuspendDeviceRequest");
    private final static QName _GetLoggerStatsRequest_QNAME = new QName("urn:zimbraAdmin", "GetLoggerStatsRequest");
    private final static QName _ModifyAccountRequest_QNAME = new QName("urn:zimbraAdmin", "ModifyAccountRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: zimbraadmin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BackupQueryInfo }
     * 
     */
    public BackupQueryInfo createBackupQueryInfo() {
        return new BackupQueryInfo();
    }

    /**
     * Create an instance of {@link ConstraintInfo }
     * 
     */
    public ConstraintInfo createConstraintInfo() {
        return new ConstraintInfo();
    }

    /**
     * Create an instance of {@link WaitSetInfo }
     * 
     */
    public WaitSetInfo createWaitSetInfo() {
        return new WaitSetInfo();
    }

    /**
     * Create an instance of {@link EffectiveAttrInfo }
     * 
     */
    public EffectiveAttrInfo createEffectiveAttrInfo() {
        return new EffectiveAttrInfo();
    }

    /**
     * Create an instance of {@link DomainAdminRight }
     * 
     */
    public DomainAdminRight createDomainAdminRight() {
        return new DomainAdminRight();
    }

    /**
     * Create an instance of {@link InviteInfo }
     * 
     */
    public InviteInfo createInviteInfo() {
        return new InviteInfo();
    }

    /**
     * Create an instance of {@link VersionCheckInfo }
     * 
     */
    public VersionCheckInfo createVersionCheckInfo() {
        return new VersionCheckInfo();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency }
     * 
     */
    public MailboxBlobConsistency createMailboxBlobConsistency() {
        return new MailboxBlobConsistency();
    }

    /**
     * Create an instance of {@link VoiceProviderInfo }
     * 
     */
    public VoiceProviderInfo createVoiceProviderInfo() {
        return new VoiceProviderInfo();
    }

    /**
     * Create an instance of {@link CmdRightsInfo }
     * 
     */
    public CmdRightsInfo createCmdRightsInfo() {
        return new CmdRightsInfo();
    }

    /**
     * Create an instance of {@link GetClusterStatusResponse }
     * 
     */
    public GetClusterStatusResponse createGetClusterStatusResponse() {
        return new GetClusterStatusResponse();
    }

    /**
     * Create an instance of {@link AdminCreateWaitSetRequest }
     * 
     */
    public AdminCreateWaitSetRequest createAdminCreateWaitSetRequest() {
        return new AdminCreateWaitSetRequest();
    }

    /**
     * Create an instance of {@link AdminWaitSetRequest }
     * 
     */
    public AdminWaitSetRequest createAdminWaitSetRequest() {
        return new AdminWaitSetRequest();
    }

    /**
     * Create an instance of {@link GetRightsDocResponse }
     * 
     */
    public GetRightsDocResponse createGetRightsDocResponse() {
        return new GetRightsDocResponse();
    }

    /**
     * Create an instance of {@link FixCalendarTZRequest }
     * 
     */
    public FixCalendarTZRequest createFixCalendarTZRequest() {
        return new FixCalendarTZRequest();
    }

    /**
     * Create an instance of {@link DistributionListInfo }
     * 
     */
    public DistributionListInfo createDistributionListInfo() {
        return new DistributionListInfo();
    }

    /**
     * Create an instance of {@link GetAdminExtensionZimletsResponse }
     * 
     */
    public GetAdminExtensionZimletsResponse createGetAdminExtensionZimletsResponse() {
        return new GetAdminExtensionZimletsResponse();
    }

    /**
     * Create an instance of {@link PurgeAccountCalendarCacheResponse }
     * 
     */
    public PurgeAccountCalendarCacheResponse createPurgeAccountCalendarCacheResponse() {
        return new PurgeAccountCalendarCacheResponse();
    }

    /**
     * Create an instance of {@link SetServerOfflineResponse }
     * 
     */
    public SetServerOfflineResponse createSetServerOfflineResponse() {
        return new SetServerOfflineResponse();
    }

    /**
     * Create an instance of {@link ModifyDelegatedAdminConstraintsRequest }
     * 
     */
    public ModifyDelegatedAdminConstraintsRequest createModifyDelegatedAdminConstraintsRequest() {
        return new ModifyDelegatedAdminConstraintsRequest();
    }

    /**
     * Create an instance of {@link GetAllAdminAccountsRequest }
     * 
     */
    public GetAllAdminAccountsRequest createGetAllAdminAccountsRequest() {
        return new GetAllAdminAccountsRequest();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link AutoProvTaskControlRequest }
     * 
     */
    public AutoProvTaskControlRequest createAutoProvTaskControlRequest() {
        return new AutoProvTaskControlRequest();
    }

    /**
     * Create an instance of {@link RolloverRedoLogResponse }
     * 
     */
    public RolloverRedoLogResponse createRolloverRedoLogResponse() {
        return new RolloverRedoLogResponse();
    }

    /**
     * Create an instance of {@link CheckHostnameResolveResponse }
     * 
     */
    public CheckHostnameResolveResponse createCheckHostnameResolveResponse() {
        return new CheckHostnameResolveResponse();
    }

    /**
     * Create an instance of {@link GetAllXMPPComponentsRequest }
     * 
     */
    public GetAllXMPPComponentsRequest createGetAllXMPPComponentsRequest() {
        return new GetAllXMPPComponentsRequest();
    }

    /**
     * Create an instance of {@link GetAccountLoggersRequest }
     * 
     */
    public GetAccountLoggersRequest createGetAccountLoggersRequest() {
        return new GetAccountLoggersRequest();
    }

    /**
     * Create an instance of {@link RenameDistributionListRequest }
     * 
     */
    public RenameDistributionListRequest createRenameDistributionListRequest() {
        return new RenameDistributionListRequest();
    }

    /**
     * Create an instance of {@link RenameDistributionListResponse }
     * 
     */
    public RenameDistributionListResponse createRenameDistributionListResponse() {
        return new RenameDistributionListResponse();
    }

    /**
     * Create an instance of {@link CheckHostnameResolveRequest }
     * 
     */
    public CheckHostnameResolveRequest createCheckHostnameResolveRequest() {
        return new CheckHostnameResolveRequest();
    }

    /**
     * Create an instance of {@link DedupeBlobsResponse }
     * 
     */
    public DedupeBlobsResponse createDedupeBlobsResponse() {
        return new DedupeBlobsResponse();
    }

    /**
     * Create an instance of {@link CreateDistributionListRequest }
     * 
     */
    public CreateDistributionListRequest createCreateDistributionListRequest() {
        return new CreateDistributionListRequest();
    }

    /**
     * Create an instance of {@link PurgeAccountCalendarCacheRequest }
     * 
     */
    public PurgeAccountCalendarCacheRequest createPurgeAccountCalendarCacheRequest() {
        return new PurgeAccountCalendarCacheRequest();
    }

    /**
     * Create an instance of {@link ModifyUCServiceResponse }
     * 
     */
    public ModifyUCServiceResponse createModifyUCServiceResponse() {
        return new ModifyUCServiceResponse();
    }

    /**
     * Create an instance of {@link ClearCookieResponse }
     * 
     */
    public ClearCookieResponse createClearCookieResponse() {
        return new ClearCookieResponse();
    }

    /**
     * Create an instance of {@link GetHsmStatusResponse }
     * 
     */
    public GetHsmStatusResponse createGetHsmStatusResponse() {
        return new GetHsmStatusResponse();
    }

    /**
     * Create an instance of {@link VerifyCertKeyResponse }
     * 
     */
    public VerifyCertKeyResponse createVerifyCertKeyResponse() {
        return new VerifyCertKeyResponse();
    }

    /**
     * Create an instance of {@link GetShareInfoRequest }
     * 
     */
    public GetShareInfoRequest createGetShareInfoRequest() {
        return new GetShareInfoRequest();
    }

    /**
     * Create an instance of {@link ModifyLDAPEntryRequest }
     * 
     */
    public ModifyLDAPEntryRequest createModifyLDAPEntryRequest() {
        return new ModifyLDAPEntryRequest();
    }

    /**
     * Create an instance of {@link AdminDestroyWaitSetResponse }
     * 
     */
    public AdminDestroyWaitSetResponse createAdminDestroyWaitSetResponse() {
        return new AdminDestroyWaitSetResponse();
    }

    /**
     * Create an instance of {@link CompactIndexResponse }
     * 
     */
    public CompactIndexResponse createCompactIndexResponse() {
        return new CompactIndexResponse();
    }

    /**
     * Create an instance of {@link GetFreeBusyQueueInfoResponse }
     * 
     */
    public GetFreeBusyQueueInfoResponse createGetFreeBusyQueueInfoResponse() {
        return new GetFreeBusyQueueInfoResponse();
    }

    /**
     * Create an instance of {@link CreateXMbxSearchResponse }
     * 
     */
    public CreateXMbxSearchResponse createCreateXMbxSearchResponse() {
        return new CreateXMbxSearchResponse();
    }

    /**
     * Create an instance of {@link AbortXMbxSearchRequest }
     * 
     */
    public AbortXMbxSearchRequest createAbortXMbxSearchRequest() {
        return new AbortXMbxSearchRequest();
    }

    /**
     * Create an instance of {@link GetAllCalendarResourcesRequest }
     * 
     */
    public GetAllCalendarResourcesRequest createGetAllCalendarResourcesRequest() {
        return new GetAllCalendarResourcesRequest();
    }

    /**
     * Create an instance of {@link RenameLDAPEntryResponse }
     * 
     */
    public RenameLDAPEntryResponse createRenameLDAPEntryResponse() {
        return new RenameLDAPEntryResponse();
    }

    /**
     * Create an instance of {@link ScheduleBackupsResponse }
     * 
     */
    public ScheduleBackupsResponse createScheduleBackupsResponse() {
        return new ScheduleBackupsResponse();
    }

    /**
     * Create an instance of {@link FailoverClusterServiceResponse }
     * 
     */
    public FailoverClusterServiceResponse createFailoverClusterServiceResponse() {
        return new FailoverClusterServiceResponse();
    }

    /**
     * Create an instance of {@link GetLicenseInfoRequest }
     * 
     */
    public GetLicenseInfoRequest createGetLicenseInfoRequest() {
        return new GetLicenseInfoRequest();
    }

    /**
     * Create an instance of {@link DomainInfo }
     * 
     */
    public DomainInfo createDomainInfo() {
        return new DomainInfo();
    }

    /**
     * Create an instance of {@link GetRightsDocRequest }
     * 
     */
    public GetRightsDocRequest createGetRightsDocRequest() {
        return new GetRightsDocRequest();
    }

    /**
     * Create an instance of {@link GetEffectiveRightsRequest }
     * 
     */
    public GetEffectiveRightsRequest createGetEffectiveRightsRequest() {
        return new GetEffectiveRightsRequest();
    }

    /**
     * Create an instance of {@link MigrateAccountRequest }
     * 
     */
    public MigrateAccountRequest createMigrateAccountRequest() {
        return new MigrateAccountRequest();
    }

    /**
     * Create an instance of {@link PushFreeBusyResponse }
     * 
     */
    public PushFreeBusyResponse createPushFreeBusyResponse() {
        return new PushFreeBusyResponse();
    }

    /**
     * Create an instance of {@link CreateDomainRequest }
     * 
     */
    public CreateDomainRequest createCreateDomainRequest() {
        return new CreateDomainRequest();
    }

    /**
     * Create an instance of {@link GetMemcachedClientConfigRequest }
     * 
     */
    public GetMemcachedClientConfigRequest createGetMemcachedClientConfigRequest() {
        return new GetMemcachedClientConfigRequest();
    }

    /**
     * Create an instance of {@link CountAccountResponse }
     * 
     */
    public CountAccountResponse createCountAccountResponse() {
        return new CountAccountResponse();
    }

    /**
     * Create an instance of {@link DeleteCalendarResourceRequest }
     * 
     */
    public DeleteCalendarResourceRequest createDeleteCalendarResourceRequest() {
        return new DeleteCalendarResourceRequest();
    }

    /**
     * Create an instance of {@link GetSessionsResponse }
     * 
     */
    public GetSessionsResponse createGetSessionsResponse() {
        return new GetSessionsResponse();
    }

    /**
     * Create an instance of {@link CreateXMPPComponentRequest }
     * 
     */
    public CreateXMPPComponentRequest createCreateXMPPComponentRequest() {
        return new CreateXMPPComponentRequest();
    }

    /**
     * Create an instance of {@link DeleteDomainResponse }
     * 
     */
    public DeleteDomainResponse createDeleteDomainResponse() {
        return new DeleteDomainResponse();
    }

    /**
     * Create an instance of {@link ModifyVolumeResponse }
     * 
     */
    public ModifyVolumeResponse createModifyVolumeResponse() {
        return new ModifyVolumeResponse();
    }

    /**
     * Create an instance of {@link RestoreResponse }
     * 
     */
    public RestoreResponse createRestoreResponse() {
        return new RestoreResponse();
    }

    /**
     * Create an instance of {@link GetAllDomainsRequest }
     * 
     */
    public GetAllDomainsRequest createGetAllDomainsRequest() {
        return new GetAllDomainsRequest();
    }

    /**
     * Create an instance of {@link GetCertResponse }
     * 
     */
    public GetCertResponse createGetCertResponse() {
        return new GetCertResponse();
    }

    /**
     * Create an instance of {@link Attr }
     * 
     */
    public Attr createAttr() {
        return new Attr();
    }

    /**
     * Create an instance of {@link VerifyStoreManagerRequest }
     * 
     */
    public VerifyStoreManagerRequest createVerifyStoreManagerRequest() {
        return new VerifyStoreManagerRequest();
    }

    /**
     * Create an instance of {@link DumpSessionsRequest }
     * 
     */
    public DumpSessionsRequest createDumpSessionsRequest() {
        return new DumpSessionsRequest();
    }

    /**
     * Create an instance of {@link GetShareInfoResponse }
     * 
     */
    public GetShareInfoResponse createGetShareInfoResponse() {
        return new GetShareInfoResponse();
    }

    /**
     * Create an instance of {@link FixCalendarTZResponse }
     * 
     */
    public FixCalendarTZResponse createFixCalendarTZResponse() {
        return new FixCalendarTZResponse();
    }

    /**
     * Create an instance of {@link MoveMailboxRequest }
     * 
     */
    public MoveMailboxRequest createMoveMailboxRequest() {
        return new MoveMailboxRequest();
    }

    /**
     * Create an instance of {@link GetAllUCProvidersResponse }
     * 
     */
    public GetAllUCProvidersResponse createGetAllUCProvidersResponse() {
        return new GetAllUCProvidersResponse();
    }

    /**
     * Create an instance of {@link GetAttributeInfoResponse }
     * 
     */
    public GetAttributeInfoResponse createGetAttributeInfoResponse() {
        return new GetAttributeInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteCalendarResourceResponse }
     * 
     */
    public DeleteCalendarResourceResponse createDeleteCalendarResourceResponse() {
        return new DeleteCalendarResourceResponse();
    }

    /**
     * Create an instance of {@link GetAllZimletsResponse }
     * 
     */
    public GetAllZimletsResponse createGetAllZimletsResponse() {
        return new GetAllZimletsResponse();
    }

    /**
     * Create an instance of {@link CheckDomainMXRecordRequest }
     * 
     */
    public CheckDomainMXRecordRequest createCheckDomainMXRecordRequest() {
        return new CheckDomainMXRecordRequest();
    }

    /**
     * Create an instance of {@link GetAllSkinsResponse }
     * 
     */
    public GetAllSkinsResponse createGetAllSkinsResponse() {
        return new GetAllSkinsResponse();
    }

    /**
     * Create an instance of {@link ScheduleBackupsRequest }
     * 
     */
    public ScheduleBackupsRequest createScheduleBackupsRequest() {
        return new ScheduleBackupsRequest();
    }

    /**
     * Create an instance of {@link EnableArchiveRequest }
     * 
     */
    public EnableArchiveRequest createEnableArchiveRequest() {
        return new EnableArchiveRequest();
    }

    /**
     * Create an instance of {@link GetDevicesCountSinceLastUsedRequest }
     * 
     */
    public GetDevicesCountSinceLastUsedRequest createGetDevicesCountSinceLastUsedRequest() {
        return new GetDevicesCountSinceLastUsedRequest();
    }

    /**
     * Create an instance of {@link GetCosRequest }
     * 
     */
    public GetCosRequest createGetCosRequest() {
        return new GetCosRequest();
    }

    /**
     * Create an instance of {@link DeleteVolumeRequest }
     * 
     */
    public DeleteVolumeRequest createDeleteVolumeRequest() {
        return new DeleteVolumeRequest();
    }

    /**
     * Create an instance of {@link QueryWaitSetResponse }
     * 
     */
    public QueryWaitSetResponse createQueryWaitSetResponse() {
        return new QueryWaitSetResponse();
    }

    /**
     * Create an instance of {@link DeleteSystemRetentionPolicyResponse }
     * 
     */
    public DeleteSystemRetentionPolicyResponse createDeleteSystemRetentionPolicyResponse() {
        return new DeleteSystemRetentionPolicyResponse();
    }

    /**
     * Create an instance of {@link GetAllEffectiveRightsResponse }
     * 
     */
    public GetAllEffectiveRightsResponse createGetAllEffectiveRightsResponse() {
        return new GetAllEffectiveRightsResponse();
    }

    /**
     * Create an instance of {@link GetVersionInfoRequest }
     * 
     */
    public GetVersionInfoRequest createGetVersionInfoRequest() {
        return new GetVersionInfoRequest();
    }

    /**
     * Create an instance of {@link ModifySMIMEConfigResponse }
     * 
     */
    public ModifySMIMEConfigResponse createModifySMIMEConfigResponse() {
        return new ModifySMIMEConfigResponse();
    }

    /**
     * Create an instance of {@link AutoProvAccountRequest }
     * 
     */
    public AutoProvAccountRequest createAutoProvAccountRequest() {
        return new AutoProvAccountRequest();
    }

    /**
     * Create an instance of {@link UnloadMailboxRequest }
     * 
     */
    public UnloadMailboxRequest createUnloadMailboxRequest() {
        return new UnloadMailboxRequest();
    }

    /**
     * Create an instance of {@link UploadProxyCARequest }
     * 
     */
    public UploadProxyCARequest createUploadProxyCARequest() {
        return new UploadProxyCARequest();
    }

    /**
     * Create an instance of {@link DelegateAuthRequest }
     * 
     */
    public DelegateAuthRequest createDelegateAuthRequest() {
        return new DelegateAuthRequest();
    }

    /**
     * Create an instance of {@link SyncGalAccountRequest }
     * 
     */
    public SyncGalAccountRequest createSyncGalAccountRequest() {
        return new SyncGalAccountRequest();
    }

    /**
     * Create an instance of {@link GrantRightRequest }
     * 
     */
    public GrantRightRequest createGrantRightRequest() {
        return new GrantRightRequest();
    }

    /**
     * Create an instance of {@link PurgeMovedMailboxResponse }
     * 
     */
    public PurgeMovedMailboxResponse createPurgeMovedMailboxResponse() {
        return new PurgeMovedMailboxResponse();
    }

    /**
     * Create an instance of {@link GetAggregateQuotaUsageOnServerResponse }
     * 
     */
    public GetAggregateQuotaUsageOnServerResponse createGetAggregateQuotaUsageOnServerResponse() {
        return new GetAggregateQuotaUsageOnServerResponse();
    }

    /**
     * Create an instance of {@link GetAllDistributionListsRequest }
     * 
     */
    public GetAllDistributionListsRequest createGetAllDistributionListsRequest() {
        return new GetAllDistributionListsRequest();
    }

    /**
     * Create an instance of {@link GetAllMailboxesResponse }
     * 
     */
    public GetAllMailboxesResponse createGetAllMailboxesResponse() {
        return new GetAllMailboxesResponse();
    }

    /**
     * Create an instance of {@link GetCSRResponse }
     * 
     */
    public GetCSRResponse createGetCSRResponse() {
        return new GetCSRResponse();
    }

    /**
     * Create an instance of {@link GetServerStatsResponse }
     * 
     */
    public GetServerStatsResponse createGetServerStatsResponse() {
        return new GetServerStatsResponse();
    }

    /**
     * Create an instance of {@link RolloverRedoLogRequest }
     * 
     */
    public RolloverRedoLogRequest createRolloverRedoLogRequest() {
        return new RolloverRedoLogRequest();
    }

    /**
     * Create an instance of {@link ReloadMemcachedClientConfigRequest }
     * 
     */
    public ReloadMemcachedClientConfigRequest createReloadMemcachedClientConfigRequest() {
        return new ReloadMemcachedClientConfigRequest();
    }

    /**
     * Create an instance of {@link UpdatePresenceSessionIdResponse }
     * 
     */
    public UpdatePresenceSessionIdResponse createUpdatePresenceSessionIdResponse() {
        return new UpdatePresenceSessionIdResponse();
    }

    /**
     * Create an instance of {@link GetServerRequest }
     * 
     */
    public GetServerRequest createGetServerRequest() {
        return new GetServerRequest();
    }

    /**
     * Create an instance of {@link GetZimletStatusRequest }
     * 
     */
    public GetZimletStatusRequest createGetZimletStatusRequest() {
        return new GetZimletStatusRequest();
    }

    /**
     * Create an instance of {@link GetDevicesCountSinceLastUsedResponse }
     * 
     */
    public GetDevicesCountSinceLastUsedResponse createGetDevicesCountSinceLastUsedResponse() {
        return new GetDevicesCountSinceLastUsedResponse();
    }

    /**
     * Create an instance of {@link RenameCosRequest }
     * 
     */
    public RenameCosRequest createRenameCosRequest() {
        return new RenameCosRequest();
    }

    /**
     * Create an instance of {@link ModifyAlwaysOnClusterResponse }
     * 
     */
    public ModifyAlwaysOnClusterResponse createModifyAlwaysOnClusterResponse() {
        return new ModifyAlwaysOnClusterResponse();
    }

    /**
     * Create an instance of {@link AdminCreateWaitSetResponse }
     * 
     */
    public AdminCreateWaitSetResponse createAdminCreateWaitSetResponse() {
        return new AdminCreateWaitSetResponse();
    }

    /**
     * Create an instance of {@link DeleteDataSourceResponse }
     * 
     */
    public DeleteDataSourceResponse createDeleteDataSourceResponse() {
        return new DeleteDataSourceResponse();
    }

    /**
     * Create an instance of {@link GetLicenseInfoResponse }
     * 
     */
    public GetLicenseInfoResponse createGetLicenseInfoResponse() {
        return new GetLicenseInfoResponse();
    }

    /**
     * Create an instance of {@link RemoveDistributionListAliasResponse }
     * 
     */
    public RemoveDistributionListAliasResponse createRemoveDistributionListAliasResponse() {
        return new RemoveDistributionListAliasResponse();
    }

    /**
     * Create an instance of {@link RemoveDistributionListMemberRequest }
     * 
     */
    public RemoveDistributionListMemberRequest createRemoveDistributionListMemberRequest() {
        return new RemoveDistributionListMemberRequest();
    }

    /**
     * Create an instance of {@link CheckRightRequest }
     * 
     */
    public CheckRightRequest createCheckRightRequest() {
        return new CheckRightRequest();
    }

    /**
     * Create an instance of {@link GetMailboxRequest }
     * 
     */
    public GetMailboxRequest createGetMailboxRequest() {
        return new GetMailboxRequest();
    }

    /**
     * Create an instance of {@link SearchCalendarResourcesRequest }
     * 
     */
    public SearchCalendarResourcesRequest createSearchCalendarResourcesRequest() {
        return new SearchCalendarResourcesRequest();
    }

    /**
     * Create an instance of {@link GenCSRRequest }
     * 
     */
    public GenCSRRequest createGenCSRRequest() {
        return new GenCSRRequest();
    }

    /**
     * Create an instance of {@link ExportMailboxResponse }
     * 
     */
    public ExportMailboxResponse createExportMailboxResponse() {
        return new ExportMailboxResponse();
    }

    /**
     * Create an instance of {@link GetMailboxVolumesRequest }
     * 
     */
    public GetMailboxVolumesRequest createGetMailboxVolumesRequest() {
        return new GetMailboxVolumesRequest();
    }

    /**
     * Create an instance of {@link CreateServerRequest }
     * 
     */
    public CreateServerRequest createCreateServerRequest() {
        return new CreateServerRequest();
    }

    /**
     * Create an instance of {@link FixCalendarEndTimeResponse }
     * 
     */
    public FixCalendarEndTimeResponse createFixCalendarEndTimeResponse() {
        return new FixCalendarEndTimeResponse();
    }

    /**
     * Create an instance of {@link SearchDirectoryResponse }
     * 
     */
    public SearchDirectoryResponse createSearchDirectoryResponse() {
        return new SearchDirectoryResponse();
    }

    /**
     * Create an instance of {@link GetAllAlwaysOnClustersResponse }
     * 
     */
    public GetAllAlwaysOnClustersResponse createGetAllAlwaysOnClustersResponse() {
        return new GetAllAlwaysOnClustersResponse();
    }

    /**
     * Create an instance of {@link GetConfigRequest }
     * 
     */
    public GetConfigRequest createGetConfigRequest() {
        return new GetConfigRequest();
    }

    /**
     * Create an instance of {@link CreateSystemRetentionPolicyResponse }
     * 
     */
    public CreateSystemRetentionPolicyResponse createCreateSystemRetentionPolicyResponse() {
        return new CreateSystemRetentionPolicyResponse();
    }

    /**
     * Create an instance of {@link ConfigureZimletRequest }
     * 
     */
    public ConfigureZimletRequest createConfigureZimletRequest() {
        return new ConfigureZimletRequest();
    }

    /**
     * Create an instance of {@link SetLocalServerOnlineRequest }
     * 
     */
    public SetLocalServerOnlineRequest createSetLocalServerOnlineRequest() {
        return new SetLocalServerOnlineRequest();
    }

    /**
     * Create an instance of {@link GetServerNIfsRequest }
     * 
     */
    public GetServerNIfsRequest createGetServerNIfsRequest() {
        return new GetServerNIfsRequest();
    }

    /**
     * Create an instance of {@link CreateAlwaysOnClusterResponse }
     * 
     */
    public CreateAlwaysOnClusterResponse createCreateAlwaysOnClusterResponse() {
        return new CreateAlwaysOnClusterResponse();
    }

    /**
     * Create an instance of {@link GetServerStatsRequest }
     * 
     */
    public GetServerStatsRequest createGetServerStatsRequest() {
        return new GetServerStatsRequest();
    }

    /**
     * Create an instance of {@link ModifyVolumeRequest }
     * 
     */
    public ModifyVolumeRequest createModifyVolumeRequest() {
        return new ModifyVolumeRequest();
    }

    /**
     * Create an instance of {@link CreateVolumeResponse }
     * 
     */
    public CreateVolumeResponse createCreateVolumeResponse() {
        return new CreateVolumeResponse();
    }

    /**
     * Create an instance of {@link DeleteDistributionListResponse }
     * 
     */
    public DeleteDistributionListResponse createDeleteDistributionListResponse() {
        return new DeleteDistributionListResponse();
    }

    /**
     * Create an instance of {@link DeleteServerResponse }
     * 
     */
    public DeleteServerResponse createDeleteServerResponse() {
        return new DeleteServerResponse();
    }

    /**
     * Create an instance of {@link CheckGalConfigRequest }
     * 
     */
    public CheckGalConfigRequest createCheckGalConfigRequest() {
        return new CheckGalConfigRequest();
    }

    /**
     * Create an instance of {@link CheckExchangeAuthRequest }
     * 
     */
    public CheckExchangeAuthRequest createCheckExchangeAuthRequest() {
        return new CheckExchangeAuthRequest();
    }

    /**
     * Create an instance of {@link CreateCalendarResourceRequest }
     * 
     */
    public CreateCalendarResourceRequest createCreateCalendarResourceRequest() {
        return new CreateCalendarResourceRequest();
    }

    /**
     * Create an instance of {@link GetMailQueueInfoResponse }
     * 
     */
    public GetMailQueueInfoResponse createGetMailQueueInfoResponse() {
        return new GetMailQueueInfoResponse();
    }

    /**
     * Create an instance of {@link LockoutMailboxResponse }
     * 
     */
    public LockoutMailboxResponse createLockoutMailboxResponse() {
        return new LockoutMailboxResponse();
    }

    /**
     * Create an instance of {@link RenameCalendarResourceResponse }
     * 
     */
    public RenameCalendarResourceResponse createRenameCalendarResourceResponse() {
        return new RenameCalendarResourceResponse();
    }

    /**
     * Create an instance of {@link QueryMailboxMoveResponse }
     * 
     */
    public QueryMailboxMoveResponse createQueryMailboxMoveResponse() {
        return new QueryMailboxMoveResponse();
    }

    /**
     * Create an instance of {@link DeleteMailboxRequest }
     * 
     */
    public DeleteMailboxRequest createDeleteMailboxRequest() {
        return new DeleteMailboxRequest();
    }

    /**
     * Create an instance of {@link GetCreateObjectAttrsResponse }
     * 
     */
    public GetCreateObjectAttrsResponse createGetCreateObjectAttrsResponse() {
        return new GetCreateObjectAttrsResponse();
    }

    /**
     * Create an instance of {@link RemoveDistributionListMemberResponse }
     * 
     */
    public RemoveDistributionListMemberResponse createRemoveDistributionListMemberResponse() {
        return new RemoveDistributionListMemberResponse();
    }

    /**
     * Create an instance of {@link DeleteCosRequest }
     * 
     */
    public DeleteCosRequest createDeleteCosRequest() {
        return new DeleteCosRequest();
    }

    /**
     * Create an instance of {@link RemoveAccountLoggerRequest }
     * 
     */
    public RemoveAccountLoggerRequest createRemoveAccountLoggerRequest() {
        return new RemoveAccountLoggerRequest();
    }

    /**
     * Create an instance of {@link GetIndexStatsResponse }
     * 
     */
    public GetIndexStatsResponse createGetIndexStatsResponse() {
        return new GetIndexStatsResponse();
    }

    /**
     * Create an instance of {@link GetCalendarResourceResponse }
     * 
     */
    public GetCalendarResourceResponse createGetCalendarResourceResponse() {
        return new GetCalendarResourceResponse();
    }

    /**
     * Create an instance of {@link CheckExchangeAuthResponse }
     * 
     */
    public CheckExchangeAuthResponse createCheckExchangeAuthResponse() {
        return new CheckExchangeAuthResponse();
    }

    /**
     * Create an instance of {@link CompactIndexRequest }
     * 
     */
    public CompactIndexRequest createCompactIndexRequest() {
        return new CompactIndexRequest();
    }

    /**
     * Create an instance of {@link GetAllServersRequest }
     * 
     */
    public GetAllServersRequest createGetAllServersRequest() {
        return new GetAllServersRequest();
    }

    /**
     * Create an instance of {@link InstallCertRequest }
     * 
     */
    public InstallCertRequest createInstallCertRequest() {
        return new InstallCertRequest();
    }

    /**
     * Create an instance of {@link SearchAccountsResponse }
     * 
     */
    public SearchAccountsResponse createSearchAccountsResponse() {
        return new SearchAccountsResponse();
    }

    /**
     * Create an instance of {@link PurgeMovedMailboxRequest }
     * 
     */
    public PurgeMovedMailboxRequest createPurgeMovedMailboxRequest() {
        return new PurgeMovedMailboxRequest();
    }

    /**
     * Create an instance of {@link GetDevicesCountRequest }
     * 
     */
    public GetDevicesCountRequest createGetDevicesCountRequest() {
        return new GetDevicesCountRequest();
    }

    /**
     * Create an instance of {@link RenameUCServiceRequest }
     * 
     */
    public RenameUCServiceRequest createRenameUCServiceRequest() {
        return new RenameUCServiceRequest();
    }

    /**
     * Create an instance of {@link AuthRequest }
     * 
     */
    public AuthRequest createAuthRequest() {
        return new AuthRequest();
    }

    /**
     * Create an instance of {@link HsmResponse }
     * 
     */
    public HsmResponse createHsmResponse() {
        return new HsmResponse();
    }

    /**
     * Create an instance of {@link RenameUCServiceResponse }
     * 
     */
    public RenameUCServiceResponse createRenameUCServiceResponse() {
        return new RenameUCServiceResponse();
    }

    /**
     * Create an instance of {@link ResetAllLoggersRequest }
     * 
     */
    public ResetAllLoggersRequest createResetAllLoggersRequest() {
        return new ResetAllLoggersRequest();
    }

    /**
     * Create an instance of {@link ActivateLicenseResponse }
     * 
     */
    public ActivateLicenseResponse createActivateLicenseResponse() {
        return new ActivateLicenseResponse();
    }

    /**
     * Create an instance of {@link GetServiceStatusRequest }
     * 
     */
    public GetServiceStatusRequest createGetServiceStatusRequest() {
        return new GetServiceStatusRequest();
    }

    /**
     * Create an instance of {@link GetAllFreeBusyProvidersResponse }
     * 
     */
    public GetAllFreeBusyProvidersResponse createGetAllFreeBusyProvidersResponse() {
        return new GetAllFreeBusyProvidersResponse();
    }

    /**
     * Create an instance of {@link GetZimletResponse }
     * 
     */
    public GetZimletResponse createGetZimletResponse() {
        return new GetZimletResponse();
    }

    /**
     * Create an instance of {@link GetAccountRequest }
     * 
     */
    public GetAccountRequest createGetAccountRequest() {
        return new GetAccountRequest();
    }

    /**
     * Create an instance of {@link GetGrantsResponse }
     * 
     */
    public GetGrantsResponse createGetGrantsResponse() {
        return new GetGrantsResponse();
    }

    /**
     * Create an instance of {@link SearchAutoProvDirectoryResponse }
     * 
     */
    public SearchAutoProvDirectoryResponse createSearchAutoProvDirectoryResponse() {
        return new SearchAutoProvDirectoryResponse();
    }

    /**
     * Create an instance of {@link CreateAlwaysOnClusterRequest }
     * 
     */
    public CreateAlwaysOnClusterRequest createCreateAlwaysOnClusterRequest() {
        return new CreateAlwaysOnClusterRequest();
    }

    /**
     * Create an instance of {@link DeleteGalSyncAccountRequest }
     * 
     */
    public DeleteGalSyncAccountRequest createDeleteGalSyncAccountRequest() {
        return new DeleteGalSyncAccountRequest();
    }

    /**
     * Create an instance of {@link GetCSRRequest }
     * 
     */
    public GetCSRRequest createGetCSRRequest() {
        return new GetCSRRequest();
    }

    /**
     * Create an instance of {@link QueryMailboxMoveRequest }
     * 
     */
    public QueryMailboxMoveRequest createQueryMailboxMoveRequest() {
        return new QueryMailboxMoveRequest();
    }

    /**
     * Create an instance of {@link RunUnitTestsRequest }
     * 
     */
    public RunUnitTestsRequest createRunUnitTestsRequest() {
        return new RunUnitTestsRequest();
    }

    /**
     * Create an instance of {@link CreateUCServiceResponse }
     * 
     */
    public CreateUCServiceResponse createCreateUCServiceResponse() {
        return new CreateUCServiceResponse();
    }

    /**
     * Create an instance of {@link NoOpRequest }
     * 
     */
    public NoOpRequest createNoOpRequest() {
        return new NoOpRequest();
    }

    /**
     * Create an instance of {@link MailQueueActionRequest }
     * 
     */
    public MailQueueActionRequest createMailQueueActionRequest() {
        return new MailQueueActionRequest();
    }

    /**
     * Create an instance of {@link ModifyDomainRequest }
     * 
     */
    public ModifyDomainRequest createModifyDomainRequest() {
        return new ModifyDomainRequest();
    }

    /**
     * Create an instance of {@link DeleteLDAPEntryResponse }
     * 
     */
    public DeleteLDAPEntryResponse createDeleteLDAPEntryResponse() {
        return new DeleteLDAPEntryResponse();
    }

    /**
     * Create an instance of {@link RecalculateMailboxCountsRequest }
     * 
     */
    public RecalculateMailboxCountsRequest createRecalculateMailboxCountsRequest() {
        return new RecalculateMailboxCountsRequest();
    }

    /**
     * Create an instance of {@link RemoteWipeRequest }
     * 
     */
    public RemoteWipeRequest createRemoteWipeRequest() {
        return new RemoteWipeRequest();
    }

    /**
     * Create an instance of {@link MoveBlobsResponse }
     * 
     */
    public MoveBlobsResponse createMoveBlobsResponse() {
        return new MoveBlobsResponse();
    }

    /**
     * Create an instance of {@link SearchMultiMailboxRequest }
     * 
     */
    public SearchMultiMailboxRequest createSearchMultiMailboxRequest() {
        return new SearchMultiMailboxRequest();
    }

    /**
     * Create an instance of {@link SyncGalAccountResponse }
     * 
     */
    public SyncGalAccountResponse createSyncGalAccountResponse() {
        return new SyncGalAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllServersResponse }
     * 
     */
    public GetAllServersResponse createGetAllServersResponse() {
        return new GetAllServersResponse();
    }

    /**
     * Create an instance of {@link RemoveAccountLoggerResponse }
     * 
     */
    public RemoveAccountLoggerResponse createRemoveAccountLoggerResponse() {
        return new RemoveAccountLoggerResponse();
    }

    /**
     * Create an instance of {@link GetDevicesCountUsedTodayResponse }
     * 
     */
    public GetDevicesCountUsedTodayResponse createGetDevicesCountUsedTodayResponse() {
        return new GetDevicesCountUsedTodayResponse();
    }

    /**
     * Create an instance of {@link MailQueueActionResponse }
     * 
     */
    public MailQueueActionResponse createMailQueueActionResponse() {
        return new MailQueueActionResponse();
    }

    /**
     * Create an instance of {@link GetSystemRetentionPolicyRequest }
     * 
     */
    public GetSystemRetentionPolicyRequest createGetSystemRetentionPolicyRequest() {
        return new GetSystemRetentionPolicyRequest();
    }

    /**
     * Create an instance of {@link GetAllCalendarResourcesResponse }
     * 
     */
    public GetAllCalendarResourcesResponse createGetAllCalendarResourcesResponse() {
        return new GetAllCalendarResourcesResponse();
    }

    /**
     * Create an instance of {@link MailQueueFlushResponse }
     * 
     */
    public MailQueueFlushResponse createMailQueueFlushResponse() {
        return new MailQueueFlushResponse();
    }

    /**
     * Create an instance of {@link DeleteXMPPComponentRequest }
     * 
     */
    public DeleteXMPPComponentRequest createDeleteXMPPComponentRequest() {
        return new DeleteXMPPComponentRequest();
    }

    /**
     * Create an instance of {@link GetAdminConsoleUICompRequest }
     * 
     */
    public GetAdminConsoleUICompRequest createGetAdminConsoleUICompRequest() {
        return new GetAdminConsoleUICompRequest();
    }

    /**
     * Create an instance of {@link SearchAccountsRequest }
     * 
     */
    public SearchAccountsRequest createSearchAccountsRequest() {
        return new SearchAccountsRequest();
    }

    /**
     * Create an instance of {@link GetSyncStateResponse }
     * 
     */
    public GetSyncStateResponse createGetSyncStateResponse() {
        return new GetSyncStateResponse();
    }

    /**
     * Create an instance of {@link GetXMbxSearchesListResponse }
     * 
     */
    public GetXMbxSearchesListResponse createGetXMbxSearchesListResponse() {
        return new GetXMbxSearchesListResponse();
    }

    /**
     * Create an instance of {@link HsmRequest }
     * 
     */
    public HsmRequest createHsmRequest() {
        return new HsmRequest();
    }

    /**
     * Create an instance of {@link GetMailQueueResponse }
     * 
     */
    public GetMailQueueResponse createGetMailQueueResponse() {
        return new GetMailQueueResponse();
    }

    /**
     * Create an instance of {@link ServerInfo }
     * 
     */
    public ServerInfo createServerInfo() {
        return new ServerInfo();
    }

    /**
     * Create an instance of {@link CopyCosRequest }
     * 
     */
    public CopyCosRequest createCopyCosRequest() {
        return new CopyCosRequest();
    }

    /**
     * Create an instance of {@link GetDistributionListMembershipRequest }
     * 
     */
    public GetDistributionListMembershipRequest createGetDistributionListMembershipRequest() {
        return new GetDistributionListMembershipRequest();
    }

    /**
     * Create an instance of {@link SearchGalResponse }
     * 
     */
    public SearchGalResponse createSearchGalResponse() {
        return new SearchGalResponse();
    }

    /**
     * Create an instance of {@link ModifyDataSourceResponse }
     * 
     */
    public ModifyDataSourceResponse createModifyDataSourceResponse() {
        return new ModifyDataSourceResponse();
    }

    /**
     * Create an instance of {@link InstallLicenseResponse }
     * 
     */
    public InstallLicenseResponse createInstallLicenseResponse() {
        return new InstallLicenseResponse();
    }

    /**
     * Create an instance of {@link DeleteZimletRequest }
     * 
     */
    public DeleteZimletRequest createDeleteZimletRequest() {
        return new DeleteZimletRequest();
    }

    /**
     * Create an instance of {@link GetQuotaUsageResponse }
     * 
     */
    public GetQuotaUsageResponse createGetQuotaUsageResponse() {
        return new GetQuotaUsageResponse();
    }

    /**
     * Create an instance of {@link ConfigureZimletResponse }
     * 
     */
    public ConfigureZimletResponse createConfigureZimletResponse() {
        return new ConfigureZimletResponse();
    }

    /**
     * Create an instance of {@link RevokeRightResponse }
     * 
     */
    public RevokeRightResponse createRevokeRightResponse() {
        return new RevokeRightResponse();
    }

    /**
     * Create an instance of {@link ModifyAccountResponse }
     * 
     */
    public ModifyAccountResponse createModifyAccountResponse() {
        return new ModifyAccountResponse();
    }

    /**
     * Create an instance of {@link ModifySystemRetentionPolicyResponse }
     * 
     */
    public ModifySystemRetentionPolicyResponse createModifySystemRetentionPolicyResponse() {
        return new ModifySystemRetentionPolicyResponse();
    }

    /**
     * Create an instance of {@link DelegateAuthResponse }
     * 
     */
    public DelegateAuthResponse createDelegateAuthResponse() {
        return new DelegateAuthResponse();
    }

    /**
     * Create an instance of {@link RemoveStaleDeviceMetadataResponse }
     * 
     */
    public RemoveStaleDeviceMetadataResponse createRemoveStaleDeviceMetadataResponse() {
        return new RemoveStaleDeviceMetadataResponse();
    }

    /**
     * Create an instance of {@link GetAllDistributionListsResponse }
     * 
     */
    public GetAllDistributionListsResponse createGetAllDistributionListsResponse() {
        return new GetAllDistributionListsResponse();
    }

    /**
     * Create an instance of {@link GetSyncStateRequest }
     * 
     */
    public GetSyncStateRequest createGetSyncStateRequest() {
        return new GetSyncStateRequest();
    }

    /**
     * Create an instance of {@link VerifyIndexRequest }
     * 
     */
    public VerifyIndexRequest createVerifyIndexRequest() {
        return new VerifyIndexRequest();
    }

    /**
     * Create an instance of {@link DeleteAlwaysOnClusterRequest }
     * 
     */
    public DeleteAlwaysOnClusterRequest createDeleteAlwaysOnClusterRequest() {
        return new DeleteAlwaysOnClusterRequest();
    }

    /**
     * Create an instance of {@link RemoveStaleDeviceMetadataRequest }
     * 
     */
    public RemoveStaleDeviceMetadataRequest createRemoveStaleDeviceMetadataRequest() {
        return new RemoveStaleDeviceMetadataRequest();
    }

    /**
     * Create an instance of {@link CreateDistributionListResponse }
     * 
     */
    public CreateDistributionListResponse createCreateDistributionListResponse() {
        return new CreateDistributionListResponse();
    }

    /**
     * Create an instance of {@link GetCosResponse }
     * 
     */
    public GetCosResponse createGetCosResponse() {
        return new GetCosResponse();
    }

    /**
     * Create an instance of {@link GetDataSourcesResponse }
     * 
     */
    public GetDataSourcesResponse createGetDataSourcesResponse() {
        return new GetDataSourcesResponse();
    }

    /**
     * Create an instance of {@link GetAllLocalesResponse }
     * 
     */
    public GetAllLocalesResponse createGetAllLocalesResponse() {
        return new GetAllLocalesResponse();
    }

    /**
     * Create an instance of {@link GetFreeBusyQueueInfoRequest }
     * 
     */
    public GetFreeBusyQueueInfoRequest createGetFreeBusyQueueInfoRequest() {
        return new GetFreeBusyQueueInfoRequest();
    }

    /**
     * Create an instance of {@link ModifyAlwaysOnClusterRequest }
     * 
     */
    public ModifyAlwaysOnClusterRequest createModifyAlwaysOnClusterRequest() {
        return new ModifyAlwaysOnClusterRequest();
    }

    /**
     * Create an instance of {@link RunUnitTestsResponse }
     * 
     */
    public RunUnitTestsResponse createRunUnitTestsResponse() {
        return new RunUnitTestsResponse();
    }

    /**
     * Create an instance of {@link ModifySystemRetentionPolicyRequest }
     * 
     */
    public ModifySystemRetentionPolicyRequest createModifySystemRetentionPolicyRequest() {
        return new ModifySystemRetentionPolicyRequest();
    }

    /**
     * Create an instance of {@link GetDomainRequest }
     * 
     */
    public GetDomainRequest createGetDomainRequest() {
        return new GetDomainRequest();
    }

    /**
     * Create an instance of {@link NoOpResponse }
     * 
     */
    public NoOpResponse createNoOpResponse() {
        return new NoOpResponse();
    }

    /**
     * Create an instance of {@link AdminWaitSetResponse }
     * 
     */
    public AdminWaitSetResponse createAdminWaitSetResponse() {
        return new AdminWaitSetResponse();
    }

    /**
     * Create an instance of {@link CreateLDAPEntryRequest }
     * 
     */
    public CreateLDAPEntryRequest createCreateLDAPEntryRequest() {
        return new CreateLDAPEntryRequest();
    }

    /**
     * Create an instance of {@link GetAllLocalesRequest }
     * 
     */
    public GetAllLocalesRequest createGetAllLocalesRequest() {
        return new GetAllLocalesRequest();
    }

    /**
     * Create an instance of {@link GetMailboxVersionResponse }
     * 
     */
    public GetMailboxVersionResponse createGetMailboxVersionResponse() {
        return new GetMailboxVersionResponse();
    }

    /**
     * Create an instance of {@link RegisterMailboxMoveOutResponse }
     * 
     */
    public RegisterMailboxMoveOutResponse createRegisterMailboxMoveOutResponse() {
        return new RegisterMailboxMoveOutResponse();
    }

    /**
     * Create an instance of {@link GetMailboxStatsRequest }
     * 
     */
    public GetMailboxStatsRequest createGetMailboxStatsRequest() {
        return new GetMailboxStatsRequest();
    }

    /**
     * Create an instance of {@link DeleteXMPPComponentResponse }
     * 
     */
    public DeleteXMPPComponentResponse createDeleteXMPPComponentResponse() {
        return new DeleteXMPPComponentResponse();
    }

    /**
     * Create an instance of {@link DlInfo }
     * 
     */
    public DlInfo createDlInfo() {
        return new DlInfo();
    }

    /**
     * Create an instance of {@link GrantRightResponse }
     * 
     */
    public GrantRightResponse createGrantRightResponse() {
        return new GrantRightResponse();
    }

    /**
     * Create an instance of {@link AutoCompleteGalResponse }
     * 
     */
    public AutoCompleteGalResponse createAutoCompleteGalResponse() {
        return new AutoCompleteGalResponse();
    }

    /**
     * Create an instance of {@link AddAccountLoggerRequest }
     * 
     */
    public AddAccountLoggerRequest createAddAccountLoggerRequest() {
        return new AddAccountLoggerRequest();
    }

    /**
     * Create an instance of {@link GetAllRightsResponse }
     * 
     */
    public GetAllRightsResponse createGetAllRightsResponse() {
        return new GetAllRightsResponse();
    }

    /**
     * Create an instance of {@link CreateSystemRetentionPolicyRequest }
     * 
     */
    public CreateSystemRetentionPolicyRequest createCreateSystemRetentionPolicyRequest() {
        return new CreateSystemRetentionPolicyRequest();
    }

    /**
     * Create an instance of {@link ModifyDelegatedAdminConstraintsResponse }
     * 
     */
    public ModifyDelegatedAdminConstraintsResponse createModifyDelegatedAdminConstraintsResponse() {
        return new ModifyDelegatedAdminConstraintsResponse();
    }

    /**
     * Create an instance of {@link RemoveDeviceResponse }
     * 
     */
    public RemoveDeviceResponse createRemoveDeviceResponse() {
        return new RemoveDeviceResponse();
    }

    /**
     * Create an instance of {@link SetCurrentVolumeRequest }
     * 
     */
    public SetCurrentVolumeRequest createSetCurrentVolumeRequest() {
        return new SetCurrentVolumeRequest();
    }

    /**
     * Create an instance of {@link GetAllAccountLoggersResponse }
     * 
     */
    public GetAllAccountLoggersResponse createGetAllAccountLoggersResponse() {
        return new GetAllAccountLoggersResponse();
    }

    /**
     * Create an instance of {@link GetDeviceStatusResponse }
     * 
     */
    public GetDeviceStatusResponse createGetDeviceStatusResponse() {
        return new GetDeviceStatusResponse();
    }

    /**
     * Create an instance of {@link RestoreRequest }
     * 
     */
    public RestoreRequest createRestoreRequest() {
        return new RestoreRequest();
    }

    /**
     * Create an instance of {@link ModifyCosResponse }
     * 
     */
    public ModifyCosResponse createModifyCosResponse() {
        return new ModifyCosResponse();
    }

    /**
     * Create an instance of {@link GetDeviceStatusRequest }
     * 
     */
    public GetDeviceStatusRequest createGetDeviceStatusRequest() {
        return new GetDeviceStatusRequest();
    }

    /**
     * Create an instance of {@link GetAccountLoggersResponse }
     * 
     */
    public GetAccountLoggersResponse createGetAccountLoggersResponse() {
        return new GetAccountLoggersResponse();
    }

    /**
     * Create an instance of {@link GetDistributionListResponse }
     * 
     */
    public GetDistributionListResponse createGetDistributionListResponse() {
        return new GetDistributionListResponse();
    }

    /**
     * Create an instance of {@link DeleteDataSourceRequest }
     * 
     */
    public DeleteDataSourceRequest createDeleteDataSourceRequest() {
        return new DeleteDataSourceRequest();
    }

    /**
     * Create an instance of {@link GetLDAPEntriesRequest }
     * 
     */
    public GetLDAPEntriesRequest createGetLDAPEntriesRequest() {
        return new GetLDAPEntriesRequest();
    }

    /**
     * Create an instance of {@link DeleteGalSyncAccountResponse }
     * 
     */
    public DeleteGalSyncAccountResponse createDeleteGalSyncAccountResponse() {
        return new DeleteGalSyncAccountResponse();
    }

    /**
     * Create an instance of {@link GetMailboxResponse }
     * 
     */
    public GetMailboxResponse createGetMailboxResponse() {
        return new GetMailboxResponse();
    }

    /**
     * Create an instance of {@link GetAttributeInfoRequest }
     * 
     */
    public GetAttributeInfoRequest createGetAttributeInfoRequest() {
        return new GetAttributeInfoRequest();
    }

    /**
     * Create an instance of {@link GetMailboxVolumesResponse }
     * 
     */
    public GetMailboxVolumesResponse createGetMailboxVolumesResponse() {
        return new GetMailboxVolumesResponse();
    }

    /**
     * Create an instance of {@link DeployZimletRequest }
     * 
     */
    public DeployZimletRequest createDeployZimletRequest() {
        return new DeployZimletRequest();
    }

    /**
     * Create an instance of {@link ReloadAccountResponse }
     * 
     */
    public ReloadAccountResponse createReloadAccountResponse() {
        return new ReloadAccountResponse();
    }

    /**
     * Create an instance of {@link SetLocalServerOnlineResponse }
     * 
     */
    public SetLocalServerOnlineResponse createSetLocalServerOnlineResponse() {
        return new SetLocalServerOnlineResponse();
    }

    /**
     * Create an instance of {@link GetAllZimletsRequest }
     * 
     */
    public GetAllZimletsRequest createGetAllZimletsRequest() {
        return new GetAllZimletsRequest();
    }

    /**
     * Create an instance of {@link RegisterMailboxMoveOutRequest }
     * 
     */
    public RegisterMailboxMoveOutRequest createRegisterMailboxMoveOutRequest() {
        return new RegisterMailboxMoveOutRequest();
    }

    /**
     * Create an instance of {@link RevokeRightRequest }
     * 
     */
    public RevokeRightRequest createRevokeRightRequest() {
        return new RevokeRightRequest();
    }

    /**
     * Create an instance of {@link GetMailboxStatsResponse }
     * 
     */
    public GetMailboxStatsResponse createGetMailboxStatsResponse() {
        return new GetMailboxStatsResponse();
    }

    /**
     * Create an instance of {@link PurgeMessagesResponse }
     * 
     */
    public PurgeMessagesResponse createPurgeMessagesResponse() {
        return new PurgeMessagesResponse();
    }

    /**
     * Create an instance of {@link GetAllRightsRequest }
     * 
     */
    public GetAllRightsRequest createGetAllRightsRequest() {
        return new GetAllRightsRequest();
    }

    /**
     * Create an instance of {@link GetApplianceHSMFSResponse }
     * 
     */
    public GetApplianceHSMFSResponse createGetApplianceHSMFSResponse() {
        return new GetApplianceHSMFSResponse();
    }

    /**
     * Create an instance of {@link DeleteServerRequest }
     * 
     */
    public DeleteServerRequest createDeleteServerRequest() {
        return new DeleteServerRequest();
    }

    /**
     * Create an instance of {@link ExportMailboxRequest }
     * 
     */
    public ExportMailboxRequest createExportMailboxRequest() {
        return new ExportMailboxRequest();
    }

    /**
     * Create an instance of {@link ModifyConfigRequest }
     * 
     */
    public ModifyConfigRequest createModifyConfigRequest() {
        return new ModifyConfigRequest();
    }

    /**
     * Create an instance of {@link UpdateDeviceStatusRequest }
     * 
     */
    public UpdateDeviceStatusRequest createUpdateDeviceStatusRequest() {
        return new UpdateDeviceStatusRequest();
    }

    /**
     * Create an instance of {@link GetDelegatedAdminConstraintsRequest }
     * 
     */
    public GetDelegatedAdminConstraintsRequest createGetDelegatedAdminConstraintsRequest() {
        return new GetDelegatedAdminConstraintsRequest();
    }

    /**
     * Create an instance of {@link GetUCServiceRequest }
     * 
     */
    public GetUCServiceRequest createGetUCServiceRequest() {
        return new GetUCServiceRequest();
    }

    /**
     * Create an instance of {@link GetSystemRetentionPolicyResponse }
     * 
     */
    public GetSystemRetentionPolicyResponse createGetSystemRetentionPolicyResponse() {
        return new GetSystemRetentionPolicyResponse();
    }

    /**
     * Create an instance of {@link BackupQueryResponse }
     * 
     */
    public BackupQueryResponse createBackupQueryResponse() {
        return new BackupQueryResponse();
    }

    /**
     * Create an instance of {@link AbortXMbxSearchResponse }
     * 
     */
    public AbortXMbxSearchResponse createAbortXMbxSearchResponse() {
        return new AbortXMbxSearchResponse();
    }

    /**
     * Create an instance of {@link CheckPasswordStrengthResponse }
     * 
     */
    public CheckPasswordStrengthResponse createCheckPasswordStrengthResponse() {
        return new CheckPasswordStrengthResponse();
    }

    /**
     * Create an instance of {@link DeleteDistributionListRequest }
     * 
     */
    public DeleteDistributionListRequest createDeleteDistributionListRequest() {
        return new DeleteDistributionListRequest();
    }

    /**
     * Create an instance of {@link CreateLDAPEntryResponse }
     * 
     */
    public CreateLDAPEntryResponse createCreateLDAPEntryResponse() {
        return new CreateLDAPEntryResponse();
    }

    /**
     * Create an instance of {@link GetConfigResponse }
     * 
     */
    public GetConfigResponse createGetConfigResponse() {
        return new GetConfigResponse();
    }

    /**
     * Create an instance of {@link GetClusterStatusRequest }
     * 
     */
    public GetClusterStatusRequest createGetClusterStatusRequest() {
        return new GetClusterStatusRequest();
    }

    /**
     * Create an instance of {@link CopyCosResponse }
     * 
     */
    public CopyCosResponse createCopyCosResponse() {
        return new CopyCosResponse();
    }

    /**
     * Create an instance of {@link CreateUCServiceRequest }
     * 
     */
    public CreateUCServiceRequest createCreateUCServiceRequest() {
        return new CreateUCServiceRequest();
    }

    /**
     * Create an instance of {@link FixCalendarPriorityRequest }
     * 
     */
    public FixCalendarPriorityRequest createFixCalendarPriorityRequest() {
        return new FixCalendarPriorityRequest();
    }

    /**
     * Create an instance of {@link CheckRightResponse }
     * 
     */
    public CheckRightResponse createCheckRightResponse() {
        return new CheckRightResponse();
    }

    /**
     * Create an instance of {@link ModifyDataSourceRequest }
     * 
     */
    public ModifyDataSourceRequest createModifyDataSourceRequest() {
        return new ModifyDataSourceRequest();
    }

    /**
     * Create an instance of {@link UcServiceInfo }
     * 
     */
    public UcServiceInfo createUcServiceInfo() {
        return new UcServiceInfo();
    }

    /**
     * Create an instance of {@link DeleteMailboxResponse }
     * 
     */
    public DeleteMailboxResponse createDeleteMailboxResponse() {
        return new DeleteMailboxResponse();
    }

    /**
     * Create an instance of {@link AbortHsmResponse }
     * 
     */
    public AbortHsmResponse createAbortHsmResponse() {
        return new AbortHsmResponse();
    }

    /**
     * Create an instance of {@link GetAllCosResponse }
     * 
     */
    public GetAllCosResponse createGetAllCosResponse() {
        return new GetAllCosResponse();
    }

    /**
     * Create an instance of {@link PurgeFreeBusyQueueRequest }
     * 
     */
    public PurgeFreeBusyQueueRequest createPurgeFreeBusyQueueRequest() {
        return new PurgeFreeBusyQueueRequest();
    }

    /**
     * Create an instance of {@link GetAllActiveServersResponse }
     * 
     */
    public GetAllActiveServersResponse createGetAllActiveServersResponse() {
        return new GetAllActiveServersResponse();
    }

    /**
     * Create an instance of {@link GetAdminConsoleUICompResponse }
     * 
     */
    public GetAdminConsoleUICompResponse createGetAdminConsoleUICompResponse() {
        return new GetAdminConsoleUICompResponse();
    }

    /**
     * Create an instance of {@link ReloadMemcachedClientConfigResponse }
     * 
     */
    public ReloadMemcachedClientConfigResponse createReloadMemcachedClientConfigResponse() {
        return new ReloadMemcachedClientConfigResponse();
    }

    /**
     * Create an instance of {@link GetAllVolumesRequest }
     * 
     */
    public GetAllVolumesRequest createGetAllVolumesRequest() {
        return new GetAllVolumesRequest();
    }

    /**
     * Create an instance of {@link SetCurrentVolumeResponse }
     * 
     */
    public SetCurrentVolumeResponse createSetCurrentVolumeResponse() {
        return new SetCurrentVolumeResponse();
    }

    /**
     * Create an instance of {@link MailboxQuotaInfo }
     * 
     */
    public MailboxQuotaInfo createMailboxQuotaInfo() {
        return new MailboxQuotaInfo();
    }

    /**
     * Create an instance of {@link ModifyAdminSavedSearchesRequest }
     * 
     */
    public ModifyAdminSavedSearchesRequest createModifyAdminSavedSearchesRequest() {
        return new ModifyAdminSavedSearchesRequest();
    }

    /**
     * Create an instance of {@link MigrateAccountResponse }
     * 
     */
    public MigrateAccountResponse createMigrateAccountResponse() {
        return new MigrateAccountResponse();
    }

    /**
     * Create an instance of {@link CreateCosRequest }
     * 
     */
    public CreateCosRequest createCreateCosRequest() {
        return new CreateCosRequest();
    }

    /**
     * Create an instance of {@link ModifyServerRequest }
     * 
     */
    public ModifyServerRequest createModifyServerRequest() {
        return new ModifyServerRequest();
    }

    /**
     * Create an instance of {@link CreateServerResponse }
     * 
     */
    public CreateServerResponse createCreateServerResponse() {
        return new CreateServerResponse();
    }

    /**
     * Create an instance of {@link ZimletServerExtension }
     * 
     */
    public ZimletServerExtension createZimletServerExtension() {
        return new ZimletServerExtension();
    }

    /**
     * Create an instance of {@link InstallLicenseRequest }
     * 
     */
    public InstallLicenseRequest createInstallLicenseRequest() {
        return new InstallLicenseRequest();
    }

    /**
     * Create an instance of {@link SetPasswordRequest }
     * 
     */
    public SetPasswordRequest createSetPasswordRequest() {
        return new SetPasswordRequest();
    }

    /**
     * Create an instance of {@link GetEffectiveRightsResponse }
     * 
     */
    public GetEffectiveRightsResponse createGetEffectiveRightsResponse() {
        return new GetEffectiveRightsResponse();
    }

    /**
     * Create an instance of {@link GetAllAdminAccountsResponse }
     * 
     */
    public GetAllAdminAccountsResponse createGetAllAdminAccountsResponse() {
        return new GetAllAdminAccountsResponse();
    }

    /**
     * Create an instance of {@link GetCalendarResourceRequest }
     * 
     */
    public GetCalendarResourceRequest createGetCalendarResourceRequest() {
        return new GetCalendarResourceRequest();
    }

    /**
     * Create an instance of {@link RemoteWipeResponse }
     * 
     */
    public RemoteWipeResponse createRemoteWipeResponse() {
        return new RemoteWipeResponse();
    }

    /**
     * Create an instance of {@link GetCertRequest }
     * 
     */
    public GetCertRequest createGetCertRequest() {
        return new GetCertRequest();
    }

    /**
     * Create an instance of {@link ReloadAccountRequest }
     * 
     */
    public ReloadAccountRequest createReloadAccountRequest() {
        return new ReloadAccountRequest();
    }

    /**
     * Create an instance of {@link DeleteVolumeResponse }
     * 
     */
    public DeleteVolumeResponse createDeleteVolumeResponse() {
        return new DeleteVolumeResponse();
    }

    /**
     * Create an instance of {@link CheckAuthConfigRequest }
     * 
     */
    public CheckAuthConfigRequest createCheckAuthConfigRequest() {
        return new CheckAuthConfigRequest();
    }

    /**
     * Create an instance of {@link GetAllUCServicesResponse }
     * 
     */
    public GetAllUCServicesResponse createGetAllUCServicesResponse() {
        return new GetAllUCServicesResponse();
    }

    /**
     * Create an instance of {@link ModifyServerResponse }
     * 
     */
    public ModifyServerResponse createModifyServerResponse() {
        return new ModifyServerResponse();
    }

    /**
     * Create an instance of {@link RemoveAccountAliasResponse }
     * 
     */
    public RemoveAccountAliasResponse createRemoveAccountAliasResponse() {
        return new RemoveAccountAliasResponse();
    }

    /**
     * Create an instance of {@link SearchMultiMailboxResponse }
     * 
     */
    public SearchMultiMailboxResponse createSearchMultiMailboxResponse() {
        return new SearchMultiMailboxResponse();
    }

    /**
     * Create an instance of {@link AdminCustomMetadata }
     * 
     */
    public AdminCustomMetadata createAdminCustomMetadata() {
        return new AdminCustomMetadata();
    }

    /**
     * Create an instance of {@link GetServiceStatusResponse }
     * 
     */
    public GetServiceStatusResponse createGetServiceStatusResponse() {
        return new GetServiceStatusResponse();
    }

    /**
     * Create an instance of {@link UnregisterMailboxMoveOutRequest }
     * 
     */
    public UnregisterMailboxMoveOutRequest createUnregisterMailboxMoveOutRequest() {
        return new UnregisterMailboxMoveOutRequest();
    }

    /**
     * Create an instance of {@link GetAllCosRequest }
     * 
     */
    public GetAllCosRequest createGetAllCosRequest() {
        return new GetAllCosRequest();
    }

    /**
     * Create an instance of {@link MoveBlobsRequest }
     * 
     */
    public MoveBlobsRequest createMoveBlobsRequest() {
        return new MoveBlobsRequest();
    }

    /**
     * Create an instance of {@link GetAllXMPPComponentsResponse }
     * 
     */
    public GetAllXMPPComponentsResponse createGetAllXMPPComponentsResponse() {
        return new GetAllXMPPComponentsResponse();
    }

    /**
     * Create an instance of {@link GetServerResponse }
     * 
     */
    public GetServerResponse createGetServerResponse() {
        return new GetServerResponse();
    }

    /**
     * Create an instance of {@link CheckHealthResponse }
     * 
     */
    public CheckHealthResponse createCheckHealthResponse() {
        return new CheckHealthResponse();
    }

    /**
     * Create an instance of {@link ModifySMIMEConfigRequest }
     * 
     */
    public ModifySMIMEConfigRequest createModifySMIMEConfigRequest() {
        return new ModifySMIMEConfigRequest();
    }

    /**
     * Create an instance of {@link GetXMbxSearchesListRequest }
     * 
     */
    public GetXMbxSearchesListRequest createGetXMbxSearchesListRequest() {
        return new GetXMbxSearchesListRequest();
    }

    /**
     * Create an instance of {@link GetDomainInfoRequest }
     * 
     */
    public GetDomainInfoRequest createGetDomainInfoRequest() {
        return new GetDomainInfoRequest();
    }

    /**
     * Create an instance of {@link CreateZimletRequest }
     * 
     */
    public CreateZimletRequest createCreateZimletRequest() {
        return new CreateZimletRequest();
    }

    /**
     * Create an instance of {@link GetMailboxVersionRequest }
     * 
     */
    public GetMailboxVersionRequest createGetMailboxVersionRequest() {
        return new GetMailboxVersionRequest();
    }

    /**
     * Create an instance of {@link ModifyCosRequest }
     * 
     */
    public ModifyCosRequest createModifyCosRequest() {
        return new ModifyCosRequest();
    }

    /**
     * Create an instance of {@link CreateCosResponse }
     * 
     */
    public CreateCosResponse createCreateCosResponse() {
        return new CreateCosResponse();
    }

    /**
     * Create an instance of {@link GetAllVolumesResponse }
     * 
     */
    public GetAllVolumesResponse createGetAllVolumesResponse() {
        return new GetAllVolumesResponse();
    }

    /**
     * Create an instance of {@link RenameAccountResponse }
     * 
     */
    public RenameAccountResponse createRenameAccountResponse() {
        return new RenameAccountResponse();
    }

    /**
     * Create an instance of {@link ModifyCalendarResourceResponse }
     * 
     */
    public ModifyCalendarResourceResponse createModifyCalendarResourceResponse() {
        return new ModifyCalendarResourceResponse();
    }

    /**
     * Create an instance of {@link VerifyStoreManagerResponse }
     * 
     */
    public VerifyStoreManagerResponse createVerifyStoreManagerResponse() {
        return new VerifyStoreManagerResponse();
    }

    /**
     * Create an instance of {@link GetHsmStatusRequest }
     * 
     */
    public GetHsmStatusRequest createGetHsmStatusRequest() {
        return new GetHsmStatusRequest();
    }

    /**
     * Create an instance of {@link GetUCServiceResponse }
     * 
     */
    public GetUCServiceResponse createGetUCServiceResponse() {
        return new GetUCServiceResponse();
    }

    /**
     * Create an instance of {@link FixCalendarPriorityResponse }
     * 
     */
    public FixCalendarPriorityResponse createFixCalendarPriorityResponse() {
        return new FixCalendarPriorityResponse();
    }

    /**
     * Create an instance of {@link SearchCalendarResourcesResponse }
     * 
     */
    public SearchCalendarResourcesResponse createSearchCalendarResourcesResponse() {
        return new SearchCalendarResourcesResponse();
    }

    /**
     * Create an instance of {@link AddAccountAliasRequest }
     * 
     */
    public AddAccountAliasRequest createAddAccountAliasRequest() {
        return new AddAccountAliasRequest();
    }

    /**
     * Create an instance of {@link AddDistributionListMemberRequest }
     * 
     */
    public AddDistributionListMemberRequest createAddDistributionListMemberRequest() {
        return new AddDistributionListMemberRequest();
    }

    /**
     * Create an instance of {@link ReloadLocalConfigResponse }
     * 
     */
    public ReloadLocalConfigResponse createReloadLocalConfigResponse() {
        return new ReloadLocalConfigResponse();
    }

    /**
     * Create an instance of {@link GetServerNIfsResponse }
     * 
     */
    public GetServerNIfsResponse createGetServerNIfsResponse() {
        return new GetServerNIfsResponse();
    }

    /**
     * Create an instance of {@link FlushCacheRequest }
     * 
     */
    public FlushCacheRequest createFlushCacheRequest() {
        return new FlushCacheRequest();
    }

    /**
     * Create an instance of {@link SearchDirectoryRequest }
     * 
     */
    public SearchDirectoryRequest createSearchDirectoryRequest() {
        return new SearchDirectoryRequest();
    }

    /**
     * Create an instance of {@link GetAllDomainsResponse }
     * 
     */
    public GetAllDomainsResponse createGetAllDomainsResponse() {
        return new GetAllDomainsResponse();
    }

    /**
     * Create an instance of {@link GetDevicesCountResponse }
     * 
     */
    public GetDevicesCountResponse createGetDevicesCountResponse() {
        return new GetDevicesCountResponse();
    }

    /**
     * Create an instance of {@link GetVersionInfoResponse }
     * 
     */
    public GetVersionInfoResponse createGetVersionInfoResponse() {
        return new GetVersionInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteUCServiceResponse }
     * 
     */
    public DeleteUCServiceResponse createDeleteUCServiceResponse() {
        return new DeleteUCServiceResponse();
    }

    /**
     * Create an instance of {@link GetAccountInfoRequest }
     * 
     */
    public GetAccountInfoRequest createGetAccountInfoRequest() {
        return new GetAccountInfoRequest();
    }

    /**
     * Create an instance of {@link GetAdminSavedSearchesResponse }
     * 
     */
    public GetAdminSavedSearchesResponse createGetAdminSavedSearchesResponse() {
        return new GetAdminSavedSearchesResponse();
    }

    /**
     * Create an instance of {@link RenameLDAPEntryRequest }
     * 
     */
    public RenameLDAPEntryRequest createRenameLDAPEntryRequest() {
        return new RenameLDAPEntryRequest();
    }

    /**
     * Create an instance of {@link CountObjectsResponse }
     * 
     */
    public CountObjectsResponse createCountObjectsResponse() {
        return new CountObjectsResponse();
    }

    /**
     * Create an instance of {@link GetDataSourcesRequest }
     * 
     */
    public GetDataSourcesRequest createGetDataSourcesRequest() {
        return new GetDataSourcesRequest();
    }

    /**
     * Create an instance of {@link GetDevicesResponse }
     * 
     */
    public GetDevicesResponse createGetDevicesResponse() {
        return new GetDevicesResponse();
    }

    /**
     * Create an instance of {@link DedupeBlobsRequest }
     * 
     */
    public DedupeBlobsRequest createDedupeBlobsRequest() {
        return new DedupeBlobsRequest();
    }

    /**
     * Create an instance of {@link GetAllAccountLoggersRequest }
     * 
     */
    public GetAllAccountLoggersRequest createGetAllAccountLoggersRequest() {
        return new GetAllAccountLoggersRequest();
    }

    /**
     * Create an instance of {@link CountAccountRequest }
     * 
     */
    public CountAccountRequest createCountAccountRequest() {
        return new CountAccountRequest();
    }

    /**
     * Create an instance of {@link GetLDAPEntriesResponse }
     * 
     */
    public GetLDAPEntriesResponse createGetLDAPEntriesResponse() {
        return new GetLDAPEntriesResponse();
    }

    /**
     * Create an instance of {@link GetSessionsRequest }
     * 
     */
    public GetSessionsRequest createGetSessionsRequest() {
        return new GetSessionsRequest();
    }

    /**
     * Create an instance of {@link RenameAccountRequest }
     * 
     */
    public RenameAccountRequest createRenameAccountRequest() {
        return new RenameAccountRequest();
    }

    /**
     * Create an instance of {@link UndeployZimletRequest }
     * 
     */
    public UndeployZimletRequest createUndeployZimletRequest() {
        return new UndeployZimletRequest();
    }

    /**
     * Create an instance of {@link AutoProvAccountResponse }
     * 
     */
    public AutoProvAccountResponse createAutoProvAccountResponse() {
        return new AutoProvAccountResponse();
    }

    /**
     * Create an instance of {@link UpdatePresenceSessionIdRequest }
     * 
     */
    public UpdatePresenceSessionIdRequest createUpdatePresenceSessionIdRequest() {
        return new UpdatePresenceSessionIdRequest();
    }

    /**
     * Create an instance of {@link DeployZimletResponse }
     * 
     */
    public DeployZimletResponse createDeployZimletResponse() {
        return new DeployZimletResponse();
    }

    /**
     * Create an instance of {@link GetAllEffectiveRightsRequest }
     * 
     */
    public GetAllEffectiveRightsRequest createGetAllEffectiveRightsRequest() {
        return new GetAllEffectiveRightsRequest();
    }

    /**
     * Create an instance of {@link SetServerOfflineRequest }
     * 
     */
    public SetServerOfflineRequest createSetServerOfflineRequest() {
        return new SetServerOfflineRequest();
    }

    /**
     * Create an instance of {@link ComputeAggregateQuotaUsageResponse }
     * 
     */
    public ComputeAggregateQuotaUsageResponse createComputeAggregateQuotaUsageResponse() {
        return new ComputeAggregateQuotaUsageResponse();
    }

    /**
     * Create an instance of {@link GetZimletRequest }
     * 
     */
    public GetZimletRequest createGetZimletRequest() {
        return new GetZimletRequest();
    }

    /**
     * Create an instance of {@link GenCSRResponse }
     * 
     */
    public GenCSRResponse createGenCSRResponse() {
        return new GenCSRResponse();
    }

    /**
     * Create an instance of {@link CreateGalSyncAccountResponse }
     * 
     */
    public CreateGalSyncAccountResponse createCreateGalSyncAccountResponse() {
        return new CreateGalSyncAccountResponse();
    }

    /**
     * Create an instance of {@link GetLicenseRequest }
     * 
     */
    public GetLicenseRequest createGetLicenseRequest() {
        return new GetLicenseRequest();
    }

    /**
     * Create an instance of {@link QueueQuery }
     * 
     */
    public QueueQuery createQueueQuery() {
        return new QueueQuery();
    }

    /**
     * Create an instance of {@link GetAllUCProvidersRequest }
     * 
     */
    public GetAllUCProvidersRequest createGetAllUCProvidersRequest() {
        return new GetAllUCProvidersRequest();
    }

    /**
     * Create an instance of {@link MailQueueFlushRequest }
     * 
     */
    public MailQueueFlushRequest createMailQueueFlushRequest() {
        return new MailQueueFlushRequest();
    }

    /**
     * Create an instance of {@link GetCurrentVolumesRequest }
     * 
     */
    public GetCurrentVolumesRequest createGetCurrentVolumesRequest() {
        return new GetCurrentVolumesRequest();
    }

    /**
     * Create an instance of {@link CreateArchiveRequest }
     * 
     */
    public CreateArchiveRequest createCreateArchiveRequest() {
        return new CreateArchiveRequest();
    }

    /**
     * Create an instance of {@link DumpSessionsResponse }
     * 
     */
    public DumpSessionsResponse createDumpSessionsResponse() {
        return new DumpSessionsResponse();
    }

    /**
     * Create an instance of {@link GetAdminSavedSearchesRequest }
     * 
     */
    public GetAdminSavedSearchesRequest createGetAdminSavedSearchesRequest() {
        return new GetAdminSavedSearchesRequest();
    }

    /**
     * Create an instance of {@link ModifyDomainResponse }
     * 
     */
    public ModifyDomainResponse createModifyDomainResponse() {
        return new ModifyDomainResponse();
    }

    /**
     * Create an instance of {@link BackupAccountQueryRequest }
     * 
     */
    public BackupAccountQueryRequest createBackupAccountQueryRequest() {
        return new BackupAccountQueryRequest();
    }

    /**
     * Create an instance of {@link GetDevicesRequest }
     * 
     */
    public GetDevicesRequest createGetDevicesRequest() {
        return new GetDevicesRequest();
    }

    /**
     * Create an instance of {@link GetDistributionListMembershipResponse }
     * 
     */
    public GetDistributionListMembershipResponse createGetDistributionListMembershipResponse() {
        return new GetDistributionListMembershipResponse();
    }

    /**
     * Create an instance of {@link ModifyDistributionListResponse }
     * 
     */
    public ModifyDistributionListResponse createModifyDistributionListResponse() {
        return new ModifyDistributionListResponse();
    }

    /**
     * Create an instance of {@link GetAllSkinsRequest }
     * 
     */
    public GetAllSkinsRequest createGetAllSkinsRequest() {
        return new GetAllSkinsRequest();
    }

    /**
     * Create an instance of {@link UploadDomCertResponse }
     * 
     */
    public UploadDomCertResponse createUploadDomCertResponse() {
        return new UploadDomCertResponse();
    }

    /**
     * Create an instance of {@link GetDomainResponse }
     * 
     */
    public GetDomainResponse createGetDomainResponse() {
        return new GetDomainResponse();
    }

    /**
     * Create an instance of {@link QueryWaitSetRequest }
     * 
     */
    public QueryWaitSetRequest createQueryWaitSetRequest() {
        return new QueryWaitSetRequest();
    }

    /**
     * Create an instance of {@link CreateDataSourceRequest }
     * 
     */
    public CreateDataSourceRequest createCreateDataSourceRequest() {
        return new CreateDataSourceRequest();
    }

    /**
     * Create an instance of {@link CreateDataSourceResponse }
     * 
     */
    public CreateDataSourceResponse createCreateDataSourceResponse() {
        return new CreateDataSourceResponse();
    }

    /**
     * Create an instance of {@link ExportAndDeleteItemsResponse }
     * 
     */
    public ExportAndDeleteItemsResponse createExportAndDeleteItemsResponse() {
        return new ExportAndDeleteItemsResponse();
    }

    /**
     * Create an instance of {@link AlwaysOnClusterInfo }
     * 
     */
    public AlwaysOnClusterInfo createAlwaysOnClusterInfo() {
        return new AlwaysOnClusterInfo();
    }

    /**
     * Create an instance of {@link GetAllConfigRequest }
     * 
     */
    public GetAllConfigRequest createGetAllConfigRequest() {
        return new GetAllConfigRequest();
    }

    /**
     * Create an instance of {@link AddGalSyncDataSourceRequest }
     * 
     */
    public AddGalSyncDataSourceRequest createAddGalSyncDataSourceRequest() {
        return new AddGalSyncDataSourceRequest();
    }

    /**
     * Create an instance of {@link GetAccountMembershipResponse }
     * 
     */
    public GetAccountMembershipResponse createGetAccountMembershipResponse() {
        return new GetAccountMembershipResponse();
    }

    /**
     * Create an instance of {@link GetAlwaysOnClusterResponse }
     * 
     */
    public GetAlwaysOnClusterResponse createGetAlwaysOnClusterResponse() {
        return new GetAlwaysOnClusterResponse();
    }

    /**
     * Create an instance of {@link CreateZimletResponse }
     * 
     */
    public CreateZimletResponse createCreateZimletResponse() {
        return new CreateZimletResponse();
    }

    /**
     * Create an instance of {@link GetXMPPComponentResponse }
     * 
     */
    public GetXMPPComponentResponse createGetXMPPComponentResponse() {
        return new GetXMPPComponentResponse();
    }

    /**
     * Create an instance of {@link SearchGalRequest }
     * 
     */
    public SearchGalRequest createSearchGalRequest() {
        return new SearchGalRequest();
    }

    /**
     * Create an instance of {@link GetCreateObjectAttrsRequest }
     * 
     */
    public GetCreateObjectAttrsRequest createGetCreateObjectAttrsRequest() {
        return new GetCreateObjectAttrsRequest();
    }

    /**
     * Create an instance of {@link DeleteAlwaysOnClusterResponse }
     * 
     */
    public DeleteAlwaysOnClusterResponse createDeleteAlwaysOnClusterResponse() {
        return new DeleteAlwaysOnClusterResponse();
    }

    /**
     * Create an instance of {@link FixCalendarEndTimeRequest }
     * 
     */
    public FixCalendarEndTimeRequest createFixCalendarEndTimeRequest() {
        return new FixCalendarEndTimeRequest();
    }

    /**
     * Create an instance of {@link GetCurrentVolumesResponse }
     * 
     */
    public GetCurrentVolumesResponse createGetCurrentVolumesResponse() {
        return new GetCurrentVolumesResponse();
    }

    /**
     * Create an instance of {@link RefreshRegisteredAuthTokensRequest }
     * 
     */
    public RefreshRegisteredAuthTokensRequest createRefreshRegisteredAuthTokensRequest() {
        return new RefreshRegisteredAuthTokensRequest();
    }

    /**
     * Create an instance of {@link ModifyCalendarResourceRequest }
     * 
     */
    public ModifyCalendarResourceRequest createModifyCalendarResourceRequest() {
        return new ModifyCalendarResourceRequest();
    }

    /**
     * Create an instance of {@link CreateAccountRequest }
     * 
     */
    public CreateAccountRequest createCreateAccountRequest() {
        return new CreateAccountRequest();
    }

    /**
     * Create an instance of {@link UploadProxyCAResponse }
     * 
     */
    public UploadProxyCAResponse createUploadProxyCAResponse() {
        return new UploadProxyCAResponse();
    }

    /**
     * Create an instance of {@link VersionCheckResponse }
     * 
     */
    public VersionCheckResponse createVersionCheckResponse() {
        return new VersionCheckResponse();
    }

    /**
     * Create an instance of {@link GetAllConfigResponse }
     * 
     */
    public GetAllConfigResponse createGetAllConfigResponse() {
        return new GetAllConfigResponse();
    }

    /**
     * Create an instance of {@link UndeployZimletResponse }
     * 
     */
    public UndeployZimletResponse createUndeployZimletResponse() {
        return new UndeployZimletResponse();
    }

    /**
     * Create an instance of {@link GetGrantsRequest }
     * 
     */
    public GetGrantsRequest createGetGrantsRequest() {
        return new GetGrantsRequest();
    }

    /**
     * Create an instance of {@link AddDistributionListAliasResponse }
     * 
     */
    public AddDistributionListAliasResponse createAddDistributionListAliasResponse() {
        return new AddDistributionListAliasResponse();
    }

    /**
     * Create an instance of {@link DeleteLDAPEntryRequest }
     * 
     */
    public DeleteLDAPEntryRequest createDeleteLDAPEntryRequest() {
        return new DeleteLDAPEntryRequest();
    }

    /**
     * Create an instance of {@link GetIndexStatsRequest }
     * 
     */
    public GetIndexStatsRequest createGetIndexStatsRequest() {
        return new GetIndexStatsRequest();
    }

    /**
     * Create an instance of {@link LockoutMailboxRequest }
     * 
     */
    public LockoutMailboxRequest createLockoutMailboxRequest() {
        return new LockoutMailboxRequest();
    }

    /**
     * Create an instance of {@link MoveMailboxResponse }
     * 
     */
    public MoveMailboxResponse createMoveMailboxResponse() {
        return new MoveMailboxResponse();
    }

    /**
     * Create an instance of {@link RefreshRegisteredAuthTokensResponse }
     * 
     */
    public RefreshRegisteredAuthTokensResponse createRefreshRegisteredAuthTokensResponse() {
        return new RefreshRegisteredAuthTokensResponse();
    }

    /**
     * Create an instance of {@link AddGalSyncDataSourceResponse }
     * 
     */
    public AddGalSyncDataSourceResponse createAddGalSyncDataSourceResponse() {
        return new AddGalSyncDataSourceResponse();
    }

    /**
     * Create an instance of {@link CreateVolumeRequest }
     * 
     */
    public CreateVolumeRequest createCreateVolumeRequest() {
        return new CreateVolumeRequest();
    }

    /**
     * Create an instance of {@link GetAccountInfoResponse }
     * 
     */
    public GetAccountInfoResponse createGetAccountInfoResponse() {
        return new GetAccountInfoResponse();
    }

    /**
     * Create an instance of {@link UploadDomCertRequest }
     * 
     */
    public UploadDomCertRequest createUploadDomCertRequest() {
        return new UploadDomCertRequest();
    }

    /**
     * Create an instance of {@link AddAccountLoggerResponse }
     * 
     */
    public AddAccountLoggerResponse createAddAccountLoggerResponse() {
        return new AddAccountLoggerResponse();
    }

    /**
     * Create an instance of {@link FailoverClusterServiceRequest }
     * 
     */
    public FailoverClusterServiceRequest createFailoverClusterServiceRequest() {
        return new FailoverClusterServiceRequest();
    }

    /**
     * Create an instance of {@link UpdateDeviceStatusResponse }
     * 
     */
    public UpdateDeviceStatusResponse createUpdateDeviceStatusResponse() {
        return new UpdateDeviceStatusResponse();
    }

    /**
     * Create an instance of {@link DeleteAccountResponse }
     * 
     */
    public DeleteAccountResponse createDeleteAccountResponse() {
        return new DeleteAccountResponse();
    }

    /**
     * Create an instance of {@link InstallCertResponse }
     * 
     */
    public InstallCertResponse createInstallCertResponse() {
        return new InstallCertResponse();
    }

    /**
     * Create an instance of {@link FlushCacheResponse }
     * 
     */
    public FlushCacheResponse createFlushCacheResponse() {
        return new FlushCacheResponse();
    }

    /**
     * Create an instance of {@link GetLoggerStatsResponse }
     * 
     */
    public GetLoggerStatsResponse createGetLoggerStatsResponse() {
        return new GetLoggerStatsResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link ModifyZimletRequest }
     * 
     */
    public ModifyZimletRequest createModifyZimletRequest() {
        return new ModifyZimletRequest();
    }

    /**
     * Create an instance of {@link DisableArchiveRequest }
     * 
     */
    public DisableArchiveRequest createDisableArchiveRequest() {
        return new DisableArchiveRequest();
    }

    /**
     * Create an instance of {@link GetAllAccountsRequest }
     * 
     */
    public GetAllAccountsRequest createGetAllAccountsRequest() {
        return new GetAllAccountsRequest();
    }

    /**
     * Create an instance of {@link GetAllUCServicesRequest }
     * 
     */
    public GetAllUCServicesRequest createGetAllUCServicesRequest() {
        return new GetAllUCServicesRequest();
    }

    /**
     * Create an instance of {@link ReloadLocalConfigRequest }
     * 
     */
    public ReloadLocalConfigRequest createReloadLocalConfigRequest() {
        return new ReloadLocalConfigRequest();
    }

    /**
     * Create an instance of {@link GetDomainInfoResponse }
     * 
     */
    public GetDomainInfoResponse createGetDomainInfoResponse() {
        return new GetDomainInfoResponse();
    }

    /**
     * Create an instance of {@link GetDevicesCountUsedTodayRequest }
     * 
     */
    public GetDevicesCountUsedTodayRequest createGetDevicesCountUsedTodayRequest() {
        return new GetDevicesCountUsedTodayRequest();
    }

    /**
     * Create an instance of {@link GetRightResponse }
     * 
     */
    public GetRightResponse createGetRightResponse() {
        return new GetRightResponse();
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllFreeBusyProvidersRequest }
     * 
     */
    public GetAllFreeBusyProvidersRequest createGetAllFreeBusyProvidersRequest() {
        return new GetAllFreeBusyProvidersRequest();
    }

    /**
     * Create an instance of {@link RemoveDistributionListAliasRequest }
     * 
     */
    public RemoveDistributionListAliasRequest createRemoveDistributionListAliasRequest() {
        return new RemoveDistributionListAliasRequest();
    }

    /**
     * Create an instance of {@link DisableArchiveResponse }
     * 
     */
    public DisableArchiveResponse createDisableArchiveResponse() {
        return new DisableArchiveResponse();
    }

    /**
     * Create an instance of {@link ModifyLDAPEntryResponse }
     * 
     */
    public ModifyLDAPEntryResponse createModifyLDAPEntryResponse() {
        return new ModifyLDAPEntryResponse();
    }

    /**
     * Create an instance of {@link DeleteCosResponse }
     * 
     */
    public DeleteCosResponse createDeleteCosResponse() {
        return new DeleteCosResponse();
    }

    /**
     * Create an instance of {@link CreateXMPPComponentResponse }
     * 
     */
    public CreateXMPPComponentResponse createCreateXMPPComponentResponse() {
        return new CreateXMPPComponentResponse();
    }

    /**
     * Create an instance of {@link CreateGalSyncAccountRequest }
     * 
     */
    public CreateGalSyncAccountRequest createCreateGalSyncAccountRequest() {
        return new CreateGalSyncAccountRequest();
    }

    /**
     * Create an instance of {@link VerifyIndexResponse }
     * 
     */
    public VerifyIndexResponse createVerifyIndexResponse() {
        return new VerifyIndexResponse();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link CheckDirectoryResponse }
     * 
     */
    public CheckDirectoryResponse createCheckDirectoryResponse() {
        return new CheckDirectoryResponse();
    }

    /**
     * Create an instance of {@link GetZimletStatusResponse }
     * 
     */
    public GetZimletStatusResponse createGetZimletStatusResponse() {
        return new GetZimletStatusResponse();
    }

    /**
     * Create an instance of {@link CheckBlobConsistencyRequest }
     * 
     */
    public CheckBlobConsistencyRequest createCheckBlobConsistencyRequest() {
        return new CheckBlobConsistencyRequest();
    }

    /**
     * Create an instance of {@link CreateCalendarResourceResponse }
     * 
     */
    public CreateCalendarResourceResponse createCreateCalendarResourceResponse() {
        return new CreateCalendarResourceResponse();
    }

    /**
     * Create an instance of {@link ReIndexRequest }
     * 
     */
    public ReIndexRequest createReIndexRequest() {
        return new ReIndexRequest();
    }

    /**
     * Create an instance of {@link DeleteXMbxSearchResponse }
     * 
     */
    public DeleteXMbxSearchResponse createDeleteXMbxSearchResponse() {
        return new DeleteXMbxSearchResponse();
    }

    /**
     * Create an instance of {@link GetMemcachedClientConfigResponse }
     * 
     */
    public GetMemcachedClientConfigResponse createGetMemcachedClientConfigResponse() {
        return new GetMemcachedClientConfigResponse();
    }

    /**
     * Create an instance of {@link BackupQueryRequest }
     * 
     */
    public BackupQueryRequest createBackupQueryRequest() {
        return new BackupQueryRequest();
    }

    /**
     * Create an instance of {@link GetApplianceHSMFSRequest }
     * 
     */
    public GetApplianceHSMFSRequest createGetApplianceHSMFSRequest() {
        return new GetApplianceHSMFSRequest();
    }

    /**
     * Create an instance of {@link ResumeDeviceRequest }
     * 
     */
    public ResumeDeviceRequest createResumeDeviceRequest() {
        return new ResumeDeviceRequest();
    }

    /**
     * Create an instance of {@link ResumeDeviceResponse }
     * 
     */
    public ResumeDeviceResponse createResumeDeviceResponse() {
        return new ResumeDeviceResponse();
    }

    /**
     * Create an instance of {@link BackupAccountQueryResponse }
     * 
     */
    public BackupAccountQueryResponse createBackupAccountQueryResponse() {
        return new BackupAccountQueryResponse();
    }

    /**
     * Create an instance of {@link CheckDirectoryRequest }
     * 
     */
    public CheckDirectoryRequest createCheckDirectoryRequest() {
        return new CheckDirectoryRequest();
    }

    /**
     * Create an instance of {@link AddDistributionListMemberResponse }
     * 
     */
    public AddDistributionListMemberResponse createAddDistributionListMemberResponse() {
        return new AddDistributionListMemberResponse();
    }

    /**
     * Create an instance of {@link GetAlwaysOnClusterRequest }
     * 
     */
    public GetAlwaysOnClusterRequest createGetAlwaysOnClusterRequest() {
        return new GetAlwaysOnClusterRequest();
    }

    /**
     * Create an instance of {@link CheckGalConfigResponse }
     * 
     */
    public CheckGalConfigResponse createCheckGalConfigResponse() {
        return new CheckGalConfigResponse();
    }

    /**
     * Create an instance of {@link GetDelegatedAdminConstraintsResponse }
     * 
     */
    public GetDelegatedAdminConstraintsResponse createGetDelegatedAdminConstraintsResponse() {
        return new GetDelegatedAdminConstraintsResponse();
    }

    /**
     * Create an instance of {@link GetVolumeRequest }
     * 
     */
    public GetVolumeRequest createGetVolumeRequest() {
        return new GetVolumeRequest();
    }

    /**
     * Create an instance of {@link SearchAutoProvDirectoryRequest }
     * 
     */
    public SearchAutoProvDirectoryRequest createSearchAutoProvDirectoryRequest() {
        return new SearchAutoProvDirectoryRequest();
    }

    /**
     * Create an instance of {@link SuspendDeviceResponse }
     * 
     */
    public SuspendDeviceResponse createSuspendDeviceResponse() {
        return new SuspendDeviceResponse();
    }

    /**
     * Create an instance of {@link CheckHealthRequest }
     * 
     */
    public CheckHealthRequest createCheckHealthRequest() {
        return new CheckHealthRequest();
    }

    /**
     * Create an instance of {@link AbortHsmRequest }
     * 
     */
    public AbortHsmRequest createAbortHsmRequest() {
        return new AbortHsmRequest();
    }

    /**
     * Create an instance of {@link BackupResponse }
     * 
     */
    public BackupResponse createBackupResponse() {
        return new BackupResponse();
    }

    /**
     * Create an instance of {@link VerifyCertKeyRequest }
     * 
     */
    public VerifyCertKeyRequest createVerifyCertKeyRequest() {
        return new VerifyCertKeyRequest();
    }

    /**
     * Create an instance of {@link AuthResponse }
     * 
     */
    public AuthResponse createAuthResponse() {
        return new AuthResponse();
    }

    /**
     * Create an instance of {@link CancelPendingRemoteWipeRequest }
     * 
     */
    public CancelPendingRemoteWipeRequest createCancelPendingRemoteWipeRequest() {
        return new CancelPendingRemoteWipeRequest();
    }

    /**
     * Create an instance of {@link GetXMPPComponentRequest }
     * 
     */
    public GetXMPPComponentRequest createGetXMPPComponentRequest() {
        return new GetXMPPComponentRequest();
    }

    /**
     * Create an instance of {@link GetSMIMEConfigResponse }
     * 
     */
    public GetSMIMEConfigResponse createGetSMIMEConfigResponse() {
        return new GetSMIMEConfigResponse();
    }

    /**
     * Create an instance of {@link ModifyZimletResponse }
     * 
     */
    public ModifyZimletResponse createModifyZimletResponse() {
        return new ModifyZimletResponse();
    }

    /**
     * Create an instance of {@link AutoCompleteGalRequest }
     * 
     */
    public AutoCompleteGalRequest createAutoCompleteGalRequest() {
        return new AutoCompleteGalRequest();
    }

    /**
     * Create an instance of {@link CreateXMbxSearchRequest }
     * 
     */
    public CreateXMbxSearchRequest createCreateXMbxSearchRequest() {
        return new CreateXMbxSearchRequest();
    }

    /**
     * Create an instance of {@link DeleteDomainRequest }
     * 
     */
    public DeleteDomainRequest createDeleteDomainRequest() {
        return new DeleteDomainRequest();
    }

    /**
     * Create an instance of {@link ModifyDistributionListRequest }
     * 
     */
    public ModifyDistributionListRequest createModifyDistributionListRequest() {
        return new ModifyDistributionListRequest();
    }

    /**
     * Create an instance of {@link GetLoggerStatsRequest }
     * 
     */
    public GetLoggerStatsRequest createGetLoggerStatsRequest() {
        return new GetLoggerStatsRequest();
    }

    /**
     * Create an instance of {@link ModifyAccountRequest }
     * 
     */
    public ModifyAccountRequest createModifyAccountRequest() {
        return new ModifyAccountRequest();
    }

    /**
     * Create an instance of {@link SuspendDeviceRequest }
     * 
     */
    public SuspendDeviceRequest createSuspendDeviceRequest() {
        return new SuspendDeviceRequest();
    }

    /**
     * Create an instance of {@link UnloadMailboxResponse }
     * 
     */
    public UnloadMailboxResponse createUnloadMailboxResponse() {
        return new UnloadMailboxResponse();
    }

    /**
     * Create an instance of {@link GetRightRequest }
     * 
     */
    public GetRightRequest createGetRightRequest() {
        return new GetRightRequest();
    }

    /**
     * Create an instance of {@link DeleteUCServiceRequest }
     * 
     */
    public DeleteUCServiceRequest createDeleteUCServiceRequest() {
        return new DeleteUCServiceRequest();
    }

    /**
     * Create an instance of {@link DeleteAccountRequest }
     * 
     */
    public DeleteAccountRequest createDeleteAccountRequest() {
        return new DeleteAccountRequest();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link RenameCosResponse }
     * 
     */
    public RenameCosResponse createRenameCosResponse() {
        return new RenameCosResponse();
    }

    /**
     * Create an instance of {@link DeleteSystemRetentionPolicyRequest }
     * 
     */
    public DeleteSystemRetentionPolicyRequest createDeleteSystemRetentionPolicyRequest() {
        return new DeleteSystemRetentionPolicyRequest();
    }

    /**
     * Create an instance of {@link GetMailQueueRequest }
     * 
     */
    public GetMailQueueRequest createGetMailQueueRequest() {
        return new GetMailQueueRequest();
    }

    /**
     * Create an instance of {@link GetDistributionListRequest }
     * 
     */
    public GetDistributionListRequest createGetDistributionListRequest() {
        return new GetDistributionListRequest();
    }

    /**
     * Create an instance of {@link CreateDomainResponse }
     * 
     */
    public CreateDomainResponse createCreateDomainResponse() {
        return new CreateDomainResponse();
    }

    /**
     * Create an instance of {@link ModifyConfigResponse }
     * 
     */
    public ModifyConfigResponse createModifyConfigResponse() {
        return new ModifyConfigResponse();
    }

    /**
     * Create an instance of {@link ModifyAdminSavedSearchesResponse }
     * 
     */
    public ModifyAdminSavedSearchesResponse createModifyAdminSavedSearchesResponse() {
        return new ModifyAdminSavedSearchesResponse();
    }

    /**
     * Create an instance of {@link RemoveDeviceRequest }
     * 
     */
    public RemoveDeviceRequest createRemoveDeviceRequest() {
        return new RemoveDeviceRequest();
    }

    /**
     * Create an instance of {@link GetAggregateQuotaUsageOnServerRequest }
     * 
     */
    public GetAggregateQuotaUsageOnServerRequest createGetAggregateQuotaUsageOnServerRequest() {
        return new GetAggregateQuotaUsageOnServerRequest();
    }

    /**
     * Create an instance of {@link GetSMIMEConfigRequest }
     * 
     */
    public GetSMIMEConfigRequest createGetSMIMEConfigRequest() {
        return new GetSMIMEConfigRequest();
    }

    /**
     * Create an instance of {@link CheckAuthConfigResponse }
     * 
     */
    public CheckAuthConfigResponse createCheckAuthConfigResponse() {
        return new CheckAuthConfigResponse();
    }

    /**
     * Create an instance of {@link ResetAllLoggersResponse }
     * 
     */
    public ResetAllLoggersResponse createResetAllLoggersResponse() {
        return new ResetAllLoggersResponse();
    }

    /**
     * Create an instance of {@link DeleteZimletResponse }
     * 
     */
    public DeleteZimletResponse createDeleteZimletResponse() {
        return new DeleteZimletResponse();
    }

    /**
     * Create an instance of {@link AddAccountAliasResponse }
     * 
     */
    public AddAccountAliasResponse createAddAccountAliasResponse() {
        return new AddAccountAliasResponse();
    }

    /**
     * Create an instance of {@link DeleteXMbxSearchRequest }
     * 
     */
    public DeleteXMbxSearchRequest createDeleteXMbxSearchRequest() {
        return new DeleteXMbxSearchRequest();
    }

    /**
     * Create an instance of {@link ComputeAggregateQuotaUsageRequest }
     * 
     */
    public ComputeAggregateQuotaUsageRequest createComputeAggregateQuotaUsageRequest() {
        return new ComputeAggregateQuotaUsageRequest();
    }

    /**
     * Create an instance of {@link CountObjectsRequest }
     * 
     */
    public CountObjectsRequest createCountObjectsRequest() {
        return new CountObjectsRequest();
    }

    /**
     * Create an instance of {@link CheckBlobConsistencyResponse }
     * 
     */
    public CheckBlobConsistencyResponse createCheckBlobConsistencyResponse() {
        return new CheckBlobConsistencyResponse();
    }

    /**
     * Create an instance of {@link CheckPasswordStrengthRequest }
     * 
     */
    public CheckPasswordStrengthRequest createCheckPasswordStrengthRequest() {
        return new CheckPasswordStrengthRequest();
    }

    /**
     * Create an instance of {@link GetAdminExtensionZimletsRequest }
     * 
     */
    public GetAdminExtensionZimletsRequest createGetAdminExtensionZimletsRequest() {
        return new GetAdminExtensionZimletsRequest();
    }

    /**
     * Create an instance of {@link ClearCookieRequest }
     * 
     */
    public ClearCookieRequest createClearCookieRequest() {
        return new ClearCookieRequest();
    }

    /**
     * Create an instance of {@link GetAllMailboxesRequest }
     * 
     */
    public GetAllMailboxesRequest createGetAllMailboxesRequest() {
        return new GetAllMailboxesRequest();
    }

    /**
     * Create an instance of {@link CreateArchiveResponse }
     * 
     */
    public CreateArchiveResponse createCreateArchiveResponse() {
        return new CreateArchiveResponse();
    }

    /**
     * Create an instance of {@link PurgeMessagesRequest }
     * 
     */
    public PurgeMessagesRequest createPurgeMessagesRequest() {
        return new PurgeMessagesRequest();
    }

    /**
     * Create an instance of {@link BackupRequest }
     * 
     */
    public BackupRequest createBackupRequest() {
        return new BackupRequest();
    }

    /**
     * Create an instance of {@link ActivateLicenseRequest }
     * 
     */
    public ActivateLicenseRequest createActivateLicenseRequest() {
        return new ActivateLicenseRequest();
    }

    /**
     * Create an instance of {@link RemoveAccountAliasRequest }
     * 
     */
    public RemoveAccountAliasRequest createRemoveAccountAliasRequest() {
        return new RemoveAccountAliasRequest();
    }

    /**
     * Create an instance of {@link GetAllAlwaysOnClustersRequest }
     * 
     */
    public GetAllAlwaysOnClustersRequest createGetAllAlwaysOnClustersRequest() {
        return new GetAllAlwaysOnClustersRequest();
    }

    /**
     * Create an instance of {@link StatsValueWrapper }
     * 
     */
    public StatsValueWrapper createStatsValueWrapper() {
        return new StatsValueWrapper();
    }

    /**
     * Create an instance of {@link PurgeFreeBusyQueueResponse }
     * 
     */
    public PurgeFreeBusyQueueResponse createPurgeFreeBusyQueueResponse() {
        return new PurgeFreeBusyQueueResponse();
    }

    /**
     * Create an instance of {@link GetLicenseResponse }
     * 
     */
    public GetLicenseResponse createGetLicenseResponse() {
        return new GetLicenseResponse();
    }

    /**
     * Create an instance of {@link ReIndexResponse }
     * 
     */
    public ReIndexResponse createReIndexResponse() {
        return new ReIndexResponse();
    }

    /**
     * Create an instance of {@link AdminDestroyWaitSetRequest }
     * 
     */
    public AdminDestroyWaitSetRequest createAdminDestroyWaitSetRequest() {
        return new AdminDestroyWaitSetRequest();
    }

    /**
     * Create an instance of {@link GetAllActiveServersRequest }
     * 
     */
    public GetAllActiveServersRequest createGetAllActiveServersRequest() {
        return new GetAllActiveServersRequest();
    }

    /**
     * Create an instance of {@link VersionCheckRequest }
     * 
     */
    public VersionCheckRequest createVersionCheckRequest() {
        return new VersionCheckRequest();
    }

    /**
     * Create an instance of {@link CancelPendingRemoteWipeResponse }
     * 
     */
    public CancelPendingRemoteWipeResponse createCancelPendingRemoteWipeResponse() {
        return new CancelPendingRemoteWipeResponse();
    }

    /**
     * Create an instance of {@link AliasInfo }
     * 
     */
    public AliasInfo createAliasInfo() {
        return new AliasInfo();
    }

    /**
     * Create an instance of {@link ModifyUCServiceRequest }
     * 
     */
    public ModifyUCServiceRequest createModifyUCServiceRequest() {
        return new ModifyUCServiceRequest();
    }

    /**
     * Create an instance of {@link CheckDomainMXRecordResponse }
     * 
     */
    public CheckDomainMXRecordResponse createCheckDomainMXRecordResponse() {
        return new CheckDomainMXRecordResponse();
    }

    /**
     * Create an instance of {@link GetVolumeResponse }
     * 
     */
    public GetVolumeResponse createGetVolumeResponse() {
        return new GetVolumeResponse();
    }

    /**
     * Create an instance of {@link AddDistributionListAliasRequest }
     * 
     */
    public AddDistributionListAliasRequest createAddDistributionListAliasRequest() {
        return new AddDistributionListAliasRequest();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link AutoProvTaskControlResponse }
     * 
     */
    public AutoProvTaskControlResponse createAutoProvTaskControlResponse() {
        return new AutoProvTaskControlResponse();
    }

    /**
     * Create an instance of {@link GetQuotaUsageRequest }
     * 
     */
    public GetQuotaUsageRequest createGetQuotaUsageRequest() {
        return new GetQuotaUsageRequest();
    }

    /**
     * Create an instance of {@link RecalculateMailboxCountsResponse }
     * 
     */
    public RecalculateMailboxCountsResponse createRecalculateMailboxCountsResponse() {
        return new RecalculateMailboxCountsResponse();
    }

    /**
     * Create an instance of {@link EnableArchiveResponse }
     * 
     */
    public EnableArchiveResponse createEnableArchiveResponse() {
        return new EnableArchiveResponse();
    }

    /**
     * Create an instance of {@link PushFreeBusyRequest }
     * 
     */
    public PushFreeBusyRequest createPushFreeBusyRequest() {
        return new PushFreeBusyRequest();
    }

    /**
     * Create an instance of {@link ExportAndDeleteItemsRequest }
     * 
     */
    public ExportAndDeleteItemsRequest createExportAndDeleteItemsRequest() {
        return new ExportAndDeleteItemsRequest();
    }

    /**
     * Create an instance of {@link RenameCalendarResourceRequest }
     * 
     */
    public RenameCalendarResourceRequest createRenameCalendarResourceRequest() {
        return new RenameCalendarResourceRequest();
    }

    /**
     * Create an instance of {@link GetAccountMembershipRequest }
     * 
     */
    public GetAccountMembershipRequest createGetAccountMembershipRequest() {
        return new GetAccountMembershipRequest();
    }

    /**
     * Create an instance of {@link GetMailQueueInfoRequest }
     * 
     */
    public GetMailQueueInfoRequest createGetMailQueueInfoRequest() {
        return new GetMailQueueInfoRequest();
    }

    /**
     * Create an instance of {@link UnregisterMailboxMoveOutResponse }
     * 
     */
    public UnregisterMailboxMoveOutResponse createUnregisterMailboxMoveOutResponse() {
        return new UnregisterMailboxMoveOutResponse();
    }

    /**
     * Create an instance of {@link CancelRuleInfo }
     * 
     */
    public CancelRuleInfo createCancelRuleInfo() {
        return new CancelRuleInfo();
    }

    /**
     * Create an instance of {@link TzReplaceInfo }
     * 
     */
    public TzReplaceInfo createTzReplaceInfo() {
        return new TzReplaceInfo();
    }

    /**
     * Create an instance of {@link DeviceId }
     * 
     */
    public DeviceId createDeviceId() {
        return new DeviceId();
    }

    /**
     * Create an instance of {@link CalOrganizer }
     * 
     */
    public CalOrganizer createCalOrganizer() {
        return new CalOrganizer();
    }

    /**
     * Create an instance of {@link AdminObjectInfo }
     * 
     */
    public AdminObjectInfo createAdminObjectInfo() {
        return new AdminObjectInfo();
    }

    /**
     * Create an instance of {@link VersionCheckUpdateInfo }
     * 
     */
    public VersionCheckUpdateInfo createVersionCheckUpdateInfo() {
        return new VersionCheckUpdateInfo();
    }

    /**
     * Create an instance of {@link ConstraintAttr }
     * 
     */
    public ConstraintAttr createConstraintAttr() {
        return new ConstraintAttr();
    }

    /**
     * Create an instance of {@link SearchID }
     * 
     */
    public SearchID createSearchID() {
        return new SearchID();
    }

    /**
     * Create an instance of {@link EmailInfo }
     * 
     */
    public EmailInfo createEmailInfo() {
        return new EmailInfo();
    }

    /**
     * Create an instance of {@link InheritedFlaggedValue }
     * 
     */
    public InheritedFlaggedValue createInheritedFlaggedValue() {
        return new InheritedFlaggedValue();
    }

    /**
     * Create an instance of {@link NetworkInformation }
     * 
     */
    public NetworkInformation createNetworkInformation() {
        return new NetworkInformation();
    }

    /**
     * Create an instance of {@link CheckDirSelector }
     * 
     */
    public CheckDirSelector createCheckDirSelector() {
        return new CheckDirSelector();
    }

    /**
     * Create an instance of {@link CalendarResourceSelector }
     * 
     */
    public CalendarResourceSelector createCalendarResourceSelector() {
        return new CalendarResourceSelector();
    }

    /**
     * Create an instance of {@link SingleDates }
     * 
     */
    public SingleDates createSingleDates() {
        return new SingleDates();
    }

    /**
     * Create an instance of {@link QueueSummaryItem }
     * 
     */
    public QueueSummaryItem createQueueSummaryItem() {
        return new QueueSummaryItem();
    }

    /**
     * Create an instance of {@link MailboxVolumeInfo }
     * 
     */
    public MailboxVolumeInfo createMailboxVolumeInfo() {
        return new MailboxVolumeInfo();
    }

    /**
     * Create an instance of {@link RightWithName }
     * 
     */
    public RightWithName createRightWithName() {
        return new RightWithName();
    }

    /**
     * Create an instance of {@link WkstRule }
     * 
     */
    public WkstRule createWkstRule() {
        return new WkstRule();
    }

    /**
     * Create an instance of {@link XmppComponentInfo }
     * 
     */
    public XmppComponentInfo createXmppComponentInfo() {
        return new XmppComponentInfo();
    }

    /**
     * Create an instance of {@link AttachmentIdAttrib }
     * 
     */
    public AttachmentIdAttrib createAttachmentIdAttrib() {
        return new AttachmentIdAttrib();
    }

    /**
     * Create an instance of {@link MailQueueCount }
     * 
     */
    public MailQueueCount createMailQueueCount() {
        return new MailQueueCount();
    }

    /**
     * Create an instance of {@link VersionInfo }
     * 
     */
    public VersionInfo createVersionInfo() {
        return new VersionInfo();
    }

    /**
     * Create an instance of {@link SyncGalAccountSpec }
     * 
     */
    public SyncGalAccountSpec createSyncGalAccountSpec() {
        return new SyncGalAccountSpec();
    }

    /**
     * Create an instance of {@link DeviceStatusInfo }
     * 
     */
    public DeviceStatusInfo createDeviceStatusInfo() {
        return new DeviceStatusInfo();
    }

    /**
     * Create an instance of {@link AidAndFilename }
     * 
     */
    public AidAndFilename createAidAndFilename() {
        return new AidAndFilename();
    }

    /**
     * Create an instance of {@link UcServiceSelector }
     * 
     */
    public UcServiceSelector createUcServiceSelector() {
        return new UcServiceSelector();
    }

    /**
     * Create an instance of {@link AdminKeyValuePairs }
     * 
     */
    public AdminKeyValuePairs createAdminKeyValuePairs() {
        return new AdminKeyValuePairs();
    }

    /**
     * Create an instance of {@link FailoverClusterServiceSpec }
     * 
     */
    public FailoverClusterServiceSpec createFailoverClusterServiceSpec() {
        return new FailoverClusterServiceSpec();
    }

    /**
     * Create an instance of {@link BackupSpec }
     * 
     */
    public BackupSpec createBackupSpec() {
        return new BackupSpec();
    }

    /**
     * Create an instance of {@link SyncGalAccountDataSourceSpec }
     * 
     */
    public SyncGalAccountDataSourceSpec createSyncGalAccountDataSourceSpec() {
        return new SyncGalAccountDataSourceSpec();
    }

    /**
     * Create an instance of {@link ServerQueues }
     * 
     */
    public ServerQueues createServerQueues() {
        return new ServerQueues();
    }

    /**
     * Create an instance of {@link WaitSetSessionInfo }
     * 
     */
    public WaitSetSessionInfo createWaitSetSessionInfo() {
        return new WaitSetSessionInfo();
    }

    /**
     * Create an instance of {@link DurationInfo }
     * 
     */
    public DurationInfo createDurationInfo() {
        return new DurationInfo();
    }

    /**
     * Create an instance of {@link MailboxVersionInfo }
     * 
     */
    public MailboxVersionInfo createMailboxVersionInfo() {
        return new MailboxVersionInfo();
    }

    /**
     * Create an instance of {@link ByMinuteRule }
     * 
     */
    public ByMinuteRule createByMinuteRule() {
        return new ByMinuteRule();
    }

    /**
     * Create an instance of {@link ShareNotification }
     * 
     */
    public ShareNotification createShareNotification() {
        return new ShareNotification();
    }

    /**
     * Create an instance of {@link AdminZimletConfigInfo }
     * 
     */
    public AdminZimletConfigInfo createAdminZimletConfigInfo() {
        return new AdminZimletConfigInfo();
    }

    /**
     * Create an instance of {@link ZimletStatusParent }
     * 
     */
    public ZimletStatusParent createZimletStatusParent() {
        return new ZimletStatusParent();
    }

    /**
     * Create an instance of {@link PackageSelector }
     * 
     */
    public PackageSelector createPackageSelector() {
        return new PackageSelector();
    }

    /**
     * Create an instance of {@link ReindexProgressInfo }
     * 
     */
    public ReindexProgressInfo createReindexProgressInfo() {
        return new ReindexProgressInfo();
    }

    /**
     * Create an instance of {@link AccountLoggerInfo }
     * 
     */
    public AccountLoggerInfo createAccountLoggerInfo() {
        return new AccountLoggerInfo();
    }

    /**
     * Create an instance of {@link Names }
     * 
     */
    public Names createNames() {
        return new Names();
    }

    /**
     * Create an instance of {@link DirPathInfo }
     * 
     */
    public DirPathInfo createDirPathInfo() {
        return new DirPathInfo();
    }

    /**
     * Create an instance of {@link ZimletInfo }
     * 
     */
    public ZimletInfo createZimletInfo() {
        return new ZimletInfo();
    }

    /**
     * Create an instance of {@link ByDayRule }
     * 
     */
    public ByDayRule createByDayRule() {
        return new ByDayRule();
    }

    /**
     * Create an instance of {@link StatsInfo }
     * 
     */
    public StatsInfo createStatsInfo() {
        return new StatsInfo();
    }

    /**
     * Create an instance of {@link MailboxStats }
     * 
     */
    public MailboxStats createMailboxStats() {
        return new MailboxStats();
    }

    /**
     * Create an instance of {@link VolumeInfo }
     * 
     */
    public VolumeInfo createVolumeInfo() {
        return new VolumeInfo();
    }

    /**
     * Create an instance of {@link UnexpectedBlobInfo }
     * 
     */
    public UnexpectedBlobInfo createUnexpectedBlobInfo() {
        return new UnexpectedBlobInfo();
    }

    /**
     * Create an instance of {@link TzFixupRuleMatchDates }
     * 
     */
    public TzFixupRuleMatchDates createTzFixupRuleMatchDates() {
        return new TzFixupRuleMatchDates();
    }

    /**
     * Create an instance of {@link BlobSizeInfo }
     * 
     */
    public BlobSizeInfo createBlobSizeInfo() {
        return new BlobSizeInfo();
    }

    /**
     * Create an instance of {@link AccountQuotaInfo }
     * 
     */
    public AccountQuotaInfo createAccountQuotaInfo() {
        return new AccountQuotaInfo();
    }

    /**
     * Create an instance of {@link DomainSelector }
     * 
     */
    public DomainSelector createDomainSelector() {
        return new DomainSelector();
    }

    /**
     * Create an instance of {@link AdminZimletContext }
     * 
     */
    public AdminZimletContext createAdminZimletContext() {
        return new AdminZimletContext();
    }

    /**
     * Create an instance of {@link ByMonthDayRule }
     * 
     */
    public ByMonthDayRule createByMonthDayRule() {
        return new ByMonthDayRule();
    }

    /**
     * Create an instance of {@link LoggerInfo }
     * 
     */
    public LoggerInfo createLoggerInfo() {
        return new LoggerInfo();
    }

    /**
     * Create an instance of {@link DistributionListSelector }
     * 
     */
    public DistributionListSelector createDistributionListSelector() {
        return new DistributionListSelector();
    }

    /**
     * Create an instance of {@link CalendarReply }
     * 
     */
    public CalendarReply createCalendarReply() {
        return new CalendarReply();
    }

    /**
     * Create an instance of {@link UsedBlobInfo }
     * 
     */
    public UsedBlobInfo createUsedBlobInfo() {
        return new UsedBlobInfo();
    }

    /**
     * Create an instance of {@link GalContactInfo }
     * 
     */
    public GalContactInfo createGalContactInfo() {
        return new GalContactInfo();
    }

    /**
     * Create an instance of {@link ItemId }
     * 
     */
    public ItemId createItemId() {
        return new ItemId();
    }

    /**
     * Create an instance of {@link BackupAccountQuerySpec }
     * 
     */
    public BackupAccountQuerySpec createBackupAccountQuerySpec() {
        return new BackupAccountQuerySpec();
    }

    /**
     * Create an instance of {@link EntrySearchFilterSingleCond }
     * 
     */
    public EntrySearchFilterSingleCond createEntrySearchFilterSingleCond() {
        return new EntrySearchFilterSingleCond();
    }

    /**
     * Create an instance of {@link GranteeInfo }
     * 
     */
    public GranteeInfo createGranteeInfo() {
        return new GranteeInfo();
    }

    /**
     * Create an instance of {@link BackupQuerySpec }
     * 
     */
    public BackupQuerySpec createBackupQuerySpec() {
        return new BackupQuerySpec();
    }

    /**
     * Create an instance of {@link ComboRights }
     * 
     */
    public ComboRights createComboRights() {
        return new ComboRights();
    }

    /**
     * Create an instance of {@link RightsAttrs }
     * 
     */
    public RightsAttrs createRightsAttrs() {
        return new RightsAttrs();
    }

    /**
     * Create an instance of {@link EffectiveAttrsInfo }
     * 
     */
    public EffectiveAttrsInfo createEffectiveAttrsInfo() {
        return new EffectiveAttrsInfo();
    }

    /**
     * Create an instance of {@link CurrentAccounts }
     * 
     */
    public CurrentAccounts createCurrentAccounts() {
        return new CurrentAccounts();
    }

    /**
     * Create an instance of {@link ExportMailboxSelector }
     * 
     */
    public ExportMailboxSelector createExportMailboxSelector() {
        return new ExportMailboxSelector();
    }

    /**
     * Create an instance of {@link GranteeWithType }
     * 
     */
    public GranteeWithType createGranteeWithType() {
        return new GranteeWithType();
    }

    /**
     * Create an instance of {@link WkDay }
     * 
     */
    public WkDay createWkDay() {
        return new WkDay();
    }

    /**
     * Create an instance of {@link AlwaysOnClusterSelector }
     * 
     */
    public AlwaysOnClusterSelector createAlwaysOnClusterSelector() {
        return new AlwaysOnClusterSelector();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link QueueQueryField }
     * 
     */
    public QueueQueryField createQueueQueryField() {
        return new QueueQueryField();
    }

    /**
     * Create an instance of {@link MailboxVolumesInfo }
     * 
     */
    public MailboxVolumesInfo createMailboxVolumesInfo() {
        return new MailboxVolumesInfo();
    }

    /**
     * Create an instance of {@link RecurrenceInfo }
     * 
     */
    public RecurrenceInfo createRecurrenceInfo() {
        return new RecurrenceInfo();
    }

    /**
     * Create an instance of {@link ExceptionRuleInfo }
     * 
     */
    public ExceptionRuleInfo createExceptionRuleInfo() {
        return new ExceptionRuleInfo();
    }

    /**
     * Create an instance of {@link AccountsAttrib }
     * 
     */
    public AccountsAttrib createAccountsAttrib() {
        return new AccountsAttrib();
    }

    /**
     * Create an instance of {@link EffectiveRightsTargetInfo }
     * 
     */
    public EffectiveRightsTargetInfo createEffectiveRightsTargetInfo() {
        return new EffectiveRightsTargetInfo();
    }

    /**
     * Create an instance of {@link InviteComponent }
     * 
     */
    public InviteComponent createInviteComponent() {
        return new InviteComponent();
    }

    /**
     * Create an instance of {@link CalendarAttendee }
     * 
     */
    public CalendarAttendee createCalendarAttendee() {
        return new CalendarAttendee();
    }

    /**
     * Create an instance of {@link DateTimeStringAttr }
     * 
     */
    public DateTimeStringAttr createDateTimeStringAttr() {
        return new DateTimeStringAttr();
    }

    /**
     * Create an instance of {@link TzFixupRuleMatchRules }
     * 
     */
    public TzFixupRuleMatchRules createTzFixupRuleMatchRules() {
        return new TzFixupRuleMatchRules();
    }

    /**
     * Create an instance of {@link CurrentVolumeInfo }
     * 
     */
    public CurrentVolumeInfo createCurrentVolumeInfo() {
        return new CurrentVolumeInfo();
    }

    /**
     * Create an instance of {@link CertInfo }
     * 
     */
    public CertInfo createCertInfo() {
        return new CertInfo();
    }

    /**
     * Create an instance of {@link MailboxInfo }
     * 
     */
    public MailboxInfo createMailboxInfo() {
        return new MailboxInfo();
    }

    /**
     * Create an instance of {@link BufferedCommitInfo }
     * 
     */
    public BufferedCommitInfo createBufferedCommitInfo() {
        return new BufferedCommitInfo();
    }

    /**
     * Create an instance of {@link CosInfoAttr }
     * 
     */
    public CosInfoAttr createCosInfoAttr() {
        return new CosInfoAttr();
    }

    /**
     * Create an instance of {@link ReindexMailboxInfo }
     * 
     */
    public ReindexMailboxInfo createReindexMailboxInfo() {
        return new ReindexMailboxInfo();
    }

    /**
     * Create an instance of {@link MailboxMoveSpec }
     * 
     */
    public MailboxMoveSpec createMailboxMoveSpec() {
        return new MailboxMoveSpec();
    }

    /**
     * Create an instance of {@link ByMonthRule }
     * 
     */
    public ByMonthRule createByMonthRule() {
        return new ByMonthRule();
    }

    /**
     * Create an instance of {@link HostStats }
     * 
     */
    public HostStats createHostStats() {
        return new HostStats();
    }

    /**
     * Create an instance of {@link LicenseExpirationInfo }
     * 
     */
    public LicenseExpirationInfo createLicenseExpirationInfo() {
        return new LicenseExpirationInfo();
    }

    /**
     * Create an instance of {@link MessageCommon }
     * 
     */
    public MessageCommon createMessageCommon() {
        return new MessageCommon();
    }

    /**
     * Create an instance of {@link ClusterServerInfo }
     * 
     */
    public ClusterServerInfo createClusterServerInfo() {
        return new ClusterServerInfo();
    }

    /**
     * Create an instance of {@link CommCert }
     * 
     */
    public CommCert createCommCert() {
        return new CommCert();
    }

    /**
     * Create an instance of {@link VolumeIdAndProgress }
     * 
     */
    public VolumeIdAndProgress createVolumeIdAndProgress() {
        return new VolumeIdAndProgress();
    }

    /**
     * Create an instance of {@link PolicyHolder }
     * 
     */
    public PolicyHolder createPolicyHolder() {
        return new PolicyHolder();
    }

    /**
     * Create an instance of {@link MailboxWithMailboxId }
     * 
     */
    public MailboxWithMailboxId createMailboxWithMailboxId() {
        return new MailboxWithMailboxId();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link ClusterServiceInfo }
     * 
     */
    public ClusterServiceInfo createClusterServiceInfo() {
        return new ClusterServiceInfo();
    }

    /**
     * Create an instance of {@link FolderId }
     * 
     */
    public FolderId createFolderId() {
        return new FolderId();
    }

    /**
     * Create an instance of {@link XParam }
     * 
     */
    public XParam createXParam() {
        return new XParam();
    }

    /**
     * Create an instance of {@link EffectiveRightsInfo }
     * 
     */
    public EffectiveRightsInfo createEffectiveRightsInfo() {
        return new EffectiveRightsInfo();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link HsmFileSystemInfo }
     * 
     */
    public HsmFileSystemInfo createHsmFileSystemInfo() {
        return new HsmFileSystemInfo();
    }

    /**
     * Create an instance of {@link SimpleElement }
     * 
     */
    public SimpleElement createSimpleElement() {
        return new SimpleElement();
    }

    /**
     * Create an instance of {@link ExceptionRecurIdInfo }
     * 
     */
    public ExceptionRecurIdInfo createExceptionRecurIdInfo() {
        return new ExceptionRecurIdInfo();
    }

    /**
     * Create an instance of {@link BackupQueryAccounts }
     * 
     */
    public BackupQueryAccounts createBackupQueryAccounts() {
        return new BackupQueryAccounts();
    }

    /**
     * Create an instance of {@link SessionForWaitSet }
     * 
     */
    public SessionForWaitSet createSessionForWaitSet() {
        return new SessionForWaitSet();
    }

    /**
     * Create an instance of {@link BackupQueryCounter }
     * 
     */
    public BackupQueryCounter createBackupQueryCounter() {
        return new BackupQueryCounter();
    }

    /**
     * Create an instance of {@link TzFixupRuleMatch }
     * 
     */
    public TzFixupRuleMatch createTzFixupRuleMatch() {
        return new TzFixupRuleMatch();
    }

    /**
     * Create an instance of {@link MailQueueAction }
     * 
     */
    public MailQueueAction createMailQueueAction() {
        return new MailQueueAction();
    }

    /**
     * Create an instance of {@link TzFixupRuleMatchRule }
     * 
     */
    public TzFixupRuleMatchRule createTzFixupRuleMatchRule() {
        return new TzFixupRuleMatchRule();
    }

    /**
     * Create an instance of {@link XmppComponentSelector }
     * 
     */
    public XmppComponentSelector createXmppComponentSelector() {
        return new XmppComponentSelector();
    }

    /**
     * Create an instance of {@link ContactGroupMember }
     * 
     */
    public ContactGroupMember createContactGroupMember() {
        return new ContactGroupMember();
    }

    /**
     * Create an instance of {@link InviteComponentCommon }
     * 
     */
    public InviteComponentCommon createInviteComponentCommon() {
        return new InviteComponentCommon();
    }

    /**
     * Create an instance of {@link AccountSessionInfo }
     * 
     */
    public AccountSessionInfo createAccountSessionInfo() {
        return new AccountSessionInfo();
    }

    /**
     * Create an instance of {@link FreeBusyProviderInfo }
     * 
     */
    public FreeBusyProviderInfo createFreeBusyProviderInfo() {
        return new FreeBusyProviderInfo();
    }

    /**
     * Create an instance of {@link SimpleSessionInfo }
     * 
     */
    public SimpleSessionInfo createSimpleSessionInfo() {
        return new SimpleSessionInfo();
    }

    /**
     * Create an instance of {@link ByWeekNoRule }
     * 
     */
    public ByWeekNoRule createByWeekNoRule() {
        return new ByWeekNoRule();
    }

    /**
     * Create an instance of {@link InDomainInfo }
     * 
     */
    public InDomainInfo createInDomainInfo() {
        return new InDomainInfo();
    }

    /**
     * Create an instance of {@link PurgeMovedMailboxInfo }
     * 
     */
    public PurgeMovedMailboxInfo createPurgeMovedMailboxInfo() {
        return new PurgeMovedMailboxInfo();
    }

    /**
     * Create an instance of {@link SmimeConfigInfo }
     * 
     */
    public SmimeConfigInfo createSmimeConfigInfo() {
        return new SmimeConfigInfo();
    }

    /**
     * Create an instance of {@link MissingBlobInfo }
     * 
     */
    public MissingBlobInfo createMissingBlobInfo() {
        return new MissingBlobInfo();
    }

    /**
     * Create an instance of {@link ZimletDeploymentStatus }
     * 
     */
    public ZimletDeploymentStatus createZimletDeploymentStatus() {
        return new ZimletDeploymentStatus();
    }

    /**
     * Create an instance of {@link RightViaInfo }
     * 
     */
    public RightViaInfo createRightViaInfo() {
        return new RightViaInfo();
    }

    /**
     * Create an instance of {@link NameAndValue }
     * 
     */
    public NameAndValue createNameAndValue() {
        return new NameAndValue();
    }

    /**
     * Create an instance of {@link DateAttr }
     * 
     */
    public DateAttr createDateAttr() {
        return new DateAttr();
    }

    /**
     * Create an instance of {@link AdminZimletDesc }
     * 
     */
    public AdminZimletDesc createAdminZimletDesc() {
        return new AdminZimletDesc();
    }

    /**
     * Create an instance of {@link AdminZimletHostConfigInfo }
     * 
     */
    public AdminZimletHostConfigInfo createAdminZimletHostConfigInfo() {
        return new AdminZimletHostConfigInfo();
    }

    /**
     * Create an instance of {@link ZimletStatus }
     * 
     */
    public ZimletStatus createZimletStatus() {
        return new ZimletStatus();
    }

    /**
     * Create an instance of {@link StatsSpec }
     * 
     */
    public StatsSpec createStatsSpec() {
        return new StatsSpec();
    }

    /**
     * Create an instance of {@link FreeBusyQueueProvider }
     * 
     */
    public FreeBusyQueueProvider createFreeBusyQueueProvider() {
        return new FreeBusyQueueProvider();
    }

    /**
     * Create an instance of {@link DlSubscriptionNotification }
     * 
     */
    public DlSubscriptionNotification createDlSubscriptionNotification() {
        return new DlSubscriptionNotification();
    }

    /**
     * Create an instance of {@link ZimletAclStatusPri }
     * 
     */
    public ZimletAclStatusPri createZimletAclStatusPri() {
        return new ZimletAclStatusPri();
    }

    /**
     * Create an instance of {@link GeoInfo }
     * 
     */
    public GeoInfo createGeoInfo() {
        return new GeoInfo();
    }

    /**
     * Create an instance of {@link ZimletStatusCos }
     * 
     */
    public ZimletStatusCos createZimletStatusCos() {
        return new ZimletStatusCos();
    }

    /**
     * Create an instance of {@link GrantInfo }
     * 
     */
    public GrantInfo createGrantInfo() {
        return new GrantInfo();
    }

    /**
     * Create an instance of {@link RestoreSpec }
     * 
     */
    public RestoreSpec createRestoreSpec() {
        return new RestoreSpec();
    }

    /**
     * Create an instance of {@link EntrySearchFilterMultiCond }
     * 
     */
    public EntrySearchFilterMultiCond createEntrySearchFilterMultiCond() {
        return new EntrySearchFilterMultiCond();
    }

    /**
     * Create an instance of {@link EntrySearchFilterInfo }
     * 
     */
    public EntrySearchFilterInfo createEntrySearchFilterInfo() {
        return new EntrySearchFilterInfo();
    }

    /**
     * Create an instance of {@link TargetWithType }
     * 
     */
    public TargetWithType createTargetWithType() {
        return new TargetWithType();
    }

    /**
     * Create an instance of {@link ZimletAcl }
     * 
     */
    public ZimletAcl createZimletAcl() {
        return new ZimletAcl();
    }

    /**
     * Create an instance of {@link DistributionListMembershipInfo }
     * 
     */
    public DistributionListMembershipInfo createDistributionListMembershipInfo() {
        return new DistributionListMembershipInfo();
    }

    /**
     * Create an instance of {@link InfoForSessionType }
     * 
     */
    public InfoForSessionType createInfoForSessionType() {
        return new InfoForSessionType();
    }

    /**
     * Create an instance of {@link StatsValues }
     * 
     */
    public StatsValues createStatsValues() {
        return new StatsValues();
    }

    /**
     * Create an instance of {@link SyncStateInfo }
     * 
     */
    public SyncStateInfo createSyncStateInfo() {
        return new SyncStateInfo();
    }

    /**
     * Create an instance of {@link XNameRule }
     * 
     */
    public XNameRule createXNameRule() {
        return new XNameRule();
    }

    /**
     * Create an instance of {@link MailQueueDetails }
     * 
     */
    public MailQueueDetails createMailQueueDetails() {
        return new MailQueueDetails();
    }

    /**
     * Create an instance of {@link IdAndAction }
     * 
     */
    public IdAndAction createIdAndAction() {
        return new IdAndAction();
    }

    /**
     * Create an instance of {@link IndexStats }
     * 
     */
    public IndexStats createIndexStats() {
        return new IndexStats();
    }

    /**
     * Create an instance of {@link XProp }
     * 
     */
    public XProp createXProp() {
        return new XProp();
    }

    /**
     * Create an instance of {@link CosCountInfo }
     * 
     */
    public CosCountInfo createCosCountInfo() {
        return new CosCountInfo();
    }

    /**
     * Create an instance of {@link ArchiveSpec }
     * 
     */
    public ArchiveSpec createArchiveSpec() {
        return new ArchiveSpec();
    }

    /**
     * Create an instance of {@link CompletedTestInfo }
     * 
     */
    public CompletedTestInfo createCompletedTestInfo() {
        return new CompletedTestInfo();
    }

    /**
     * Create an instance of {@link TzFixupRuleMatchDate }
     * 
     */
    public TzFixupRuleMatchDate createTzFixupRuleMatchDate() {
        return new TzFixupRuleMatchDate();
    }

    /**
     * Create an instance of {@link ServerSelector }
     * 
     */
    public ServerSelector createServerSelector() {
        return new ServerSelector();
    }

    /**
     * Create an instance of {@link ExchangeAuthSpec }
     * 
     */
    public ExchangeAuthSpec createExchangeAuthSpec() {
        return new ExchangeAuthSpec();
    }

    /**
     * Create an instance of {@link ComboRightInfo }
     * 
     */
    public ComboRightInfo createComboRightInfo() {
        return new ComboRightInfo();
    }

    /**
     * Create an instance of {@link DomainAggregateQuotaInfo }
     * 
     */
    public DomainAggregateQuotaInfo createDomainAggregateQuotaInfo() {
        return new DomainAggregateQuotaInfo();
    }

    /**
     * Create an instance of {@link CsrSubject }
     * 
     */
    public CsrSubject createCsrSubject() {
        return new CsrSubject();
    }

    /**
     * Create an instance of {@link PartInfo }
     * 
     */
    public PartInfo createPartInfo() {
        return new PartInfo();
    }

    /**
     * Create an instance of {@link PackageRightsInfo }
     * 
     */
    public PackageRightsInfo createPackageRightsInfo() {
        return new PackageRightsInfo();
    }

    /**
     * Create an instance of {@link BlobRevisionInfo }
     * 
     */
    public BlobRevisionInfo createBlobRevisionInfo() {
        return new BlobRevisionInfo();
    }

    /**
     * Create an instance of {@link AutoProvDirectoryEntry }
     * 
     */
    public AutoProvDirectoryEntry createAutoProvDirectoryEntry() {
        return new AutoProvDirectoryEntry();
    }

    /**
     * Create an instance of {@link XmppComponentSpec }
     * 
     */
    public XmppComponentSpec createXmppComponentSpec() {
        return new XmppComponentSpec();
    }

    /**
     * Create an instance of {@link ServerWithQueueAction }
     * 
     */
    public ServerWithQueueAction createServerWithQueueAction() {
        return new ServerWithQueueAction();
    }

    /**
     * Create an instance of {@link ByHourRule }
     * 
     */
    public ByHourRule createByHourRule() {
        return new ByHourRule();
    }

    /**
     * Create an instance of {@link DtVal }
     * 
     */
    public DtVal createDtVal() {
        return new DtVal();
    }

    /**
     * Create an instance of {@link MailQueueWithAction }
     * 
     */
    public MailQueueWithAction createMailQueueWithAction() {
        return new MailQueueWithAction();
    }

    /**
     * Create an instance of {@link BackupInfo }
     * 
     */
    public BackupInfo createBackupInfo() {
        return new BackupInfo();
    }

    /**
     * Create an instance of {@link DataSourceSpecifier }
     * 
     */
    public DataSourceSpecifier createDataSourceSpecifier() {
        return new DataSourceSpecifier();
    }

    /**
     * Create an instance of {@link CookieSpec }
     * 
     */
    public CookieSpec createCookieSpec() {
        return new CookieSpec();
    }

    /**
     * Create an instance of {@link SmimeConfigModifications }
     * 
     */
    public SmimeConfigModifications createSmimeConfigModifications() {
        return new SmimeConfigModifications();
    }

    /**
     * Create an instance of {@link CalTZInfo }
     * 
     */
    public CalTZInfo createCalTZInfo() {
        return new CalTZInfo();
    }

    /**
     * Create an instance of {@link MoveMailboxInfo }
     * 
     */
    public MoveMailboxInfo createMoveMailboxInfo() {
        return new MoveMailboxInfo();
    }

    /**
     * Create an instance of {@link IncorrectBlobSizeInfo }
     * 
     */
    public IncorrectBlobSizeInfo createIncorrectBlobSizeInfo() {
        return new IncorrectBlobSizeInfo();
    }

    /**
     * Create an instance of {@link LdapEntryInfo }
     * 
     */
    public LdapEntryInfo createLdapEntryInfo() {
        return new LdapEntryInfo();
    }

    /**
     * Create an instance of {@link RecurIdInfo }
     * 
     */
    public RecurIdInfo createRecurIdInfo() {
        return new RecurIdInfo();
    }

    /**
     * Create an instance of {@link RightModifierInfo }
     * 
     */
    public RightModifierInfo createRightModifierInfo() {
        return new RightModifierInfo();
    }

    /**
     * Create an instance of {@link ExcludeRecurrenceInfo }
     * 
     */
    public ExcludeRecurrenceInfo createExcludeRecurrenceInfo() {
        return new ExcludeRecurrenceInfo();
    }

    /**
     * Create an instance of {@link NumAttr }
     * 
     */
    public NumAttr createNumAttr() {
        return new NumAttr();
    }

    /**
     * Create an instance of {@link AdminZimletGlobalConfigInfo }
     * 
     */
    public AdminZimletGlobalConfigInfo createAdminZimletGlobalConfigInfo() {
        return new AdminZimletGlobalConfigInfo();
    }

    /**
     * Create an instance of {@link TzFixupRule }
     * 
     */
    public TzFixupRule createTzFixupRule() {
        return new TzFixupRule();
    }

    /**
     * Create an instance of {@link IntegerValueAttrib }
     * 
     */
    public IntegerValueAttrib createIntegerValueAttrib() {
        return new IntegerValueAttrib();
    }

    /**
     * Create an instance of {@link FailedTestInfo }
     * 
     */
    public FailedTestInfo createFailedTestInfo() {
        return new FailedTestInfo();
    }

    /**
     * Create an instance of {@link GranteeSelector }
     * 
     */
    public GranteeSelector createGranteeSelector() {
        return new GranteeSelector();
    }

    /**
     * Create an instance of {@link NameOrId }
     * 
     */
    public NameOrId createNameOrId() {
        return new NameOrId();
    }

    /**
     * Create an instance of {@link CosInfo }
     * 
     */
    public CosInfo createCosInfo() {
        return new CosInfo();
    }

    /**
     * Create an instance of {@link HostName }
     * 
     */
    public HostName createHostName() {
        return new HostName();
    }

    /**
     * Create an instance of {@link AttributeDescription }
     * 
     */
    public AttributeDescription createAttributeDescription() {
        return new AttributeDescription();
    }

    /**
     * Create an instance of {@link AlarmInfo }
     * 
     */
    public AlarmInfo createAlarmInfo() {
        return new AlarmInfo();
    }

    /**
     * Create an instance of {@link AdminZimletInfo }
     * 
     */
    public AdminZimletInfo createAdminZimletInfo() {
        return new AdminZimletInfo();
    }

    /**
     * Create an instance of {@link Stat }
     * 
     */
    public Stat createStat() {
        return new Stat();
    }

    /**
     * Create an instance of {@link AddRecurrenceInfo }
     * 
     */
    public AddRecurrenceInfo createAddRecurrenceInfo() {
        return new AddRecurrenceInfo();
    }

    /**
     * Create an instance of {@link CalendarResourceInfo }
     * 
     */
    public CalendarResourceInfo createCalendarResourceInfo() {
        return new CalendarResourceInfo();
    }

    /**
     * Create an instance of {@link SearchNode }
     * 
     */
    public SearchNode createSearchNode() {
        return new SearchNode();
    }

    /**
     * Create an instance of {@link TimeAttr }
     * 
     */
    public TimeAttr createTimeAttr() {
        return new TimeAttr();
    }

    /**
     * Create an instance of {@link DtTimeInfo }
     * 
     */
    public DtTimeInfo createDtTimeInfo() {
        return new DtTimeInfo();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link TimeZoneInfo }
     * 
     */
    public TimeZoneInfo createTimeZoneInfo() {
        return new TimeZoneInfo();
    }

    /**
     * Create an instance of {@link BackupQueryError }
     * 
     */
    public BackupQueryError createBackupQueryError() {
        return new BackupQueryError();
    }

    /**
     * Create an instance of {@link RightInfo }
     * 
     */
    public RightInfo createRightInfo() {
        return new RightInfo();
    }

    /**
     * Create an instance of {@link CacheSelector }
     * 
     */
    public CacheSelector createCacheSelector() {
        return new CacheSelector();
    }

    /**
     * Create an instance of {@link MessageInfo }
     * 
     */
    public MessageInfo createMessageInfo() {
        return new MessageInfo();
    }

    /**
     * Create an instance of {@link MailboxByAccountIdSelector }
     * 
     */
    public MailboxByAccountIdSelector createMailboxByAccountIdSelector() {
        return new MailboxByAccountIdSelector();
    }

    /**
     * Create an instance of {@link BySetPosRule }
     * 
     */
    public BySetPosRule createBySetPosRule() {
        return new BySetPosRule();
    }

    /**
     * Create an instance of {@link SessionInfo }
     * 
     */
    public SessionInfo createSessionInfo() {
        return new SessionInfo();
    }

    /**
     * Create an instance of {@link RightsEntriesInfo }
     * 
     */
    public RightsEntriesInfo createRightsEntriesInfo() {
        return new RightsEntriesInfo();
    }

    /**
     * Create an instance of {@link ServerMailQueueQuery }
     * 
     */
    public ServerMailQueueQuery createServerMailQueueQuery() {
        return new ServerMailQueueQuery();
    }

    /**
     * Create an instance of {@link AlarmTriggerInfo }
     * 
     */
    public AlarmTriggerInfo createAlarmTriggerInfo() {
        return new AlarmTriggerInfo();
    }

    /**
     * Create an instance of {@link DateString }
     * 
     */
    public DateString createDateString() {
        return new DateString();
    }

    /**
     * Create an instance of {@link EffectiveRightsTarget }
     * 
     */
    public EffectiveRightsTarget createEffectiveRightsTarget() {
        return new EffectiveRightsTarget();
    }

    /**
     * Create an instance of {@link ServerMailQueueDetails }
     * 
     */
    public ServerMailQueueDetails createServerMailQueueDetails() {
        return new ServerMailQueueDetails();
    }

    /**
     * Create an instance of {@link UcServiceAttribute }
     * 
     */
    public UcServiceAttribute createUcServiceAttribute() {
        return new UcServiceAttribute();
    }

    /**
     * Create an instance of {@link IncorrectBlobRevisionInfo }
     * 
     */
    public IncorrectBlobRevisionInfo createIncorrectBlobRevisionInfo() {
        return new IncorrectBlobRevisionInfo();
    }

    /**
     * Create an instance of {@link CacheEntrySelector }
     * 
     */
    public CacheEntrySelector createCacheEntrySelector() {
        return new CacheEntrySelector();
    }

    /**
     * Create an instance of {@link LimitedQuery }
     * 
     */
    public LimitedQuery createLimitedQuery() {
        return new LimitedQuery();
    }

    /**
     * Create an instance of {@link IntervalRule }
     * 
     */
    public IntervalRule createIntervalRule() {
        return new IntervalRule();
    }

    /**
     * Create an instance of {@link TypeIdName }
     * 
     */
    public TypeIdName createTypeIdName() {
        return new TypeIdName();
    }

    /**
     * Create an instance of {@link BackupAccountQueryInfo }
     * 
     */
    public BackupAccountQueryInfo createBackupAccountQueryInfo() {
        return new BackupAccountQueryInfo();
    }

    /**
     * Create an instance of {@link AdminZimletProperty }
     * 
     */
    public AdminZimletProperty createAdminZimletProperty() {
        return new AdminZimletProperty();
    }

    /**
     * Create an instance of {@link CalendarAttach }
     * 
     */
    public CalendarAttach createCalendarAttach() {
        return new CalendarAttach();
    }

    /**
     * Create an instance of {@link IntIdAttr }
     * 
     */
    public IntIdAttr createIntIdAttr() {
        return new IntIdAttr();
    }

    /**
     * Create an instance of {@link ExportAndDeleteMailboxSpec }
     * 
     */
    public ExportAndDeleteMailboxSpec createExportAndDeleteMailboxSpec() {
        return new ExportAndDeleteMailboxSpec();
    }

    /**
     * Create an instance of {@link MailQueueQuery }
     * 
     */
    public MailQueueQuery createMailQueueQuery() {
        return new MailQueueQuery();
    }

    /**
     * Create an instance of {@link DataSourceInfo }
     * 
     */
    public DataSourceInfo createDataSourceInfo() {
        return new DataSourceInfo();
    }

    /**
     * Create an instance of {@link CosSelector }
     * 
     */
    public CosSelector createCosSelector() {
        return new CosSelector();
    }

    /**
     * Create an instance of {@link BackupAccountQueryBackupInfo }
     * 
     */
    public BackupAccountQueryBackupInfo createBackupAccountQueryBackupInfo() {
        return new BackupAccountQueryBackupInfo();
    }

    /**
     * Create an instance of {@link BySecondRule }
     * 
     */
    public BySecondRule createBySecondRule() {
        return new BySecondRule();
    }

    /**
     * Create an instance of {@link ExportAndDeleteItemSpec }
     * 
     */
    public ExportAndDeleteItemSpec createExportAndDeleteItemSpec() {
        return new ExportAndDeleteItemSpec();
    }

    /**
     * Create an instance of {@link EffectiveRightsTargetSelector }
     * 
     */
    public EffectiveRightsTargetSelector createEffectiveRightsTargetSelector() {
        return new EffectiveRightsTargetSelector();
    }

    /**
     * Create an instance of {@link QueueItem }
     * 
     */
    public QueueItem createQueueItem() {
        return new QueueItem();
    }

    /**
     * Create an instance of {@link PrincipalSelector }
     * 
     */
    public PrincipalSelector createPrincipalSelector() {
        return new PrincipalSelector();
    }

    /**
     * Create an instance of {@link AdminAttrsImpl }
     * 
     */
    public AdminAttrsImpl createAdminAttrsImpl() {
        return new AdminAttrsImpl();
    }

    /**
     * Create an instance of {@link Offset }
     * 
     */
    public Offset createOffset() {
        return new Offset();
    }

    /**
     * Create an instance of {@link ByYearDayRule }
     * 
     */
    public ByYearDayRule createByYearDayRule() {
        return new ByYearDayRule();
    }

    /**
     * Create an instance of {@link FileCopierSpec }
     * 
     */
    public FileCopierSpec createFileCopierSpec() {
        return new FileCopierSpec();
    }

    /**
     * Create an instance of {@link BackupQueryAccountStatus }
     * 
     */
    public BackupQueryAccountStatus createBackupQueryAccountStatus() {
        return new BackupQueryAccountStatus();
    }

    /**
     * Create an instance of {@link MailboxMoveInfo }
     * 
     */
    public MailboxMoveInfo createMailboxMoveInfo() {
        return new MailboxMoveInfo();
    }

    /**
     * Create an instance of {@link TestResultInfo }
     * 
     */
    public TestResultInfo createTestResultInfo() {
        return new TestResultInfo();
    }

    /**
     * Create an instance of {@link QueueSummary }
     * 
     */
    public QueueSummary createQueueSummary() {
        return new QueueSummary();
    }

    /**
     * Create an instance of {@link LocaleInfo }
     * 
     */
    public LocaleInfo createLocaleInfo() {
        return new LocaleInfo();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link SimpleRepeatingRule }
     * 
     */
    public SimpleRepeatingRule createSimpleRepeatingRule() {
        return new SimpleRepeatingRule();
    }

    /**
     * Create an instance of {@link ValueAttrib }
     * 
     */
    public ValueAttrib createValueAttrib() {
        return new ValueAttrib();
    }

    /**
     * Create an instance of {@link BackupQueryInfo.Stats }
     * 
     */
    public BackupQueryInfo.Stats createBackupQueryInfoStats() {
        return new BackupQueryInfo.Stats();
    }

    /**
     * Create an instance of {@link ConstraintInfo.Values }
     * 
     */
    public ConstraintInfo.Values createConstraintInfoValues() {
        return new ConstraintInfo.Values();
    }

    /**
     * Create an instance of {@link WaitSetInfo.Errors }
     * 
     */
    public WaitSetInfo.Errors createWaitSetInfoErrors() {
        return new WaitSetInfo.Errors();
    }

    /**
     * Create an instance of {@link WaitSetInfo.Buffered }
     * 
     */
    public WaitSetInfo.Buffered createWaitSetInfoBuffered() {
        return new WaitSetInfo.Buffered();
    }

    /**
     * Create an instance of {@link EffectiveAttrInfo.Default }
     * 
     */
    public EffectiveAttrInfo.Default createEffectiveAttrInfoDefault() {
        return new EffectiveAttrInfo.Default();
    }

    /**
     * Create an instance of {@link DomainAdminRight.Rights }
     * 
     */
    public DomainAdminRight.Rights createDomainAdminRightRights() {
        return new DomainAdminRight.Rights();
    }

    /**
     * Create an instance of {@link InviteInfo.Replies }
     * 
     */
    public InviteInfo.Replies createInviteInfoReplies() {
        return new InviteInfo.Replies();
    }

    /**
     * Create an instance of {@link VersionCheckInfo.Updates }
     * 
     */
    public VersionCheckInfo.Updates createVersionCheckInfoUpdates() {
        return new VersionCheckInfo.Updates();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency.MissingBlobs }
     * 
     */
    public MailboxBlobConsistency.MissingBlobs createMailboxBlobConsistencyMissingBlobs() {
        return new MailboxBlobConsistency.MissingBlobs();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency.IncorrectSize }
     * 
     */
    public MailboxBlobConsistency.IncorrectSize createMailboxBlobConsistencyIncorrectSize() {
        return new MailboxBlobConsistency.IncorrectSize();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency.UnexpectedBlobs }
     * 
     */
    public MailboxBlobConsistency.UnexpectedBlobs createMailboxBlobConsistencyUnexpectedBlobs() {
        return new MailboxBlobConsistency.UnexpectedBlobs();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency.IncorrectRevision }
     * 
     */
    public MailboxBlobConsistency.IncorrectRevision createMailboxBlobConsistencyIncorrectRevision() {
        return new MailboxBlobConsistency.IncorrectRevision();
    }

    /**
     * Create an instance of {@link MailboxBlobConsistency.UsedBlobs }
     * 
     */
    public MailboxBlobConsistency.UsedBlobs createMailboxBlobConsistencyUsedBlobs() {
        return new MailboxBlobConsistency.UsedBlobs();
    }

    /**
     * Create an instance of {@link VoiceProviderInfo.Attrs }
     * 
     */
    public VoiceProviderInfo.Attrs createVoiceProviderInfoAttrs() {
        return new VoiceProviderInfo.Attrs();
    }

    /**
     * Create an instance of {@link CmdRightsInfo.Rights }
     * 
     */
    public CmdRightsInfo.Rights createCmdRightsInfoRights() {
        return new CmdRightsInfo.Rights();
    }

    /**
     * Create an instance of {@link CmdRightsInfo.Desc }
     * 
     */
    public CmdRightsInfo.Desc createCmdRightsInfoDesc() {
        return new CmdRightsInfo.Desc();
    }

    /**
     * Create an instance of {@link GetClusterStatusResponse.Servers }
     * 
     */
    public GetClusterStatusResponse.Servers createGetClusterStatusResponseServers() {
        return new GetClusterStatusResponse.Servers();
    }

    /**
     * Create an instance of {@link GetClusterStatusResponse.Services }
     * 
     */
    public GetClusterStatusResponse.Services createGetClusterStatusResponseServices() {
        return new GetClusterStatusResponse.Services();
    }

    /**
     * Create an instance of {@link AdminCreateWaitSetRequest.Add }
     * 
     */
    public AdminCreateWaitSetRequest.Add createAdminCreateWaitSetRequestAdd() {
        return new AdminCreateWaitSetRequest.Add();
    }

    /**
     * Create an instance of {@link AdminWaitSetRequest.Add }
     * 
     */
    public AdminWaitSetRequest.Add createAdminWaitSetRequestAdd() {
        return new AdminWaitSetRequest.Add();
    }

    /**
     * Create an instance of {@link AdminWaitSetRequest.Update }
     * 
     */
    public AdminWaitSetRequest.Update createAdminWaitSetRequestUpdate() {
        return new AdminWaitSetRequest.Update();
    }

    /**
     * Create an instance of {@link AdminWaitSetRequest.Remove }
     * 
     */
    public AdminWaitSetRequest.Remove createAdminWaitSetRequestRemove() {
        return new AdminWaitSetRequest.Remove();
    }

    /**
     * Create an instance of {@link GetRightsDocResponse.DomainAdminCopypasteToZimbraRightsDomainadminXmlTemplate }
     * 
     */
    public GetRightsDocResponse.DomainAdminCopypasteToZimbraRightsDomainadminXmlTemplate createGetRightsDocResponseDomainAdminCopypasteToZimbraRightsDomainadminXmlTemplate() {
        return new GetRightsDocResponse.DomainAdminCopypasteToZimbraRightsDomainadminXmlTemplate();
    }

    /**
     * Create an instance of {@link FixCalendarTZRequest.Tzfixup }
     * 
     */
    public FixCalendarTZRequest.Tzfixup createFixCalendarTZRequestTzfixup() {
        return new FixCalendarTZRequest.Tzfixup();
    }

    /**
     * Create an instance of {@link DistributionListInfo.Owners }
     * 
     */
    public DistributionListInfo.Owners createDistributionListInfoOwners() {
        return new DistributionListInfo.Owners();
    }

    /**
     * Create an instance of {@link GetAdminExtensionZimletsResponse.Zimlets }
     * 
     */
    public GetAdminExtensionZimletsResponse.Zimlets createGetAdminExtensionZimletsResponseZimlets() {
        return new GetAdminExtensionZimletsResponse.Zimlets();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetVersionInfoRequest")
    public JAXBElement<GetVersionInfoRequest> createGetVersionInfoRequest(GetVersionInfoRequest value) {
        return new JAXBElement<GetVersionInfoRequest>(_GetVersionInfoRequest_QNAME, GetVersionInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySMIMEConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifySMIMEConfigResponse")
    public JAXBElement<ModifySMIMEConfigResponse> createModifySMIMEConfigResponse(ModifySMIMEConfigResponse value) {
        return new JAXBElement<ModifySMIMEConfigResponse>(_ModifySMIMEConfigResponse_QNAME, ModifySMIMEConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoProvAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoProvAccountRequest")
    public JAXBElement<AutoProvAccountRequest> createAutoProvAccountRequest(AutoProvAccountRequest value) {
        return new JAXBElement<AutoProvAccountRequest>(_AutoProvAccountRequest_QNAME, AutoProvAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnloadMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UnloadMailboxRequest")
    public JAXBElement<UnloadMailboxRequest> createUnloadMailboxRequest(UnloadMailboxRequest value) {
        return new JAXBElement<UnloadMailboxRequest>(_UnloadMailboxRequest_QNAME, UnloadMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerStatsResponse")
    public JAXBElement<GetServerStatsResponse> createGetServerStatsResponse(GetServerStatsResponse value) {
        return new JAXBElement<GetServerStatsResponse>(_GetServerStatsResponse_QNAME, GetServerStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolloverRedoLogRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RolloverRedoLogRequest")
    public JAXBElement<RolloverRedoLogRequest> createRolloverRedoLogRequest(RolloverRedoLogRequest value) {
        return new JAXBElement<RolloverRedoLogRequest>(_RolloverRedoLogRequest_QNAME, RolloverRedoLogRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadMemcachedClientConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadMemcachedClientConfigRequest")
    public JAXBElement<ReloadMemcachedClientConfigRequest> createReloadMemcachedClientConfigRequest(ReloadMemcachedClientConfigRequest value) {
        return new JAXBElement<ReloadMemcachedClientConfigRequest>(_ReloadMemcachedClientConfigRequest_QNAME, ReloadMemcachedClientConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncGalAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SyncGalAccountRequest")
    public JAXBElement<SyncGalAccountRequest> createSyncGalAccountRequest(SyncGalAccountRequest value) {
        return new JAXBElement<SyncGalAccountRequest>(_SyncGalAccountRequest_QNAME, SyncGalAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRightRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GrantRightRequest")
    public JAXBElement<GrantRightRequest> createGrantRightRequest(GrantRightRequest value) {
        return new JAXBElement<GrantRightRequest>(_GrantRightRequest_QNAME, GrantRightRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeMovedMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeMovedMailboxResponse")
    public JAXBElement<PurgeMovedMailboxResponse> createPurgeMovedMailboxResponse(PurgeMovedMailboxResponse value) {
        return new JAXBElement<PurgeMovedMailboxResponse>(_PurgeMovedMailboxResponse_QNAME, PurgeMovedMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMailboxesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllMailboxesResponse")
    public JAXBElement<GetAllMailboxesResponse> createGetAllMailboxesResponse(GetAllMailboxesResponse value) {
        return new JAXBElement<GetAllMailboxesResponse>(_GetAllMailboxesResponse_QNAME, GetAllMailboxesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameCosRequest")
    public JAXBElement<RenameCosRequest> createRenameCosRequest(RenameCosRequest value) {
        return new JAXBElement<RenameCosRequest>(_RenameCosRequest_QNAME, RenameCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAlwaysOnClusterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAlwaysOnClusterResponse")
    public JAXBElement<ModifyAlwaysOnClusterResponse> createModifyAlwaysOnClusterResponse(ModifyAlwaysOnClusterResponse value) {
        return new JAXBElement<ModifyAlwaysOnClusterResponse>(_ModifyAlwaysOnClusterResponse_QNAME, ModifyAlwaysOnClusterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminCreateWaitSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminCreateWaitSetResponse")
    public JAXBElement<AdminCreateWaitSetResponse> createAdminCreateWaitSetResponse(AdminCreateWaitSetResponse value) {
        return new JAXBElement<AdminCreateWaitSetResponse>(_AdminCreateWaitSetResponse_QNAME, AdminCreateWaitSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDataSourceResponse")
    public JAXBElement<DeleteDataSourceResponse> createDeleteDataSourceResponse(DeleteDataSourceResponse value) {
        return new JAXBElement<DeleteDataSourceResponse>(_DeleteDataSourceResponse_QNAME, DeleteDataSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCalendarResourcesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchCalendarResourcesRequest")
    public JAXBElement<SearchCalendarResourcesRequest> createSearchCalendarResourcesRequest(SearchCalendarResourcesRequest value) {
        return new JAXBElement<SearchCalendarResourcesRequest>(_SearchCalendarResourcesRequest_QNAME, SearchCalendarResourcesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCSRRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GenCSRRequest")
    public JAXBElement<GenCSRRequest> createGenCSRRequest(GenCSRRequest value) {
        return new JAXBElement<GenCSRRequest>(_GenCSRRequest_QNAME, GenCSRRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDistributionListMemberRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDistributionListMemberRequest")
    public JAXBElement<RemoveDistributionListMemberRequest> createRemoveDistributionListMemberRequest(RemoveDistributionListMemberRequest value) {
        return new JAXBElement<RemoveDistributionListMemberRequest>(_RemoveDistributionListMemberRequest_QNAME, RemoveDistributionListMemberRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerNIfsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerNIfsRequest")
    public JAXBElement<GetServerNIfsRequest> createGetServerNIfsRequest(GetServerNIfsRequest value) {
        return new JAXBElement<GetServerNIfsRequest>(_GetServerNIfsRequest_QNAME, GetServerNIfsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ConfigureZimletRequest")
    public JAXBElement<ConfigureZimletRequest> createConfigureZimletRequest(ConfigureZimletRequest value) {
        return new JAXBElement<ConfigureZimletRequest>(_ConfigureZimletRequest_QNAME, ConfigureZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ExportMailboxResponse")
    public JAXBElement<ExportMailboxResponse> createExportMailboxResponse(ExportMailboxResponse value) {
        return new JAXBElement<ExportMailboxResponse>(_ExportMailboxResponse_QNAME, ExportMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAlwaysOnClustersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAlwaysOnClustersResponse")
    public JAXBElement<GetAllAlwaysOnClustersResponse> createGetAllAlwaysOnClustersResponse(GetAllAlwaysOnClustersResponse value) {
        return new JAXBElement<GetAllAlwaysOnClustersResponse>(_GetAllAlwaysOnClustersResponse_QNAME, GetAllAlwaysOnClustersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDirectoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchDirectoryResponse")
    public JAXBElement<SearchDirectoryResponse> createSearchDirectoryResponse(SearchDirectoryResponse value) {
        return new JAXBElement<SearchDirectoryResponse>(_SearchDirectoryResponse_QNAME, SearchDirectoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateVolumeResponse")
    public JAXBElement<CreateVolumeResponse> createCreateVolumeResponse(CreateVolumeResponse value) {
        return new JAXBElement<CreateVolumeResponse>(_CreateVolumeResponse_QNAME, CreateVolumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckExchangeAuthRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckExchangeAuthRequest")
    public JAXBElement<CheckExchangeAuthRequest> createCheckExchangeAuthRequest(CheckExchangeAuthRequest value) {
        return new JAXBElement<CheckExchangeAuthRequest>(_CheckExchangeAuthRequest_QNAME, CheckExchangeAuthRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCalendarResourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateCalendarResourceRequest")
    public JAXBElement<CreateCalendarResourceRequest> createCreateCalendarResourceRequest(CreateCalendarResourceRequest value) {
        return new JAXBElement<CreateCalendarResourceRequest>(_CreateCalendarResourceRequest_QNAME, CreateCalendarResourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerStatsRequest")
    public JAXBElement<GetServerStatsRequest> createGetServerStatsRequest(GetServerStatsRequest value) {
        return new JAXBElement<GetServerStatsRequest>(_GetServerStatsRequest_QNAME, GetServerStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAccountLoggerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveAccountLoggerRequest")
    public JAXBElement<RemoveAccountLoggerRequest> createRemoveAccountLoggerRequest(RemoveAccountLoggerRequest value) {
        return new JAXBElement<RemoveAccountLoggerRequest>(_RemoveAccountLoggerRequest_QNAME, RemoveAccountLoggerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMailboxMoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "QueryMailboxMoveResponse")
    public JAXBElement<QueryMailboxMoveResponse> createQueryMailboxMoveResponse(QueryMailboxMoveResponse value) {
        return new JAXBElement<QueryMailboxMoveResponse>(_QueryMailboxMoveResponse_QNAME, QueryMailboxMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllServersRequest")
    public JAXBElement<GetAllServersRequest> createGetAllServersRequest(GetAllServersRequest value) {
        return new JAXBElement<GetAllServersRequest>(_GetAllServersRequest_QNAME, GetAllServersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchAccountsResponse")
    public JAXBElement<SearchAccountsResponse> createSearchAccountsResponse(SearchAccountsResponse value) {
        return new JAXBElement<SearchAccountsResponse>(_SearchAccountsResponse_QNAME, SearchAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalendarResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCalendarResourceResponse")
    public JAXBElement<GetCalendarResourceResponse> createGetCalendarResourceResponse(GetCalendarResourceResponse value) {
        return new JAXBElement<GetCalendarResourceResponse>(_GetCalendarResourceResponse_QNAME, GetCalendarResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactIndexRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CompactIndexRequest")
    public JAXBElement<CompactIndexRequest> createCompactIndexRequest(CompactIndexRequest value) {
        return new JAXBElement<CompactIndexRequest>(_CompactIndexRequest_QNAME, CompactIndexRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountLoggersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountLoggersRequest")
    public JAXBElement<GetAccountLoggersRequest> createGetAccountLoggersRequest(GetAccountLoggersRequest value) {
        return new JAXBElement<GetAccountLoggersRequest>(_GetAccountLoggersRequest_QNAME, GetAccountLoggersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllXMPPComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllXMPPComponentsRequest")
    public JAXBElement<GetAllXMPPComponentsRequest> createGetAllXMPPComponentsRequest(GetAllXMPPComponentsRequest value) {
        return new JAXBElement<GetAllXMPPComponentsRequest>(_GetAllXMPPComponentsRequest_QNAME, GetAllXMPPComponentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetServerOfflineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetServerOfflineResponse")
    public JAXBElement<SetServerOfflineResponse> createSetServerOfflineResponse(SetServerOfflineResponse value) {
        return new JAXBElement<SetServerOfflineResponse>(_SetServerOfflineResponse_QNAME, SetServerOfflineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAdminAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAdminAccountsRequest")
    public JAXBElement<GetAllAdminAccountsRequest> createGetAllAdminAccountsRequest(GetAllAdminAccountsRequest value) {
        return new JAXBElement<GetAllAdminAccountsRequest>(_GetAllAdminAccountsRequest_QNAME, GetAllAdminAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDelegatedAdminConstraintsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDelegatedAdminConstraintsRequest")
    public JAXBElement<ModifyDelegatedAdminConstraintsRequest> createModifyDelegatedAdminConstraintsRequest(ModifyDelegatedAdminConstraintsRequest value) {
        return new JAXBElement<ModifyDelegatedAdminConstraintsRequest>(_ModifyDelegatedAdminConstraintsRequest_QNAME, ModifyDelegatedAdminConstraintsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyCertKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyCertKeyResponse")
    public JAXBElement<VerifyCertKeyResponse> createVerifyCertKeyResponse(VerifyCertKeyResponse value) {
        return new JAXBElement<VerifyCertKeyResponse>(_VerifyCertKeyResponse_QNAME, VerifyCertKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShareInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetShareInfoRequest")
    public JAXBElement<GetShareInfoRequest> createGetShareInfoRequest(GetShareInfoRequest value) {
        return new JAXBElement<GetShareInfoRequest>(_GetShareInfoRequest_QNAME, GetShareInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminDestroyWaitSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminDestroyWaitSetResponse")
    public JAXBElement<AdminDestroyWaitSetResponse> createAdminDestroyWaitSetResponse(AdminDestroyWaitSetResponse value) {
        return new JAXBElement<AdminDestroyWaitSetResponse>(_AdminDestroyWaitSetResponse_QNAME, AdminDestroyWaitSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHostnameResolveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckHostnameResolveRequest")
    public JAXBElement<CheckHostnameResolveRequest> createCheckHostnameResolveRequest(CheckHostnameResolveRequest value) {
        return new JAXBElement<CheckHostnameResolveRequest>(_CheckHostnameResolveRequest_QNAME, CheckHostnameResolveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateXMbxSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateXMbxSearchResponse")
    public JAXBElement<CreateXMbxSearchResponse> createCreateXMbxSearchResponse(CreateXMbxSearchResponse value) {
        return new JAXBElement<CreateXMbxSearchResponse>(_CreateXMbxSearchResponse_QNAME, CreateXMbxSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbortXMbxSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AbortXMbxSearchRequest")
    public JAXBElement<AbortXMbxSearchRequest> createAbortXMbxSearchRequest(AbortXMbxSearchRequest value) {
        return new JAXBElement<AbortXMbxSearchRequest>(_AbortXMbxSearchRequest_QNAME, AbortXMbxSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsDocRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetRightsDocRequest")
    public JAXBElement<GetRightsDocRequest> createGetRightsDocRequest(GetRightsDocRequest value) {
        return new JAXBElement<GetRightsDocRequest>(_GetRightsDocRequest_QNAME, GetRightsDocRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDomainRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDomainRequest")
    public JAXBElement<CreateDomainRequest> createCreateDomainRequest(CreateDomainRequest value) {
        return new JAXBElement<CreateDomainRequest>(_CreateDomainRequest_QNAME, CreateDomainRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMemcachedClientConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMemcachedClientConfigRequest")
    public JAXBElement<GetMemcachedClientConfigRequest> createGetMemcachedClientConfigRequest(GetMemcachedClientConfigRequest value) {
        return new JAXBElement<GetMemcachedClientConfigRequest>(_GetMemcachedClientConfigRequest_QNAME, GetMemcachedClientConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CountAccountResponse")
    public JAXBElement<CountAccountResponse> createCountAccountResponse(CountAccountResponse value) {
        return new JAXBElement<CountAccountResponse>(_CountAccountResponse_QNAME, CountAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MigrateAccountRequest")
    public JAXBElement<MigrateAccountRequest> createMigrateAccountRequest(MigrateAccountRequest value) {
        return new JAXBElement<MigrateAccountRequest>(_MigrateAccountRequest_QNAME, MigrateAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushFreeBusyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PushFreeBusyResponse")
    public JAXBElement<PushFreeBusyResponse> createPushFreeBusyResponse(PushFreeBusyResponse value) {
        return new JAXBElement<PushFreeBusyResponse>(_PushFreeBusyResponse_QNAME, PushFreeBusyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RestoreResponse")
    public JAXBElement<RestoreResponse> createRestoreResponse(RestoreResponse value) {
        return new JAXBElement<RestoreResponse>(_RestoreResponse_QNAME, RestoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDomainResponse")
    public JAXBElement<DeleteDomainResponse> createDeleteDomainResponse(DeleteDomainResponse value) {
        return new JAXBElement<DeleteDomainResponse>(_DeleteDomainResponse_QNAME, DeleteDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyVolumeResponse")
    public JAXBElement<ModifyVolumeResponse> createModifyVolumeResponse(ModifyVolumeResponse value) {
        return new JAXBElement<ModifyVolumeResponse>(_ModifyVolumeResponse_QNAME, ModifyVolumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCalendarResourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteCalendarResourceRequest")
    public JAXBElement<DeleteCalendarResourceRequest> createDeleteCalendarResourceRequest(DeleteCalendarResourceRequest value) {
        return new JAXBElement<DeleteCalendarResourceRequest>(_DeleteCalendarResourceRequest_QNAME, DeleteCalendarResourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MoveMailboxRequest")
    public JAXBElement<MoveMailboxRequest> createMoveMailboxRequest(MoveMailboxRequest value) {
        return new JAXBElement<MoveMailboxRequest>(_MoveMailboxRequest_QNAME, MoveMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUCProvidersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllUCProvidersResponse")
    public JAXBElement<GetAllUCProvidersResponse> createGetAllUCProvidersResponse(GetAllUCProvidersResponse value) {
        return new JAXBElement<GetAllUCProvidersResponse>(_GetAllUCProvidersResponse_QNAME, GetAllUCProvidersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "a")
    public JAXBElement<Attr> createA(Attr value) {
        return new JAXBElement<Attr>(_A_QNAME, Attr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableArchiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "EnableArchiveRequest")
    public JAXBElement<EnableArchiveRequest> createEnableArchiveRequest(EnableArchiveRequest value) {
        return new JAXBElement<EnableArchiveRequest>(_EnableArchiveRequest_QNAME, EnableArchiveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountSinceLastUsedRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountSinceLastUsedRequest")
    public JAXBElement<GetDevicesCountSinceLastUsedRequest> createGetDevicesCountSinceLastUsedRequest(GetDevicesCountSinceLastUsedRequest value) {
        return new JAXBElement<GetDevicesCountSinceLastUsedRequest>(_GetDevicesCountSinceLastUsedRequest_QNAME, GetDevicesCountSinceLastUsedRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllZimletsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllZimletsResponse")
    public JAXBElement<GetAllZimletsResponse> createGetAllZimletsResponse(GetAllZimletsResponse value) {
        return new JAXBElement<GetAllZimletsResponse>(_GetAllZimletsResponse_QNAME, GetAllZimletsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GrantRightResponse")
    public JAXBElement<GrantRightResponse> createGrantRightResponse(GrantRightResponse value) {
        return new JAXBElement<GrantRightResponse>(_GrantRightResponse_QNAME, GrantRightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DlInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "cos")
    public JAXBElement<DlInfo> createCos(DlInfo value) {
        return new JAXBElement<DlInfo>(_Cos_QNAME, DlInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDeviceResponse")
    public JAXBElement<RemoveDeviceResponse> createRemoveDeviceResponse(RemoveDeviceResponse value) {
        return new JAXBElement<RemoveDeviceResponse>(_RemoveDeviceResponse_QNAME, RemoveDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDeviceStatusResponse")
    public JAXBElement<GetDeviceStatusResponse> createGetDeviceStatusResponse(GetDeviceStatusResponse value) {
        return new JAXBElement<GetDeviceStatusResponse>(_GetDeviceStatusResponse_QNAME, GetDeviceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RestoreRequest")
    public JAXBElement<RestoreRequest> createRestoreRequest(RestoreRequest value) {
        return new JAXBElement<RestoreRequest>(_RestoreRequest_QNAME, RestoreRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyCosResponse")
    public JAXBElement<ModifyCosResponse> createModifyCosResponse(ModifyCosResponse value) {
        return new JAXBElement<ModifyCosResponse>(_ModifyCosResponse_QNAME, ModifyCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllRightsResponse")
    public JAXBElement<GetAllRightsResponse> createGetAllRightsResponse(GetAllRightsResponse value) {
        return new JAXBElement<GetAllRightsResponse>(_GetAllRightsResponse_QNAME, GetAllRightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDelegatedAdminConstraintsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDelegatedAdminConstraintsResponse")
    public JAXBElement<ModifyDelegatedAdminConstraintsResponse> createModifyDelegatedAdminConstraintsResponse(ModifyDelegatedAdminConstraintsResponse value) {
        return new JAXBElement<ModifyDelegatedAdminConstraintsResponse>(_ModifyDelegatedAdminConstraintsResponse_QNAME, ModifyDelegatedAdminConstraintsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGalSyncAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteGalSyncAccountResponse")
    public JAXBElement<DeleteGalSyncAccountResponse> createDeleteGalSyncAccountResponse(DeleteGalSyncAccountResponse value) {
        return new JAXBElement<DeleteGalSyncAccountResponse>(_DeleteGalSyncAccountResponse_QNAME, DeleteGalSyncAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminWaitSetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminWaitSetRequest")
    public JAXBElement<AdminWaitSetRequest> createAdminWaitSetRequest(AdminWaitSetRequest value) {
        return new JAXBElement<AdminWaitSetRequest>(_AdminWaitSetRequest_QNAME, AdminWaitSetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountLoggersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountLoggersResponse")
    public JAXBElement<GetAccountLoggersResponse> createGetAccountLoggersResponse(GetAccountLoggersResponse value) {
        return new JAXBElement<GetAccountLoggersResponse>(_GetAccountLoggersResponse_QNAME, GetAccountLoggersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistributionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDistributionListResponse")
    public JAXBElement<GetDistributionListResponse> createGetDistributionListResponse(GetDistributionListResponse value) {
        return new JAXBElement<GetDistributionListResponse>(_GetDistributionListResponse_QNAME, GetDistributionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterMailboxMoveOutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RegisterMailboxMoveOutRequest")
    public JAXBElement<RegisterMailboxMoveOutRequest> createRegisterMailboxMoveOutRequest(RegisterMailboxMoveOutRequest value) {
        return new JAXBElement<RegisterMailboxMoveOutRequest>(_RegisterMailboxMoveOutRequest_QNAME, RegisterMailboxMoveOutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRightRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RevokeRightRequest")
    public JAXBElement<RevokeRightRequest> createRevokeRightRequest(RevokeRightRequest value) {
        return new JAXBElement<RevokeRightRequest>(_RevokeRightRequest_QNAME, RevokeRightRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadAccountResponse")
    public JAXBElement<ReloadAccountResponse> createReloadAccountResponse(ReloadAccountResponse value) {
        return new JAXBElement<ReloadAccountResponse>(_ReloadAccountResponse_QNAME, ReloadAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDelegatedAdminConstraintsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDelegatedAdminConstraintsRequest")
    public JAXBElement<GetDelegatedAdminConstraintsRequest> createGetDelegatedAdminConstraintsRequest(GetDelegatedAdminConstraintsRequest value) {
        return new JAXBElement<GetDelegatedAdminConstraintsRequest>(_GetDelegatedAdminConstraintsRequest_QNAME, GetDelegatedAdminConstraintsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyConfigRequest")
    public JAXBElement<ModifyConfigRequest> createModifyConfigRequest(ModifyConfigRequest value) {
        return new JAXBElement<ModifyConfigRequest>(_ModifyConfigRequest_QNAME, ModifyConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplianceHSMFSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetApplianceHSMFSResponse")
    public JAXBElement<GetApplianceHSMFSResponse> createGetApplianceHSMFSResponse(GetApplianceHSMFSResponse value) {
        return new JAXBElement<GetApplianceHSMFSResponse>(_GetApplianceHSMFSResponse_QNAME, GetApplianceHSMFSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbortXMbxSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AbortXMbxSearchResponse")
    public JAXBElement<AbortXMbxSearchResponse> createAbortXMbxSearchResponse(AbortXMbxSearchResponse value) {
        return new JAXBElement<AbortXMbxSearchResponse>(_AbortXMbxSearchResponse_QNAME, AbortXMbxSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClusterStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetClusterStatusRequest")
    public JAXBElement<GetClusterStatusRequest> createGetClusterStatusRequest(GetClusterStatusRequest value) {
        return new JAXBElement<GetClusterStatusRequest>(_GetClusterStatusRequest_QNAME, GetClusterStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetConfigResponse")
    public JAXBElement<GetConfigResponse> createGetConfigResponse(GetConfigResponse value) {
        return new JAXBElement<GetConfigResponse>(_GetConfigResponse_QNAME, GetConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDataSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDataSourceRequest")
    public JAXBElement<ModifyDataSourceRequest> createModifyDataSourceRequest(ModifyDataSourceRequest value) {
        return new JAXBElement<ModifyDataSourceRequest>(_ModifyDataSourceRequest_QNAME, ModifyDataSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UcServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ucservice")
    public JAXBElement<UcServiceInfo> createUcservice(UcServiceInfo value) {
        return new JAXBElement<UcServiceInfo>(_Ucservice_QNAME, UcServiceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteMailboxResponse")
    public JAXBElement<DeleteMailboxResponse> createDeleteMailboxResponse(DeleteMailboxResponse value) {
        return new JAXBElement<DeleteMailboxResponse>(_DeleteMailboxResponse_QNAME, DeleteMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbortHsmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AbortHsmResponse")
    public JAXBElement<AbortHsmResponse> createAbortHsmResponse(AbortHsmResponse value) {
        return new JAXBElement<AbortHsmResponse>(_AbortHsmResponse_QNAME, AbortHsmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameUCServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameUCServiceResponse")
    public JAXBElement<RenameUCServiceResponse> createRenameUCServiceResponse(RenameUCServiceResponse value) {
        return new JAXBElement<RenameUCServiceResponse>(_RenameUCServiceResponse_QNAME, RenameUCServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetAllLoggersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ResetAllLoggersRequest")
    public JAXBElement<ResetAllLoggersRequest> createResetAllLoggersRequest(ResetAllLoggersRequest value) {
        return new JAXBElement<ResetAllLoggersRequest>(_ResetAllLoggersRequest_QNAME, ResetAllLoggersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateLicenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ActivateLicenseResponse")
    public JAXBElement<ActivateLicenseResponse> createActivateLicenseResponse(ActivateLicenseResponse value) {
        return new JAXBElement<ActivateLicenseResponse>(_ActivateLicenseResponse_QNAME, ActivateLicenseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServiceStatusRequest")
    public JAXBElement<GetServiceStatusRequest> createGetServiceStatusRequest(GetServiceStatusRequest value) {
        return new JAXBElement<GetServiceStatusRequest>(_GetServiceStatusRequest_QNAME, GetServiceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetZimletResponse")
    public JAXBElement<GetZimletResponse> createGetZimletResponse(GetZimletResponse value) {
        return new JAXBElement<GetZimletResponse>(_GetZimletResponse_QNAME, GetZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlwaysOnClusterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateAlwaysOnClusterRequest")
    public JAXBElement<CreateAlwaysOnClusterRequest> createCreateAlwaysOnClusterRequest(CreateAlwaysOnClusterRequest value) {
        return new JAXBElement<CreateAlwaysOnClusterRequest>(_CreateAlwaysOnClusterRequest_QNAME, CreateAlwaysOnClusterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGalSyncAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteGalSyncAccountRequest")
    public JAXBElement<DeleteGalSyncAccountRequest> createDeleteGalSyncAccountRequest(DeleteGalSyncAccountRequest value) {
        return new JAXBElement<DeleteGalSyncAccountRequest>(_DeleteGalSyncAccountRequest_QNAME, DeleteGalSyncAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetGrantsResponse")
    public JAXBElement<GetGrantsResponse> createGetGrantsResponse(GetGrantsResponse value) {
        return new JAXBElement<GetGrantsResponse>(_GetGrantsResponse_QNAME, GetGrantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLDAPEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteLDAPEntryResponse")
    public JAXBElement<DeleteLDAPEntryResponse> createDeleteLDAPEntryResponse(DeleteLDAPEntryResponse value) {
        return new JAXBElement<DeleteLDAPEntryResponse>(_DeleteLDAPEntryResponse_QNAME, DeleteLDAPEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteWipeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoteWipeRequest")
    public JAXBElement<RemoteWipeRequest> createRemoteWipeRequest(RemoteWipeRequest value) {
        return new JAXBElement<RemoteWipeRequest>(_RemoteWipeRequest_QNAME, RemoteWipeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUCServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateUCServiceResponse")
    public JAXBElement<CreateUCServiceResponse> createCreateUCServiceResponse(CreateUCServiceResponse value) {
        return new JAXBElement<CreateUCServiceResponse>(_CreateUCServiceResponse_QNAME, CreateUCServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoOpRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "NoOpRequest")
    public JAXBElement<NoOpRequest> createNoOpRequest(NoOpRequest value) {
        return new JAXBElement<NoOpRequest>(_NoOpRequest_QNAME, NoOpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCalendarResourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllCalendarResourcesResponse")
    public JAXBElement<GetAllCalendarResourcesResponse> createGetAllCalendarResourcesResponse(GetAllCalendarResourcesResponse value) {
        return new JAXBElement<GetAllCalendarResourcesResponse>(_GetAllCalendarResourcesResponse_QNAME, GetAllCalendarResourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailQueueFlushResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MailQueueFlushResponse")
    public JAXBElement<MailQueueFlushResponse> createMailQueueFlushResponse(MailQueueFlushResponse value) {
        return new JAXBElement<MailQueueFlushResponse>(_MailQueueFlushResponse_QNAME, MailQueueFlushResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountUsedTodayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountUsedTodayResponse")
    public JAXBElement<GetDevicesCountUsedTodayResponse> createGetDevicesCountUsedTodayResponse(GetDevicesCountUsedTodayResponse value) {
        return new JAXBElement<GetDevicesCountUsedTodayResponse>(_GetDevicesCountUsedTodayResponse_QNAME, GetDevicesCountUsedTodayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteZimletRequest")
    public JAXBElement<DeleteZimletRequest> createDeleteZimletRequest(DeleteZimletRequest value) {
        return new JAXBElement<DeleteZimletRequest>(_DeleteZimletRequest_QNAME, DeleteZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSyncStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSyncStateResponse")
    public JAXBElement<GetSyncStateResponse> createGetSyncStateResponse(GetSyncStateResponse value) {
        return new JAXBElement<GetSyncStateResponse>(_GetSyncStateResponse_QNAME, GetSyncStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CopyCosRequest")
    public JAXBElement<CopyCosRequest> createCopyCosRequest(CopyCosRequest value) {
        return new JAXBElement<CopyCosRequest>(_CopyCosRequest_QNAME, CopyCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDataSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDataSourceResponse")
    public JAXBElement<ModifyDataSourceResponse> createModifyDataSourceResponse(ModifyDataSourceResponse value) {
        return new JAXBElement<ModifyDataSourceResponse>(_ModifyDataSourceResponse_QNAME, ModifyDataSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAccountResponse")
    public JAXBElement<ModifyAccountResponse> createModifyAccountResponse(ModifyAccountResponse value) {
        return new JAXBElement<ModifyAccountResponse>(_ModifyAccountResponse_QNAME, ModifyAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RevokeRightResponse")
    public JAXBElement<RevokeRightResponse> createRevokeRightResponse(RevokeRightResponse value) {
        return new JAXBElement<RevokeRightResponse>(_RevokeRightResponse_QNAME, RevokeRightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAlwaysOnClusterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAlwaysOnClusterRequest")
    public JAXBElement<ModifyAlwaysOnClusterRequest> createModifyAlwaysOnClusterRequest(ModifyAlwaysOnClusterRequest value) {
        return new JAXBElement<ModifyAlwaysOnClusterRequest>(_ModifyAlwaysOnClusterRequest_QNAME, ModifyAlwaysOnClusterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunUnitTestsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RunUnitTestsResponse")
    public JAXBElement<RunUnitTestsResponse> createRunUnitTestsResponse(RunUnitTestsResponse value) {
        return new JAXBElement<RunUnitTestsResponse>(_RunUnitTestsResponse_QNAME, RunUnitTestsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSyncStateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSyncStateRequest")
    public JAXBElement<GetSyncStateRequest> createGetSyncStateRequest(GetSyncStateRequest value) {
        return new JAXBElement<GetSyncStateRequest>(_GetSyncStateRequest_QNAME, GetSyncStateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDistributionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDistributionListResponse")
    public JAXBElement<CreateDistributionListResponse> createCreateDistributionListResponse(CreateDistributionListResponse value) {
        return new JAXBElement<CreateDistributionListResponse>(_CreateDistributionListResponse_QNAME, CreateDistributionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminWaitSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminWaitSetResponse")
    public JAXBElement<AdminWaitSetResponse> createAdminWaitSetResponse(AdminWaitSetResponse value) {
        return new JAXBElement<AdminWaitSetResponse>(_AdminWaitSetResponse_QNAME, AdminWaitSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLDAPEntryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateLDAPEntryRequest")
    public JAXBElement<CreateLDAPEntryRequest> createCreateLDAPEntryRequest(CreateLDAPEntryRequest value) {
        return new JAXBElement<CreateLDAPEntryRequest>(_CreateLDAPEntryRequest_QNAME, CreateLDAPEntryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLocalesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllLocalesRequest")
    public JAXBElement<GetAllLocalesRequest> createGetAllLocalesRequest(GetAllLocalesRequest value) {
        return new JAXBElement<GetAllLocalesRequest>(_GetAllLocalesRequest_QNAME, GetAllLocalesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxVersionResponse")
    public JAXBElement<GetMailboxVersionResponse> createGetMailboxVersionResponse(GetMailboxVersionResponse value) {
        return new JAXBElement<GetMailboxVersionResponse>(_GetMailboxVersionResponse_QNAME, GetMailboxVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySystemRetentionPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifySystemRetentionPolicyRequest")
    public JAXBElement<ModifySystemRetentionPolicyRequest> createModifySystemRetentionPolicyRequest(ModifySystemRetentionPolicyRequest value) {
        return new JAXBElement<ModifySystemRetentionPolicyRequest>(_ModifySystemRetentionPolicyRequest_QNAME, ModifySystemRetentionPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDomainRequest")
    public JAXBElement<GetDomainRequest> createGetDomainRequest(GetDomainRequest value) {
        return new JAXBElement<GetDomainRequest>(_GetDomainRequest_QNAME, GetDomainRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "NoOpResponse")
    public JAXBElement<NoOpResponse> createNoOpResponse(NoOpResponse value) {
        return new JAXBElement<NoOpResponse>(_NoOpResponse_QNAME, NoOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameAccountRequest")
    public JAXBElement<RenameAccountRequest> createRenameAccountRequest(RenameAccountRequest value) {
        return new JAXBElement<RenameAccountRequest>(_RenameAccountRequest_QNAME, RenameAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePresenceSessionIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UpdatePresenceSessionIdRequest")
    public JAXBElement<UpdatePresenceSessionIdRequest> createUpdatePresenceSessionIdRequest(UpdatePresenceSessionIdRequest value) {
        return new JAXBElement<UpdatePresenceSessionIdRequest>(_UpdatePresenceSessionIdRequest_QNAME, UpdatePresenceSessionIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DedupeBlobsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DedupeBlobsRequest")
    public JAXBElement<DedupeBlobsRequest> createDedupeBlobsRequest(DedupeBlobsRequest value) {
        return new JAXBElement<DedupeBlobsRequest>(_DedupeBlobsRequest_QNAME, DedupeBlobsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountLoggersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAccountLoggersRequest")
    public JAXBElement<GetAllAccountLoggersRequest> createGetAllAccountLoggersRequest(GetAllAccountLoggersRequest value) {
        return new JAXBElement<GetAllAccountLoggersRequest>(_GetAllAccountLoggersRequest_QNAME, GetAllAccountLoggersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLDAPEntriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLDAPEntriesResponse")
    public JAXBElement<GetLDAPEntriesResponse> createGetLDAPEntriesResponse(GetLDAPEntriesResponse value) {
        return new JAXBElement<GetLDAPEntriesResponse>(_GetLDAPEntriesResponse_QNAME, GetLDAPEntriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CountAccountRequest")
    public JAXBElement<CountAccountRequest> createCountAccountRequest(CountAccountRequest value) {
        return new JAXBElement<CountAccountRequest>(_CountAccountRequest_QNAME, CountAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSessionsRequest")
    public JAXBElement<GetSessionsRequest> createGetSessionsRequest(GetSessionsRequest value) {
        return new JAXBElement<GetSessionsRequest>(_GetSessionsRequest_QNAME, GetSessionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeAggregateQuotaUsageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ComputeAggregateQuotaUsageResponse")
    public JAXBElement<ComputeAggregateQuotaUsageResponse> createComputeAggregateQuotaUsageResponse(ComputeAggregateQuotaUsageResponse value) {
        return new JAXBElement<ComputeAggregateQuotaUsageResponse>(_ComputeAggregateQuotaUsageResponse_QNAME, ComputeAggregateQuotaUsageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUCProvidersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllUCProvidersRequest")
    public JAXBElement<GetAllUCProvidersRequest> createGetAllUCProvidersRequest(GetAllUCProvidersRequest value) {
        return new JAXBElement<GetAllUCProvidersRequest>(_GetAllUCProvidersRequest_QNAME, GetAllUCProvidersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailQueueFlushRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MailQueueFlushRequest")
    public JAXBElement<MailQueueFlushRequest> createMailQueueFlushRequest(MailQueueFlushRequest value) {
        return new JAXBElement<MailQueueFlushRequest>(_MailQueueFlushRequest_QNAME, MailQueueFlushRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetZimletRequest")
    public JAXBElement<GetZimletRequest> createGetZimletRequest(GetZimletRequest value) {
        return new JAXBElement<GetZimletRequest>(_GetZimletRequest_QNAME, GetZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGalSyncAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateGalSyncAccountResponse")
    public JAXBElement<CreateGalSyncAccountResponse> createCreateGalSyncAccountResponse(CreateGalSyncAccountResponse value) {
        return new JAXBElement<CreateGalSyncAccountResponse>(_CreateGalSyncAccountResponse_QNAME, CreateGalSyncAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCSRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GenCSRResponse")
    public JAXBElement<GenCSRResponse> createGenCSRResponse(GenCSRResponse value) {
        return new JAXBElement<GenCSRResponse>(_GenCSRResponse_QNAME, GenCSRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistributionListMembershipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDistributionListMembershipResponse")
    public JAXBElement<GetDistributionListMembershipResponse> createGetDistributionListMembershipResponse(GetDistributionListMembershipResponse value) {
        return new JAXBElement<GetDistributionListMembershipResponse>(_GetDistributionListMembershipResponse_QNAME, GetDistributionListMembershipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentVolumesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCurrentVolumesRequest")
    public JAXBElement<GetCurrentVolumesRequest> createGetCurrentVolumesRequest(GetCurrentVolumesRequest value) {
        return new JAXBElement<GetCurrentVolumesRequest>(_GetCurrentVolumesRequest_QNAME, GetCurrentVolumesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DumpSessionsResponse")
    public JAXBElement<DumpSessionsResponse> createDumpSessionsResponse(DumpSessionsResponse value) {
        return new JAXBElement<DumpSessionsResponse>(_DumpSessionsResponse_QNAME, DumpSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminSavedSearchesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminSavedSearchesRequest")
    public JAXBElement<GetAdminSavedSearchesRequest> createGetAdminSavedSearchesRequest(GetAdminSavedSearchesRequest value) {
        return new JAXBElement<GetAdminSavedSearchesRequest>(_GetAdminSavedSearchesRequest_QNAME, GetAdminSavedSearchesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDomainResponse")
    public JAXBElement<GetDomainResponse> createGetDomainResponse(GetDomainResponse value) {
        return new JAXBElement<GetDomainResponse>(_GetDomainResponse_QNAME, GetDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDomCertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UploadDomCertResponse")
    public JAXBElement<UploadDomCertResponse> createUploadDomCertResponse(UploadDomCertResponse value) {
        return new JAXBElement<UploadDomCertResponse>(_UploadDomCertResponse_QNAME, UploadDomCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWaitSetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "QueryWaitSetRequest")
    public JAXBElement<QueryWaitSetRequest> createQueryWaitSetRequest(QueryWaitSetRequest value) {
        return new JAXBElement<QueryWaitSetRequest>(_QueryWaitSetRequest_QNAME, QueryWaitSetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSkinsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllSkinsRequest")
    public JAXBElement<GetAllSkinsRequest> createGetAllSkinsRequest(GetAllSkinsRequest value) {
        return new JAXBElement<GetAllSkinsRequest>(_GetAllSkinsRequest_QNAME, GetAllSkinsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAndDeleteItemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ExportAndDeleteItemsResponse")
    public JAXBElement<ExportAndDeleteItemsResponse> createExportAndDeleteItemsResponse(ExportAndDeleteItemsResponse value) {
        return new JAXBElement<ExportAndDeleteItemsResponse>(_ExportAndDeleteItemsResponse_QNAME, ExportAndDeleteItemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllConfigRequest")
    public JAXBElement<GetAllConfigRequest> createGetAllConfigRequest(GetAllConfigRequest value) {
        return new JAXBElement<GetAllConfigRequest>(_GetAllConfigRequest_QNAME, GetAllConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDataSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDataSourceResponse")
    public JAXBElement<CreateDataSourceResponse> createCreateDataSourceResponse(CreateDataSourceResponse value) {
        return new JAXBElement<CreateDataSourceResponse>(_CreateDataSourceResponse_QNAME, CreateDataSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchGalRequest")
    public JAXBElement<SearchGalRequest> createSearchGalRequest(SearchGalRequest value) {
        return new JAXBElement<SearchGalRequest>(_SearchGalRequest_QNAME, SearchGalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreateObjectAttrsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCreateObjectAttrsRequest")
    public JAXBElement<GetCreateObjectAttrsRequest> createGetCreateObjectAttrsRequest(GetCreateObjectAttrsRequest value) {
        return new JAXBElement<GetCreateObjectAttrsRequest>(_GetCreateObjectAttrsRequest_QNAME, GetCreateObjectAttrsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "target")
    public JAXBElement<String> createTarget(String value) {
        return new JAXBElement<String>(_Target_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAlwaysOnClusterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteAlwaysOnClusterResponse")
    public JAXBElement<DeleteAlwaysOnClusterResponse> createDeleteAlwaysOnClusterResponse(DeleteAlwaysOnClusterResponse value) {
        return new JAXBElement<DeleteAlwaysOnClusterResponse>(_DeleteAlwaysOnClusterResponse_QNAME, DeleteAlwaysOnClusterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentVolumesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCurrentVolumesResponse")
    public JAXBElement<GetCurrentVolumesResponse> createGetCurrentVolumesResponse(GetCurrentVolumesResponse value) {
        return new JAXBElement<GetCurrentVolumesResponse>(_GetCurrentVolumesResponse_QNAME, GetCurrentVolumesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGalSyncDataSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddGalSyncDataSourceRequest")
    public JAXBElement<AddGalSyncDataSourceRequest> createAddGalSyncDataSourceRequest(AddGalSyncDataSourceRequest value) {
        return new JAXBElement<AddGalSyncDataSourceRequest>(_AddGalSyncDataSourceRequest_QNAME, AddGalSyncDataSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountMembershipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountMembershipResponse")
    public JAXBElement<GetAccountMembershipResponse> createGetAccountMembershipResponse(GetAccountMembershipResponse value) {
        return new JAXBElement<GetAccountMembershipResponse>(_GetAccountMembershipResponse_QNAME, GetAccountMembershipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlwaysOnClusterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAlwaysOnClusterResponse")
    public JAXBElement<GetAlwaysOnClusterResponse> createGetAlwaysOnClusterResponse(GetAlwaysOnClusterResponse value) {
        return new JAXBElement<GetAlwaysOnClusterResponse>(_GetAlwaysOnClusterResponse_QNAME, GetAlwaysOnClusterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockoutMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "LockoutMailboxRequest")
    public JAXBElement<LockoutMailboxRequest> createLockoutMailboxRequest(LockoutMailboxRequest value) {
        return new JAXBElement<LockoutMailboxRequest>(_LockoutMailboxRequest_QNAME, LockoutMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MoveMailboxResponse")
    public JAXBElement<MoveMailboxResponse> createMoveMailboxResponse(MoveMailboxResponse value) {
        return new JAXBElement<MoveMailboxResponse>(_MoveMailboxResponse_QNAME, MoveMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshRegisteredAuthTokensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RefreshRegisteredAuthTokensResponse")
    public JAXBElement<RefreshRegisteredAuthTokensResponse> createRefreshRegisteredAuthTokensResponse(RefreshRegisteredAuthTokensResponse value) {
        return new JAXBElement<RefreshRegisteredAuthTokensResponse>(_RefreshRegisteredAuthTokensResponse_QNAME, RefreshRegisteredAuthTokensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndexStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetIndexStatsRequest")
    public JAXBElement<GetIndexStatsRequest> createGetIndexStatsRequest(GetIndexStatsRequest value) {
        return new JAXBElement<GetIndexStatsRequest>(_GetIndexStatsRequest_QNAME, GetIndexStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCalendarResourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyCalendarResourceRequest")
    public JAXBElement<ModifyCalendarResourceRequest> createModifyCalendarResourceRequest(ModifyCalendarResourceRequest value) {
        return new JAXBElement<ModifyCalendarResourceRequest>(_ModifyCalendarResourceRequest_QNAME, ModifyCalendarResourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadMemcachedClientConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadMemcachedClientConfigResponse")
    public JAXBElement<ReloadMemcachedClientConfigResponse> createReloadMemcachedClientConfigResponse(ReloadMemcachedClientConfigResponse value) {
        return new JAXBElement<ReloadMemcachedClientConfigResponse>(_ReloadMemcachedClientConfigResponse_QNAME, ReloadMemcachedClientConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailboxQuotaInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "mbox")
    public JAXBElement<MailboxQuotaInfo> createMbox(MailboxQuotaInfo value) {
        return new JAXBElement<MailboxQuotaInfo>(_Mbox_QNAME, MailboxQuotaInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVolumesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllVolumesRequest")
    public JAXBElement<GetAllVolumesRequest> createGetAllVolumesRequest(GetAllVolumesRequest value) {
        return new JAXBElement<GetAllVolumesRequest>(_GetAllVolumesRequest_QNAME, GetAllVolumesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActiveServersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllActiveServersResponse")
    public JAXBElement<GetAllActiveServersResponse> createGetAllActiveServersResponse(GetAllActiveServersResponse value) {
        return new JAXBElement<GetAllActiveServersResponse>(_GetAllActiveServersResponse_QNAME, GetAllActiveServersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminConsoleUICompResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminConsoleUICompResponse")
    public JAXBElement<GetAdminConsoleUICompResponse> createGetAdminConsoleUICompResponse(GetAdminConsoleUICompResponse value) {
        return new JAXBElement<GetAdminConsoleUICompResponse>(_GetAdminConsoleUICompResponse_QNAME, GetAdminConsoleUICompResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallLicenseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "InstallLicenseRequest")
    public JAXBElement<InstallLicenseRequest> createInstallLicenseRequest(InstallLicenseRequest value) {
        return new JAXBElement<InstallLicenseRequest>(_InstallLicenseRequest_QNAME, InstallLicenseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPasswordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetPasswordRequest")
    public JAXBElement<SetPasswordRequest> createSetPasswordRequest(SetPasswordRequest value) {
        return new JAXBElement<SetPasswordRequest>(_SetPasswordRequest_QNAME, SetPasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEffectiveRightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetEffectiveRightsResponse")
    public JAXBElement<GetEffectiveRightsResponse> createGetEffectiveRightsResponse(GetEffectiveRightsResponse value) {
        return new JAXBElement<GetEffectiveRightsResponse>(_GetEffectiveRightsResponse_QNAME, GetEffectiveRightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateCosRequest")
    public JAXBElement<CreateCosRequest> createCreateCosRequest(CreateCosRequest value) {
        return new JAXBElement<CreateCosRequest>(_CreateCosRequest_QNAME, CreateCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateServerResponse")
    public JAXBElement<CreateServerResponse> createCreateServerResponse(CreateServerResponse value) {
        return new JAXBElement<CreateServerResponse>(_CreateServerResponse_QNAME, CreateServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteVolumeResponse")
    public JAXBElement<DeleteVolumeResponse> createDeleteVolumeResponse(DeleteVolumeResponse value) {
        return new JAXBElement<DeleteVolumeResponse>(_DeleteVolumeResponse_QNAME, DeleteVolumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "includeCSS")
    public JAXBElement<String> createIncludeCSS(String value) {
        return new JAXBElement<String>(_IncludeCSS_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAuthConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckAuthConfigRequest")
    public JAXBElement<CheckAuthConfigRequest> createCheckAuthConfigRequest(CheckAuthConfigRequest value) {
        return new JAXBElement<CheckAuthConfigRequest>(_CheckAuthConfigRequest_QNAME, CheckAuthConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoteWipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoteWipeResponse")
    public JAXBElement<RemoteWipeResponse> createRemoteWipeResponse(RemoteWipeResponse value) {
        return new JAXBElement<RemoteWipeResponse>(_RemoteWipeResponse_QNAME, RemoteWipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCertRequest")
    public JAXBElement<GetCertRequest> createGetCertRequest(GetCertRequest value) {
        return new JAXBElement<GetCertRequest>(_GetCertRequest_QNAME, GetCertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadAccountRequest")
    public JAXBElement<ReloadAccountRequest> createReloadAccountRequest(ReloadAccountRequest value) {
        return new JAXBElement<ReloadAccountRequest>(_ReloadAccountRequest_QNAME, ReloadAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllCosRequest")
    public JAXBElement<GetAllCosRequest> createGetAllCosRequest(GetAllCosRequest value) {
        return new JAXBElement<GetAllCosRequest>(_GetAllCosRequest_QNAME, GetAllCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterMailboxMoveOutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UnregisterMailboxMoveOutRequest")
    public JAXBElement<UnregisterMailboxMoveOutRequest> createUnregisterMailboxMoveOutRequest(UnregisterMailboxMoveOutRequest value) {
        return new JAXBElement<UnregisterMailboxMoveOutRequest>(_UnregisterMailboxMoveOutRequest_QNAME, UnregisterMailboxMoveOutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBlobsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MoveBlobsRequest")
    public JAXBElement<MoveBlobsRequest> createMoveBlobsRequest(MoveBlobsRequest value) {
        return new JAXBElement<MoveBlobsRequest>(_MoveBlobsRequest_QNAME, MoveBlobsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllXMPPComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllXMPPComponentsResponse")
    public JAXBElement<GetAllXMPPComponentsResponse> createGetAllXMPPComponentsResponse(GetAllXMPPComponentsResponse value) {
        return new JAXBElement<GetAllXMPPComponentsResponse>(_GetAllXMPPComponentsResponse_QNAME, GetAllXMPPComponentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyServerResponse")
    public JAXBElement<ModifyServerResponse> createModifyServerResponse(ModifyServerResponse value) {
        return new JAXBElement<ModifyServerResponse>(_ModifyServerResponse_QNAME, ModifyServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAccountAliasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveAccountAliasResponse")
    public JAXBElement<RemoveAccountAliasResponse> createRemoveAccountAliasResponse(RemoveAccountAliasResponse value) {
        return new JAXBElement<RemoveAccountAliasResponse>(_RemoveAccountAliasResponse_QNAME, RemoveAccountAliasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServiceStatusResponse")
    public JAXBElement<GetServiceStatusResponse> createGetServiceStatusResponse(GetServiceStatusResponse value) {
        return new JAXBElement<GetServiceStatusResponse>(_GetServiceStatusResponse_QNAME, GetServiceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDomainInfoRequest")
    public JAXBElement<GetDomainInfoRequest> createGetDomainInfoRequest(GetDomainInfoRequest value) {
        return new JAXBElement<GetDomainInfoRequest>(_GetDomainInfoRequest_QNAME, GetDomainInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateZimletRequest")
    public JAXBElement<CreateZimletRequest> createCreateZimletRequest(CreateZimletRequest value) {
        return new JAXBElement<CreateZimletRequest>(_CreateZimletRequest_QNAME, CreateZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxVersionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxVersionRequest")
    public JAXBElement<GetMailboxVersionRequest> createGetMailboxVersionRequest(GetMailboxVersionRequest value) {
        return new JAXBElement<GetMailboxVersionRequest>(_GetMailboxVersionRequest_QNAME, GetMailboxVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHealthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckHealthResponse")
    public JAXBElement<CheckHealthResponse> createCheckHealthResponse(CheckHealthResponse value) {
        return new JAXBElement<CheckHealthResponse>(_CheckHealthResponse_QNAME, CheckHealthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySMIMEConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifySMIMEConfigRequest")
    public JAXBElement<ModifySMIMEConfigRequest> createModifySMIMEConfigRequest(ModifySMIMEConfigRequest value) {
        return new JAXBElement<ModifySMIMEConfigRequest>(_ModifySMIMEConfigRequest_QNAME, ModifySMIMEConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMbxSearchesListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetXMbxSearchesListRequest")
    public JAXBElement<GetXMbxSearchesListRequest> createGetXMbxSearchesListRequest(GetXMbxSearchesListRequest value) {
        return new JAXBElement<GetXMbxSearchesListRequest>(_GetXMbxSearchesListRequest_QNAME, GetXMbxSearchesListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCalendarResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyCalendarResourceResponse")
    public JAXBElement<ModifyCalendarResourceResponse> createModifyCalendarResourceResponse(ModifyCalendarResourceResponse value) {
        return new JAXBElement<ModifyCalendarResourceResponse>(_ModifyCalendarResourceResponse_QNAME, ModifyCalendarResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyStoreManagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyStoreManagerResponse")
    public JAXBElement<VerifyStoreManagerResponse> createVerifyStoreManagerResponse(VerifyStoreManagerResponse value) {
        return new JAXBElement<VerifyStoreManagerResponse>(_VerifyStoreManagerResponse_QNAME, VerifyStoreManagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUCServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetUCServiceResponse")
    public JAXBElement<GetUCServiceResponse> createGetUCServiceResponse(GetUCServiceResponse value) {
        return new JAXBElement<GetUCServiceResponse>(_GetUCServiceResponse_QNAME, GetUCServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllVolumesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllVolumesResponse")
    public JAXBElement<GetAllVolumesResponse> createGetAllVolumesResponse(GetAllVolumesResponse value) {
        return new JAXBElement<GetAllVolumesResponse>(_GetAllVolumesResponse_QNAME, GetAllVolumesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlushCacheRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FlushCacheRequest")
    public JAXBElement<FlushCacheRequest> createFlushCacheRequest(FlushCacheRequest value) {
        return new JAXBElement<FlushCacheRequest>(_FlushCacheRequest_QNAME, FlushCacheRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDomainsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllDomainsResponse")
    public JAXBElement<GetAllDomainsResponse> createGetAllDomainsResponse(GetAllDomainsResponse value) {
        return new JAXBElement<GetAllDomainsResponse>(_GetAllDomainsResponse_QNAME, GetAllDomainsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDirectoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchDirectoryRequest")
    public JAXBElement<SearchDirectoryRequest> createSearchDirectoryRequest(SearchDirectoryRequest value) {
        return new JAXBElement<SearchDirectoryRequest>(_SearchDirectoryRequest_QNAME, SearchDirectoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountResponse")
    public JAXBElement<GetDevicesCountResponse> createGetDevicesCountResponse(GetDevicesCountResponse value) {
        return new JAXBElement<GetDevicesCountResponse>(_GetDevicesCountResponse_QNAME, GetDevicesCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarPriorityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarPriorityResponse")
    public JAXBElement<FixCalendarPriorityResponse> createFixCalendarPriorityResponse(FixCalendarPriorityResponse value) {
        return new JAXBElement<FixCalendarPriorityResponse>(_FixCalendarPriorityResponse_QNAME, FixCalendarPriorityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCalendarResourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchCalendarResourcesResponse")
    public JAXBElement<SearchCalendarResourcesResponse> createSearchCalendarResourcesResponse(SearchCalendarResourcesResponse value) {
        return new JAXBElement<SearchCalendarResourcesResponse>(_SearchCalendarResourcesResponse_QNAME, SearchCalendarResourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountAliasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddAccountAliasRequest")
    public JAXBElement<AddAccountAliasRequest> createAddAccountAliasRequest(AddAccountAliasRequest value) {
        return new JAXBElement<AddAccountAliasRequest>(_AddAccountAliasRequest_QNAME, AddAccountAliasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDistributionListMemberRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddDistributionListMemberRequest")
    public JAXBElement<AddDistributionListMemberRequest> createAddDistributionListMemberRequest(AddDistributionListMemberRequest value) {
        return new JAXBElement<AddDistributionListMemberRequest>(_AddDistributionListMemberRequest_QNAME, AddDistributionListMemberRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminSavedSearchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminSavedSearchesResponse")
    public JAXBElement<GetAdminSavedSearchesResponse> createGetAdminSavedSearchesResponse(GetAdminSavedSearchesResponse value) {
        return new JAXBElement<GetAdminSavedSearchesResponse>(_GetAdminSavedSearchesResponse_QNAME, GetAdminSavedSearchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountObjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CountObjectsResponse")
    public JAXBElement<CountObjectsResponse> createCountObjectsResponse(CountObjectsResponse value) {
        return new JAXBElement<CountObjectsResponse>(_CountObjectsResponse_QNAME, CountObjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSourcesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDataSourcesRequest")
    public JAXBElement<GetDataSourcesRequest> createGetDataSourcesRequest(GetDataSourcesRequest value) {
        return new JAXBElement<GetDataSourcesRequest>(_GetDataSourcesRequest_QNAME, GetDataSourcesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUCServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteUCServiceResponse")
    public JAXBElement<DeleteUCServiceResponse> createDeleteUCServiceResponse(DeleteUCServiceResponse value) {
        return new JAXBElement<DeleteUCServiceResponse>(_DeleteUCServiceResponse_QNAME, DeleteUCServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistributionListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDistributionListRequest")
    public JAXBElement<GetDistributionListRequest> createGetDistributionListRequest(GetDistributionListRequest value) {
        return new JAXBElement<GetDistributionListRequest>(_GetDistributionListRequest_QNAME, GetDistributionListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAdminSavedSearchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAdminSavedSearchesResponse")
    public JAXBElement<ModifyAdminSavedSearchesResponse> createModifyAdminSavedSearchesResponse(ModifyAdminSavedSearchesResponse value) {
        return new JAXBElement<ModifyAdminSavedSearchesResponse>(_ModifyAdminSavedSearchesResponse_QNAME, ModifyAdminSavedSearchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PingRequest")
    public JAXBElement<PingRequest> createPingRequest(PingRequest value) {
        return new JAXBElement<PingRequest>(_PingRequest_QNAME, PingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameCosResponse")
    public JAXBElement<RenameCosResponse> createRenameCosResponse(RenameCosResponse value) {
        return new JAXBElement<RenameCosResponse>(_RenameCosResponse_QNAME, RenameCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountAliasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddAccountAliasResponse")
    public JAXBElement<AddAccountAliasResponse> createAddAccountAliasResponse(AddAccountAliasResponse value) {
        return new JAXBElement<AddAccountAliasResponse>(_AddAccountAliasResponse_QNAME, AddAccountAliasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAggregateQuotaUsageOnServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAggregateQuotaUsageOnServerRequest")
    public JAXBElement<GetAggregateQuotaUsageOnServerRequest> createGetAggregateQuotaUsageOnServerRequest(GetAggregateQuotaUsageOnServerRequest value) {
        return new JAXBElement<GetAggregateQuotaUsageOnServerRequest>(_GetAggregateQuotaUsageOnServerRequest_QNAME, GetAggregateQuotaUsageOnServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSMIMEConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSMIMEConfigRequest")
    public JAXBElement<GetSMIMEConfigRequest> createGetSMIMEConfigRequest(GetSMIMEConfigRequest value) {
        return new JAXBElement<GetSMIMEConfigRequest>(_GetSMIMEConfigRequest_QNAME, GetSMIMEConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteXMbxSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteXMbxSearchRequest")
    public JAXBElement<DeleteXMbxSearchRequest> createDeleteXMbxSearchRequest(DeleteXMbxSearchRequest value) {
        return new JAXBElement<DeleteXMbxSearchRequest>(_DeleteXMbxSearchRequest_QNAME, DeleteXMbxSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountObjectsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CountObjectsRequest")
    public JAXBElement<CountObjectsRequest> createCountObjectsRequest(CountObjectsRequest value) {
        return new JAXBElement<CountObjectsRequest>(_CountObjectsRequest_QNAME, CountObjectsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminExtensionZimletsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminExtensionZimletsRequest")
    public JAXBElement<GetAdminExtensionZimletsRequest> createGetAdminExtensionZimletsRequest(GetAdminExtensionZimletsRequest value) {
        return new JAXBElement<GetAdminExtensionZimletsRequest>(_GetAdminExtensionZimletsRequest_QNAME, GetAdminExtensionZimletsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeFreeBusyQueueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeFreeBusyQueueResponse")
    public JAXBElement<PurgeFreeBusyQueueResponse> createPurgeFreeBusyQueueResponse(PurgeFreeBusyQueueResponse value) {
        return new JAXBElement<PurgeFreeBusyQueueResponse>(_PurgeFreeBusyQueueResponse_QNAME, PurgeFreeBusyQueueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLicenseResponse")
    public JAXBElement<GetLicenseResponse> createGetLicenseResponse(GetLicenseResponse value) {
        return new JAXBElement<GetLicenseResponse>(_GetLicenseResponse_QNAME, GetLicenseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReIndexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReIndexResponse")
    public JAXBElement<ReIndexResponse> createReIndexResponse(ReIndexResponse value) {
        return new JAXBElement<ReIndexResponse>(_ReIndexResponse_QNAME, ReIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateLicenseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ActivateLicenseRequest")
    public JAXBElement<ActivateLicenseRequest> createActivateLicenseRequest(ActivateLicenseRequest value) {
        return new JAXBElement<ActivateLicenseRequest>(_ActivateLicenseRequest_QNAME, ActivateLicenseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatsValueWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "values")
    public JAXBElement<StatsValueWrapper> createValues(StatsValueWrapper value) {
        return new JAXBElement<StatsValueWrapper>(_Values_QNAME, StatsValueWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AliasInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "alias")
    public JAXBElement<AliasInfo> createAlias(AliasInfo value) {
        return new JAXBElement<AliasInfo>(_Alias_QNAME, AliasInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminDestroyWaitSetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminDestroyWaitSetRequest")
    public JAXBElement<AdminDestroyWaitSetRequest> createAdminDestroyWaitSetRequest(AdminDestroyWaitSetRequest value) {
        return new JAXBElement<AdminDestroyWaitSetRequest>(_AdminDestroyWaitSetRequest_QNAME, AdminDestroyWaitSetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VersionCheckRequest")
    public JAXBElement<VersionCheckRequest> createVersionCheckRequest(VersionCheckRequest value) {
        return new JAXBElement<VersionCheckRequest>(_VersionCheckRequest_QNAME, VersionCheckRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecalculateMailboxCountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RecalculateMailboxCountsResponse")
    public JAXBElement<RecalculateMailboxCountsResponse> createRecalculateMailboxCountsResponse(RecalculateMailboxCountsResponse value) {
        return new JAXBElement<RecalculateMailboxCountsResponse>(_RecalculateMailboxCountsResponse_QNAME, RecalculateMailboxCountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDomainMXRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckDomainMXRecordResponse")
    public JAXBElement<CheckDomainMXRecordResponse> createCheckDomainMXRecordResponse(CheckDomainMXRecordResponse value) {
        return new JAXBElement<CheckDomainMXRecordResponse>(_CheckDomainMXRecordResponse_QNAME, CheckDomainMXRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDistributionListAliasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddDistributionListAliasRequest")
    public JAXBElement<AddDistributionListAliasRequest> createAddDistributionListAliasRequest(AddDistributionListAliasRequest value) {
        return new JAXBElement<AddDistributionListAliasRequest>(_AddDistributionListAliasRequest_QNAME, AddDistributionListAliasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushFreeBusyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PushFreeBusyRequest")
    public JAXBElement<PushFreeBusyRequest> createPushFreeBusyRequest(PushFreeBusyRequest value) {
        return new JAXBElement<PushFreeBusyRequest>(_PushFreeBusyRequest_QNAME, PushFreeBusyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAndDeleteItemsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ExportAndDeleteItemsRequest")
    public JAXBElement<ExportAndDeleteItemsRequest> createExportAndDeleteItemsRequest(ExportAndDeleteItemsRequest value) {
        return new JAXBElement<ExportAndDeleteItemsRequest>(_ExportAndDeleteItemsRequest_QNAME, ExportAndDeleteItemsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameCalendarResourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameCalendarResourceRequest")
    public JAXBElement<RenameCalendarResourceRequest> createRenameCalendarResourceRequest(RenameCalendarResourceRequest value) {
        return new JAXBElement<RenameCalendarResourceRequest>(_RenameCalendarResourceRequest_QNAME, RenameCalendarResourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailQueueInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailQueueInfoRequest")
    public JAXBElement<GetMailQueueInfoRequest> createGetMailQueueInfoRequest(GetMailQueueInfoRequest value) {
        return new JAXBElement<GetMailQueueInfoRequest>(_GetMailQueueInfoRequest_QNAME, GetMailQueueInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterMailboxMoveOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UnregisterMailboxMoveOutResponse")
    public JAXBElement<UnregisterMailboxMoveOutResponse> createUnregisterMailboxMoveOutResponse(UnregisterMailboxMoveOutResponse value) {
        return new JAXBElement<UnregisterMailboxMoveOutResponse>(_UnregisterMailboxMoveOutResponse_QNAME, UnregisterMailboxMoveOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountMembershipRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountMembershipRequest")
    public JAXBElement<GetAccountMembershipRequest> createGetAccountMembershipRequest(GetAccountMembershipRequest value) {
        return new JAXBElement<GetAccountMembershipRequest>(_GetAccountMembershipRequest_QNAME, GetAccountMembershipRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClusterStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetClusterStatusResponse")
    public JAXBElement<GetClusterStatusResponse> createGetClusterStatusResponse(GetClusterStatusResponse value) {
        return new JAXBElement<GetClusterStatusResponse>(_GetClusterStatusResponse_QNAME, GetClusterStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallCertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "InstallCertResponse")
    public JAXBElement<InstallCertResponse> createInstallCertResponse(InstallCertResponse value) {
        return new JAXBElement<InstallCertResponse>(_InstallCertResponse_QNAME, InstallCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlushCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FlushCacheResponse")
    public JAXBElement<FlushCacheResponse> createFlushCacheResponse(FlushCacheResponse value) {
        return new JAXBElement<FlushCacheResponse>(_FlushCacheResponse_QNAME, FlushCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountLoggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddAccountLoggerResponse")
    public JAXBElement<AddAccountLoggerResponse> createAddAccountLoggerResponse(AddAccountLoggerResponse value) {
        return new JAXBElement<AddAccountLoggerResponse>(_AddAccountLoggerResponse_QNAME, AddAccountLoggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailoverClusterServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FailoverClusterServiceRequest")
    public JAXBElement<FailoverClusterServiceRequest> createFailoverClusterServiceRequest(FailoverClusterServiceRequest value) {
        return new JAXBElement<FailoverClusterServiceRequest>(_FailoverClusterServiceRequest_QNAME, FailoverClusterServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVolumeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateVolumeRequest")
    public JAXBElement<CreateVolumeRequest> createCreateVolumeRequest(CreateVolumeRequest value) {
        return new JAXBElement<CreateVolumeRequest>(_CreateVolumeRequest_QNAME, CreateVolumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteAccountResponse")
    public JAXBElement<DeleteAccountResponse> createDeleteAccountResponse(DeleteAccountResponse value) {
        return new JAXBElement<DeleteAccountResponse>(_DeleteAccountResponse_QNAME, DeleteAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UpdateDeviceStatusResponse")
    public JAXBElement<UpdateDeviceStatusResponse> createUpdateDeviceStatusResponse(UpdateDeviceStatusResponse value) {
        return new JAXBElement<UpdateDeviceStatusResponse>(_UpdateDeviceStatusResponse_QNAME, UpdateDeviceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyZimletRequest")
    public JAXBElement<ModifyZimletRequest> createModifyZimletRequest(ModifyZimletRequest value) {
        return new JAXBElement<ModifyZimletRequest>(_ModifyZimletRequest_QNAME, ModifyZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableArchiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DisableArchiveRequest")
    public JAXBElement<DisableArchiveRequest> createDisableArchiveRequest(DisableArchiveRequest value) {
        return new JAXBElement<DisableArchiveRequest>(_DisableArchiveRequest_QNAME, DisableArchiveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAccountsRequest")
    public JAXBElement<GetAllAccountsRequest> createGetAllAccountsRequest(GetAllAccountsRequest value) {
        return new JAXBElement<GetAllAccountsRequest>(_GetAllAccountsRequest_QNAME, GetAllAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUCServicesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllUCServicesRequest")
    public JAXBElement<GetAllUCServicesRequest> createGetAllUCServicesRequest(GetAllUCServicesRequest value) {
        return new JAXBElement<GetAllUCServicesRequest>(_GetAllUCServicesRequest_QNAME, GetAllUCServicesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadLocalConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadLocalConfigRequest")
    public JAXBElement<ReloadLocalConfigRequest> createReloadLocalConfigRequest(ReloadLocalConfigRequest value) {
        return new JAXBElement<ReloadLocalConfigRequest>(_ReloadLocalConfigRequest_QNAME, ReloadLocalConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGalSyncAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateGalSyncAccountRequest")
    public JAXBElement<CreateGalSyncAccountRequest> createCreateGalSyncAccountRequest(CreateGalSyncAccountRequest value) {
        return new JAXBElement<CreateGalSyncAccountRequest>(_CreateGalSyncAccountRequest_QNAME, CreateGalSyncAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetRightResponse")
    public JAXBElement<GetRightResponse> createGetRightResponse(GetRightResponse value) {
        return new JAXBElement<GetRightResponse>(_GetRightResponse_QNAME, GetRightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDistributionListAliasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDistributionListAliasRequest")
    public JAXBElement<RemoveDistributionListAliasRequest> createRemoveDistributionListAliasRequest(RemoveDistributionListAliasRequest value) {
        return new JAXBElement<RemoveDistributionListAliasRequest>(_RemoveDistributionListAliasRequest_QNAME, RemoveDistributionListAliasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReIndexRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReIndexRequest")
    public JAXBElement<ReIndexRequest> createReIndexRequest(ReIndexRequest value) {
        return new JAXBElement<ReIndexRequest>(_ReIndexRequest_QNAME, ReIndexRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteXMbxSearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteXMbxSearchResponse")
    public JAXBElement<DeleteXMbxSearchResponse> createDeleteXMbxSearchResponse(DeleteXMbxSearchResponse value) {
        return new JAXBElement<DeleteXMbxSearchResponse>(_DeleteXMbxSearchResponse_QNAME, DeleteXMbxSearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyIndexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyIndexResponse")
    public JAXBElement<VerifyIndexResponse> createVerifyIndexResponse(VerifyIndexResponse value) {
        return new JAXBElement<VerifyIndexResponse>(_VerifyIndexResponse_QNAME, VerifyIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZimletStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetZimletStatusResponse")
    public JAXBElement<GetZimletStatusResponse> createGetZimletStatusResponse(GetZimletStatusResponse value) {
        return new JAXBElement<GetZimletStatusResponse>(_GetZimletStatusResponse_QNAME, GetZimletStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ResumeDeviceResponse")
    public JAXBElement<ResumeDeviceResponse> createResumeDeviceResponse(ResumeDeviceResponse value) {
        return new JAXBElement<ResumeDeviceResponse>(_ResumeDeviceResponse_QNAME, ResumeDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplianceHSMFSRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetApplianceHSMFSRequest")
    public JAXBElement<GetApplianceHSMFSRequest> createGetApplianceHSMFSRequest(GetApplianceHSMFSRequest value) {
        return new JAXBElement<GetApplianceHSMFSRequest>(_GetApplianceHSMFSRequest_QNAME, GetApplianceHSMFSRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDistributionListMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddDistributionListMemberResponse")
    public JAXBElement<AddDistributionListMemberResponse> createAddDistributionListMemberResponse(AddDistributionListMemberResponse value) {
        return new JAXBElement<AddDistributionListMemberResponse>(_AddDistributionListMemberResponse_QNAME, AddDistributionListMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDirectoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckDirectoryRequest")
    public JAXBElement<CheckDirectoryRequest> createCheckDirectoryRequest(CheckDirectoryRequest value) {
        return new JAXBElement<CheckDirectoryRequest>(_CheckDirectoryRequest_QNAME, CheckDirectoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyCertKeyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyCertKeyRequest")
    public JAXBElement<VerifyCertKeyRequest> createVerifyCertKeyRequest(VerifyCertKeyRequest value) {
        return new JAXBElement<VerifyCertKeyRequest>(_VerifyCertKeyRequest_QNAME, VerifyCertKeyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupResponse")
    public JAXBElement<BackupResponse> createBackupResponse(BackupResponse value) {
        return new JAXBElement<BackupResponse>(_BackupResponse_QNAME, BackupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAutoProvDirectoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchAutoProvDirectoryRequest")
    public JAXBElement<SearchAutoProvDirectoryRequest> createSearchAutoProvDirectoryRequest(SearchAutoProvDirectoryRequest value) {
        return new JAXBElement<SearchAutoProvDirectoryRequest>(_SearchAutoProvDirectoryRequest_QNAME, SearchAutoProvDirectoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDelegatedAdminConstraintsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDelegatedAdminConstraintsResponse")
    public JAXBElement<GetDelegatedAdminConstraintsResponse> createGetDelegatedAdminConstraintsResponse(GetDelegatedAdminConstraintsResponse value) {
        return new JAXBElement<GetDelegatedAdminConstraintsResponse>(_GetDelegatedAdminConstraintsResponse_QNAME, GetDelegatedAdminConstraintsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVolumeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetVolumeRequest")
    public JAXBElement<GetVolumeRequest> createGetVolumeRequest(GetVolumeRequest value) {
        return new JAXBElement<GetVolumeRequest>(_GetVolumeRequest_QNAME, GetVolumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnloadMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UnloadMailboxResponse")
    public JAXBElement<UnloadMailboxResponse> createUnloadMailboxResponse(UnloadMailboxResponse value) {
        return new JAXBElement<UnloadMailboxResponse>(_UnloadMailboxResponse_QNAME, UnloadMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUCServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteUCServiceRequest")
    public JAXBElement<DeleteUCServiceRequest> createDeleteUCServiceRequest(DeleteUCServiceRequest value) {
        return new JAXBElement<DeleteUCServiceRequest>(_DeleteUCServiceRequest_QNAME, DeleteUCServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetRightRequest")
    public JAXBElement<GetRightRequest> createGetRightRequest(GetRightRequest value) {
        return new JAXBElement<GetRightRequest>(_GetRightRequest_QNAME, GetRightRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCompleteGalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoCompleteGalRequest")
    public JAXBElement<AutoCompleteGalRequest> createAutoCompleteGalRequest(AutoCompleteGalRequest value) {
        return new JAXBElement<AutoCompleteGalRequest>(_AutoCompleteGalRequest_QNAME, AutoCompleteGalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEffectiveRightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllEffectiveRightsResponse")
    public JAXBElement<GetAllEffectiveRightsResponse> createGetAllEffectiveRightsResponse(GetAllEffectiveRightsResponse value) {
        return new JAXBElement<GetAllEffectiveRightsResponse>(_GetAllEffectiveRightsResponse_QNAME, GetAllEffectiveRightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionListInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "dl")
    public JAXBElement<DistributionListInfo> createDl(DistributionListInfo value) {
        return new JAXBElement<DistributionListInfo>(_Dl_QNAME, DistributionListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProxyCARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UploadProxyCARequest")
    public JAXBElement<UploadProxyCARequest> createUploadProxyCARequest(UploadProxyCARequest value) {
        return new JAXBElement<UploadProxyCARequest>(_UploadProxyCARequest_QNAME, UploadProxyCARequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVolumeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteVolumeRequest")
    public JAXBElement<DeleteVolumeRequest> createDeleteVolumeRequest(DeleteVolumeRequest value) {
        return new JAXBElement<DeleteVolumeRequest>(_DeleteVolumeRequest_QNAME, DeleteVolumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminExtensionZimletsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminExtensionZimletsResponse")
    public JAXBElement<GetAdminExtensionZimletsResponse> createGetAdminExtensionZimletsResponse(GetAdminExtensionZimletsResponse value) {
        return new JAXBElement<GetAdminExtensionZimletsResponse>(_GetAdminExtensionZimletsResponse_QNAME, GetAdminExtensionZimletsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSystemRetentionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteSystemRetentionPolicyResponse")
    public JAXBElement<DeleteSystemRetentionPolicyResponse> createDeleteSystemRetentionPolicyResponse(DeleteSystemRetentionPolicyResponse value) {
        return new JAXBElement<DeleteSystemRetentionPolicyResponse>(_DeleteSystemRetentionPolicyResponse_QNAME, DeleteSystemRetentionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryWaitSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "QueryWaitSetResponse")
    public JAXBElement<QueryWaitSetResponse> createQueryWaitSetResponse(QueryWaitSetResponse value) {
        return new JAXBElement<QueryWaitSetResponse>(_QueryWaitSetResponse_QNAME, QueryWaitSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePresenceSessionIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UpdatePresenceSessionIdResponse")
    public JAXBElement<UpdatePresenceSessionIdResponse> createUpdatePresenceSessionIdResponse(UpdatePresenceSessionIdResponse value) {
        return new JAXBElement<UpdatePresenceSessionIdResponse>(_UpdatePresenceSessionIdResponse_QNAME, UpdatePresenceSessionIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateAuthRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DelegateAuthRequest")
    public JAXBElement<DelegateAuthRequest> createDelegateAuthRequest(DelegateAuthRequest value) {
        return new JAXBElement<DelegateAuthRequest>(_DelegateAuthRequest_QNAME, DelegateAuthRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAggregateQuotaUsageOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAggregateQuotaUsageOnServerResponse")
    public JAXBElement<GetAggregateQuotaUsageOnServerResponse> createGetAggregateQuotaUsageOnServerResponse(GetAggregateQuotaUsageOnServerResponse value) {
        return new JAXBElement<GetAggregateQuotaUsageOnServerResponse>(_GetAggregateQuotaUsageOnServerResponse_QNAME, GetAggregateQuotaUsageOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDistributionListsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllDistributionListsRequest")
    public JAXBElement<GetAllDistributionListsRequest> createGetAllDistributionListsRequest(GetAllDistributionListsRequest value) {
        return new JAXBElement<GetAllDistributionListsRequest>(_GetAllDistributionListsRequest_QNAME, GetAllDistributionListsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCSRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCSRResponse")
    public JAXBElement<GetCSRResponse> createGetCSRResponse(GetCSRResponse value) {
        return new JAXBElement<GetCSRResponse>(_GetCSRResponse_QNAME, GetCSRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountSinceLastUsedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountSinceLastUsedResponse")
    public JAXBElement<GetDevicesCountSinceLastUsedResponse> createGetDevicesCountSinceLastUsedResponse(GetDevicesCountSinceLastUsedResponse value) {
        return new JAXBElement<GetDevicesCountSinceLastUsedResponse>(_GetDevicesCountSinceLastUsedResponse_QNAME, GetDevicesCountSinceLastUsedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLicenseInfoResponse")
    public JAXBElement<GetLicenseInfoResponse> createGetLicenseInfoResponse(GetLicenseInfoResponse value) {
        return new JAXBElement<GetLicenseInfoResponse>(_GetLicenseInfoResponse_QNAME, GetLicenseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerRequest")
    public JAXBElement<GetServerRequest> createGetServerRequest(GetServerRequest value) {
        return new JAXBElement<GetServerRequest>(_GetServerRequest_QNAME, GetServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZimletStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetZimletStatusRequest")
    public JAXBElement<GetZimletStatusRequest> createGetZimletStatusRequest(GetZimletStatusRequest value) {
        return new JAXBElement<GetZimletStatusRequest>(_GetZimletStatusRequest_QNAME, GetZimletStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDistributionListAliasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDistributionListAliasResponse")
    public JAXBElement<RemoveDistributionListAliasResponse> createRemoveDistributionListAliasResponse(RemoveDistributionListAliasResponse value) {
        return new JAXBElement<RemoveDistributionListAliasResponse>(_RemoveDistributionListAliasResponse_QNAME, RemoveDistributionListAliasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRightRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckRightRequest")
    public JAXBElement<CheckRightRequest> createCheckRightRequest(CheckRightRequest value) {
        return new JAXBElement<CheckRightRequest>(_CheckRightRequest_QNAME, CheckRightRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarTZRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarTZRequest")
    public JAXBElement<FixCalendarTZRequest> createFixCalendarTZRequest(FixCalendarTZRequest value) {
        return new JAXBElement<FixCalendarTZRequest>(_FixCalendarTZRequest_QNAME, FixCalendarTZRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxRequest")
    public JAXBElement<GetMailboxRequest> createGetMailboxRequest(GetMailboxRequest value) {
        return new JAXBElement<GetMailboxRequest>(_GetMailboxRequest_QNAME, GetMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSystemRetentionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateSystemRetentionPolicyResponse")
    public JAXBElement<CreateSystemRetentionPolicyResponse> createCreateSystemRetentionPolicyResponse(CreateSystemRetentionPolicyResponse value) {
        return new JAXBElement<CreateSystemRetentionPolicyResponse>(_CreateSystemRetentionPolicyResponse_QNAME, CreateSystemRetentionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLocalServerOnlineRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetLocalServerOnlineRequest")
    public JAXBElement<SetLocalServerOnlineRequest> createSetLocalServerOnlineRequest(SetLocalServerOnlineRequest value) {
        return new JAXBElement<SetLocalServerOnlineRequest>(_SetLocalServerOnlineRequest_QNAME, SetLocalServerOnlineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlwaysOnClusterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateAlwaysOnClusterResponse")
    public JAXBElement<CreateAlwaysOnClusterResponse> createCreateAlwaysOnClusterResponse(CreateAlwaysOnClusterResponse value) {
        return new JAXBElement<CreateAlwaysOnClusterResponse>(_CreateAlwaysOnClusterResponse_QNAME, CreateAlwaysOnClusterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxVolumesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxVolumesRequest")
    public JAXBElement<GetMailboxVolumesRequest> createGetMailboxVolumesRequest(GetMailboxVolumesRequest value) {
        return new JAXBElement<GetMailboxVolumesRequest>(_GetMailboxVolumesRequest_QNAME, GetMailboxVolumesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateServerRequest")
    public JAXBElement<CreateServerRequest> createCreateServerRequest(CreateServerRequest value) {
        return new JAXBElement<CreateServerRequest>(_CreateServerRequest_QNAME, CreateServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetConfigRequest")
    public JAXBElement<GetConfigRequest> createGetConfigRequest(GetConfigRequest value) {
        return new JAXBElement<GetConfigRequest>(_GetConfigRequest_QNAME, GetConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarEndTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarEndTimeResponse")
    public JAXBElement<FixCalendarEndTimeResponse> createFixCalendarEndTimeResponse(FixCalendarEndTimeResponse value) {
        return new JAXBElement<FixCalendarEndTimeResponse>(_FixCalendarEndTimeResponse_QNAME, FixCalendarEndTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGalConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckGalConfigRequest")
    public JAXBElement<CheckGalConfigRequest> createCheckGalConfigRequest(CheckGalConfigRequest value) {
        return new JAXBElement<CheckGalConfigRequest>(_CheckGalConfigRequest_QNAME, CheckGalConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDistributionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDistributionListResponse")
    public JAXBElement<DeleteDistributionListResponse> createDeleteDistributionListResponse(DeleteDistributionListResponse value) {
        return new JAXBElement<DeleteDistributionListResponse>(_DeleteDistributionListResponse_QNAME, DeleteDistributionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteServerResponse")
    public JAXBElement<DeleteServerResponse> createDeleteServerResponse(DeleteServerResponse value) {
        return new JAXBElement<DeleteServerResponse>(_DeleteServerResponse_QNAME, DeleteServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyVolumeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyVolumeRequest")
    public JAXBElement<ModifyVolumeRequest> createModifyVolumeRequest(ModifyVolumeRequest value) {
        return new JAXBElement<ModifyVolumeRequest>(_ModifyVolumeRequest_QNAME, ModifyVolumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreateObjectAttrsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCreateObjectAttrsResponse")
    public JAXBElement<GetCreateObjectAttrsResponse> createGetCreateObjectAttrsResponse(GetCreateObjectAttrsResponse value) {
        return new JAXBElement<GetCreateObjectAttrsResponse>(_GetCreateObjectAttrsResponse_QNAME, GetCreateObjectAttrsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDistributionListMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDistributionListMemberResponse")
    public JAXBElement<RemoveDistributionListMemberResponse> createRemoveDistributionListMemberResponse(RemoveDistributionListMemberResponse value) {
        return new JAXBElement<RemoveDistributionListMemberResponse>(_RemoveDistributionListMemberResponse_QNAME, RemoveDistributionListMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteCosRequest")
    public JAXBElement<DeleteCosRequest> createDeleteCosRequest(DeleteCosRequest value) {
        return new JAXBElement<DeleteCosRequest>(_DeleteCosRequest_QNAME, DeleteCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIndexStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetIndexStatsResponse")
    public JAXBElement<GetIndexStatsResponse> createGetIndexStatsResponse(GetIndexStatsResponse value) {
        return new JAXBElement<GetIndexStatsResponse>(_GetIndexStatsResponse_QNAME, GetIndexStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailQueueInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailQueueInfoResponse")
    public JAXBElement<GetMailQueueInfoResponse> createGetMailQueueInfoResponse(GetMailQueueInfoResponse value) {
        return new JAXBElement<GetMailQueueInfoResponse>(_GetMailQueueInfoResponse_QNAME, GetMailQueueInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockoutMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "LockoutMailboxResponse")
    public JAXBElement<LockoutMailboxResponse> createLockoutMailboxResponse(LockoutMailboxResponse value) {
        return new JAXBElement<LockoutMailboxResponse>(_LockoutMailboxResponse_QNAME, LockoutMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameCalendarResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameCalendarResourceResponse")
    public JAXBElement<RenameCalendarResourceResponse> createRenameCalendarResourceResponse(RenameCalendarResourceResponse value) {
        return new JAXBElement<RenameCalendarResourceResponse>(_RenameCalendarResourceResponse_QNAME, RenameCalendarResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteMailboxRequest")
    public JAXBElement<DeleteMailboxRequest> createDeleteMailboxRequest(DeleteMailboxRequest value) {
        return new JAXBElement<DeleteMailboxRequest>(_DeleteMailboxRequest_QNAME, DeleteMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallCertRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "InstallCertRequest")
    public JAXBElement<InstallCertRequest> createInstallCertRequest(InstallCertRequest value) {
        return new JAXBElement<InstallCertRequest>(_InstallCertRequest_QNAME, InstallCertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeMovedMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeMovedMailboxRequest")
    public JAXBElement<PurgeMovedMailboxRequest> createPurgeMovedMailboxRequest(PurgeMovedMailboxRequest value) {
        return new JAXBElement<PurgeMovedMailboxRequest>(_PurgeMovedMailboxRequest_QNAME, PurgeMovedMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountRequest")
    public JAXBElement<GetDevicesCountRequest> createGetDevicesCountRequest(GetDevicesCountRequest value) {
        return new JAXBElement<GetDevicesCountRequest>(_GetDevicesCountRequest_QNAME, GetDevicesCountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameUCServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameUCServiceRequest")
    public JAXBElement<RenameUCServiceRequest> createRenameUCServiceRequest(RenameUCServiceRequest value) {
        return new JAXBElement<RenameUCServiceRequest>(_RenameUCServiceRequest_QNAME, RenameUCServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckExchangeAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckExchangeAuthResponse")
    public JAXBElement<CheckExchangeAuthResponse> createCheckExchangeAuthResponse(CheckExchangeAuthResponse value) {
        return new JAXBElement<CheckExchangeAuthResponse>(_CheckExchangeAuthResponse_QNAME, CheckExchangeAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoProvTaskControlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoProvTaskControlRequest")
    public JAXBElement<AutoProvTaskControlRequest> createAutoProvTaskControlRequest(AutoProvTaskControlRequest value) {
        return new JAXBElement<AutoProvTaskControlRequest>(_AutoProvTaskControlRequest_QNAME, AutoProvTaskControlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHostnameResolveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckHostnameResolveResponse")
    public JAXBElement<CheckHostnameResolveResponse> createCheckHostnameResolveResponse(CheckHostnameResolveResponse value) {
        return new JAXBElement<CheckHostnameResolveResponse>(_CheckHostnameResolveResponse_QNAME, CheckHostnameResolveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RolloverRedoLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RolloverRedoLogResponse")
    public JAXBElement<RolloverRedoLogResponse> createRolloverRedoLogResponse(RolloverRedoLogResponse value) {
        return new JAXBElement<RolloverRedoLogResponse>(_RolloverRedoLogResponse_QNAME, RolloverRedoLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeAccountCalendarCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeAccountCalendarCacheResponse")
    public JAXBElement<PurgeAccountCalendarCacheResponse> createPurgeAccountCalendarCacheResponse(PurgeAccountCalendarCacheResponse value) {
        return new JAXBElement<PurgeAccountCalendarCacheResponse>(_PurgeAccountCalendarCacheResponse_QNAME, PurgeAccountCalendarCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCookieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ClearCookieResponse")
    public JAXBElement<ClearCookieResponse> createClearCookieResponse(ClearCookieResponse value) {
        return new JAXBElement<ClearCookieResponse>(_ClearCookieResponse_QNAME, ClearCookieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHsmStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetHsmStatusResponse")
    public JAXBElement<GetHsmStatusResponse> createGetHsmStatusResponse(GetHsmStatusResponse value) {
        return new JAXBElement<GetHsmStatusResponse>(_GetHsmStatusResponse_QNAME, GetHsmStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyUCServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyUCServiceResponse")
    public JAXBElement<ModifyUCServiceResponse> createModifyUCServiceResponse(ModifyUCServiceResponse value) {
        return new JAXBElement<ModifyUCServiceResponse>(_ModifyUCServiceResponse_QNAME, ModifyUCServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLDAPEntryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyLDAPEntryRequest")
    public JAXBElement<ModifyLDAPEntryRequest> createModifyLDAPEntryRequest(ModifyLDAPEntryRequest value) {
        return new JAXBElement<ModifyLDAPEntryRequest>(_ModifyLDAPEntryRequest_QNAME, ModifyLDAPEntryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompactIndexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CompactIndexResponse")
    public JAXBElement<CompactIndexResponse> createCompactIndexResponse(CompactIndexResponse value) {
        return new JAXBElement<CompactIndexResponse>(_CompactIndexResponse_QNAME, CompactIndexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameDistributionListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameDistributionListRequest")
    public JAXBElement<RenameDistributionListRequest> createRenameDistributionListRequest(RenameDistributionListRequest value) {
        return new JAXBElement<RenameDistributionListRequest>(_RenameDistributionListRequest_QNAME, RenameDistributionListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameDistributionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameDistributionListResponse")
    public JAXBElement<RenameDistributionListResponse> createRenameDistributionListResponse(RenameDistributionListResponse value) {
        return new JAXBElement<RenameDistributionListResponse>(_RenameDistributionListResponse_QNAME, RenameDistributionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DedupeBlobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DedupeBlobsResponse")
    public JAXBElement<DedupeBlobsResponse> createDedupeBlobsResponse(DedupeBlobsResponse value) {
        return new JAXBElement<DedupeBlobsResponse>(_DedupeBlobsResponse_QNAME, DedupeBlobsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDistributionListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDistributionListRequest")
    public JAXBElement<CreateDistributionListRequest> createCreateDistributionListRequest(CreateDistributionListRequest value) {
        return new JAXBElement<CreateDistributionListRequest>(_CreateDistributionListRequest_QNAME, CreateDistributionListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeAccountCalendarCacheRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeAccountCalendarCacheRequest")
    public JAXBElement<PurgeAccountCalendarCacheRequest> createPurgeAccountCalendarCacheRequest(PurgeAccountCalendarCacheRequest value) {
        return new JAXBElement<PurgeAccountCalendarCacheRequest>(_PurgeAccountCalendarCacheRequest_QNAME, PurgeAccountCalendarCacheRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCalendarResourcesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllCalendarResourcesRequest")
    public JAXBElement<GetAllCalendarResourcesRequest> createGetAllCalendarResourcesRequest(GetAllCalendarResourcesRequest value) {
        return new JAXBElement<GetAllCalendarResourcesRequest>(_GetAllCalendarResourcesRequest_QNAME, GetAllCalendarResourcesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleBackupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ScheduleBackupsResponse")
    public JAXBElement<ScheduleBackupsResponse> createScheduleBackupsResponse(ScheduleBackupsResponse value) {
        return new JAXBElement<ScheduleBackupsResponse>(_ScheduleBackupsResponse_QNAME, ScheduleBackupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameLDAPEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameLDAPEntryResponse")
    public JAXBElement<RenameLDAPEntryResponse> createRenameLDAPEntryResponse(RenameLDAPEntryResponse value) {
        return new JAXBElement<RenameLDAPEntryResponse>(_RenameLDAPEntryResponse_QNAME, RenameLDAPEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeBusyQueueInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetFreeBusyQueueInfoResponse")
    public JAXBElement<GetFreeBusyQueueInfoResponse> createGetFreeBusyQueueInfoResponse(GetFreeBusyQueueInfoResponse value) {
        return new JAXBElement<GetFreeBusyQueueInfoResponse>(_GetFreeBusyQueueInfoResponse_QNAME, GetFreeBusyQueueInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailoverClusterServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FailoverClusterServiceResponse")
    public JAXBElement<FailoverClusterServiceResponse> createFailoverClusterServiceResponse(FailoverClusterServiceResponse value) {
        return new JAXBElement<FailoverClusterServiceResponse>(_FailoverClusterServiceResponse_QNAME, FailoverClusterServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLicenseInfoRequest")
    public JAXBElement<GetLicenseInfoRequest> createGetLicenseInfoRequest(GetLicenseInfoRequest value) {
        return new JAXBElement<GetLicenseInfoRequest>(_GetLicenseInfoRequest_QNAME, GetLicenseInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "domain")
    public JAXBElement<DomainInfo> createDomain(DomainInfo value) {
        return new JAXBElement<DomainInfo>(_Domain_QNAME, DomainInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEffectiveRightsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetEffectiveRightsRequest")
    public JAXBElement<GetEffectiveRightsRequest> createGetEffectiveRightsRequest(GetEffectiveRightsRequest value) {
        return new JAXBElement<GetEffectiveRightsRequest>(_GetEffectiveRightsRequest_QNAME, GetEffectiveRightsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateXMPPComponentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateXMPPComponentRequest")
    public JAXBElement<CreateXMPPComponentRequest> createCreateXMPPComponentRequest(CreateXMPPComponentRequest value) {
        return new JAXBElement<CreateXMPPComponentRequest>(_CreateXMPPComponentRequest_QNAME, CreateXMPPComponentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSessionsResponse")
    public JAXBElement<GetSessionsResponse> createGetSessionsResponse(GetSessionsResponse value) {
        return new JAXBElement<GetSessionsResponse>(_GetSessionsResponse_QNAME, GetSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarTZResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarTZResponse")
    public JAXBElement<FixCalendarTZResponse> createFixCalendarTZResponse(FixCalendarTZResponse value) {
        return new JAXBElement<FixCalendarTZResponse>(_FixCalendarTZResponse_QNAME, FixCalendarTZResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShareInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetShareInfoResponse")
    public JAXBElement<GetShareInfoResponse> createGetShareInfoResponse(GetShareInfoResponse value) {
        return new JAXBElement<GetShareInfoResponse>(_GetShareInfoResponse_QNAME, GetShareInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttributeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAttributeInfoResponse")
    public JAXBElement<GetAttributeInfoResponse> createGetAttributeInfoResponse(GetAttributeInfoResponse value) {
        return new JAXBElement<GetAttributeInfoResponse>(_GetAttributeInfoResponse_QNAME, GetAttributeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCertResponse")
    public JAXBElement<GetCertResponse> createGetCertResponse(GetCertResponse value) {
        return new JAXBElement<GetCertResponse>(_GetCertResponse_QNAME, GetCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDomainsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllDomainsRequest")
    public JAXBElement<GetAllDomainsRequest> createGetAllDomainsRequest(GetAllDomainsRequest value) {
        return new JAXBElement<GetAllDomainsRequest>(_GetAllDomainsRequest_QNAME, GetAllDomainsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpSessionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DumpSessionsRequest")
    public JAXBElement<DumpSessionsRequest> createDumpSessionsRequest(DumpSessionsRequest value) {
        return new JAXBElement<DumpSessionsRequest>(_DumpSessionsRequest_QNAME, DumpSessionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyStoreManagerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyStoreManagerRequest")
    public JAXBElement<VerifyStoreManagerRequest> createVerifyStoreManagerRequest(VerifyStoreManagerRequest value) {
        return new JAXBElement<VerifyStoreManagerRequest>(_VerifyStoreManagerRequest_QNAME, VerifyStoreManagerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCosRequest")
    public JAXBElement<GetCosRequest> createGetCosRequest(GetCosRequest value) {
        return new JAXBElement<GetCosRequest>(_GetCosRequest_QNAME, GetCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCalendarResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteCalendarResourceResponse")
    public JAXBElement<DeleteCalendarResourceResponse> createDeleteCalendarResourceResponse(DeleteCalendarResourceResponse value) {
        return new JAXBElement<DeleteCalendarResourceResponse>(_DeleteCalendarResourceResponse_QNAME, DeleteCalendarResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSkinsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllSkinsResponse")
    public JAXBElement<GetAllSkinsResponse> createGetAllSkinsResponse(GetAllSkinsResponse value) {
        return new JAXBElement<GetAllSkinsResponse>(_GetAllSkinsResponse_QNAME, GetAllSkinsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleBackupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ScheduleBackupsRequest")
    public JAXBElement<ScheduleBackupsRequest> createScheduleBackupsRequest(ScheduleBackupsRequest value) {
        return new JAXBElement<ScheduleBackupsRequest>(_ScheduleBackupsRequest_QNAME, ScheduleBackupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDomainMXRecordRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckDomainMXRecordRequest")
    public JAXBElement<CheckDomainMXRecordRequest> createCheckDomainMXRecordRequest(CheckDomainMXRecordRequest value) {
        return new JAXBElement<CheckDomainMXRecordRequest>(_CheckDomainMXRecordRequest_QNAME, CheckDomainMXRecordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoCompleteGalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoCompleteGalResponse")
    public JAXBElement<AutoCompleteGalResponse> createAutoCompleteGalResponse(AutoCompleteGalResponse value) {
        return new JAXBElement<AutoCompleteGalResponse>(_AutoCompleteGalResponse_QNAME, AutoCompleteGalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAccountLoggerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddAccountLoggerRequest")
    public JAXBElement<AddAccountLoggerRequest> createAddAccountLoggerRequest(AddAccountLoggerRequest value) {
        return new JAXBElement<AddAccountLoggerRequest>(_AddAccountLoggerRequest_QNAME, AddAccountLoggerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentVolumeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetCurrentVolumeRequest")
    public JAXBElement<SetCurrentVolumeRequest> createSetCurrentVolumeRequest(SetCurrentVolumeRequest value) {
        return new JAXBElement<SetCurrentVolumeRequest>(_SetCurrentVolumeRequest_QNAME, SetCurrentVolumeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountLoggersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAccountLoggersResponse")
    public JAXBElement<GetAllAccountLoggersResponse> createGetAllAccountLoggersResponse(GetAllAccountLoggersResponse value) {
        return new JAXBElement<GetAllAccountLoggersResponse>(_GetAllAccountLoggersResponse_QNAME, GetAllAccountLoggersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeviceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDeviceStatusRequest")
    public JAXBElement<GetDeviceStatusRequest> createGetDeviceStatusRequest(GetDeviceStatusRequest value) {
        return new JAXBElement<GetDeviceStatusRequest>(_GetDeviceStatusRequest_QNAME, GetDeviceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSystemRetentionPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateSystemRetentionPolicyRequest")
    public JAXBElement<CreateSystemRetentionPolicyRequest> createCreateSystemRetentionPolicyRequest(CreateSystemRetentionPolicyRequest value) {
        return new JAXBElement<CreateSystemRetentionPolicyRequest>(_CreateSystemRetentionPolicyRequest_QNAME, CreateSystemRetentionPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxResponse")
    public JAXBElement<GetMailboxResponse> createGetMailboxResponse(GetMailboxResponse value) {
        return new JAXBElement<GetMailboxResponse>(_GetMailboxResponse_QNAME, GetMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAttributeInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAttributeInfoRequest")
    public JAXBElement<GetAttributeInfoRequest> createGetAttributeInfoRequest(GetAttributeInfoRequest value) {
        return new JAXBElement<GetAttributeInfoRequest>(_GetAttributeInfoRequest_QNAME, GetAttributeInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDataSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDataSourceRequest")
    public JAXBElement<DeleteDataSourceRequest> createDeleteDataSourceRequest(DeleteDataSourceRequest value) {
        return new JAXBElement<DeleteDataSourceRequest>(_DeleteDataSourceRequest_QNAME, DeleteDataSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLDAPEntriesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLDAPEntriesRequest")
    public JAXBElement<GetLDAPEntriesRequest> createGetLDAPEntriesRequest(GetLDAPEntriesRequest value) {
        return new JAXBElement<GetLDAPEntriesRequest>(_GetLDAPEntriesRequest_QNAME, GetLDAPEntriesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxStatsResponse")
    public JAXBElement<GetMailboxStatsResponse> createGetMailboxStatsResponse(GetMailboxStatsResponse value) {
        return new JAXBElement<GetMailboxStatsResponse>(_GetMailboxStatsResponse_QNAME, GetMailboxStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeMessagesResponse")
    public JAXBElement<PurgeMessagesResponse> createPurgeMessagesResponse(PurgeMessagesResponse value) {
        return new JAXBElement<PurgeMessagesResponse>(_PurgeMessagesResponse_QNAME, PurgeMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRightsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllRightsRequest")
    public JAXBElement<GetAllRightsRequest> createGetAllRightsRequest(GetAllRightsRequest value) {
        return new JAXBElement<GetAllRightsRequest>(_GetAllRightsRequest_QNAME, GetAllRightsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeployZimletRequest")
    public JAXBElement<DeployZimletRequest> createDeployZimletRequest(DeployZimletRequest value) {
        return new JAXBElement<DeployZimletRequest>(_DeployZimletRequest_QNAME, DeployZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxVolumesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxVolumesResponse")
    public JAXBElement<GetMailboxVolumesResponse> createGetMailboxVolumesResponse(GetMailboxVolumesResponse value) {
        return new JAXBElement<GetMailboxVolumesResponse>(_GetMailboxVolumesResponse_QNAME, GetMailboxVolumesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLocalServerOnlineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetLocalServerOnlineResponse")
    public JAXBElement<SetLocalServerOnlineResponse> createSetLocalServerOnlineResponse(SetLocalServerOnlineResponse value) {
        return new JAXBElement<SetLocalServerOnlineResponse>(_SetLocalServerOnlineResponse_QNAME, SetLocalServerOnlineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllZimletsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllZimletsRequest")
    public JAXBElement<GetAllZimletsRequest> createGetAllZimletsRequest(GetAllZimletsRequest value) {
        return new JAXBElement<GetAllZimletsRequest>(_GetAllZimletsRequest_QNAME, GetAllZimletsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUCServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetUCServiceRequest")
    public JAXBElement<GetUCServiceRequest> createGetUCServiceRequest(GetUCServiceRequest value) {
        return new JAXBElement<GetUCServiceRequest>(_GetUCServiceRequest_QNAME, GetUCServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDeviceStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UpdateDeviceStatusRequest")
    public JAXBElement<UpdateDeviceStatusRequest> createUpdateDeviceStatusRequest(UpdateDeviceStatusRequest value) {
        return new JAXBElement<UpdateDeviceStatusRequest>(_UpdateDeviceStatusRequest_QNAME, UpdateDeviceStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemRetentionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSystemRetentionPolicyResponse")
    public JAXBElement<GetSystemRetentionPolicyResponse> createGetSystemRetentionPolicyResponse(GetSystemRetentionPolicyResponse value) {
        return new JAXBElement<GetSystemRetentionPolicyResponse>(_GetSystemRetentionPolicyResponse_QNAME, GetSystemRetentionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupQueryResponse")
    public JAXBElement<BackupQueryResponse> createBackupQueryResponse(BackupQueryResponse value) {
        return new JAXBElement<BackupQueryResponse>(_BackupQueryResponse_QNAME, BackupQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteServerRequest")
    public JAXBElement<DeleteServerRequest> createDeleteServerRequest(DeleteServerRequest value) {
        return new JAXBElement<DeleteServerRequest>(_DeleteServerRequest_QNAME, DeleteServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ExportMailboxRequest")
    public JAXBElement<ExportMailboxRequest> createExportMailboxRequest(ExportMailboxRequest value) {
        return new JAXBElement<ExportMailboxRequest>(_ExportMailboxRequest_QNAME, ExportMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLDAPEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateLDAPEntryResponse")
    public JAXBElement<CreateLDAPEntryResponse> createCreateLDAPEntryResponse(CreateLDAPEntryResponse value) {
        return new JAXBElement<CreateLDAPEntryResponse>(_CreateLDAPEntryResponse_QNAME, CreateLDAPEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPasswordStrengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckPasswordStrengthResponse")
    public JAXBElement<CheckPasswordStrengthResponse> createCheckPasswordStrengthResponse(CheckPasswordStrengthResponse value) {
        return new JAXBElement<CheckPasswordStrengthResponse>(_CheckPasswordStrengthResponse_QNAME, CheckPasswordStrengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDistributionListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDistributionListRequest")
    public JAXBElement<DeleteDistributionListRequest> createDeleteDistributionListRequest(DeleteDistributionListRequest value) {
        return new JAXBElement<DeleteDistributionListRequest>(_DeleteDistributionListRequest_QNAME, DeleteDistributionListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckRightResponse")
    public JAXBElement<CheckRightResponse> createCheckRightResponse(CheckRightResponse value) {
        return new JAXBElement<CheckRightResponse>(_CheckRightResponse_QNAME, CheckRightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllCosResponse")
    public JAXBElement<GetAllCosResponse> createGetAllCosResponse(GetAllCosResponse value) {
        return new JAXBElement<GetAllCosResponse>(_GetAllCosResponse_QNAME, GetAllCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CopyCosResponse")
    public JAXBElement<CopyCosResponse> createCopyCosResponse(CopyCosResponse value) {
        return new JAXBElement<CopyCosResponse>(_CopyCosResponse_QNAME, CopyCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUCServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateUCServiceRequest")
    public JAXBElement<CreateUCServiceRequest> createCreateUCServiceRequest(CreateUCServiceRequest value) {
        return new JAXBElement<CreateUCServiceRequest>(_CreateUCServiceRequest_QNAME, CreateUCServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarPriorityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarPriorityRequest")
    public JAXBElement<FixCalendarPriorityRequest> createFixCalendarPriorityRequest(FixCalendarPriorityRequest value) {
        return new JAXBElement<FixCalendarPriorityRequest>(_FixCalendarPriorityRequest_QNAME, FixCalendarPriorityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountRequest")
    public JAXBElement<GetAccountRequest> createGetAccountRequest(GetAccountRequest value) {
        return new JAXBElement<GetAccountRequest>(_GetAccountRequest_QNAME, GetAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFreeBusyProvidersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllFreeBusyProvidersResponse")
    public JAXBElement<GetAllFreeBusyProvidersResponse> createGetAllFreeBusyProvidersResponse(GetAllFreeBusyProvidersResponse value) {
        return new JAXBElement<GetAllFreeBusyProvidersResponse>(_GetAllFreeBusyProvidersResponse_QNAME, GetAllFreeBusyProvidersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetRightsDocResponse")
    public JAXBElement<GetRightsDocResponse> createGetRightsDocResponse(GetRightsDocResponse value) {
        return new JAXBElement<GetRightsDocResponse>(_GetRightsDocResponse_QNAME, GetRightsDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AuthRequest")
    public JAXBElement<AuthRequest> createAuthRequest(AuthRequest value) {
        return new JAXBElement<AuthRequest>(_AuthRequest_QNAME, AuthRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HsmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "HsmResponse")
    public JAXBElement<HsmResponse> createHsmResponse(HsmResponse value) {
        return new JAXBElement<HsmResponse>(_HsmResponse_QNAME, HsmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCSRRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCSRRequest")
    public JAXBElement<GetCSRRequest> createGetCSRRequest(GetCSRRequest value) {
        return new JAXBElement<GetCSRRequest>(_GetCSRRequest_QNAME, GetCSRRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMailboxMoveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "QueryMailboxMoveRequest")
    public JAXBElement<QueryMailboxMoveRequest> createQueryMailboxMoveRequest(QueryMailboxMoveRequest value) {
        return new JAXBElement<QueryMailboxMoveRequest>(_QueryMailboxMoveRequest_QNAME, QueryMailboxMoveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAutoProvDirectoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchAutoProvDirectoryResponse")
    public JAXBElement<SearchAutoProvDirectoryResponse> createSearchAutoProvDirectoryResponse(SearchAutoProvDirectoryResponse value) {
        return new JAXBElement<SearchAutoProvDirectoryResponse>(_SearchAutoProvDirectoryResponse_QNAME, SearchAutoProvDirectoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecalculateMailboxCountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RecalculateMailboxCountsRequest")
    public JAXBElement<RecalculateMailboxCountsRequest> createRecalculateMailboxCountsRequest(RecalculateMailboxCountsRequest value) {
        return new JAXBElement<RecalculateMailboxCountsRequest>(_RecalculateMailboxCountsRequest_QNAME, RecalculateMailboxCountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveBlobsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MoveBlobsResponse")
    public JAXBElement<MoveBlobsResponse> createMoveBlobsResponse(MoveBlobsResponse value) {
        return new JAXBElement<MoveBlobsResponse>(_MoveBlobsResponse_QNAME, MoveBlobsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMultiMailboxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchMultiMailboxRequest")
    public JAXBElement<SearchMultiMailboxRequest> createSearchMultiMailboxRequest(SearchMultiMailboxRequest value) {
        return new JAXBElement<SearchMultiMailboxRequest>(_SearchMultiMailboxRequest_QNAME, SearchMultiMailboxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunUnitTestsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RunUnitTestsRequest")
    public JAXBElement<RunUnitTestsRequest> createRunUnitTestsRequest(RunUnitTestsRequest value) {
        return new JAXBElement<RunUnitTestsRequest>(_RunUnitTestsRequest_QNAME, RunUnitTestsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailQueueActionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MailQueueActionRequest")
    public JAXBElement<MailQueueActionRequest> createMailQueueActionRequest(MailQueueActionRequest value) {
        return new JAXBElement<MailQueueActionRequest>(_MailQueueActionRequest_QNAME, MailQueueActionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDomainRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDomainRequest")
    public JAXBElement<ModifyDomainRequest> createModifyDomainRequest(ModifyDomainRequest value) {
        return new JAXBElement<ModifyDomainRequest>(_ModifyDomainRequest_QNAME, ModifyDomainRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailQueueActionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MailQueueActionResponse")
    public JAXBElement<MailQueueActionResponse> createMailQueueActionResponse(MailQueueActionResponse value) {
        return new JAXBElement<MailQueueActionResponse>(_MailQueueActionResponse_QNAME, MailQueueActionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemRetentionPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSystemRetentionPolicyRequest")
    public JAXBElement<GetSystemRetentionPolicyRequest> createGetSystemRetentionPolicyRequest(GetSystemRetentionPolicyRequest value) {
        return new JAXBElement<GetSystemRetentionPolicyRequest>(_GetSystemRetentionPolicyRequest_QNAME, GetSystemRetentionPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteXMPPComponentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteXMPPComponentRequest")
    public JAXBElement<DeleteXMPPComponentRequest> createDeleteXMPPComponentRequest(DeleteXMPPComponentRequest value) {
        return new JAXBElement<DeleteXMPPComponentRequest>(_DeleteXMPPComponentRequest_QNAME, DeleteXMPPComponentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminConsoleUICompRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAdminConsoleUICompRequest")
    public JAXBElement<GetAdminConsoleUICompRequest> createGetAdminConsoleUICompRequest(GetAdminConsoleUICompRequest value) {
        return new JAXBElement<GetAdminConsoleUICompRequest>(_GetAdminConsoleUICompRequest_QNAME, GetAdminConsoleUICompRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchAccountsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchAccountsRequest")
    public JAXBElement<SearchAccountsRequest> createSearchAccountsRequest(SearchAccountsRequest value) {
        return new JAXBElement<SearchAccountsRequest>(_SearchAccountsRequest_QNAME, SearchAccountsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SyncGalAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SyncGalAccountResponse")
    public JAXBElement<SyncGalAccountResponse> createSyncGalAccountResponse(SyncGalAccountResponse value) {
        return new JAXBElement<SyncGalAccountResponse>(_SyncGalAccountResponse_QNAME, SyncGalAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllServersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllServersResponse")
    public JAXBElement<GetAllServersResponse> createGetAllServersResponse(GetAllServersResponse value) {
        return new JAXBElement<GetAllServersResponse>(_GetAllServersResponse_QNAME, GetAllServersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAccountLoggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveAccountLoggerResponse")
    public JAXBElement<RemoveAccountLoggerResponse> createRemoveAccountLoggerResponse(RemoveAccountLoggerResponse value) {
        return new JAXBElement<RemoveAccountLoggerResponse>(_RemoveAccountLoggerResponse_QNAME, RemoveAccountLoggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstallLicenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "InstallLicenseResponse")
    public JAXBElement<InstallLicenseResponse> createInstallLicenseResponse(InstallLicenseResponse value) {
        return new JAXBElement<InstallLicenseResponse>(_InstallLicenseResponse_QNAME, InstallLicenseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaUsageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetQuotaUsageResponse")
    public JAXBElement<GetQuotaUsageResponse> createGetQuotaUsageResponse(GetQuotaUsageResponse value) {
        return new JAXBElement<GetQuotaUsageResponse>(_GetQuotaUsageResponse_QNAME, GetQuotaUsageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ConfigureZimletResponse")
    public JAXBElement<ConfigureZimletResponse> createConfigureZimletResponse(ConfigureZimletResponse value) {
        return new JAXBElement<ConfigureZimletResponse>(_ConfigureZimletResponse_QNAME, ConfigureZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailQueueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailQueueResponse")
    public JAXBElement<GetMailQueueResponse> createGetMailQueueResponse(GetMailQueueResponse value) {
        return new JAXBElement<GetMailQueueResponse>(_GetMailQueueResponse_QNAME, GetMailQueueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "server")
    public JAXBElement<ServerInfo> createServer(ServerInfo value) {
        return new JAXBElement<ServerInfo>(_Server_QNAME, ServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMbxSearchesListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetXMbxSearchesListResponse")
    public JAXBElement<GetXMbxSearchesListResponse> createGetXMbxSearchesListResponse(GetXMbxSearchesListResponse value) {
        return new JAXBElement<GetXMbxSearchesListResponse>(_GetXMbxSearchesListResponse_QNAME, GetXMbxSearchesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HsmRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "HsmRequest")
    public JAXBElement<HsmRequest> createHsmRequest(HsmRequest value) {
        return new JAXBElement<HsmRequest>(_HsmRequest_QNAME, HsmRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDistributionListMembershipRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDistributionListMembershipRequest")
    public JAXBElement<GetDistributionListMembershipRequest> createGetDistributionListMembershipRequest(GetDistributionListMembershipRequest value) {
        return new JAXBElement<GetDistributionListMembershipRequest>(_GetDistributionListMembershipRequest_QNAME, GetDistributionListMembershipRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchGalResponse")
    public JAXBElement<SearchGalResponse> createSearchGalResponse(SearchGalResponse value) {
        return new JAXBElement<SearchGalResponse>(_SearchGalResponse_QNAME, SearchGalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySystemRetentionPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifySystemRetentionPolicyResponse")
    public JAXBElement<ModifySystemRetentionPolicyResponse> createModifySystemRetentionPolicyResponse(ModifySystemRetentionPolicyResponse value) {
        return new JAXBElement<ModifySystemRetentionPolicyResponse>(_ModifySystemRetentionPolicyResponse_QNAME, ModifySystemRetentionPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStaleDeviceMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveStaleDeviceMetadataResponse")
    public JAXBElement<RemoveStaleDeviceMetadataResponse> createRemoveStaleDeviceMetadataResponse(RemoveStaleDeviceMetadataResponse value) {
        return new JAXBElement<RemoveStaleDeviceMetadataResponse>(_RemoveStaleDeviceMetadataResponse_QNAME, RemoveStaleDeviceMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelegateAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DelegateAuthResponse")
    public JAXBElement<DelegateAuthResponse> createDelegateAuthResponse(DelegateAuthResponse value) {
        return new JAXBElement<DelegateAuthResponse>(_DelegateAuthResponse_QNAME, DelegateAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataSourcesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDataSourcesResponse")
    public JAXBElement<GetDataSourcesResponse> createGetDataSourcesResponse(GetDataSourcesResponse value) {
        return new JAXBElement<GetDataSourcesResponse>(_GetDataSourcesResponse_QNAME, GetDataSourcesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeBusyQueueInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetFreeBusyQueueInfoRequest")
    public JAXBElement<GetFreeBusyQueueInfoRequest> createGetFreeBusyQueueInfoRequest(GetFreeBusyQueueInfoRequest value) {
        return new JAXBElement<GetFreeBusyQueueInfoRequest>(_GetFreeBusyQueueInfoRequest_QNAME, GetFreeBusyQueueInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLocalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllLocalesResponse")
    public JAXBElement<GetAllLocalesResponse> createGetAllLocalesResponse(GetAllLocalesResponse value) {
        return new JAXBElement<GetAllLocalesResponse>(_GetAllLocalesResponse_QNAME, GetAllLocalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDistributionListsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllDistributionListsResponse")
    public JAXBElement<GetAllDistributionListsResponse> createGetAllDistributionListsResponse(GetAllDistributionListsResponse value) {
        return new JAXBElement<GetAllDistributionListsResponse>(_GetAllDistributionListsResponse_QNAME, GetAllDistributionListsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyIndexRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VerifyIndexRequest")
    public JAXBElement<VerifyIndexRequest> createVerifyIndexRequest(VerifyIndexRequest value) {
        return new JAXBElement<VerifyIndexRequest>(_VerifyIndexRequest_QNAME, VerifyIndexRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAlwaysOnClusterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteAlwaysOnClusterRequest")
    public JAXBElement<DeleteAlwaysOnClusterRequest> createDeleteAlwaysOnClusterRequest(DeleteAlwaysOnClusterRequest value) {
        return new JAXBElement<DeleteAlwaysOnClusterRequest>(_DeleteAlwaysOnClusterRequest_QNAME, DeleteAlwaysOnClusterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCosResponse")
    public JAXBElement<GetCosResponse> createGetCosResponse(GetCosResponse value) {
        return new JAXBElement<GetCosResponse>(_GetCosResponse_QNAME, GetCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStaleDeviceMetadataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveStaleDeviceMetadataRequest")
    public JAXBElement<RemoveStaleDeviceMetadataRequest> createRemoveStaleDeviceMetadataRequest(RemoveStaleDeviceMetadataRequest value) {
        return new JAXBElement<RemoveStaleDeviceMetadataRequest>(_RemoveStaleDeviceMetadataRequest_QNAME, RemoveStaleDeviceMetadataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailboxStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailboxStatsRequest")
    public JAXBElement<GetMailboxStatsRequest> createGetMailboxStatsRequest(GetMailboxStatsRequest value) {
        return new JAXBElement<GetMailboxStatsRequest>(_GetMailboxStatsRequest_QNAME, GetMailboxStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterMailboxMoveOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RegisterMailboxMoveOutResponse")
    public JAXBElement<RegisterMailboxMoveOutResponse> createRegisterMailboxMoveOutResponse(RegisterMailboxMoveOutResponse value) {
        return new JAXBElement<RegisterMailboxMoveOutResponse>(_RegisterMailboxMoveOutResponse_QNAME, RegisterMailboxMoveOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteXMPPComponentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteXMPPComponentResponse")
    public JAXBElement<DeleteXMPPComponentResponse> createDeleteXMPPComponentResponse(DeleteXMPPComponentResponse value) {
        return new JAXBElement<DeleteXMPPComponentResponse>(_DeleteXMPPComponentResponse_QNAME, DeleteXMPPComponentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoProvAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoProvAccountResponse")
    public JAXBElement<AutoProvAccountResponse> createAutoProvAccountResponse(AutoProvAccountResponse value) {
        return new JAXBElement<AutoProvAccountResponse>(_AutoProvAccountResponse_QNAME, AutoProvAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeployZimletRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UndeployZimletRequest")
    public JAXBElement<UndeployZimletRequest> createUndeployZimletRequest(UndeployZimletRequest value) {
        return new JAXBElement<UndeployZimletRequest>(_UndeployZimletRequest_QNAME, UndeployZimletRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeployZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeployZimletResponse")
    public JAXBElement<DeployZimletResponse> createDeployZimletResponse(DeployZimletResponse value) {
        return new JAXBElement<DeployZimletResponse>(_DeployZimletResponse_QNAME, DeployZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEffectiveRightsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllEffectiveRightsRequest")
    public JAXBElement<GetAllEffectiveRightsRequest> createGetAllEffectiveRightsRequest(GetAllEffectiveRightsRequest value) {
        return new JAXBElement<GetAllEffectiveRightsRequest>(_GetAllEffectiveRightsRequest_QNAME, GetAllEffectiveRightsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetServerOfflineRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetServerOfflineRequest")
    public JAXBElement<SetServerOfflineRequest> createSetServerOfflineRequest(SetServerOfflineRequest value) {
        return new JAXBElement<SetServerOfflineRequest>(_SetServerOfflineRequest_QNAME, SetServerOfflineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueueQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "query")
    public JAXBElement<QueueQuery> createQuery(QueueQuery value) {
        return new JAXBElement<QueueQuery>(_Query_QNAME, QueueQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLicenseRequest")
    public JAXBElement<GetLicenseRequest> createGetLicenseRequest(GetLicenseRequest value) {
        return new JAXBElement<GetLicenseRequest>(_GetLicenseRequest_QNAME, GetLicenseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDomainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDomainResponse")
    public JAXBElement<ModifyDomainResponse> createModifyDomainResponse(ModifyDomainResponse value) {
        return new JAXBElement<ModifyDomainResponse>(_ModifyDomainResponse_QNAME, ModifyDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupAccountQueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupAccountQueryRequest")
    public JAXBElement<BackupAccountQueryRequest> createBackupAccountQueryRequest(BackupAccountQueryRequest value) {
        return new JAXBElement<BackupAccountQueryRequest>(_BackupAccountQueryRequest_QNAME, BackupAccountQueryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesRequest")
    public JAXBElement<GetDevicesRequest> createGetDevicesRequest(GetDevicesRequest value) {
        return new JAXBElement<GetDevicesRequest>(_GetDevicesRequest_QNAME, GetDevicesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDistributionListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDistributionListResponse")
    public JAXBElement<ModifyDistributionListResponse> createModifyDistributionListResponse(ModifyDistributionListResponse value) {
        return new JAXBElement<ModifyDistributionListResponse>(_ModifyDistributionListResponse_QNAME, ModifyDistributionListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateArchiveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateArchiveRequest")
    public JAXBElement<CreateArchiveRequest> createCreateArchiveRequest(CreateArchiveRequest value) {
        return new JAXBElement<CreateArchiveRequest>(_CreateArchiveRequest_QNAME, CreateArchiveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDataSourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDataSourceRequest")
    public JAXBElement<CreateDataSourceRequest> createCreateDataSourceRequest(CreateDataSourceRequest value) {
        return new JAXBElement<CreateDataSourceRequest>(_CreateDataSourceRequest_QNAME, CreateDataSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlwaysOnClusterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "alwaysOnCluster")
    public JAXBElement<AlwaysOnClusterInfo> createAlwaysOnCluster(AlwaysOnClusterInfo value) {
        return new JAXBElement<AlwaysOnClusterInfo>(_AlwaysOnCluster_QNAME, AlwaysOnClusterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMPPComponentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetXMPPComponentResponse")
    public JAXBElement<GetXMPPComponentResponse> createGetXMPPComponentResponse(GetXMPPComponentResponse value) {
        return new JAXBElement<GetXMPPComponentResponse>(_GetXMPPComponentResponse_QNAME, GetXMPPComponentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateZimletResponse")
    public JAXBElement<CreateZimletResponse> createCreateZimletResponse(CreateZimletResponse value) {
        return new JAXBElement<CreateZimletResponse>(_CreateZimletResponse_QNAME, CreateZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshRegisteredAuthTokensRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RefreshRegisteredAuthTokensRequest")
    public JAXBElement<RefreshRegisteredAuthTokensRequest> createRefreshRegisteredAuthTokensRequest(RefreshRegisteredAuthTokensRequest value) {
        return new JAXBElement<RefreshRegisteredAuthTokensRequest>(_RefreshRegisteredAuthTokensRequest_QNAME, RefreshRegisteredAuthTokensRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixCalendarEndTimeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "FixCalendarEndTimeRequest")
    public JAXBElement<FixCalendarEndTimeRequest> createFixCalendarEndTimeRequest(FixCalendarEndTimeRequest value) {
        return new JAXBElement<FixCalendarEndTimeRequest>(_FixCalendarEndTimeRequest_QNAME, FixCalendarEndTimeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeployZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UndeployZimletResponse")
    public JAXBElement<UndeployZimletResponse> createUndeployZimletResponse(UndeployZimletResponse value) {
        return new JAXBElement<UndeployZimletResponse>(_UndeployZimletResponse_QNAME, UndeployZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDistributionListAliasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddDistributionListAliasResponse")
    public JAXBElement<AddDistributionListAliasResponse> createAddDistributionListAliasResponse(AddDistributionListAliasResponse value) {
        return new JAXBElement<AddDistributionListAliasResponse>(_AddDistributionListAliasResponse_QNAME, AddDistributionListAliasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetGrantsRequest")
    public JAXBElement<GetGrantsRequest> createGetGrantsRequest(GetGrantsRequest value) {
        return new JAXBElement<GetGrantsRequest>(_GetGrantsRequest_QNAME, GetGrantsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLDAPEntryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteLDAPEntryRequest")
    public JAXBElement<DeleteLDAPEntryRequest> createDeleteLDAPEntryRequest(DeleteLDAPEntryRequest value) {
        return new JAXBElement<DeleteLDAPEntryRequest>(_DeleteLDAPEntryRequest_QNAME, DeleteLDAPEntryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateAccountRequest")
    public JAXBElement<CreateAccountRequest> createCreateAccountRequest(CreateAccountRequest value) {
        return new JAXBElement<CreateAccountRequest>(_CreateAccountRequest_QNAME, CreateAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "VersionCheckResponse")
    public JAXBElement<VersionCheckResponse> createVersionCheckResponse(VersionCheckResponse value) {
        return new JAXBElement<VersionCheckResponse>(_VersionCheckResponse_QNAME, VersionCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadProxyCAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UploadProxyCAResponse")
    public JAXBElement<UploadProxyCAResponse> createUploadProxyCAResponse(UploadProxyCAResponse value) {
        return new JAXBElement<UploadProxyCAResponse>(_UploadProxyCAResponse_QNAME, UploadProxyCAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllConfigResponse")
    public JAXBElement<GetAllConfigResponse> createGetAllConfigResponse(GetAllConfigResponse value) {
        return new JAXBElement<GetAllConfigResponse>(_GetAllConfigResponse_QNAME, GetAllConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetCurrentVolumeResponse")
    public JAXBElement<SetCurrentVolumeResponse> createSetCurrentVolumeResponse(SetCurrentVolumeResponse value) {
        return new JAXBElement<SetCurrentVolumeResponse>(_SetCurrentVolumeResponse_QNAME, SetCurrentVolumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAdminSavedSearchesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAdminSavedSearchesRequest")
    public JAXBElement<ModifyAdminSavedSearchesRequest> createModifyAdminSavedSearchesRequest(ModifyAdminSavedSearchesRequest value) {
        return new JAXBElement<ModifyAdminSavedSearchesRequest>(_ModifyAdminSavedSearchesRequest_QNAME, ModifyAdminSavedSearchesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeFreeBusyQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeFreeBusyQueueRequest")
    public JAXBElement<PurgeFreeBusyQueueRequest> createPurgeFreeBusyQueueRequest(PurgeFreeBusyQueueRequest value) {
        return new JAXBElement<PurgeFreeBusyQueueRequest>(_PurgeFreeBusyQueueRequest_QNAME, PurgeFreeBusyQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MigrateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "MigrateAccountResponse")
    public JAXBElement<MigrateAccountResponse> createMigrateAccountResponse(MigrateAccountResponse value) {
        return new JAXBElement<MigrateAccountResponse>(_MigrateAccountResponse_QNAME, MigrateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyServerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyServerRequest")
    public JAXBElement<ModifyServerRequest> createModifyServerRequest(ModifyServerRequest value) {
        return new JAXBElement<ModifyServerRequest>(_ModifyServerRequest_QNAME, ModifyServerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZimletServerExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "serverExtension")
    public JAXBElement<ZimletServerExtension> createServerExtension(ZimletServerExtension value) {
        return new JAXBElement<ZimletServerExtension>(_ServerExtension_QNAME, ZimletServerExtension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUCServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllUCServicesResponse")
    public JAXBElement<GetAllUCServicesResponse> createGetAllUCServicesResponse(GetAllUCServicesResponse value) {
        return new JAXBElement<GetAllUCServicesResponse>(_GetAllUCServicesResponse_QNAME, GetAllUCServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAdminAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAdminAccountsResponse")
    public JAXBElement<GetAllAdminAccountsResponse> createGetAllAdminAccountsResponse(GetAllAdminAccountsResponse value) {
        return new JAXBElement<GetAllAdminAccountsResponse>(_GetAllAdminAccountsResponse_QNAME, GetAllAdminAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalendarResourceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetCalendarResourceRequest")
    public JAXBElement<GetCalendarResourceRequest> createGetCalendarResourceRequest(GetCalendarResourceRequest value) {
        return new JAXBElement<GetCalendarResourceRequest>(_GetCalendarResourceRequest_QNAME, GetCalendarResourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchMultiMailboxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SearchMultiMailboxResponse")
    public JAXBElement<SearchMultiMailboxResponse> createSearchMultiMailboxResponse(SearchMultiMailboxResponse value) {
        return new JAXBElement<SearchMultiMailboxResponse>(_SearchMultiMailboxResponse_QNAME, SearchMultiMailboxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminCustomMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "meta")
    public JAXBElement<AdminCustomMetadata> createMeta(AdminCustomMetadata value) {
        return new JAXBElement<AdminCustomMetadata>(_Meta_QNAME, AdminCustomMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerResponse")
    public JAXBElement<GetServerResponse> createGetServerResponse(GetServerResponse value) {
        return new JAXBElement<GetServerResponse>(_GetServerResponse_QNAME, GetServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameAccountResponse")
    public JAXBElement<RenameAccountResponse> createRenameAccountResponse(RenameAccountResponse value) {
        return new JAXBElement<RenameAccountResponse>(_RenameAccountResponse_QNAME, RenameAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHsmStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetHsmStatusRequest")
    public JAXBElement<GetHsmStatusRequest> createGetHsmStatusRequest(GetHsmStatusRequest value) {
        return new JAXBElement<GetHsmStatusRequest>(_GetHsmStatusRequest_QNAME, GetHsmStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyCosRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyCosRequest")
    public JAXBElement<ModifyCosRequest> createModifyCosRequest(ModifyCosRequest value) {
        return new JAXBElement<ModifyCosRequest>(_ModifyCosRequest_QNAME, ModifyCosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateCosResponse")
    public JAXBElement<CreateCosResponse> createCreateCosResponse(CreateCosResponse value) {
        return new JAXBElement<CreateCosResponse>(_CreateCosResponse_QNAME, CreateCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetVersionInfoResponse")
    public JAXBElement<GetVersionInfoResponse> createGetVersionInfoResponse(GetVersionInfoResponse value) {
        return new JAXBElement<GetVersionInfoResponse>(_GetVersionInfoResponse_QNAME, GetVersionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReloadLocalConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ReloadLocalConfigResponse")
    public JAXBElement<ReloadLocalConfigResponse> createReloadLocalConfigResponse(ReloadLocalConfigResponse value) {
        return new JAXBElement<ReloadLocalConfigResponse>(_ReloadLocalConfigResponse_QNAME, ReloadLocalConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerNIfsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetServerNIfsResponse")
    public JAXBElement<GetServerNIfsResponse> createGetServerNIfsResponse(GetServerNIfsResponse value) {
        return new JAXBElement<GetServerNIfsResponse>(_GetServerNIfsResponse_QNAME, GetServerNIfsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameLDAPEntryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RenameLDAPEntryRequest")
    public JAXBElement<RenameLDAPEntryRequest> createRenameLDAPEntryRequest(RenameLDAPEntryRequest value) {
        return new JAXBElement<RenameLDAPEntryRequest>(_RenameLDAPEntryRequest_QNAME, RenameLDAPEntryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesResponse")
    public JAXBElement<GetDevicesResponse> createGetDevicesResponse(GetDevicesResponse value) {
        return new JAXBElement<GetDevicesResponse>(_GetDevicesResponse_QNAME, GetDevicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountInfoRequest")
    public JAXBElement<GetAccountInfoRequest> createGetAccountInfoRequest(GetAccountInfoRequest value) {
        return new JAXBElement<GetAccountInfoRequest>(_GetAccountInfoRequest_QNAME, GetAccountInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailQueueRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMailQueueRequest")
    public JAXBElement<GetMailQueueRequest> createGetMailQueueRequest(GetMailQueueRequest value) {
        return new JAXBElement<GetMailQueueRequest>(_GetMailQueueRequest_QNAME, GetMailQueueRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDomainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateDomainResponse")
    public JAXBElement<CreateDomainResponse> createCreateDomainResponse(CreateDomainResponse value) {
        return new JAXBElement<CreateDomainResponse>(_CreateDomainResponse_QNAME, CreateDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveDeviceRequest")
    public JAXBElement<RemoveDeviceRequest> createRemoveDeviceRequest(RemoveDeviceRequest value) {
        return new JAXBElement<RemoveDeviceRequest>(_RemoveDeviceRequest_QNAME, RemoveDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyConfigResponse")
    public JAXBElement<ModifyConfigResponse> createModifyConfigResponse(ModifyConfigResponse value) {
        return new JAXBElement<ModifyConfigResponse>(_ModifyConfigResponse_QNAME, ModifyConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteAccountRequest")
    public JAXBElement<DeleteAccountRequest> createDeleteAccountRequest(DeleteAccountRequest value) {
        return new JAXBElement<DeleteAccountRequest>(_DeleteAccountRequest_QNAME, DeleteAccountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSystemRetentionPolicyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteSystemRetentionPolicyRequest")
    public JAXBElement<DeleteSystemRetentionPolicyRequest> createDeleteSystemRetentionPolicyRequest(DeleteSystemRetentionPolicyRequest value) {
        return new JAXBElement<DeleteSystemRetentionPolicyRequest>(_DeleteSystemRetentionPolicyRequest_QNAME, DeleteSystemRetentionPolicyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteZimletResponse")
    public JAXBElement<DeleteZimletResponse> createDeleteZimletResponse(DeleteZimletResponse value) {
        return new JAXBElement<DeleteZimletResponse>(_DeleteZimletResponse_QNAME, DeleteZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAuthConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckAuthConfigResponse")
    public JAXBElement<CheckAuthConfigResponse> createCheckAuthConfigResponse(CheckAuthConfigResponse value) {
        return new JAXBElement<CheckAuthConfigResponse>(_CheckAuthConfigResponse_QNAME, CheckAuthConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetAllLoggersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ResetAllLoggersResponse")
    public JAXBElement<ResetAllLoggersResponse> createResetAllLoggersResponse(ResetAllLoggersResponse value) {
        return new JAXBElement<ResetAllLoggersResponse>(_ResetAllLoggersResponse_QNAME, ResetAllLoggersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPasswordStrengthRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckPasswordStrengthRequest")
    public JAXBElement<CheckPasswordStrengthRequest> createCheckPasswordStrengthRequest(CheckPasswordStrengthRequest value) {
        return new JAXBElement<CheckPasswordStrengthRequest>(_CheckPasswordStrengthRequest_QNAME, CheckPasswordStrengthRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBlobConsistencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckBlobConsistencyResponse")
    public JAXBElement<CheckBlobConsistencyResponse> createCheckBlobConsistencyResponse(CheckBlobConsistencyResponse value) {
        return new JAXBElement<CheckBlobConsistencyResponse>(_CheckBlobConsistencyResponse_QNAME, CheckBlobConsistencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeAggregateQuotaUsageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ComputeAggregateQuotaUsageRequest")
    public JAXBElement<ComputeAggregateQuotaUsageRequest> createComputeAggregateQuotaUsageRequest(ComputeAggregateQuotaUsageRequest value) {
        return new JAXBElement<ComputeAggregateQuotaUsageRequest>(_ComputeAggregateQuotaUsageRequest_QNAME, ComputeAggregateQuotaUsageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMailboxesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllMailboxesRequest")
    public JAXBElement<GetAllMailboxesRequest> createGetAllMailboxesRequest(GetAllMailboxesRequest value) {
        return new JAXBElement<GetAllMailboxesRequest>(_GetAllMailboxesRequest_QNAME, GetAllMailboxesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCookieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ClearCookieRequest")
    public JAXBElement<ClearCookieRequest> createClearCookieRequest(ClearCookieRequest value) {
        return new JAXBElement<ClearCookieRequest>(_ClearCookieRequest_QNAME, ClearCookieRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupRequest")
    public JAXBElement<BackupRequest> createBackupRequest(BackupRequest value) {
        return new JAXBElement<BackupRequest>(_BackupRequest_QNAME, BackupRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateArchiveResponse")
    public JAXBElement<CreateArchiveResponse> createCreateArchiveResponse(CreateArchiveResponse value) {
        return new JAXBElement<CreateArchiveResponse>(_CreateArchiveResponse_QNAME, CreateArchiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeMessagesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "PurgeMessagesRequest")
    public JAXBElement<PurgeMessagesRequest> createPurgeMessagesRequest(PurgeMessagesRequest value) {
        return new JAXBElement<PurgeMessagesRequest>(_PurgeMessagesRequest_QNAME, PurgeMessagesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAccountAliasRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "RemoveAccountAliasRequest")
    public JAXBElement<RemoveAccountAliasRequest> createRemoveAccountAliasRequest(RemoveAccountAliasRequest value) {
        return new JAXBElement<RemoveAccountAliasRequest>(_RemoveAccountAliasRequest_QNAME, RemoveAccountAliasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAlwaysOnClustersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAlwaysOnClustersRequest")
    public JAXBElement<GetAllAlwaysOnClustersRequest> createGetAllAlwaysOnClustersRequest(GetAllAlwaysOnClustersRequest value) {
        return new JAXBElement<GetAllAlwaysOnClustersRequest>(_GetAllAlwaysOnClustersRequest_QNAME, GetAllAlwaysOnClustersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingRemoteWipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CancelPendingRemoteWipeResponse")
    public JAXBElement<CancelPendingRemoteWipeResponse> createCancelPendingRemoteWipeResponse(CancelPendingRemoteWipeResponse value) {
        return new JAXBElement<CancelPendingRemoteWipeResponse>(_CancelPendingRemoteWipeResponse_QNAME, CancelPendingRemoteWipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyUCServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyUCServiceRequest")
    public JAXBElement<ModifyUCServiceRequest> createModifyUCServiceRequest(ModifyUCServiceRequest value) {
        return new JAXBElement<ModifyUCServiceRequest>(_ModifyUCServiceRequest_QNAME, ModifyUCServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActiveServersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllActiveServersRequest")
    public JAXBElement<GetAllActiveServersRequest> createGetAllActiveServersRequest(GetAllActiveServersRequest value) {
        return new JAXBElement<GetAllActiveServersRequest>(_GetAllActiveServersRequest_QNAME, GetAllActiveServersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoProvTaskControlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AutoProvTaskControlResponse")
    public JAXBElement<AutoProvTaskControlResponse> createAutoProvTaskControlResponse(AutoProvTaskControlResponse value) {
        return new JAXBElement<AutoProvTaskControlResponse>(_AutoProvTaskControlResponse_QNAME, AutoProvTaskControlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaUsageRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetQuotaUsageRequest")
    public JAXBElement<GetQuotaUsageRequest> createGetQuotaUsageRequest(GetQuotaUsageRequest value) {
        return new JAXBElement<GetQuotaUsageRequest>(_GetQuotaUsageRequest_QNAME, GetQuotaUsageRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "EnableArchiveResponse")
    public JAXBElement<EnableArchiveResponse> createEnableArchiveResponse(EnableArchiveResponse value) {
        return new JAXBElement<EnableArchiveResponse>(_EnableArchiveResponse_QNAME, EnableArchiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVolumeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetVolumeResponse")
    public JAXBElement<GetVolumeResponse> createGetVolumeResponse(GetVolumeResponse value) {
        return new JAXBElement<GetVolumeResponse>(_GetVolumeResponse_QNAME, GetVolumeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SetPasswordResponse")
    public JAXBElement<SetPasswordResponse> createSetPasswordResponse(SetPasswordResponse value) {
        return new JAXBElement<SetPasswordResponse>(_SetPasswordResponse_QNAME, SetPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoggerStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLoggerStatsResponse")
    public JAXBElement<GetLoggerStatsResponse> createGetLoggerStatsResponse(GetLoggerStatsResponse value) {
        return new JAXBElement<GetLoggerStatsResponse>(_GetLoggerStatsResponse_QNAME, GetLoggerStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddGalSyncDataSourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AddGalSyncDataSourceResponse")
    public JAXBElement<AddGalSyncDataSourceResponse> createAddGalSyncDataSourceResponse(AddGalSyncDataSourceResponse value) {
        return new JAXBElement<AddGalSyncDataSourceResponse>(_AddGalSyncDataSourceResponse_QNAME, AddGalSyncDataSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountInfoResponse")
    public JAXBElement<GetAccountInfoResponse> createGetAccountInfoResponse(GetAccountInfoResponse value) {
        return new JAXBElement<GetAccountInfoResponse>(_GetAccountInfoResponse_QNAME, GetAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDomCertRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "UploadDomCertRequest")
    public JAXBElement<UploadDomCertRequest> createUploadDomCertRequest(UploadDomCertRequest value) {
        return new JAXBElement<UploadDomCertRequest>(_UploadDomCertRequest_QNAME, UploadDomCertRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDomainInfoResponse")
    public JAXBElement<GetDomainInfoResponse> createGetDomainInfoResponse(GetDomainInfoResponse value) {
        return new JAXBElement<GetDomainInfoResponse>(_GetDomainInfoResponse_QNAME, GetDomainInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDevicesCountUsedTodayRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetDevicesCountUsedTodayRequest")
    public JAXBElement<GetDevicesCountUsedTodayRequest> createGetDevicesCountUsedTodayRequest(GetDevicesCountUsedTodayRequest value) {
        return new JAXBElement<GetDevicesCountUsedTodayRequest>(_GetDevicesCountUsedTodayRequest_QNAME, GetDevicesCountUsedTodayRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteCosResponse")
    public JAXBElement<DeleteCosResponse> createDeleteCosResponse(DeleteCosResponse value) {
        return new JAXBElement<DeleteCosResponse>(_DeleteCosResponse_QNAME, DeleteCosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateXMPPComponentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateXMPPComponentResponse")
    public JAXBElement<CreateXMPPComponentResponse> createCreateXMPPComponentResponse(CreateXMPPComponentResponse value) {
        return new JAXBElement<CreateXMPPComponentResponse>(_CreateXMPPComponentResponse_QNAME, CreateXMPPComponentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFreeBusyProvidersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllFreeBusyProvidersRequest")
    public JAXBElement<GetAllFreeBusyProvidersRequest> createGetAllFreeBusyProvidersRequest(GetAllFreeBusyProvidersRequest value) {
        return new JAXBElement<GetAllFreeBusyProvidersRequest>(_GetAllFreeBusyProvidersRequest_QNAME, GetAllFreeBusyProvidersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DisableArchiveResponse")
    public JAXBElement<DisableArchiveResponse> createDisableArchiveResponse(DisableArchiveResponse value) {
        return new JAXBElement<DisableArchiveResponse>(_DisableArchiveResponse_QNAME, DisableArchiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLDAPEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyLDAPEntryResponse")
    public JAXBElement<ModifyLDAPEntryResponse> createModifyLDAPEntryResponse(ModifyLDAPEntryResponse value) {
        return new JAXBElement<ModifyLDAPEntryResponse>(_ModifyLDAPEntryResponse_QNAME, ModifyLDAPEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBlobConsistencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckBlobConsistencyRequest")
    public JAXBElement<CheckBlobConsistencyRequest> createCheckBlobConsistencyRequest(CheckBlobConsistencyRequest value) {
        return new JAXBElement<CheckBlobConsistencyRequest>(_CheckBlobConsistencyRequest_QNAME, CheckBlobConsistencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCalendarResourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateCalendarResourceResponse")
    public JAXBElement<CreateCalendarResourceResponse> createCreateCalendarResourceResponse(CreateCalendarResourceResponse value) {
        return new JAXBElement<CreateCalendarResourceResponse>(_CreateCalendarResourceResponse_QNAME, CreateCalendarResourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDirectoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckDirectoryResponse")
    public JAXBElement<CheckDirectoryResponse> createCheckDirectoryResponse(CheckDirectoryResponse value) {
        return new JAXBElement<CheckDirectoryResponse>(_CheckDirectoryResponse_QNAME, CheckDirectoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<GetAllAccountsResponse>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminCreateWaitSetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AdminCreateWaitSetRequest")
    public JAXBElement<AdminCreateWaitSetRequest> createAdminCreateWaitSetRequest(AdminCreateWaitSetRequest value) {
        return new JAXBElement<AdminCreateWaitSetRequest>(_AdminCreateWaitSetRequest_QNAME, AdminCreateWaitSetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupAccountQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupAccountQueryResponse")
    public JAXBElement<BackupAccountQueryResponse> createBackupAccountQueryResponse(BackupAccountQueryResponse value) {
        return new JAXBElement<BackupAccountQueryResponse>(_BackupAccountQueryResponse_QNAME, BackupAccountQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMemcachedClientConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetMemcachedClientConfigResponse")
    public JAXBElement<GetMemcachedClientConfigResponse> createGetMemcachedClientConfigResponse(GetMemcachedClientConfigResponse value) {
        return new JAXBElement<GetMemcachedClientConfigResponse>(_GetMemcachedClientConfigResponse_QNAME, GetMemcachedClientConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackupQueryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "BackupQueryRequest")
    public JAXBElement<BackupQueryRequest> createBackupQueryRequest(BackupQueryRequest value) {
        return new JAXBElement<BackupQueryRequest>(_BackupQueryRequest_QNAME, BackupQueryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumeDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ResumeDeviceRequest")
    public JAXBElement<ResumeDeviceRequest> createResumeDeviceRequest(ResumeDeviceRequest value) {
        return new JAXBElement<ResumeDeviceRequest>(_ResumeDeviceRequest_QNAME, ResumeDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckGalConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckGalConfigResponse")
    public JAXBElement<CheckGalConfigResponse> createCheckGalConfigResponse(CheckGalConfigResponse value) {
        return new JAXBElement<CheckGalConfigResponse>(_CheckGalConfigResponse_QNAME, CheckGalConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlwaysOnClusterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetAlwaysOnClusterRequest")
    public JAXBElement<GetAlwaysOnClusterRequest> createGetAlwaysOnClusterRequest(GetAlwaysOnClusterRequest value) {
        return new JAXBElement<GetAlwaysOnClusterRequest>(_GetAlwaysOnClusterRequest_QNAME, GetAlwaysOnClusterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbortHsmRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AbortHsmRequest")
    public JAXBElement<AbortHsmRequest> createAbortHsmRequest(AbortHsmRequest value) {
        return new JAXBElement<AbortHsmRequest>(_AbortHsmRequest_QNAME, AbortHsmRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckHealthRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CheckHealthRequest")
    public JAXBElement<CheckHealthRequest> createCheckHealthRequest(CheckHealthRequest value) {
        return new JAXBElement<CheckHealthRequest>(_CheckHealthRequest_QNAME, CheckHealthRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "AuthResponse")
    public JAXBElement<AuthResponse> createAuthResponse(AuthResponse value) {
        return new JAXBElement<AuthResponse>(_AuthResponse_QNAME, AuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "include")
    public JAXBElement<String> createInclude(String value) {
        return new JAXBElement<String>(_Include_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SuspendDeviceResponse")
    public JAXBElement<SuspendDeviceResponse> createSuspendDeviceResponse(SuspendDeviceResponse value) {
        return new JAXBElement<SuspendDeviceResponse>(_SuspendDeviceResponse_QNAME, SuspendDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingRemoteWipeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CancelPendingRemoteWipeRequest")
    public JAXBElement<CancelPendingRemoteWipeRequest> createCancelPendingRemoteWipeRequest(CancelPendingRemoteWipeRequest value) {
        return new JAXBElement<CancelPendingRemoteWipeRequest>(_CancelPendingRemoteWipeRequest_QNAME, CancelPendingRemoteWipeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXMPPComponentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetXMPPComponentRequest")
    public JAXBElement<GetXMPPComponentRequest> createGetXMPPComponentRequest(GetXMPPComponentRequest value) {
        return new JAXBElement<GetXMPPComponentRequest>(_GetXMPPComponentRequest_QNAME, GetXMPPComponentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateXMbxSearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "CreateXMbxSearchRequest")
    public JAXBElement<CreateXMbxSearchRequest> createCreateXMbxSearchRequest(CreateXMbxSearchRequest value) {
        return new JAXBElement<CreateXMbxSearchRequest>(_CreateXMbxSearchRequest_QNAME, CreateXMbxSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomainRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "DeleteDomainRequest")
    public JAXBElement<DeleteDomainRequest> createDeleteDomainRequest(DeleteDomainRequest value) {
        return new JAXBElement<DeleteDomainRequest>(_DeleteDomainRequest_QNAME, DeleteDomainRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyDistributionListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyDistributionListRequest")
    public JAXBElement<ModifyDistributionListRequest> createModifyDistributionListRequest(ModifyDistributionListRequest value) {
        return new JAXBElement<ModifyDistributionListRequest>(_ModifyDistributionListRequest_QNAME, ModifyDistributionListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSMIMEConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetSMIMEConfigResponse")
    public JAXBElement<GetSMIMEConfigResponse> createGetSMIMEConfigResponse(GetSMIMEConfigResponse value) {
        return new JAXBElement<GetSMIMEConfigResponse>(_GetSMIMEConfigResponse_QNAME, GetSMIMEConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyZimletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyZimletResponse")
    public JAXBElement<ModifyZimletResponse> createModifyZimletResponse(ModifyZimletResponse value) {
        return new JAXBElement<ModifyZimletResponse>(_ModifyZimletResponse_QNAME, ModifyZimletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendDeviceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "SuspendDeviceRequest")
    public JAXBElement<SuspendDeviceRequest> createSuspendDeviceRequest(SuspendDeviceRequest value) {
        return new JAXBElement<SuspendDeviceRequest>(_SuspendDeviceRequest_QNAME, SuspendDeviceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoggerStatsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "GetLoggerStatsRequest")
    public JAXBElement<GetLoggerStatsRequest> createGetLoggerStatsRequest(GetLoggerStatsRequest value) {
        return new JAXBElement<GetLoggerStatsRequest>(_GetLoggerStatsRequest_QNAME, GetLoggerStatsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAccountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:zimbraAdmin", name = "ModifyAccountRequest")
    public JAXBElement<ModifyAccountRequest> createModifyAccountRequest(ModifyAccountRequest value) {
        return new JAXBElement<ModifyAccountRequest>(_ModifyAccountRequest_QNAME, ModifyAccountRequest.class, null, value);
    }

}

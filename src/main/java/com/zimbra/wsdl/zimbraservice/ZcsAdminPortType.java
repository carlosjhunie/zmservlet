
package com.zimbra.wsdl.zimbraservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import zimbraadmin.AbortHsmRequest;
import zimbraadmin.AbortHsmResponse;
import zimbraadmin.AbortXMbxSearchRequest;
import zimbraadmin.AbortXMbxSearchResponse;
import zimbraadmin.ActivateLicenseRequest;
import zimbraadmin.ActivateLicenseResponse;
import zimbraadmin.AddAccountAliasRequest;
import zimbraadmin.AddAccountAliasResponse;
import zimbraadmin.AddAccountLoggerRequest;
import zimbraadmin.AddAccountLoggerResponse;
import zimbraadmin.AddDistributionListAliasRequest;
import zimbraadmin.AddDistributionListAliasResponse;
import zimbraadmin.AddDistributionListMemberRequest;
import zimbraadmin.AddDistributionListMemberResponse;
import zimbraadmin.AddGalSyncDataSourceRequest;
import zimbraadmin.AddGalSyncDataSourceResponse;
import zimbraadmin.AdminCreateWaitSetRequest;
import zimbraadmin.AdminCreateWaitSetResponse;
import zimbraadmin.AdminDestroyWaitSetRequest;
import zimbraadmin.AdminDestroyWaitSetResponse;
import zimbraadmin.AdminWaitSetRequest;
import zimbraadmin.AdminWaitSetResponse;
import zimbraadmin.AuthRequest;
import zimbraadmin.AuthResponse;
import zimbraadmin.AutoCompleteGalRequest;
import zimbraadmin.AutoCompleteGalResponse;
import zimbraadmin.AutoProvAccountRequest;
import zimbraadmin.AutoProvAccountResponse;
import zimbraadmin.AutoProvTaskControlRequest;
import zimbraadmin.AutoProvTaskControlResponse;
import zimbraadmin.BackupAccountQueryRequest;
import zimbraadmin.BackupAccountQueryResponse;
import zimbraadmin.BackupQueryRequest;
import zimbraadmin.BackupQueryResponse;
import zimbraadmin.BackupRequest;
import zimbraadmin.BackupResponse;
import zimbraadmin.CancelPendingRemoteWipeRequest;
import zimbraadmin.CancelPendingRemoteWipeResponse;
import zimbraadmin.CheckAuthConfigRequest;
import zimbraadmin.CheckAuthConfigResponse;
import zimbraadmin.CheckBlobConsistencyRequest;
import zimbraadmin.CheckBlobConsistencyResponse;
import zimbraadmin.CheckDirectoryRequest;
import zimbraadmin.CheckDirectoryResponse;
import zimbraadmin.CheckDomainMXRecordRequest;
import zimbraadmin.CheckDomainMXRecordResponse;
import zimbraadmin.CheckExchangeAuthRequest;
import zimbraadmin.CheckExchangeAuthResponse;
import zimbraadmin.CheckGalConfigRequest;
import zimbraadmin.CheckGalConfigResponse;
import zimbraadmin.CheckHealthRequest;
import zimbraadmin.CheckHealthResponse;
import zimbraadmin.CheckHostnameResolveRequest;
import zimbraadmin.CheckHostnameResolveResponse;
import zimbraadmin.CheckPasswordStrengthRequest;
import zimbraadmin.CheckPasswordStrengthResponse;
import zimbraadmin.CheckRightRequest;
import zimbraadmin.CheckRightResponse;
import zimbraadmin.ClearCookieRequest;
import zimbraadmin.ClearCookieResponse;
import zimbraadmin.CompactIndexRequest;
import zimbraadmin.CompactIndexResponse;
import zimbraadmin.ComputeAggregateQuotaUsageRequest;
import zimbraadmin.ComputeAggregateQuotaUsageResponse;
import zimbraadmin.ConfigureZimletRequest;
import zimbraadmin.ConfigureZimletResponse;
import zimbraadmin.CopyCosRequest;
import zimbraadmin.CopyCosResponse;
import zimbraadmin.CountAccountRequest;
import zimbraadmin.CountAccountResponse;
import zimbraadmin.CountObjectsRequest;
import zimbraadmin.CountObjectsResponse;
import zimbraadmin.CreateAccountRequest;
import zimbraadmin.CreateAccountResponse;
import zimbraadmin.CreateAlwaysOnClusterRequest;
import zimbraadmin.CreateAlwaysOnClusterResponse;
import zimbraadmin.CreateArchiveRequest;
import zimbraadmin.CreateArchiveResponse;
import zimbraadmin.CreateCalendarResourceRequest;
import zimbraadmin.CreateCalendarResourceResponse;
import zimbraadmin.CreateCosRequest;
import zimbraadmin.CreateCosResponse;
import zimbraadmin.CreateDataSourceRequest;
import zimbraadmin.CreateDataSourceResponse;
import zimbraadmin.CreateDistributionListRequest;
import zimbraadmin.CreateDistributionListResponse;
import zimbraadmin.CreateDomainRequest;
import zimbraadmin.CreateDomainResponse;
import zimbraadmin.CreateGalSyncAccountRequest;
import zimbraadmin.CreateGalSyncAccountResponse;
import zimbraadmin.CreateLDAPEntryRequest;
import zimbraadmin.CreateLDAPEntryResponse;
import zimbraadmin.CreateServerRequest;
import zimbraadmin.CreateServerResponse;
import zimbraadmin.CreateSystemRetentionPolicyRequest;
import zimbraadmin.CreateSystemRetentionPolicyResponse;
import zimbraadmin.CreateUCServiceRequest;
import zimbraadmin.CreateUCServiceResponse;
import zimbraadmin.CreateVolumeRequest;
import zimbraadmin.CreateVolumeResponse;
import zimbraadmin.CreateXMPPComponentRequest;
import zimbraadmin.CreateXMPPComponentResponse;
import zimbraadmin.CreateXMbxSearchRequest;
import zimbraadmin.CreateXMbxSearchResponse;
import zimbraadmin.CreateZimletRequest;
import zimbraadmin.CreateZimletResponse;
import zimbraadmin.DedupeBlobsRequest;
import zimbraadmin.DedupeBlobsResponse;
import zimbraadmin.DelegateAuthRequest;
import zimbraadmin.DelegateAuthResponse;
import zimbraadmin.DeleteAccountRequest;
import zimbraadmin.DeleteAccountResponse;
import zimbraadmin.DeleteAlwaysOnClusterRequest;
import zimbraadmin.DeleteAlwaysOnClusterResponse;
import zimbraadmin.DeleteCalendarResourceRequest;
import zimbraadmin.DeleteCalendarResourceResponse;
import zimbraadmin.DeleteCosRequest;
import zimbraadmin.DeleteCosResponse;
import zimbraadmin.DeleteDataSourceRequest;
import zimbraadmin.DeleteDataSourceResponse;
import zimbraadmin.DeleteDistributionListRequest;
import zimbraadmin.DeleteDistributionListResponse;
import zimbraadmin.DeleteDomainRequest;
import zimbraadmin.DeleteDomainResponse;
import zimbraadmin.DeleteGalSyncAccountRequest;
import zimbraadmin.DeleteGalSyncAccountResponse;
import zimbraadmin.DeleteLDAPEntryRequest;
import zimbraadmin.DeleteLDAPEntryResponse;
import zimbraadmin.DeleteMailboxRequest;
import zimbraadmin.DeleteMailboxResponse;
import zimbraadmin.DeleteServerRequest;
import zimbraadmin.DeleteServerResponse;
import zimbraadmin.DeleteSystemRetentionPolicyRequest;
import zimbraadmin.DeleteSystemRetentionPolicyResponse;
import zimbraadmin.DeleteUCServiceRequest;
import zimbraadmin.DeleteUCServiceResponse;
import zimbraadmin.DeleteVolumeRequest;
import zimbraadmin.DeleteVolumeResponse;
import zimbraadmin.DeleteXMPPComponentRequest;
import zimbraadmin.DeleteXMPPComponentResponse;
import zimbraadmin.DeleteXMbxSearchRequest;
import zimbraadmin.DeleteXMbxSearchResponse;
import zimbraadmin.DeleteZimletRequest;
import zimbraadmin.DeleteZimletResponse;
import zimbraadmin.DeployZimletRequest;
import zimbraadmin.DeployZimletResponse;
import zimbraadmin.DisableArchiveRequest;
import zimbraadmin.DisableArchiveResponse;
import zimbraadmin.DumpSessionsRequest;
import zimbraadmin.DumpSessionsResponse;
import zimbraadmin.EnableArchiveRequest;
import zimbraadmin.EnableArchiveResponse;
import zimbraadmin.ExportAndDeleteItemsRequest;
import zimbraadmin.ExportAndDeleteItemsResponse;
import zimbraadmin.ExportMailboxRequest;
import zimbraadmin.ExportMailboxResponse;
import zimbraadmin.FailoverClusterServiceRequest;
import zimbraadmin.FailoverClusterServiceResponse;
import zimbraadmin.FixCalendarEndTimeRequest;
import zimbraadmin.FixCalendarEndTimeResponse;
import zimbraadmin.FixCalendarPriorityRequest;
import zimbraadmin.FixCalendarPriorityResponse;
import zimbraadmin.FixCalendarTZRequest;
import zimbraadmin.FixCalendarTZResponse;
import zimbraadmin.FlushCacheRequest;
import zimbraadmin.FlushCacheResponse;
import zimbraadmin.GenCSRRequest;
import zimbraadmin.GenCSRResponse;
import zimbraadmin.GetAccountInfoRequest;
import zimbraadmin.GetAccountInfoResponse;
import zimbraadmin.GetAccountLoggersRequest;
import zimbraadmin.GetAccountLoggersResponse;
import zimbraadmin.GetAccountMembershipRequest;
import zimbraadmin.GetAccountMembershipResponse;
import zimbraadmin.GetAccountRequest;
import zimbraadmin.GetAccountResponse;
import zimbraadmin.GetAdminConsoleUICompRequest;
import zimbraadmin.GetAdminConsoleUICompResponse;
import zimbraadmin.GetAdminExtensionZimletsRequest;
import zimbraadmin.GetAdminExtensionZimletsResponse;
import zimbraadmin.GetAdminSavedSearchesRequest;
import zimbraadmin.GetAdminSavedSearchesResponse;
import zimbraadmin.GetAggregateQuotaUsageOnServerRequest;
import zimbraadmin.GetAggregateQuotaUsageOnServerResponse;
import zimbraadmin.GetAllAccountLoggersRequest;
import zimbraadmin.GetAllAccountLoggersResponse;
import zimbraadmin.GetAllAccountsRequest;
import zimbraadmin.GetAllAccountsResponse;
import zimbraadmin.GetAllActiveServersRequest;
import zimbraadmin.GetAllActiveServersResponse;
import zimbraadmin.GetAllAdminAccountsRequest;
import zimbraadmin.GetAllAdminAccountsResponse;
import zimbraadmin.GetAllAlwaysOnClustersRequest;
import zimbraadmin.GetAllAlwaysOnClustersResponse;
import zimbraadmin.GetAllCalendarResourcesRequest;
import zimbraadmin.GetAllCalendarResourcesResponse;
import zimbraadmin.GetAllConfigRequest;
import zimbraadmin.GetAllConfigResponse;
import zimbraadmin.GetAllCosRequest;
import zimbraadmin.GetAllCosResponse;
import zimbraadmin.GetAllDistributionListsRequest;
import zimbraadmin.GetAllDistributionListsResponse;
import zimbraadmin.GetAllDomainsRequest;
import zimbraadmin.GetAllDomainsResponse;
import zimbraadmin.GetAllEffectiveRightsRequest;
import zimbraadmin.GetAllEffectiveRightsResponse;
import zimbraadmin.GetAllFreeBusyProvidersRequest;
import zimbraadmin.GetAllFreeBusyProvidersResponse;
import zimbraadmin.GetAllLocalesRequest;
import zimbraadmin.GetAllLocalesResponse;
import zimbraadmin.GetAllMailboxesRequest;
import zimbraadmin.GetAllMailboxesResponse;
import zimbraadmin.GetAllRightsRequest;
import zimbraadmin.GetAllRightsResponse;
import zimbraadmin.GetAllServersRequest;
import zimbraadmin.GetAllServersResponse;
import zimbraadmin.GetAllSkinsRequest;
import zimbraadmin.GetAllSkinsResponse;
import zimbraadmin.GetAllUCProvidersRequest;
import zimbraadmin.GetAllUCProvidersResponse;
import zimbraadmin.GetAllUCServicesRequest;
import zimbraadmin.GetAllUCServicesResponse;
import zimbraadmin.GetAllVolumesRequest;
import zimbraadmin.GetAllVolumesResponse;
import zimbraadmin.GetAllXMPPComponentsRequest;
import zimbraadmin.GetAllXMPPComponentsResponse;
import zimbraadmin.GetAllZimletsRequest;
import zimbraadmin.GetAllZimletsResponse;
import zimbraadmin.GetAlwaysOnClusterRequest;
import zimbraadmin.GetAlwaysOnClusterResponse;
import zimbraadmin.GetApplianceHSMFSRequest;
import zimbraadmin.GetApplianceHSMFSResponse;
import zimbraadmin.GetAttributeInfoRequest;
import zimbraadmin.GetAttributeInfoResponse;
import zimbraadmin.GetCSRRequest;
import zimbraadmin.GetCSRResponse;
import zimbraadmin.GetCalendarResourceRequest;
import zimbraadmin.GetCalendarResourceResponse;
import zimbraadmin.GetCertRequest;
import zimbraadmin.GetCertResponse;
import zimbraadmin.GetClusterStatusRequest;
import zimbraadmin.GetClusterStatusResponse;
import zimbraadmin.GetConfigRequest;
import zimbraadmin.GetConfigResponse;
import zimbraadmin.GetCosRequest;
import zimbraadmin.GetCosResponse;
import zimbraadmin.GetCreateObjectAttrsRequest;
import zimbraadmin.GetCreateObjectAttrsResponse;
import zimbraadmin.GetCurrentVolumesRequest;
import zimbraadmin.GetCurrentVolumesResponse;
import zimbraadmin.GetDataSourcesRequest;
import zimbraadmin.GetDataSourcesResponse;
import zimbraadmin.GetDelegatedAdminConstraintsRequest;
import zimbraadmin.GetDelegatedAdminConstraintsResponse;
import zimbraadmin.GetDeviceStatusRequest;
import zimbraadmin.GetDeviceStatusResponse;
import zimbraadmin.GetDevicesCountRequest;
import zimbraadmin.GetDevicesCountResponse;
import zimbraadmin.GetDevicesCountSinceLastUsedRequest;
import zimbraadmin.GetDevicesCountSinceLastUsedResponse;
import zimbraadmin.GetDevicesCountUsedTodayRequest;
import zimbraadmin.GetDevicesCountUsedTodayResponse;
import zimbraadmin.GetDevicesRequest;
import zimbraadmin.GetDevicesResponse;
import zimbraadmin.GetDistributionListMembershipRequest;
import zimbraadmin.GetDistributionListMembershipResponse;
import zimbraadmin.GetDistributionListRequest;
import zimbraadmin.GetDistributionListResponse;
import zimbraadmin.GetDomainInfoRequest;
import zimbraadmin.GetDomainInfoResponse;
import zimbraadmin.GetDomainRequest;
import zimbraadmin.GetDomainResponse;
import zimbraadmin.GetEffectiveRightsRequest;
import zimbraadmin.GetEffectiveRightsResponse;
import zimbraadmin.GetFreeBusyQueueInfoRequest;
import zimbraadmin.GetFreeBusyQueueInfoResponse;
import zimbraadmin.GetGrantsRequest;
import zimbraadmin.GetGrantsResponse;
import zimbraadmin.GetHsmStatusRequest;
import zimbraadmin.GetHsmStatusResponse;
import zimbraadmin.GetIndexStatsRequest;
import zimbraadmin.GetIndexStatsResponse;
import zimbraadmin.GetLDAPEntriesRequest;
import zimbraadmin.GetLDAPEntriesResponse;
import zimbraadmin.GetLicenseInfoRequest;
import zimbraadmin.GetLicenseInfoResponse;
import zimbraadmin.GetLicenseRequest;
import zimbraadmin.GetLicenseResponse;
import zimbraadmin.GetLoggerStatsRequest;
import zimbraadmin.GetLoggerStatsResponse;
import zimbraadmin.GetMailQueueInfoRequest;
import zimbraadmin.GetMailQueueInfoResponse;
import zimbraadmin.GetMailQueueRequest;
import zimbraadmin.GetMailQueueResponse;
import zimbraadmin.GetMailboxRequest;
import zimbraadmin.GetMailboxResponse;
import zimbraadmin.GetMailboxStatsRequest;
import zimbraadmin.GetMailboxStatsResponse;
import zimbraadmin.GetMailboxVersionRequest;
import zimbraadmin.GetMailboxVersionResponse;
import zimbraadmin.GetMailboxVolumesRequest;
import zimbraadmin.GetMailboxVolumesResponse;
import zimbraadmin.GetMemcachedClientConfigRequest;
import zimbraadmin.GetMemcachedClientConfigResponse;
import zimbraadmin.GetQuotaUsageRequest;
import zimbraadmin.GetQuotaUsageResponse;
import zimbraadmin.GetRightRequest;
import zimbraadmin.GetRightResponse;
import zimbraadmin.GetRightsDocRequest;
import zimbraadmin.GetRightsDocResponse;
import zimbraadmin.GetSMIMEConfigRequest;
import zimbraadmin.GetSMIMEConfigResponse;
import zimbraadmin.GetServerNIfsRequest;
import zimbraadmin.GetServerNIfsResponse;
import zimbraadmin.GetServerRequest;
import zimbraadmin.GetServerResponse;
import zimbraadmin.GetServerStatsRequest;
import zimbraadmin.GetServerStatsResponse;
import zimbraadmin.GetServiceStatusRequest;
import zimbraadmin.GetServiceStatusResponse;
import zimbraadmin.GetSessionsRequest;
import zimbraadmin.GetSessionsResponse;
import zimbraadmin.GetShareInfoRequest;
import zimbraadmin.GetShareInfoResponse;
import zimbraadmin.GetSystemRetentionPolicyRequest;
import zimbraadmin.GetSystemRetentionPolicyResponse;
import zimbraadmin.GetUCServiceRequest;
import zimbraadmin.GetUCServiceResponse;
import zimbraadmin.GetVersionInfoRequest;
import zimbraadmin.GetVersionInfoResponse;
import zimbraadmin.GetVolumeRequest;
import zimbraadmin.GetVolumeResponse;
import zimbraadmin.GetXMPPComponentRequest;
import zimbraadmin.GetXMPPComponentResponse;
import zimbraadmin.GetXMbxSearchesListRequest;
import zimbraadmin.GetXMbxSearchesListResponse;
import zimbraadmin.GetZimletRequest;
import zimbraadmin.GetZimletResponse;
import zimbraadmin.GetZimletStatusRequest;
import zimbraadmin.GetZimletStatusResponse;
import zimbraadmin.GrantRightRequest;
import zimbraadmin.GrantRightResponse;
import zimbraadmin.HsmRequest;
import zimbraadmin.HsmResponse;
import zimbraadmin.InstallCertRequest;
import zimbraadmin.InstallCertResponse;
import zimbraadmin.InstallLicenseRequest;
import zimbraadmin.InstallLicenseResponse;
import zimbraadmin.LockoutMailboxRequest;
import zimbraadmin.LockoutMailboxResponse;
import zimbraadmin.MailQueueActionRequest;
import zimbraadmin.MailQueueActionResponse;
import zimbraadmin.MailQueueFlushRequest;
import zimbraadmin.MailQueueFlushResponse;
import zimbraadmin.MigrateAccountRequest;
import zimbraadmin.MigrateAccountResponse;
import zimbraadmin.ModifyAccountRequest;
import zimbraadmin.ModifyAccountResponse;
import zimbraadmin.ModifyAdminSavedSearchesRequest;
import zimbraadmin.ModifyAdminSavedSearchesResponse;
import zimbraadmin.ModifyAlwaysOnClusterRequest;
import zimbraadmin.ModifyAlwaysOnClusterResponse;
import zimbraadmin.ModifyCalendarResourceRequest;
import zimbraadmin.ModifyCalendarResourceResponse;
import zimbraadmin.ModifyConfigRequest;
import zimbraadmin.ModifyConfigResponse;
import zimbraadmin.ModifyCosRequest;
import zimbraadmin.ModifyCosResponse;
import zimbraadmin.ModifyDataSourceRequest;
import zimbraadmin.ModifyDataSourceResponse;
import zimbraadmin.ModifyDelegatedAdminConstraintsRequest;
import zimbraadmin.ModifyDelegatedAdminConstraintsResponse;
import zimbraadmin.ModifyDistributionListRequest;
import zimbraadmin.ModifyDistributionListResponse;
import zimbraadmin.ModifyDomainRequest;
import zimbraadmin.ModifyDomainResponse;
import zimbraadmin.ModifyLDAPEntryRequest;
import zimbraadmin.ModifyLDAPEntryResponse;
import zimbraadmin.ModifySMIMEConfigRequest;
import zimbraadmin.ModifySMIMEConfigResponse;
import zimbraadmin.ModifyServerRequest;
import zimbraadmin.ModifyServerResponse;
import zimbraadmin.ModifySystemRetentionPolicyRequest;
import zimbraadmin.ModifySystemRetentionPolicyResponse;
import zimbraadmin.ModifyUCServiceRequest;
import zimbraadmin.ModifyUCServiceResponse;
import zimbraadmin.ModifyVolumeRequest;
import zimbraadmin.ModifyVolumeResponse;
import zimbraadmin.ModifyZimletRequest;
import zimbraadmin.ModifyZimletResponse;
import zimbraadmin.MoveBlobsRequest;
import zimbraadmin.MoveBlobsResponse;
import zimbraadmin.MoveMailboxRequest;
import zimbraadmin.MoveMailboxResponse;
import zimbraadmin.NoOpRequest;
import zimbraadmin.NoOpResponse;
import zimbraadmin.PingRequest;
import zimbraadmin.PingResponse;
import zimbraadmin.PurgeAccountCalendarCacheRequest;
import zimbraadmin.PurgeAccountCalendarCacheResponse;
import zimbraadmin.PurgeFreeBusyQueueRequest;
import zimbraadmin.PurgeFreeBusyQueueResponse;
import zimbraadmin.PurgeMessagesRequest;
import zimbraadmin.PurgeMessagesResponse;
import zimbraadmin.PurgeMovedMailboxRequest;
import zimbraadmin.PurgeMovedMailboxResponse;
import zimbraadmin.PushFreeBusyRequest;
import zimbraadmin.PushFreeBusyResponse;
import zimbraadmin.QueryMailboxMoveRequest;
import zimbraadmin.QueryMailboxMoveResponse;
import zimbraadmin.QueryWaitSetRequest;
import zimbraadmin.QueryWaitSetResponse;
import zimbraadmin.ReIndexRequest;
import zimbraadmin.ReIndexResponse;
import zimbraadmin.RecalculateMailboxCountsRequest;
import zimbraadmin.RecalculateMailboxCountsResponse;
import zimbraadmin.RefreshRegisteredAuthTokensRequest;
import zimbraadmin.RefreshRegisteredAuthTokensResponse;
import zimbraadmin.RegisterMailboxMoveOutRequest;
import zimbraadmin.RegisterMailboxMoveOutResponse;
import zimbraadmin.ReloadAccountRequest;
import zimbraadmin.ReloadAccountResponse;
import zimbraadmin.ReloadLocalConfigRequest;
import zimbraadmin.ReloadLocalConfigResponse;
import zimbraadmin.ReloadMemcachedClientConfigRequest;
import zimbraadmin.ReloadMemcachedClientConfigResponse;
import zimbraadmin.RemoteWipeRequest;
import zimbraadmin.RemoteWipeResponse;
import zimbraadmin.RemoveAccountAliasRequest;
import zimbraadmin.RemoveAccountAliasResponse;
import zimbraadmin.RemoveAccountLoggerRequest;
import zimbraadmin.RemoveAccountLoggerResponse;
import zimbraadmin.RemoveDeviceRequest;
import zimbraadmin.RemoveDeviceResponse;
import zimbraadmin.RemoveDistributionListAliasRequest;
import zimbraadmin.RemoveDistributionListAliasResponse;
import zimbraadmin.RemoveDistributionListMemberRequest;
import zimbraadmin.RemoveDistributionListMemberResponse;
import zimbraadmin.RenameAccountRequest;
import zimbraadmin.RenameAccountResponse;
import zimbraadmin.RenameCalendarResourceRequest;
import zimbraadmin.RenameCalendarResourceResponse;
import zimbraadmin.RenameCosRequest;
import zimbraadmin.RenameCosResponse;
import zimbraadmin.RenameDistributionListRequest;
import zimbraadmin.RenameDistributionListResponse;
import zimbraadmin.RenameLDAPEntryRequest;
import zimbraadmin.RenameLDAPEntryResponse;
import zimbraadmin.RenameUCServiceRequest;
import zimbraadmin.RenameUCServiceResponse;
import zimbraadmin.ResetAllLoggersRequest;
import zimbraadmin.ResetAllLoggersResponse;
import zimbraadmin.RestoreRequest;
import zimbraadmin.RestoreResponse;
import zimbraadmin.ResumeDeviceRequest;
import zimbraadmin.ResumeDeviceResponse;
import zimbraadmin.RevokeRightRequest;
import zimbraadmin.RevokeRightResponse;
import zimbraadmin.RolloverRedoLogRequest;
import zimbraadmin.RolloverRedoLogResponse;
import zimbraadmin.RunUnitTestsRequest;
import zimbraadmin.RunUnitTestsResponse;
import zimbraadmin.ScheduleBackupsRequest;
import zimbraadmin.ScheduleBackupsResponse;
import zimbraadmin.SearchAccountsRequest;
import zimbraadmin.SearchAccountsResponse;
import zimbraadmin.SearchAutoProvDirectoryRequest;
import zimbraadmin.SearchAutoProvDirectoryResponse;
import zimbraadmin.SearchCalendarResourcesRequest;
import zimbraadmin.SearchCalendarResourcesResponse;
import zimbraadmin.SearchDirectoryRequest;
import zimbraadmin.SearchDirectoryResponse;
import zimbraadmin.SearchGalRequest;
import zimbraadmin.SearchGalResponse;
import zimbraadmin.SearchMultiMailboxRequest;
import zimbraadmin.SearchMultiMailboxResponse;
import zimbraadmin.SetCurrentVolumeRequest;
import zimbraadmin.SetCurrentVolumeResponse;
import zimbraadmin.SetLocalServerOnlineRequest;
import zimbraadmin.SetLocalServerOnlineResponse;
import zimbraadmin.SetPasswordRequest;
import zimbraadmin.SetPasswordResponse;
import zimbraadmin.SetServerOfflineRequest;
import zimbraadmin.SetServerOfflineResponse;
import zimbraadmin.SuspendDeviceRequest;
import zimbraadmin.SuspendDeviceResponse;
import zimbraadmin.SyncGalAccountRequest;
import zimbraadmin.SyncGalAccountResponse;
import zimbraadmin.UndeployZimletRequest;
import zimbraadmin.UndeployZimletResponse;
import zimbraadmin.UnloadMailboxRequest;
import zimbraadmin.UnloadMailboxResponse;
import zimbraadmin.UnregisterMailboxMoveOutRequest;
import zimbraadmin.UnregisterMailboxMoveOutResponse;
import zimbraadmin.UpdateDeviceStatusRequest;
import zimbraadmin.UpdateDeviceStatusResponse;
import zimbraadmin.UpdatePresenceSessionIdRequest;
import zimbraadmin.UpdatePresenceSessionIdResponse;
import zimbraadmin.UploadDomCertRequest;
import zimbraadmin.UploadDomCertResponse;
import zimbraadmin.UploadProxyCARequest;
import zimbraadmin.UploadProxyCAResponse;
import zimbraadmin.VerifyCertKeyRequest;
import zimbraadmin.VerifyCertKeyResponse;
import zimbraadmin.VerifyIndexRequest;
import zimbraadmin.VerifyIndexResponse;
import zimbraadmin.VerifyStoreManagerRequest;
import zimbraadmin.VerifyStoreManagerResponse;
import zimbraadmin.VersionCheckRequest;
import zimbraadmin.VersionCheckResponse;
import zimbraadminext.BulkIMAPDataImportRequest;
import zimbraadminext.BulkIMAPDataImportResponse;
import zimbraadminext.BulkImportAccountsRequest;
import zimbraadminext.BulkImportAccountsResponse;
import zimbraadminext.GenerateBulkProvisionFileFromLDAPRequest;
import zimbraadminext.GenerateBulkProvisionFileFromLDAPResponse;
import zimbraadminext.GetBulkIMAPImportTaskListRequest;
import zimbraadminext.GetBulkIMAPImportTaskListResponse;
import zimbraadminext.PurgeBulkIMAPImportTasksRequest;
import zimbraadminext.PurgeBulkIMAPImportTasksResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "zcsAdminPortType", targetNamespace = "http://www.zimbra.com/wsdl/ZimbraService.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    zimbraadminext.ObjectFactory.class,
    zimbramail.ObjectFactory.class,
    zimbraadmin.ObjectFactory.class,
    zimbra.ObjectFactory.class,
    zimbrasync.ObjectFactory.class
})
public interface ZcsAdminPortType {


    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AbortHsmResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AbortHsm")
    @WebResult(name = "AbortHsmResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AbortHsmResponse abortHsmRequest(
        @WebParam(name = "AbortHsmRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AbortHsmRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AbortXMbxSearchResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AbortXMbxSearch")
    @WebResult(name = "AbortXMbxSearchResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AbortXMbxSearchResponse abortXMbxSearchRequest(
        @WebParam(name = "AbortXMbxSearchRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AbortXMbxSearchRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ActivateLicenseResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ActivateLicense")
    @WebResult(name = "ActivateLicenseResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ActivateLicenseResponse activateLicenseRequest(
        @WebParam(name = "ActivateLicenseRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ActivateLicenseRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AddAccountAliasResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AddAccountAlias")
    @WebResult(name = "AddAccountAliasResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AddAccountAliasResponse addAccountAliasRequest(
        @WebParam(name = "AddAccountAliasRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AddAccountAliasRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AddAccountLoggerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AddAccountLogger")
    @WebResult(name = "AddAccountLoggerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AddAccountLoggerResponse addAccountLoggerRequest(
        @WebParam(name = "AddAccountLoggerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AddAccountLoggerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AddDistributionListAliasResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AddDistributionListAlias")
    @WebResult(name = "AddDistributionListAliasResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AddDistributionListAliasResponse addDistributionListAliasRequest(
        @WebParam(name = "AddDistributionListAliasRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AddDistributionListAliasRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AddDistributionListMemberResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AddDistributionListMember")
    @WebResult(name = "AddDistributionListMemberResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AddDistributionListMemberResponse addDistributionListMemberRequest(
        @WebParam(name = "AddDistributionListMemberRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AddDistributionListMemberRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AddGalSyncDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AddGalSyncDataSource")
    @WebResult(name = "AddGalSyncDataSourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AddGalSyncDataSourceResponse addGalSyncDataSourceRequest(
        @WebParam(name = "AddGalSyncDataSourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AddGalSyncDataSourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AdminCreateWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AdminCreateWaitSet")
    @WebResult(name = "AdminCreateWaitSetResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AdminCreateWaitSetResponse adminCreateWaitSetRequest(
        @WebParam(name = "AdminCreateWaitSetRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AdminCreateWaitSetRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AdminDestroyWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AdminDestroyWaitSet")
    @WebResult(name = "AdminDestroyWaitSetResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AdminDestroyWaitSetResponse adminDestroyWaitSetRequest(
        @WebParam(name = "AdminDestroyWaitSetRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AdminDestroyWaitSetRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AdminWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AdminWaitSet")
    @WebResult(name = "AdminWaitSetResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AdminWaitSetResponse adminWaitSetRequest(
        @WebParam(name = "AdminWaitSetRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AdminWaitSetRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AuthResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/Auth")
    @WebResult(name = "AuthResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AuthResponse authRequest(
        @WebParam(name = "AuthRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AuthRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AutoCompleteGalResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AutoCompleteGal")
    @WebResult(name = "AutoCompleteGalResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AutoCompleteGalResponse autoCompleteGalRequest(
        @WebParam(name = "AutoCompleteGalRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AutoCompleteGalRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AutoProvAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AutoProvAccount")
    @WebResult(name = "AutoProvAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AutoProvAccountResponse autoProvAccountRequest(
        @WebParam(name = "AutoProvAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AutoProvAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.AutoProvTaskControlResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/AutoProvTaskControl")
    @WebResult(name = "AutoProvTaskControlResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public AutoProvTaskControlResponse autoProvTaskControlRequest(
        @WebParam(name = "AutoProvTaskControlRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        AutoProvTaskControlRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.BackupAccountQueryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/BackupAccountQuery")
    @WebResult(name = "BackupAccountQueryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public BackupAccountQueryResponse backupAccountQueryRequest(
        @WebParam(name = "BackupAccountQueryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        BackupAccountQueryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.BackupQueryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/BackupQuery")
    @WebResult(name = "BackupQueryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public BackupQueryResponse backupQueryRequest(
        @WebParam(name = "BackupQueryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        BackupQueryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.BackupResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/Backup")
    @WebResult(name = "BackupResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public BackupResponse backupRequest(
        @WebParam(name = "BackupRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        BackupRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CancelPendingRemoteWipeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CancelPendingRemoteWipe")
    @WebResult(name = "CancelPendingRemoteWipeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CancelPendingRemoteWipeResponse cancelPendingRemoteWipeRequest(
        @WebParam(name = "CancelPendingRemoteWipeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CancelPendingRemoteWipeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckAuthConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckAuthConfig")
    @WebResult(name = "CheckAuthConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckAuthConfigResponse checkAuthConfigRequest(
        @WebParam(name = "CheckAuthConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckAuthConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckBlobConsistencyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckBlobConsistency")
    @WebResult(name = "CheckBlobConsistencyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckBlobConsistencyResponse checkBlobConsistencyRequest(
        @WebParam(name = "CheckBlobConsistencyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckBlobConsistencyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckDirectoryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckDirectory")
    @WebResult(name = "CheckDirectoryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckDirectoryResponse checkDirectoryRequest(
        @WebParam(name = "CheckDirectoryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckDirectoryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckDomainMXRecordResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckDomainMXRecord")
    @WebResult(name = "CheckDomainMXRecordResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckDomainMXRecordResponse checkDomainMXRecordRequest(
        @WebParam(name = "CheckDomainMXRecordRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckDomainMXRecordRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckExchangeAuthResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckExchangeAuth")
    @WebResult(name = "CheckExchangeAuthResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckExchangeAuthResponse checkExchangeAuthRequest(
        @WebParam(name = "CheckExchangeAuthRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckExchangeAuthRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckGalConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckGalConfig")
    @WebResult(name = "CheckGalConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckGalConfigResponse checkGalConfigRequest(
        @WebParam(name = "CheckGalConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckGalConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckHealthResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckHealth")
    @WebResult(name = "CheckHealthResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckHealthResponse checkHealthRequest(
        @WebParam(name = "CheckHealthRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckHealthRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckHostnameResolveResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckHostnameResolve")
    @WebResult(name = "CheckHostnameResolveResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckHostnameResolveResponse checkHostnameResolveRequest(
        @WebParam(name = "CheckHostnameResolveRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckHostnameResolveRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckPasswordStrengthResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckPasswordStrength")
    @WebResult(name = "CheckPasswordStrengthResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckPasswordStrengthResponse checkPasswordStrengthRequest(
        @WebParam(name = "CheckPasswordStrengthRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckPasswordStrengthRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CheckRightResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CheckRight")
    @WebResult(name = "CheckRightResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CheckRightResponse checkRightRequest(
        @WebParam(name = "CheckRightRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CheckRightRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ClearCookieResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ClearCookie")
    @WebResult(name = "ClearCookieResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ClearCookieResponse clearCookieRequest(
        @WebParam(name = "ClearCookieRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ClearCookieRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CompactIndexResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CompactIndex")
    @WebResult(name = "CompactIndexResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CompactIndexResponse compactIndexRequest(
        @WebParam(name = "CompactIndexRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CompactIndexRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ComputeAggregateQuotaUsageResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ComputeAggregateQuotaUsage")
    @WebResult(name = "ComputeAggregateQuotaUsageResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ComputeAggregateQuotaUsageResponse computeAggregateQuotaUsageRequest(
        @WebParam(name = "ComputeAggregateQuotaUsageRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ComputeAggregateQuotaUsageRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ConfigureZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ConfigureZimlet")
    @WebResult(name = "ConfigureZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ConfigureZimletResponse configureZimletRequest(
        @WebParam(name = "ConfigureZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ConfigureZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CopyCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CopyCos")
    @WebResult(name = "CopyCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CopyCosResponse copyCosRequest(
        @WebParam(name = "CopyCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CopyCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CountAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CountAccount")
    @WebResult(name = "CountAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CountAccountResponse countAccountRequest(
        @WebParam(name = "CountAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CountAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CountObjectsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CountObjects")
    @WebResult(name = "CountObjectsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CountObjectsResponse countObjectsRequest(
        @WebParam(name = "CountObjectsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CountObjectsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateAccount")
    @WebResult(name = "CreateAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateAccountResponse createAccountRequest(
        @WebParam(name = "CreateAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateAlwaysOnClusterResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateAlwaysOnCluster")
    @WebResult(name = "CreateAlwaysOnClusterResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateAlwaysOnClusterResponse createAlwaysOnClusterRequest(
        @WebParam(name = "CreateAlwaysOnClusterRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateAlwaysOnClusterRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateArchiveResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateArchive")
    @WebResult(name = "CreateArchiveResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateArchiveResponse createArchiveRequest(
        @WebParam(name = "CreateArchiveRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateArchiveRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateCalendarResourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateCalendarResource")
    @WebResult(name = "CreateCalendarResourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateCalendarResourceResponse createCalendarResourceRequest(
        @WebParam(name = "CreateCalendarResourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateCalendarResourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateCos")
    @WebResult(name = "CreateCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateCosResponse createCosRequest(
        @WebParam(name = "CreateCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateDataSource")
    @WebResult(name = "CreateDataSourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateDataSourceResponse createDataSourceRequest(
        @WebParam(name = "CreateDataSourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateDataSourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateDistributionList")
    @WebResult(name = "CreateDistributionListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateDistributionListResponse createDistributionListRequest(
        @WebParam(name = "CreateDistributionListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateDistributionListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateDomainResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateDomain")
    @WebResult(name = "CreateDomainResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateDomainResponse createDomainRequest(
        @WebParam(name = "CreateDomainRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateDomainRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateGalSyncAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateGalSyncAccount")
    @WebResult(name = "CreateGalSyncAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateGalSyncAccountResponse createGalSyncAccountRequest(
        @WebParam(name = "CreateGalSyncAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateGalSyncAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateLDAPEntryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateLDAPEntry")
    @WebResult(name = "CreateLDAPEntryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateLDAPEntryResponse createLDAPEntryRequest(
        @WebParam(name = "CreateLDAPEntryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateLDAPEntryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateServerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateServer")
    @WebResult(name = "CreateServerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateServerResponse createServerRequest(
        @WebParam(name = "CreateServerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateServerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateSystemRetentionPolicyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateSystemRetentionPolicy")
    @WebResult(name = "CreateSystemRetentionPolicyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateSystemRetentionPolicyResponse createSystemRetentionPolicyRequest(
        @WebParam(name = "CreateSystemRetentionPolicyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateSystemRetentionPolicyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateUCServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateUCService")
    @WebResult(name = "CreateUCServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateUCServiceResponse createUCServiceRequest(
        @WebParam(name = "CreateUCServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateUCServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateVolumeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateVolume")
    @WebResult(name = "CreateVolumeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateVolumeResponse createVolumeRequest(
        @WebParam(name = "CreateVolumeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateVolumeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateXMPPComponentResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateXMPPComponent")
    @WebResult(name = "CreateXMPPComponentResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateXMPPComponentResponse createXMPPComponentRequest(
        @WebParam(name = "CreateXMPPComponentRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateXMPPComponentRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateXMbxSearchResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateXMbxSearch")
    @WebResult(name = "CreateXMbxSearchResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateXMbxSearchResponse createXMbxSearchRequest(
        @WebParam(name = "CreateXMbxSearchRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateXMbxSearchRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.CreateZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/CreateZimlet")
    @WebResult(name = "CreateZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public CreateZimletResponse createZimletRequest(
        @WebParam(name = "CreateZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        CreateZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DedupeBlobsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DedupeBlobs")
    @WebResult(name = "DedupeBlobsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DedupeBlobsResponse dedupeBlobsRequest(
        @WebParam(name = "DedupeBlobsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DedupeBlobsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DelegateAuthResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DelegateAuth")
    @WebResult(name = "DelegateAuthResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DelegateAuthResponse delegateAuthRequest(
        @WebParam(name = "DelegateAuthRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DelegateAuthRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteAccount")
    @WebResult(name = "DeleteAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteAccountResponse deleteAccountRequest(
        @WebParam(name = "DeleteAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteAlwaysOnClusterResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteAlwaysOnCluster")
    @WebResult(name = "DeleteAlwaysOnClusterResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteAlwaysOnClusterResponse deleteAlwaysOnClusterRequest(
        @WebParam(name = "DeleteAlwaysOnClusterRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteAlwaysOnClusterRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteCalendarResourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteCalendarResource")
    @WebResult(name = "DeleteCalendarResourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteCalendarResourceResponse deleteCalendarResourceRequest(
        @WebParam(name = "DeleteCalendarResourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteCalendarResourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteCos")
    @WebResult(name = "DeleteCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteCosResponse deleteCosRequest(
        @WebParam(name = "DeleteCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteDataSource")
    @WebResult(name = "DeleteDataSourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteDataSourceResponse deleteDataSourceRequest(
        @WebParam(name = "DeleteDataSourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteDataSourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteDistributionList")
    @WebResult(name = "DeleteDistributionListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteDistributionListResponse deleteDistributionListRequest(
        @WebParam(name = "DeleteDistributionListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteDistributionListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteDomainResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteDomain")
    @WebResult(name = "DeleteDomainResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteDomainResponse deleteDomainRequest(
        @WebParam(name = "DeleteDomainRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteDomainRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteGalSyncAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteGalSyncAccount")
    @WebResult(name = "DeleteGalSyncAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteGalSyncAccountResponse deleteGalSyncAccountRequest(
        @WebParam(name = "DeleteGalSyncAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteGalSyncAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteLDAPEntryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteLDAPEntry")
    @WebResult(name = "DeleteLDAPEntryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteLDAPEntryResponse deleteLDAPEntryRequest(
        @WebParam(name = "DeleteLDAPEntryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteLDAPEntryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteMailbox")
    @WebResult(name = "DeleteMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteMailboxResponse deleteMailboxRequest(
        @WebParam(name = "DeleteMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteServerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteServer")
    @WebResult(name = "DeleteServerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteServerResponse deleteServerRequest(
        @WebParam(name = "DeleteServerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteServerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteSystemRetentionPolicyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteSystemRetentionPolicy")
    @WebResult(name = "DeleteSystemRetentionPolicyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteSystemRetentionPolicyResponse deleteSystemRetentionPolicyRequest(
        @WebParam(name = "DeleteSystemRetentionPolicyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteSystemRetentionPolicyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteUCServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteUCService")
    @WebResult(name = "DeleteUCServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteUCServiceResponse deleteUCServiceRequest(
        @WebParam(name = "DeleteUCServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteUCServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteVolumeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteVolume")
    @WebResult(name = "DeleteVolumeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteVolumeResponse deleteVolumeRequest(
        @WebParam(name = "DeleteVolumeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteVolumeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteXMPPComponentResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteXMPPComponent")
    @WebResult(name = "DeleteXMPPComponentResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteXMPPComponentResponse deleteXMPPComponentRequest(
        @WebParam(name = "DeleteXMPPComponentRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteXMPPComponentRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteXMbxSearchResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteXMbxSearch")
    @WebResult(name = "DeleteXMbxSearchResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteXMbxSearchResponse deleteXMbxSearchRequest(
        @WebParam(name = "DeleteXMbxSearchRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteXMbxSearchRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeleteZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeleteZimlet")
    @WebResult(name = "DeleteZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeleteZimletResponse deleteZimletRequest(
        @WebParam(name = "DeleteZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeleteZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DeployZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DeployZimlet")
    @WebResult(name = "DeployZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DeployZimletResponse deployZimletRequest(
        @WebParam(name = "DeployZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DeployZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DisableArchiveResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DisableArchive")
    @WebResult(name = "DisableArchiveResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DisableArchiveResponse disableArchiveRequest(
        @WebParam(name = "DisableArchiveRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DisableArchiveRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.DumpSessionsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/DumpSessions")
    @WebResult(name = "DumpSessionsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public DumpSessionsResponse dumpSessionsRequest(
        @WebParam(name = "DumpSessionsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        DumpSessionsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.EnableArchiveResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/EnableArchive")
    @WebResult(name = "EnableArchiveResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public EnableArchiveResponse enableArchiveRequest(
        @WebParam(name = "EnableArchiveRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        EnableArchiveRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ExportAndDeleteItemsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ExportAndDeleteItems")
    @WebResult(name = "ExportAndDeleteItemsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ExportAndDeleteItemsResponse exportAndDeleteItemsRequest(
        @WebParam(name = "ExportAndDeleteItemsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ExportAndDeleteItemsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ExportMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ExportMailbox")
    @WebResult(name = "ExportMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ExportMailboxResponse exportMailboxRequest(
        @WebParam(name = "ExportMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ExportMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.FailoverClusterServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/FailoverClusterService")
    @WebResult(name = "FailoverClusterServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public FailoverClusterServiceResponse failoverClusterServiceRequest(
        @WebParam(name = "FailoverClusterServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        FailoverClusterServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.FixCalendarEndTimeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/FixCalendarEndTime")
    @WebResult(name = "FixCalendarEndTimeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public FixCalendarEndTimeResponse fixCalendarEndTimeRequest(
        @WebParam(name = "FixCalendarEndTimeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        FixCalendarEndTimeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.FixCalendarPriorityResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/FixCalendarPriority")
    @WebResult(name = "FixCalendarPriorityResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public FixCalendarPriorityResponse fixCalendarPriorityRequest(
        @WebParam(name = "FixCalendarPriorityRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        FixCalendarPriorityRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.FixCalendarTZResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/FixCalendarTZ")
    @WebResult(name = "FixCalendarTZResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public FixCalendarTZResponse fixCalendarTZRequest(
        @WebParam(name = "FixCalendarTZRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        FixCalendarTZRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.FlushCacheResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/FlushCache")
    @WebResult(name = "FlushCacheResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public FlushCacheResponse flushCacheRequest(
        @WebParam(name = "FlushCacheRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        FlushCacheRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GenCSRResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GenCSR")
    @WebResult(name = "GenCSRResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GenCSRResponse genCSRRequest(
        @WebParam(name = "GenCSRRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GenCSRRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAccountInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAccountInfo")
    @WebResult(name = "GetAccountInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAccountInfoResponse getAccountInfoRequest(
        @WebParam(name = "GetAccountInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAccountInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAccountLoggersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAccountLoggers")
    @WebResult(name = "GetAccountLoggersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAccountLoggersResponse getAccountLoggersRequest(
        @WebParam(name = "GetAccountLoggersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAccountLoggersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAccountMembershipResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAccountMembership")
    @WebResult(name = "GetAccountMembershipResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAccountMembershipResponse getAccountMembershipRequest(
        @WebParam(name = "GetAccountMembershipRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAccountMembershipRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAccount")
    @WebResult(name = "GetAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAccountResponse getAccountRequest(
        @WebParam(name = "GetAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAdminConsoleUICompResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAdminConsoleUIComp")
    @WebResult(name = "GetAdminConsoleUICompResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAdminConsoleUICompResponse getAdminConsoleUICompRequest(
        @WebParam(name = "GetAdminConsoleUICompRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAdminConsoleUICompRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAdminExtensionZimletsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAdminExtensionZimlets")
    @WebResult(name = "GetAdminExtensionZimletsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAdminExtensionZimletsResponse getAdminExtensionZimletsRequest(
        @WebParam(name = "GetAdminExtensionZimletsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAdminExtensionZimletsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAdminSavedSearchesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAdminSavedSearches")
    @WebResult(name = "GetAdminSavedSearchesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAdminSavedSearchesResponse getAdminSavedSearchesRequest(
        @WebParam(name = "GetAdminSavedSearchesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAdminSavedSearchesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAggregateQuotaUsageOnServerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAggregateQuotaUsageOnServer")
    @WebResult(name = "GetAggregateQuotaUsageOnServerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAggregateQuotaUsageOnServerResponse getAggregateQuotaUsageOnServerRequest(
        @WebParam(name = "GetAggregateQuotaUsageOnServerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAggregateQuotaUsageOnServerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllAccountLoggersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllAccountLoggers")
    @WebResult(name = "GetAllAccountLoggersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllAccountLoggersResponse getAllAccountLoggersRequest(
        @WebParam(name = "GetAllAccountLoggersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllAccountLoggersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllAccountsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllAccounts")
    @WebResult(name = "GetAllAccountsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllAccountsResponse getAllAccountsRequest(
        @WebParam(name = "GetAllAccountsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllAccountsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllActiveServersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllActiveServers")
    @WebResult(name = "GetAllActiveServersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllActiveServersResponse getAllActiveServersRequest(
        @WebParam(name = "GetAllActiveServersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllActiveServersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllAdminAccountsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllAdminAccounts")
    @WebResult(name = "GetAllAdminAccountsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllAdminAccountsResponse getAllAdminAccountsRequest(
        @WebParam(name = "GetAllAdminAccountsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllAdminAccountsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllAlwaysOnClustersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllAlwaysOnClusters")
    @WebResult(name = "GetAllAlwaysOnClustersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllAlwaysOnClustersResponse getAllAlwaysOnClustersRequest(
        @WebParam(name = "GetAllAlwaysOnClustersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllAlwaysOnClustersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllCalendarResourcesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllCalendarResources")
    @WebResult(name = "GetAllCalendarResourcesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllCalendarResourcesResponse getAllCalendarResourcesRequest(
        @WebParam(name = "GetAllCalendarResourcesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllCalendarResourcesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllConfig")
    @WebResult(name = "GetAllConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllConfigResponse getAllConfigRequest(
        @WebParam(name = "GetAllConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllCos")
    @WebResult(name = "GetAllCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllCosResponse getAllCosRequest(
        @WebParam(name = "GetAllCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllDistributionListsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllDistributionLists")
    @WebResult(name = "GetAllDistributionListsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllDistributionListsResponse getAllDistributionListsRequest(
        @WebParam(name = "GetAllDistributionListsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllDistributionListsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllDomainsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllDomains")
    @WebResult(name = "GetAllDomainsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllDomainsResponse getAllDomainsRequest(
        @WebParam(name = "GetAllDomainsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllDomainsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllEffectiveRightsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllEffectiveRights")
    @WebResult(name = "GetAllEffectiveRightsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllEffectiveRightsResponse getAllEffectiveRightsRequest(
        @WebParam(name = "GetAllEffectiveRightsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllEffectiveRightsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllFreeBusyProvidersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllFreeBusyProviders")
    @WebResult(name = "GetAllFreeBusyProvidersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllFreeBusyProvidersResponse getAllFreeBusyProvidersRequest(
        @WebParam(name = "GetAllFreeBusyProvidersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllFreeBusyProvidersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllLocalesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllLocales")
    @WebResult(name = "GetAllLocalesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllLocalesResponse getAllLocalesRequest(
        @WebParam(name = "GetAllLocalesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllLocalesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllMailboxesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllMailboxes")
    @WebResult(name = "GetAllMailboxesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllMailboxesResponse getAllMailboxesRequest(
        @WebParam(name = "GetAllMailboxesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllMailboxesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllRightsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllRights")
    @WebResult(name = "GetAllRightsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllRightsResponse getAllRightsRequest(
        @WebParam(name = "GetAllRightsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllRightsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllServersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllServers")
    @WebResult(name = "GetAllServersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllServersResponse getAllServersRequest(
        @WebParam(name = "GetAllServersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllServersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllSkinsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllSkins")
    @WebResult(name = "GetAllSkinsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllSkinsResponse getAllSkinsRequest(
        @WebParam(name = "GetAllSkinsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllSkinsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllUCProvidersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllUCProviders")
    @WebResult(name = "GetAllUCProvidersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllUCProvidersResponse getAllUCProvidersRequest(
        @WebParam(name = "GetAllUCProvidersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllUCProvidersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllUCServicesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllUCServices")
    @WebResult(name = "GetAllUCServicesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllUCServicesResponse getAllUCServicesRequest(
        @WebParam(name = "GetAllUCServicesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllUCServicesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllVolumesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllVolumes")
    @WebResult(name = "GetAllVolumesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllVolumesResponse getAllVolumesRequest(
        @WebParam(name = "GetAllVolumesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllVolumesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllXMPPComponentsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllXMPPComponents")
    @WebResult(name = "GetAllXMPPComponentsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllXMPPComponentsResponse getAllXMPPComponentsRequest(
        @WebParam(name = "GetAllXMPPComponentsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllXMPPComponentsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAllZimletsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAllZimlets")
    @WebResult(name = "GetAllZimletsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAllZimletsResponse getAllZimletsRequest(
        @WebParam(name = "GetAllZimletsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAllZimletsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAlwaysOnClusterResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAlwaysOnCluster")
    @WebResult(name = "GetAlwaysOnClusterResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAlwaysOnClusterResponse getAlwaysOnClusterRequest(
        @WebParam(name = "GetAlwaysOnClusterRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAlwaysOnClusterRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetApplianceHSMFSResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetApplianceHSMFS")
    @WebResult(name = "GetApplianceHSMFSResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetApplianceHSMFSResponse getApplianceHSMFSRequest(
        @WebParam(name = "GetApplianceHSMFSRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetApplianceHSMFSRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetAttributeInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetAttributeInfo")
    @WebResult(name = "GetAttributeInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetAttributeInfoResponse getAttributeInfoRequest(
        @WebParam(name = "GetAttributeInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetAttributeInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCSRResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCSR")
    @WebResult(name = "GetCSRResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCSRResponse getCSRRequest(
        @WebParam(name = "GetCSRRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCSRRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCalendarResourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCalendarResource")
    @WebResult(name = "GetCalendarResourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCalendarResourceResponse getCalendarResourceRequest(
        @WebParam(name = "GetCalendarResourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCalendarResourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCertResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCert")
    @WebResult(name = "GetCertResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCertResponse getCertRequest(
        @WebParam(name = "GetCertRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCertRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetClusterStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetClusterStatus")
    @WebResult(name = "GetClusterStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetClusterStatusResponse getClusterStatusRequest(
        @WebParam(name = "GetClusterStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetClusterStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetConfig")
    @WebResult(name = "GetConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetConfigResponse getConfigRequest(
        @WebParam(name = "GetConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCos")
    @WebResult(name = "GetCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCosResponse getCosRequest(
        @WebParam(name = "GetCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCreateObjectAttrsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCreateObjectAttrs")
    @WebResult(name = "GetCreateObjectAttrsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCreateObjectAttrsResponse getCreateObjectAttrsRequest(
        @WebParam(name = "GetCreateObjectAttrsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCreateObjectAttrsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetCurrentVolumesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetCurrentVolumes")
    @WebResult(name = "GetCurrentVolumesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetCurrentVolumesResponse getCurrentVolumesRequest(
        @WebParam(name = "GetCurrentVolumesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetCurrentVolumesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDataSourcesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDataSources")
    @WebResult(name = "GetDataSourcesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDataSourcesResponse getDataSourcesRequest(
        @WebParam(name = "GetDataSourcesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDataSourcesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDelegatedAdminConstraintsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDelegatedAdminConstraints")
    @WebResult(name = "GetDelegatedAdminConstraintsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDelegatedAdminConstraintsResponse getDelegatedAdminConstraintsRequest(
        @WebParam(name = "GetDelegatedAdminConstraintsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDelegatedAdminConstraintsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDeviceStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDeviceStatus")
    @WebResult(name = "GetDeviceStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDeviceStatusResponse getDeviceStatusRequest(
        @WebParam(name = "GetDeviceStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDeviceStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDevicesCountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDevicesCount")
    @WebResult(name = "GetDevicesCountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDevicesCountResponse getDevicesCountRequest(
        @WebParam(name = "GetDevicesCountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDevicesCountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDevicesCountSinceLastUsedResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDevicesCountSinceLastUsed")
    @WebResult(name = "GetDevicesCountSinceLastUsedResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDevicesCountSinceLastUsedResponse getDevicesCountSinceLastUsedRequest(
        @WebParam(name = "GetDevicesCountSinceLastUsedRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDevicesCountSinceLastUsedRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDevicesCountUsedTodayResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDevicesCountUsedToday")
    @WebResult(name = "GetDevicesCountUsedTodayResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDevicesCountUsedTodayResponse getDevicesCountUsedTodayRequest(
        @WebParam(name = "GetDevicesCountUsedTodayRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDevicesCountUsedTodayRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDevicesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDevices")
    @WebResult(name = "GetDevicesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDevicesResponse getDevicesRequest(
        @WebParam(name = "GetDevicesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDevicesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDistributionListMembershipResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDistributionListMembership")
    @WebResult(name = "GetDistributionListMembershipResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDistributionListMembershipResponse getDistributionListMembershipRequest(
        @WebParam(name = "GetDistributionListMembershipRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDistributionListMembershipRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDistributionList")
    @WebResult(name = "GetDistributionListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDistributionListResponse getDistributionListRequest(
        @WebParam(name = "GetDistributionListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDistributionListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDomainInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDomainInfo")
    @WebResult(name = "GetDomainInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDomainInfoResponse getDomainInfoRequest(
        @WebParam(name = "GetDomainInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDomainInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetDomainResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetDomain")
    @WebResult(name = "GetDomainResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetDomainResponse getDomainRequest(
        @WebParam(name = "GetDomainRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetDomainRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetEffectiveRightsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetEffectiveRights")
    @WebResult(name = "GetEffectiveRightsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetEffectiveRightsResponse getEffectiveRightsRequest(
        @WebParam(name = "GetEffectiveRightsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetEffectiveRightsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetFreeBusyQueueInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetFreeBusyQueueInfo")
    @WebResult(name = "GetFreeBusyQueueInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetFreeBusyQueueInfoResponse getFreeBusyQueueInfoRequest(
        @WebParam(name = "GetFreeBusyQueueInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetFreeBusyQueueInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetGrantsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetGrants")
    @WebResult(name = "GetGrantsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetGrantsResponse getGrantsRequest(
        @WebParam(name = "GetGrantsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetGrantsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetHsmStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetHsmStatus")
    @WebResult(name = "GetHsmStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetHsmStatusResponse getHsmStatusRequest(
        @WebParam(name = "GetHsmStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetHsmStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetIndexStatsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetIndexStats")
    @WebResult(name = "GetIndexStatsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetIndexStatsResponse getIndexStatsRequest(
        @WebParam(name = "GetIndexStatsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetIndexStatsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetLDAPEntriesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetLDAPEntries")
    @WebResult(name = "GetLDAPEntriesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetLDAPEntriesResponse getLDAPEntriesRequest(
        @WebParam(name = "GetLDAPEntriesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetLDAPEntriesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetLicenseInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetLicenseInfo")
    @WebResult(name = "GetLicenseInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetLicenseInfoResponse getLicenseInfoRequest(
        @WebParam(name = "GetLicenseInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetLicenseInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetLicenseResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetLicense")
    @WebResult(name = "GetLicenseResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetLicenseResponse getLicenseRequest(
        @WebParam(name = "GetLicenseRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetLicenseRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetLoggerStatsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetLoggerStats")
    @WebResult(name = "GetLoggerStatsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetLoggerStatsResponse getLoggerStatsRequest(
        @WebParam(name = "GetLoggerStatsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetLoggerStatsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailQueueInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailQueueInfo")
    @WebResult(name = "GetMailQueueInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailQueueInfoResponse getMailQueueInfoRequest(
        @WebParam(name = "GetMailQueueInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailQueueInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailQueueResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailQueue")
    @WebResult(name = "GetMailQueueResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailQueueResponse getMailQueueRequest(
        @WebParam(name = "GetMailQueueRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailQueueRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailbox")
    @WebResult(name = "GetMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailboxResponse getMailboxRequest(
        @WebParam(name = "GetMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailboxStatsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailboxStats")
    @WebResult(name = "GetMailboxStatsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailboxStatsResponse getMailboxStatsRequest(
        @WebParam(name = "GetMailboxStatsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailboxStatsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailboxVersionResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailboxVersion")
    @WebResult(name = "GetMailboxVersionResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailboxVersionResponse getMailboxVersionRequest(
        @WebParam(name = "GetMailboxVersionRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailboxVersionRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMailboxVolumesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMailboxVolumes")
    @WebResult(name = "GetMailboxVolumesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMailboxVolumesResponse getMailboxVolumesRequest(
        @WebParam(name = "GetMailboxVolumesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMailboxVolumesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetMemcachedClientConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetMemcachedClientConfig")
    @WebResult(name = "GetMemcachedClientConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetMemcachedClientConfigResponse getMemcachedClientConfigRequest(
        @WebParam(name = "GetMemcachedClientConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetMemcachedClientConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetQuotaUsageResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetQuotaUsage")
    @WebResult(name = "GetQuotaUsageResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetQuotaUsageResponse getQuotaUsageRequest(
        @WebParam(name = "GetQuotaUsageRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetQuotaUsageRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetRightResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetRight")
    @WebResult(name = "GetRightResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetRightResponse getRightRequest(
        @WebParam(name = "GetRightRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetRightRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetRightsDocResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetRightsDoc")
    @WebResult(name = "GetRightsDocResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetRightsDocResponse getRightsDocRequest(
        @WebParam(name = "GetRightsDocRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetRightsDocRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetSMIMEConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetSMIMEConfig")
    @WebResult(name = "GetSMIMEConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetSMIMEConfigResponse getSMIMEConfigRequest(
        @WebParam(name = "GetSMIMEConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetSMIMEConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetServerNIfsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetServerNIfs")
    @WebResult(name = "GetServerNIfsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetServerNIfsResponse getServerNIfsRequest(
        @WebParam(name = "GetServerNIfsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetServerNIfsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetServerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetServer")
    @WebResult(name = "GetServerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetServerResponse getServerRequest(
        @WebParam(name = "GetServerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetServerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetServerStatsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetServerStats")
    @WebResult(name = "GetServerStatsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetServerStatsResponse getServerStatsRequest(
        @WebParam(name = "GetServerStatsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetServerStatsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetServiceStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetServiceStatus")
    @WebResult(name = "GetServiceStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetServiceStatusResponse getServiceStatusRequest(
        @WebParam(name = "GetServiceStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetServiceStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetSessionsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetSessions")
    @WebResult(name = "GetSessionsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetSessionsResponse getSessionsRequest(
        @WebParam(name = "GetSessionsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetSessionsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetShareInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetShareInfo")
    @WebResult(name = "GetShareInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetShareInfoResponse getShareInfoRequest(
        @WebParam(name = "GetShareInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetShareInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetSystemRetentionPolicyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetSystemRetentionPolicy")
    @WebResult(name = "GetSystemRetentionPolicyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetSystemRetentionPolicyResponse getSystemRetentionPolicyRequest(
        @WebParam(name = "GetSystemRetentionPolicyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetSystemRetentionPolicyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetUCServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetUCService")
    @WebResult(name = "GetUCServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetUCServiceResponse getUCServiceRequest(
        @WebParam(name = "GetUCServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetUCServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetVersionInfoResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetVersionInfo")
    @WebResult(name = "GetVersionInfoResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetVersionInfoResponse getVersionInfoRequest(
        @WebParam(name = "GetVersionInfoRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetVersionInfoRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetVolumeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetVolume")
    @WebResult(name = "GetVolumeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetVolumeResponse getVolumeRequest(
        @WebParam(name = "GetVolumeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetVolumeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetXMPPComponentResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetXMPPComponent")
    @WebResult(name = "GetXMPPComponentResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetXMPPComponentResponse getXMPPComponentRequest(
        @WebParam(name = "GetXMPPComponentRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetXMPPComponentRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetXMbxSearchesListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetXMbxSearchesList")
    @WebResult(name = "GetXMbxSearchesListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetXMbxSearchesListResponse getXMbxSearchesListRequest(
        @WebParam(name = "GetXMbxSearchesListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetXMbxSearchesListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetZimlet")
    @WebResult(name = "GetZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetZimletResponse getZimletRequest(
        @WebParam(name = "GetZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GetZimletStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GetZimletStatus")
    @WebResult(name = "GetZimletStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GetZimletStatusResponse getZimletStatusRequest(
        @WebParam(name = "GetZimletStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GetZimletStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.GrantRightResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/GrantRight")
    @WebResult(name = "GrantRightResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public GrantRightResponse grantRightRequest(
        @WebParam(name = "GrantRightRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        GrantRightRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.HsmResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/Hsm")
    @WebResult(name = "HsmResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public HsmResponse hsmRequest(
        @WebParam(name = "HsmRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        HsmRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.InstallCertResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/InstallCert")
    @WebResult(name = "InstallCertResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public InstallCertResponse installCertRequest(
        @WebParam(name = "InstallCertRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        InstallCertRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.InstallLicenseResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/InstallLicense")
    @WebResult(name = "InstallLicenseResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public InstallLicenseResponse installLicenseRequest(
        @WebParam(name = "InstallLicenseRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        InstallLicenseRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.LockoutMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/LockoutMailbox")
    @WebResult(name = "LockoutMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public LockoutMailboxResponse lockoutMailboxRequest(
        @WebParam(name = "LockoutMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        LockoutMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.MailQueueActionResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/MailQueueAction")
    @WebResult(name = "MailQueueActionResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public MailQueueActionResponse mailQueueActionRequest(
        @WebParam(name = "MailQueueActionRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        MailQueueActionRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.MailQueueFlushResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/MailQueueFlush")
    @WebResult(name = "MailQueueFlushResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public MailQueueFlushResponse mailQueueFlushRequest(
        @WebParam(name = "MailQueueFlushRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        MailQueueFlushRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.MigrateAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/MigrateAccount")
    @WebResult(name = "MigrateAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public MigrateAccountResponse migrateAccountRequest(
        @WebParam(name = "MigrateAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        MigrateAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyAccount")
    @WebResult(name = "ModifyAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyAccountResponse modifyAccountRequest(
        @WebParam(name = "ModifyAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyAdminSavedSearchesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyAdminSavedSearches")
    @WebResult(name = "ModifyAdminSavedSearchesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyAdminSavedSearchesResponse modifyAdminSavedSearchesRequest(
        @WebParam(name = "ModifyAdminSavedSearchesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyAdminSavedSearchesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyAlwaysOnClusterResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyAlwaysOnCluster")
    @WebResult(name = "ModifyAlwaysOnClusterResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyAlwaysOnClusterResponse modifyAlwaysOnClusterRequest(
        @WebParam(name = "ModifyAlwaysOnClusterRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyAlwaysOnClusterRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyCalendarResourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyCalendarResource")
    @WebResult(name = "ModifyCalendarResourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyCalendarResourceResponse modifyCalendarResourceRequest(
        @WebParam(name = "ModifyCalendarResourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyCalendarResourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyConfig")
    @WebResult(name = "ModifyConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyConfigResponse modifyConfigRequest(
        @WebParam(name = "ModifyConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyCos")
    @WebResult(name = "ModifyCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyCosResponse modifyCosRequest(
        @WebParam(name = "ModifyCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyDataSource")
    @WebResult(name = "ModifyDataSourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyDataSourceResponse modifyDataSourceRequest(
        @WebParam(name = "ModifyDataSourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyDataSourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyDelegatedAdminConstraintsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyDelegatedAdminConstraints")
    @WebResult(name = "ModifyDelegatedAdminConstraintsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyDelegatedAdminConstraintsResponse modifyDelegatedAdminConstraintsRequest(
        @WebParam(name = "ModifyDelegatedAdminConstraintsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyDelegatedAdminConstraintsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyDistributionList")
    @WebResult(name = "ModifyDistributionListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyDistributionListResponse modifyDistributionListRequest(
        @WebParam(name = "ModifyDistributionListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyDistributionListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyDomainResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyDomain")
    @WebResult(name = "ModifyDomainResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyDomainResponse modifyDomainRequest(
        @WebParam(name = "ModifyDomainRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyDomainRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyLDAPEntryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyLDAPEntry")
    @WebResult(name = "ModifyLDAPEntryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyLDAPEntryResponse modifyLDAPEntryRequest(
        @WebParam(name = "ModifyLDAPEntryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyLDAPEntryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifySMIMEConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifySMIMEConfig")
    @WebResult(name = "ModifySMIMEConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifySMIMEConfigResponse modifySMIMEConfigRequest(
        @WebParam(name = "ModifySMIMEConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifySMIMEConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyServerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyServer")
    @WebResult(name = "ModifyServerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyServerResponse modifyServerRequest(
        @WebParam(name = "ModifyServerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyServerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifySystemRetentionPolicyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifySystemRetentionPolicy")
    @WebResult(name = "ModifySystemRetentionPolicyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifySystemRetentionPolicyResponse modifySystemRetentionPolicyRequest(
        @WebParam(name = "ModifySystemRetentionPolicyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifySystemRetentionPolicyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyUCServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyUCService")
    @WebResult(name = "ModifyUCServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyUCServiceResponse modifyUCServiceRequest(
        @WebParam(name = "ModifyUCServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyUCServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyVolumeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyVolume")
    @WebResult(name = "ModifyVolumeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyVolumeResponse modifyVolumeRequest(
        @WebParam(name = "ModifyVolumeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyVolumeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ModifyZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ModifyZimlet")
    @WebResult(name = "ModifyZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ModifyZimletResponse modifyZimletRequest(
        @WebParam(name = "ModifyZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ModifyZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.MoveBlobsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/MoveBlobs")
    @WebResult(name = "MoveBlobsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public MoveBlobsResponse moveBlobsRequest(
        @WebParam(name = "MoveBlobsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        MoveBlobsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.MoveMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/MoveMailbox")
    @WebResult(name = "MoveMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public MoveMailboxResponse moveMailboxRequest(
        @WebParam(name = "MoveMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        MoveMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.NoOpResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/NoOp")
    @WebResult(name = "NoOpResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public NoOpResponse noOpRequest(
        @WebParam(name = "NoOpRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        NoOpRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PingResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/Ping")
    @WebResult(name = "PingResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PingResponse pingRequest(
        @WebParam(name = "PingRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PingRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PurgeAccountCalendarCacheResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/PurgeAccountCalendarCache")
    @WebResult(name = "PurgeAccountCalendarCacheResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PurgeAccountCalendarCacheResponse purgeAccountCalendarCacheRequest(
        @WebParam(name = "PurgeAccountCalendarCacheRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PurgeAccountCalendarCacheRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PurgeFreeBusyQueueResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/PurgeFreeBusyQueue")
    @WebResult(name = "PurgeFreeBusyQueueResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PurgeFreeBusyQueueResponse purgeFreeBusyQueueRequest(
        @WebParam(name = "PurgeFreeBusyQueueRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PurgeFreeBusyQueueRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PurgeMessagesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/PurgeMessages")
    @WebResult(name = "PurgeMessagesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PurgeMessagesResponse purgeMessagesRequest(
        @WebParam(name = "PurgeMessagesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PurgeMessagesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PurgeMovedMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/PurgeMovedMailbox")
    @WebResult(name = "PurgeMovedMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PurgeMovedMailboxResponse purgeMovedMailboxRequest(
        @WebParam(name = "PurgeMovedMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PurgeMovedMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.PushFreeBusyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/PushFreeBusy")
    @WebResult(name = "PushFreeBusyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public PushFreeBusyResponse pushFreeBusyRequest(
        @WebParam(name = "PushFreeBusyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        PushFreeBusyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.QueryMailboxMoveResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/QueryMailboxMove")
    @WebResult(name = "QueryMailboxMoveResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public QueryMailboxMoveResponse queryMailboxMoveRequest(
        @WebParam(name = "QueryMailboxMoveRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        QueryMailboxMoveRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.QueryWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/QueryWaitSet")
    @WebResult(name = "QueryWaitSetResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public QueryWaitSetResponse queryWaitSetRequest(
        @WebParam(name = "QueryWaitSetRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        QueryWaitSetRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ReIndexResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ReIndex")
    @WebResult(name = "ReIndexResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ReIndexResponse reIndexRequest(
        @WebParam(name = "ReIndexRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ReIndexRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RecalculateMailboxCountsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RecalculateMailboxCounts")
    @WebResult(name = "RecalculateMailboxCountsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RecalculateMailboxCountsResponse recalculateMailboxCountsRequest(
        @WebParam(name = "RecalculateMailboxCountsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RecalculateMailboxCountsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RefreshRegisteredAuthTokensResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RefreshRegisteredAuthTokens")
    @WebResult(name = "RefreshRegisteredAuthTokensResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RefreshRegisteredAuthTokensResponse refreshRegisteredAuthTokensRequest(
        @WebParam(name = "RefreshRegisteredAuthTokensRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RefreshRegisteredAuthTokensRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RegisterMailboxMoveOutResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RegisterMailboxMoveOut")
    @WebResult(name = "RegisterMailboxMoveOutResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RegisterMailboxMoveOutResponse registerMailboxMoveOutRequest(
        @WebParam(name = "RegisterMailboxMoveOutRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RegisterMailboxMoveOutRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ReloadAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ReloadAccount")
    @WebResult(name = "ReloadAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ReloadAccountResponse reloadAccountRequest(
        @WebParam(name = "ReloadAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ReloadAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ReloadLocalConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ReloadLocalConfig")
    @WebResult(name = "ReloadLocalConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ReloadLocalConfigResponse reloadLocalConfigRequest(
        @WebParam(name = "ReloadLocalConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ReloadLocalConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ReloadMemcachedClientConfigResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ReloadMemcachedClientConfig")
    @WebResult(name = "ReloadMemcachedClientConfigResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ReloadMemcachedClientConfigResponse reloadMemcachedClientConfigRequest(
        @WebParam(name = "ReloadMemcachedClientConfigRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ReloadMemcachedClientConfigRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoteWipeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoteWipe")
    @WebResult(name = "RemoteWipeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoteWipeResponse remoteWipeRequest(
        @WebParam(name = "RemoteWipeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoteWipeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoveAccountAliasResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoveAccountAlias")
    @WebResult(name = "RemoveAccountAliasResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoveAccountAliasResponse removeAccountAliasRequest(
        @WebParam(name = "RemoveAccountAliasRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoveAccountAliasRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoveAccountLoggerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoveAccountLogger")
    @WebResult(name = "RemoveAccountLoggerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoveAccountLoggerResponse removeAccountLoggerRequest(
        @WebParam(name = "RemoveAccountLoggerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoveAccountLoggerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoveDeviceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoveDevice")
    @WebResult(name = "RemoveDeviceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoveDeviceResponse removeDeviceRequest(
        @WebParam(name = "RemoveDeviceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoveDeviceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoveDistributionListAliasResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoveDistributionListAlias")
    @WebResult(name = "RemoveDistributionListAliasResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoveDistributionListAliasResponse removeDistributionListAliasRequest(
        @WebParam(name = "RemoveDistributionListAliasRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoveDistributionListAliasRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RemoveDistributionListMemberResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RemoveDistributionListMember")
    @WebResult(name = "RemoveDistributionListMemberResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RemoveDistributionListMemberResponse removeDistributionListMemberRequest(
        @WebParam(name = "RemoveDistributionListMemberRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RemoveDistributionListMemberRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameAccount")
    @WebResult(name = "RenameAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameAccountResponse renameAccountRequest(
        @WebParam(name = "RenameAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameCalendarResourceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameCalendarResource")
    @WebResult(name = "RenameCalendarResourceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameCalendarResourceResponse renameCalendarResourceRequest(
        @WebParam(name = "RenameCalendarResourceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameCalendarResourceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameCosResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameCos")
    @WebResult(name = "RenameCosResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameCosResponse renameCosRequest(
        @WebParam(name = "RenameCosRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameCosRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameDistributionList")
    @WebResult(name = "RenameDistributionListResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameDistributionListResponse renameDistributionListRequest(
        @WebParam(name = "RenameDistributionListRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameDistributionListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameLDAPEntryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameLDAPEntry")
    @WebResult(name = "RenameLDAPEntryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameLDAPEntryResponse renameLDAPEntryRequest(
        @WebParam(name = "RenameLDAPEntryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameLDAPEntryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RenameUCServiceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RenameUCService")
    @WebResult(name = "RenameUCServiceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RenameUCServiceResponse renameUCServiceRequest(
        @WebParam(name = "RenameUCServiceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RenameUCServiceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ResetAllLoggersResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ResetAllLoggers")
    @WebResult(name = "ResetAllLoggersResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ResetAllLoggersResponse resetAllLoggersRequest(
        @WebParam(name = "ResetAllLoggersRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ResetAllLoggersRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RestoreResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/Restore")
    @WebResult(name = "RestoreResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RestoreResponse restoreRequest(
        @WebParam(name = "RestoreRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RestoreRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ResumeDeviceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ResumeDevice")
    @WebResult(name = "ResumeDeviceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ResumeDeviceResponse resumeDeviceRequest(
        @WebParam(name = "ResumeDeviceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ResumeDeviceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RevokeRightResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RevokeRight")
    @WebResult(name = "RevokeRightResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RevokeRightResponse revokeRightRequest(
        @WebParam(name = "RevokeRightRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RevokeRightRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RolloverRedoLogResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RolloverRedoLog")
    @WebResult(name = "RolloverRedoLogResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RolloverRedoLogResponse rolloverRedoLogRequest(
        @WebParam(name = "RolloverRedoLogRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RolloverRedoLogRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.RunUnitTestsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/RunUnitTests")
    @WebResult(name = "RunUnitTestsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public RunUnitTestsResponse runUnitTestsRequest(
        @WebParam(name = "RunUnitTestsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        RunUnitTestsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.ScheduleBackupsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/ScheduleBackups")
    @WebResult(name = "ScheduleBackupsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public ScheduleBackupsResponse scheduleBackupsRequest(
        @WebParam(name = "ScheduleBackupsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        ScheduleBackupsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchAccountsResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchAccounts")
    @WebResult(name = "SearchAccountsResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchAccountsResponse searchAccountsRequest(
        @WebParam(name = "SearchAccountsRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchAccountsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchAutoProvDirectoryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchAutoProvDirectory")
    @WebResult(name = "SearchAutoProvDirectoryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchAutoProvDirectoryResponse searchAutoProvDirectoryRequest(
        @WebParam(name = "SearchAutoProvDirectoryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchAutoProvDirectoryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchCalendarResourcesResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchCalendarResources")
    @WebResult(name = "SearchCalendarResourcesResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchCalendarResourcesResponse searchCalendarResourcesRequest(
        @WebParam(name = "SearchCalendarResourcesRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchCalendarResourcesRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchDirectoryResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchDirectory")
    @WebResult(name = "SearchDirectoryResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchDirectoryResponse searchDirectoryRequest(
        @WebParam(name = "SearchDirectoryRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchDirectoryRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchGalResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchGal")
    @WebResult(name = "SearchGalResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchGalResponse searchGalRequest(
        @WebParam(name = "SearchGalRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchGalRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SearchMultiMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SearchMultiMailbox")
    @WebResult(name = "SearchMultiMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SearchMultiMailboxResponse searchMultiMailboxRequest(
        @WebParam(name = "SearchMultiMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SearchMultiMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SetCurrentVolumeResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SetCurrentVolume")
    @WebResult(name = "SetCurrentVolumeResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SetCurrentVolumeResponse setCurrentVolumeRequest(
        @WebParam(name = "SetCurrentVolumeRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SetCurrentVolumeRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SetLocalServerOnlineResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SetLocalServerOnline")
    @WebResult(name = "SetLocalServerOnlineResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SetLocalServerOnlineResponse setLocalServerOnlineRequest(
        @WebParam(name = "SetLocalServerOnlineRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SetLocalServerOnlineRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SetPasswordResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SetPassword")
    @WebResult(name = "SetPasswordResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SetPasswordResponse setPasswordRequest(
        @WebParam(name = "SetPasswordRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SetPasswordRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SetServerOfflineResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SetServerOffline")
    @WebResult(name = "SetServerOfflineResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SetServerOfflineResponse setServerOfflineRequest(
        @WebParam(name = "SetServerOfflineRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SetServerOfflineRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SuspendDeviceResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SuspendDevice")
    @WebResult(name = "SuspendDeviceResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SuspendDeviceResponse suspendDeviceRequest(
        @WebParam(name = "SuspendDeviceRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SuspendDeviceRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.SyncGalAccountResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/SyncGalAccount")
    @WebResult(name = "SyncGalAccountResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public SyncGalAccountResponse syncGalAccountRequest(
        @WebParam(name = "SyncGalAccountRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        SyncGalAccountRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UndeployZimletResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UndeployZimlet")
    @WebResult(name = "UndeployZimletResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UndeployZimletResponse undeployZimletRequest(
        @WebParam(name = "UndeployZimletRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UndeployZimletRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UnloadMailboxResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UnloadMailbox")
    @WebResult(name = "UnloadMailboxResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UnloadMailboxResponse unloadMailboxRequest(
        @WebParam(name = "UnloadMailboxRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UnloadMailboxRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UnregisterMailboxMoveOutResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UnregisterMailboxMoveOut")
    @WebResult(name = "UnregisterMailboxMoveOutResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UnregisterMailboxMoveOutResponse unregisterMailboxMoveOutRequest(
        @WebParam(name = "UnregisterMailboxMoveOutRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UnregisterMailboxMoveOutRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UpdateDeviceStatusResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UpdateDeviceStatus")
    @WebResult(name = "UpdateDeviceStatusResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UpdateDeviceStatusResponse updateDeviceStatusRequest(
        @WebParam(name = "UpdateDeviceStatusRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UpdateDeviceStatusRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UpdatePresenceSessionIdResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UpdatePresenceSessionId")
    @WebResult(name = "UpdatePresenceSessionIdResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UpdatePresenceSessionIdResponse updatePresenceSessionIdRequest(
        @WebParam(name = "UpdatePresenceSessionIdRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UpdatePresenceSessionIdRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UploadDomCertResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UploadDomCert")
    @WebResult(name = "UploadDomCertResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UploadDomCertResponse uploadDomCertRequest(
        @WebParam(name = "UploadDomCertRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UploadDomCertRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.UploadProxyCAResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/UploadProxyCA")
    @WebResult(name = "UploadProxyCAResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public UploadProxyCAResponse uploadProxyCARequest(
        @WebParam(name = "UploadProxyCARequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        UploadProxyCARequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.VerifyCertKeyResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/VerifyCertKey")
    @WebResult(name = "VerifyCertKeyResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public VerifyCertKeyResponse verifyCertKeyRequest(
        @WebParam(name = "VerifyCertKeyRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        VerifyCertKeyRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.VerifyIndexResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/VerifyIndex")
    @WebResult(name = "VerifyIndexResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public VerifyIndexResponse verifyIndexRequest(
        @WebParam(name = "VerifyIndexRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        VerifyIndexRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.VerifyStoreManagerResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/VerifyStoreManager")
    @WebResult(name = "VerifyStoreManagerResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public VerifyStoreManagerResponse verifyStoreManagerRequest(
        @WebParam(name = "VerifyStoreManagerRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        VerifyStoreManagerRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadmin.VersionCheckResponse
     */
    @WebMethod(action = "urn:zimbraAdmin/VersionCheck")
    @WebResult(name = "VersionCheckResponse", targetNamespace = "urn:zimbraAdmin", partName = "params")
    public VersionCheckResponse versionCheckRequest(
        @WebParam(name = "VersionCheckRequest", targetNamespace = "urn:zimbraAdmin", partName = "params")
        VersionCheckRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadminext.BulkIMAPDataImportResponse
     */
    @WebMethod(action = "urn:zimbraAdminExt/BulkIMAPDataImport")
    @WebResult(name = "BulkIMAPDataImportResponse", targetNamespace = "urn:zimbraAdminExt", partName = "params")
    public BulkIMAPDataImportResponse bulkIMAPDataImportRequest(
        @WebParam(name = "BulkIMAPDataImportRequest", targetNamespace = "urn:zimbraAdminExt", partName = "params")
        BulkIMAPDataImportRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadminext.BulkImportAccountsResponse
     */
    @WebMethod(action = "urn:zimbraAdminExt/BulkImportAccounts")
    @WebResult(name = "BulkImportAccountsResponse", targetNamespace = "urn:zimbraAdminExt", partName = "params")
    public BulkImportAccountsResponse bulkImportAccountsRequest(
        @WebParam(name = "BulkImportAccountsRequest", targetNamespace = "urn:zimbraAdminExt", partName = "params")
        BulkImportAccountsRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadminext.GenerateBulkProvisionFileFromLDAPResponse
     */
    @WebMethod(action = "urn:zimbraAdminExt/GenerateBulkProvisionFileFromLDAP")
    @WebResult(name = "GenerateBulkProvisionFileFromLDAPResponse", targetNamespace = "urn:zimbraAdminExt", partName = "params")
    public GenerateBulkProvisionFileFromLDAPResponse generateBulkProvisionFileFromLDAPRequest(
        @WebParam(name = "GenerateBulkProvisionFileFromLDAPRequest", targetNamespace = "urn:zimbraAdminExt", partName = "params")
        GenerateBulkProvisionFileFromLDAPRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadminext.GetBulkIMAPImportTaskListResponse
     */
    @WebMethod(action = "urn:zimbraAdminExt/GetBulkIMAPImportTaskList")
    @WebResult(name = "GetBulkIMAPImportTaskListResponse", targetNamespace = "urn:zimbraAdminExt", partName = "params")
    public GetBulkIMAPImportTaskListResponse getBulkIMAPImportTaskListRequest(
        @WebParam(name = "GetBulkIMAPImportTaskListRequest", targetNamespace = "urn:zimbraAdminExt", partName = "params")
        GetBulkIMAPImportTaskListRequest params);

    /**
     * 
     * @param params
     * @return
     *     returns zimbraadminext.PurgeBulkIMAPImportTasksResponse
     */
    @WebMethod(action = "urn:zimbraAdminExt/PurgeBulkIMAPImportTasks")
    @WebResult(name = "PurgeBulkIMAPImportTasksResponse", targetNamespace = "urn:zimbraAdminExt", partName = "params")
    public PurgeBulkIMAPImportTasksResponse purgeBulkIMAPImportTasksRequest(
        @WebParam(name = "PurgeBulkIMAPImportTasksRequest", targetNamespace = "urn:zimbraAdminExt", partName = "params")
        PurgeBulkIMAPImportTasksRequest params);

}

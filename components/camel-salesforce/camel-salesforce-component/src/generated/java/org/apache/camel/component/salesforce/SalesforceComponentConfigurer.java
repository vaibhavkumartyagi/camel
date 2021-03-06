/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SalesforceComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("apexMethod", java.lang.String.class);
        map.put("apexQueryParams", java.util.Map.class);
        map.put("apexUrl", java.lang.String.class);
        map.put("apiVersion", java.lang.String.class);
        map.put("backoffIncrement", long.class);
        map.put("batchId", java.lang.String.class);
        map.put("contentType", org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class);
        map.put("defaultReplayId", java.lang.Long.class);
        map.put("format", org.apache.camel.component.salesforce.internal.PayloadFormat.class);
        map.put("httpClient", org.apache.camel.component.salesforce.SalesforceHttpClient.class);
        map.put("httpClientConnectionTimeout", long.class);
        map.put("httpClientIdleTimeout", long.class);
        map.put("httpMaxContentLength", java.lang.Integer.class);
        map.put("includeDetails", java.lang.Boolean.class);
        map.put("initialReplayIdMap", java.util.Map.class);
        map.put("instanceId", java.lang.String.class);
        map.put("jobId", java.lang.String.class);
        map.put("limit", java.lang.Integer.class);
        map.put("maxBackoff", long.class);
        map.put("notFoundBehaviour", org.apache.camel.component.salesforce.NotFoundBehaviour.class);
        map.put("notifyForFields", org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class);
        map.put("notifyForOperationCreate", java.lang.Boolean.class);
        map.put("notifyForOperationDelete", java.lang.Boolean.class);
        map.put("notifyForOperations", org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class);
        map.put("notifyForOperationUndelete", java.lang.Boolean.class);
        map.put("notifyForOperationUpdate", java.lang.Boolean.class);
        map.put("objectMapper", com.fasterxml.jackson.databind.ObjectMapper.class);
        map.put("packages", java.lang.String.class);
        map.put("rawPayload", boolean.class);
        map.put("reportId", java.lang.String.class);
        map.put("reportMetadata", org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
        map.put("resultId", java.lang.String.class);
        map.put("sObjectBlobFieldName", java.lang.String.class);
        map.put("sObjectClass", java.lang.String.class);
        map.put("sObjectFields", java.lang.String.class);
        map.put("sObjectId", java.lang.String.class);
        map.put("sObjectIdName", java.lang.String.class);
        map.put("sObjectIdValue", java.lang.String.class);
        map.put("sObjectName", java.lang.String.class);
        map.put("sObjectQuery", java.lang.String.class);
        map.put("sObjectSearch", java.lang.String.class);
        map.put("updateTopic", boolean.class);
        map.put("config", org.apache.camel.component.salesforce.SalesforceEndpointConfig.class);
        map.put("httpClientProperties", java.util.Map.class);
        map.put("longPollingTransportProperties", java.util.Map.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("httpProxyExcludedAddresses", java.util.Set.class);
        map.put("httpProxyHost", java.lang.String.class);
        map.put("httpProxyIncludedAddresses", java.util.Set.class);
        map.put("httpProxyPort", java.lang.Integer.class);
        map.put("httpProxySocks4", boolean.class);
        map.put("authenticationType", org.apache.camel.component.salesforce.AuthenticationType.class);
        map.put("clientId", java.lang.String.class);
        map.put("clientSecret", java.lang.String.class);
        map.put("httpProxyAuthUri", java.lang.String.class);
        map.put("httpProxyPassword", java.lang.String.class);
        map.put("httpProxyRealm", java.lang.String.class);
        map.put("httpProxySecure", boolean.class);
        map.put("httpProxyUseDigestAuth", boolean.class);
        map.put("httpProxyUsername", java.lang.String.class);
        map.put("instanceUrl", java.lang.String.class);
        map.put("keystore", org.apache.camel.support.jsse.KeyStoreParameters.class);
        map.put("lazyLogin", boolean.class);
        map.put("loginConfig", org.apache.camel.component.salesforce.SalesforceLoginConfig.class);
        map.put("loginUrl", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("refreshToken", java.lang.String.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        map.put("userName", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(SalesforceComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.salesforce.SalesforceEndpointConfig getOrCreateConfig(SalesforceComponent target) {
        if (target.getConfig() == null) {
            target.setConfig(new org.apache.camel.component.salesforce.SalesforceEndpointConfig());
        }
        return target.getConfig();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceComponent target = (SalesforceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apexmethod":
        case "apexMethod": getOrCreateConfig(target).setApexMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "apexqueryparams":
        case "apexQueryParams": getOrCreateConfig(target).setApexQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "apexurl":
        case "apexUrl": getOrCreateConfig(target).setApexUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "apiversion":
        case "apiVersion": getOrCreateConfig(target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "authenticationtype":
        case "authenticationType": target.setAuthenticationType(property(camelContext, org.apache.camel.component.salesforce.AuthenticationType.class, value)); return true;
        case "backoffincrement":
        case "backoffIncrement": getOrCreateConfig(target).setBackoffIncrement(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batchid":
        case "batchId": getOrCreateConfig(target).setBatchId(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "config": target.setConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class, value)); return true;
        case "contenttype":
        case "contentType": getOrCreateConfig(target).setContentType(property(camelContext, org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class, value)); return true;
        case "defaultreplayid":
        case "defaultReplayId": getOrCreateConfig(target).setDefaultReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "format": getOrCreateConfig(target).setFormat(property(camelContext, org.apache.camel.component.salesforce.internal.PayloadFormat.class, value)); return true;
        case "httpclient":
        case "httpClient": getOrCreateConfig(target).setHttpClient(property(camelContext, org.apache.camel.component.salesforce.SalesforceHttpClient.class, value)); return true;
        case "httpclientconnectiontimeout":
        case "httpClientConnectionTimeout": target.setHttpClientConnectionTimeout(property(camelContext, long.class, value)); return true;
        case "httpclientidletimeout":
        case "httpClientIdleTimeout": target.setHttpClientIdleTimeout(property(camelContext, long.class, value)); return true;
        case "httpclientproperties":
        case "httpClientProperties": target.setHttpClientProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "httpmaxcontentlength":
        case "httpMaxContentLength": target.setHttpMaxContentLength(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyauthuri":
        case "httpProxyAuthUri": target.setHttpProxyAuthUri(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyexcludedaddresses":
        case "httpProxyExcludedAddresses": target.setHttpProxyExcludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyincludedaddresses":
        case "httpProxyIncludedAddresses": target.setHttpProxyIncludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyrealm":
        case "httpProxyRealm": target.setHttpProxyRealm(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxysecure":
        case "httpProxySecure": target.setHttpProxySecure(property(camelContext, boolean.class, value)); return true;
        case "httpproxysocks4":
        case "httpProxySocks4": target.setHttpProxySocks4(property(camelContext, boolean.class, value)); return true;
        case "httpproxyusedigestauth":
        case "httpProxyUseDigestAuth": target.setHttpProxyUseDigestAuth(property(camelContext, boolean.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": target.setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "includedetails":
        case "includeDetails": getOrCreateConfig(target).setIncludeDetails(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "initialreplayidmap":
        case "initialReplayIdMap": getOrCreateConfig(target).setInitialReplayIdMap(property(camelContext, java.util.Map.class, value)); return true;
        case "instanceid":
        case "instanceId": getOrCreateConfig(target).setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "instanceurl":
        case "instanceUrl": target.setInstanceUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "jobid":
        case "jobId": getOrCreateConfig(target).setJobId(property(camelContext, java.lang.String.class, value)); return true;
        case "keystore": target.setKeystore(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "lazylogin":
        case "lazyLogin": target.setLazyLogin(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": getOrCreateConfig(target).setLimit(property(camelContext, java.lang.Integer.class, value)); return true;
        case "loginconfig":
        case "loginConfig": target.setLoginConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceLoginConfig.class, value)); return true;
        case "loginurl":
        case "loginUrl": target.setLoginUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "longpollingtransportproperties":
        case "longPollingTransportProperties": target.setLongPollingTransportProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "maxbackoff":
        case "maxBackoff": getOrCreateConfig(target).setMaxBackoff(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "notfoundbehaviour":
        case "notFoundBehaviour": getOrCreateConfig(target).setNotFoundBehaviour(property(camelContext, org.apache.camel.component.salesforce.NotFoundBehaviour.class, value)); return true;
        case "notifyforfields":
        case "notifyForFields": getOrCreateConfig(target).setNotifyForFields(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class, value)); return true;
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": getOrCreateConfig(target).setNotifyForOperationCreate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": getOrCreateConfig(target).setNotifyForOperationDelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": getOrCreateConfig(target).setNotifyForOperationUndelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": getOrCreateConfig(target).setNotifyForOperationUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperations":
        case "notifyForOperations": getOrCreateConfig(target).setNotifyForOperations(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class, value)); return true;
        case "objectmapper":
        case "objectMapper": getOrCreateConfig(target).setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "packages": target.setPackages(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "rawpayload":
        case "rawPayload": getOrCreateConfig(target).setRawPayload(property(camelContext, boolean.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "reportid":
        case "reportId": getOrCreateConfig(target).setReportId(property(camelContext, java.lang.String.class, value)); return true;
        case "reportmetadata":
        case "reportMetadata": getOrCreateConfig(target).setReportMetadata(property(camelContext, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class, value)); return true;
        case "resultid":
        case "resultId": getOrCreateConfig(target).setResultId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": getOrCreateConfig(target).setSObjectBlobFieldName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectclass":
        case "sObjectClass": getOrCreateConfig(target).setSObjectClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectfields":
        case "sObjectFields": getOrCreateConfig(target).setSObjectFields(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectid":
        case "sObjectId": getOrCreateConfig(target).setSObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidname":
        case "sObjectIdName": getOrCreateConfig(target).setSObjectIdName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidvalue":
        case "sObjectIdValue": getOrCreateConfig(target).setSObjectIdValue(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectname":
        case "sObjectName": getOrCreateConfig(target).setSObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectquery":
        case "sObjectQuery": getOrCreateConfig(target).setSObjectQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectsearch":
        case "sObjectSearch": getOrCreateConfig(target).setSObjectSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "updatetopic":
        case "updateTopic": getOrCreateConfig(target).setUpdateTopic(property(camelContext, boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SalesforceComponent target = (SalesforceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apexmethod":
        case "apexMethod": return getOrCreateConfig(target).getApexMethod();
        case "apexqueryparams":
        case "apexQueryParams": return getOrCreateConfig(target).getApexQueryParams();
        case "apexurl":
        case "apexUrl": return getOrCreateConfig(target).getApexUrl();
        case "apiversion":
        case "apiVersion": return getOrCreateConfig(target).getApiVersion();
        case "authenticationtype":
        case "authenticationType": return target.getAuthenticationType();
        case "backoffincrement":
        case "backoffIncrement": return getOrCreateConfig(target).getBackoffIncrement();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batchid":
        case "batchId": return getOrCreateConfig(target).getBatchId();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientsecret":
        case "clientSecret": return target.getClientSecret();
        case "config": return target.getConfig();
        case "contenttype":
        case "contentType": return getOrCreateConfig(target).getContentType();
        case "defaultreplayid":
        case "defaultReplayId": return getOrCreateConfig(target).getDefaultReplayId();
        case "format": return getOrCreateConfig(target).getFormat();
        case "httpclient":
        case "httpClient": return getOrCreateConfig(target).getHttpClient();
        case "httpclientconnectiontimeout":
        case "httpClientConnectionTimeout": return target.getHttpClientConnectionTimeout();
        case "httpclientidletimeout":
        case "httpClientIdleTimeout": return target.getHttpClientIdleTimeout();
        case "httpclientproperties":
        case "httpClientProperties": return target.getHttpClientProperties();
        case "httpmaxcontentlength":
        case "httpMaxContentLength": return target.getHttpMaxContentLength();
        case "httpproxyauthuri":
        case "httpProxyAuthUri": return target.getHttpProxyAuthUri();
        case "httpproxyexcludedaddresses":
        case "httpProxyExcludedAddresses": return target.getHttpProxyExcludedAddresses();
        case "httpproxyhost":
        case "httpProxyHost": return target.getHttpProxyHost();
        case "httpproxyincludedaddresses":
        case "httpProxyIncludedAddresses": return target.getHttpProxyIncludedAddresses();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getHttpProxyPort();
        case "httpproxyrealm":
        case "httpProxyRealm": return target.getHttpProxyRealm();
        case "httpproxysecure":
        case "httpProxySecure": return target.isHttpProxySecure();
        case "httpproxysocks4":
        case "httpProxySocks4": return target.isHttpProxySocks4();
        case "httpproxyusedigestauth":
        case "httpProxyUseDigestAuth": return target.isHttpProxyUseDigestAuth();
        case "httpproxyusername":
        case "httpProxyUsername": return target.getHttpProxyUsername();
        case "includedetails":
        case "includeDetails": return getOrCreateConfig(target).getIncludeDetails();
        case "initialreplayidmap":
        case "initialReplayIdMap": return getOrCreateConfig(target).getInitialReplayIdMap();
        case "instanceid":
        case "instanceId": return getOrCreateConfig(target).getInstanceId();
        case "instanceurl":
        case "instanceUrl": return target.getInstanceUrl();
        case "jobid":
        case "jobId": return getOrCreateConfig(target).getJobId();
        case "keystore": return target.getKeystore();
        case "lazylogin":
        case "lazyLogin": return target.isLazyLogin();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return getOrCreateConfig(target).getLimit();
        case "loginconfig":
        case "loginConfig": return target.getLoginConfig();
        case "loginurl":
        case "loginUrl": return target.getLoginUrl();
        case "longpollingtransportproperties":
        case "longPollingTransportProperties": return target.getLongPollingTransportProperties();
        case "maxbackoff":
        case "maxBackoff": return getOrCreateConfig(target).getMaxBackoff();
        case "notfoundbehaviour":
        case "notFoundBehaviour": return getOrCreateConfig(target).getNotFoundBehaviour();
        case "notifyforfields":
        case "notifyForFields": return getOrCreateConfig(target).getNotifyForFields();
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": return getOrCreateConfig(target).getNotifyForOperationCreate();
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": return getOrCreateConfig(target).getNotifyForOperationDelete();
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": return getOrCreateConfig(target).getNotifyForOperationUndelete();
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": return getOrCreateConfig(target).getNotifyForOperationUpdate();
        case "notifyforoperations":
        case "notifyForOperations": return getOrCreateConfig(target).getNotifyForOperations();
        case "objectmapper":
        case "objectMapper": return getOrCreateConfig(target).getObjectMapper();
        case "packages": return target.getPackages();
        case "password": return target.getPassword();
        case "rawpayload":
        case "rawPayload": return getOrCreateConfig(target).isRawPayload();
        case "refreshtoken":
        case "refreshToken": return target.getRefreshToken();
        case "reportid":
        case "reportId": return getOrCreateConfig(target).getReportId();
        case "reportmetadata":
        case "reportMetadata": return getOrCreateConfig(target).getReportMetadata();
        case "resultid":
        case "resultId": return getOrCreateConfig(target).getResultId();
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": return getOrCreateConfig(target).getSObjectBlobFieldName();
        case "sobjectclass":
        case "sObjectClass": return getOrCreateConfig(target).getSObjectClass();
        case "sobjectfields":
        case "sObjectFields": return getOrCreateConfig(target).getSObjectFields();
        case "sobjectid":
        case "sObjectId": return getOrCreateConfig(target).getSObjectId();
        case "sobjectidname":
        case "sObjectIdName": return getOrCreateConfig(target).getSObjectIdName();
        case "sobjectidvalue":
        case "sObjectIdValue": return getOrCreateConfig(target).getSObjectIdValue();
        case "sobjectname":
        case "sObjectName": return getOrCreateConfig(target).getSObjectName();
        case "sobjectquery":
        case "sObjectQuery": return getOrCreateConfig(target).getSObjectQuery();
        case "sobjectsearch":
        case "sObjectSearch": return getOrCreateConfig(target).getSObjectSearch();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "updatetopic":
        case "updateTopic": return getOrCreateConfig(target).isUpdateTopic();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "username":
        case "userName": return target.getUserName();
        default: return null;
        }
    }
}


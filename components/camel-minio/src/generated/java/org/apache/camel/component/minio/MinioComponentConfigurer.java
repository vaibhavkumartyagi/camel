/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.minio;

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
public class MinioComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("autoCreateBucket", boolean.class);
        map.put("configuration", org.apache.camel.component.minio.MinioConfiguration.class);
        map.put("customHttpClient", okhttp3.OkHttpClient.class);
        map.put("endpoint", java.lang.String.class);
        map.put("minioClient", io.minio.MinioClient.class);
        map.put("objectLock", boolean.class);
        map.put("policy", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("region", java.lang.String.class);
        map.put("secure", boolean.class);
        map.put("serverSideEncryption", io.minio.ServerSideEncryption.class);
        map.put("serverSideEncryptionCustomerKey", io.minio.ServerSideEncryptionCustomerKey.class);
        map.put("autoCloseBody", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("bypassGovernanceMode", boolean.class);
        map.put("deleteAfterRead", boolean.class);
        map.put("delimiter", java.lang.String.class);
        map.put("destinationBucketName", java.lang.String.class);
        map.put("destinationObjectName", java.lang.String.class);
        map.put("includeBody", boolean.class);
        map.put("includeFolders", boolean.class);
        map.put("includeUserMetadata", boolean.class);
        map.put("includeVersions", boolean.class);
        map.put("length", long.class);
        map.put("matchETag", java.lang.String.class);
        map.put("maxConnections", int.class);
        map.put("maxMessagesPerPoll", int.class);
        map.put("modifiedSince", java.time.ZonedDateTime.class);
        map.put("moveAfterRead", boolean.class);
        map.put("notMatchETag", java.lang.String.class);
        map.put("objectName", java.lang.String.class);
        map.put("offset", long.class);
        map.put("prefix", java.lang.String.class);
        map.put("recursive", boolean.class);
        map.put("startAfter", java.lang.String.class);
        map.put("unModifiedSince", java.time.ZonedDateTime.class);
        map.put("useVersion1", boolean.class);
        map.put("versionId", java.lang.String.class);
        map.put("deleteAfterWrite", boolean.class);
        map.put("keyName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", org.apache.camel.component.minio.MinioOperations.class);
        map.put("pojoRequest", boolean.class);
        map.put("storageClass", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(MinioComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.minio.MinioConfiguration getOrCreateConfiguration(MinioComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.minio.MinioConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MinioComponent target = (MinioComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autoclosebody":
        case "autoCloseBody": getOrCreateConfiguration(target).setAutoCloseBody(property(camelContext, boolean.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": getOrCreateConfiguration(target).setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "bypassgovernancemode":
        case "bypassGovernanceMode": getOrCreateConfiguration(target).setBypassGovernanceMode(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.minio.MinioConfiguration.class, value)); return true;
        case "customhttpclient":
        case "customHttpClient": getOrCreateConfiguration(target).setCustomHttpClient(property(camelContext, okhttp3.OkHttpClient.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": getOrCreateConfiguration(target).setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": getOrCreateConfiguration(target).setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": getOrCreateConfiguration(target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationbucketname":
        case "destinationBucketName": getOrCreateConfiguration(target).setDestinationBucketName(property(camelContext, java.lang.String.class, value)); return true;
        case "destinationobjectname":
        case "destinationObjectName": getOrCreateConfiguration(target).setDestinationObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "endpoint": getOrCreateConfiguration(target).setEndpoint(property(camelContext, java.lang.String.class, value)); return true;
        case "includebody":
        case "includeBody": getOrCreateConfiguration(target).setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "includefolders":
        case "includeFolders": getOrCreateConfiguration(target).setIncludeFolders(property(camelContext, boolean.class, value)); return true;
        case "includeusermetadata":
        case "includeUserMetadata": getOrCreateConfiguration(target).setIncludeUserMetadata(property(camelContext, boolean.class, value)); return true;
        case "includeversions":
        case "includeVersions": getOrCreateConfiguration(target).setIncludeVersions(property(camelContext, boolean.class, value)); return true;
        case "keyname":
        case "keyName": getOrCreateConfiguration(target).setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "length": getOrCreateConfiguration(target).setLength(property(camelContext, long.class, value)); return true;
        case "matchetag":
        case "matchETag": getOrCreateConfiguration(target).setMatchETag(property(camelContext, java.lang.String.class, value)); return true;
        case "maxconnections":
        case "maxConnections": getOrCreateConfiguration(target).setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": getOrCreateConfiguration(target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "minioclient":
        case "minioClient": getOrCreateConfiguration(target).setMinioClient(property(camelContext, io.minio.MinioClient.class, value)); return true;
        case "modifiedsince":
        case "modifiedSince": getOrCreateConfiguration(target).setModifiedSince(property(camelContext, java.time.ZonedDateTime.class, value)); return true;
        case "moveafterread":
        case "moveAfterRead": getOrCreateConfiguration(target).setMoveAfterRead(property(camelContext, boolean.class, value)); return true;
        case "notmatchetag":
        case "notMatchETag": getOrCreateConfiguration(target).setNotMatchETag(property(camelContext, java.lang.String.class, value)); return true;
        case "objectlock":
        case "objectLock": getOrCreateConfiguration(target).setObjectLock(property(camelContext, boolean.class, value)); return true;
        case "objectname":
        case "objectName": getOrCreateConfiguration(target).setObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "offset": getOrCreateConfiguration(target).setOffset(property(camelContext, long.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.minio.MinioOperations.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": getOrCreateConfiguration(target).setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "prefix": getOrCreateConfiguration(target).setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": getOrCreateConfiguration(target).setSecure(property(camelContext, boolean.class, value)); return true;
        case "serversideencryption":
        case "serverSideEncryption": getOrCreateConfiguration(target).setServerSideEncryption(property(camelContext, io.minio.ServerSideEncryption.class, value)); return true;
        case "serversideencryptioncustomerkey":
        case "serverSideEncryptionCustomerKey": getOrCreateConfiguration(target).setServerSideEncryptionCustomerKey(property(camelContext, io.minio.ServerSideEncryptionCustomerKey.class, value)); return true;
        case "startafter":
        case "startAfter": getOrCreateConfiguration(target).setStartAfter(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass":
        case "storageClass": getOrCreateConfiguration(target).setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "unmodifiedsince":
        case "unModifiedSince": getOrCreateConfiguration(target).setUnModifiedSince(property(camelContext, java.time.ZonedDateTime.class, value)); return true;
        case "useversion1":
        case "useVersion1": getOrCreateConfiguration(target).setUseVersion1(property(camelContext, boolean.class, value)); return true;
        case "versionid":
        case "versionId": getOrCreateConfiguration(target).setVersionId(property(camelContext, java.lang.String.class, value)); return true;
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
        MinioComponent target = (MinioComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "autoclosebody":
        case "autoCloseBody": return getOrCreateConfiguration(target).isAutoCloseBody();
        case "autocreatebucket":
        case "autoCreateBucket": return getOrCreateConfiguration(target).isAutoCreateBucket();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "bypassgovernancemode":
        case "bypassGovernanceMode": return getOrCreateConfiguration(target).isBypassGovernanceMode();
        case "configuration": return target.getConfiguration();
        case "customhttpclient":
        case "customHttpClient": return getOrCreateConfiguration(target).getCustomHttpClient();
        case "deleteafterread":
        case "deleteAfterRead": return getOrCreateConfiguration(target).isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return getOrCreateConfiguration(target).isDeleteAfterWrite();
        case "delimiter": return getOrCreateConfiguration(target).getDelimiter();
        case "destinationbucketname":
        case "destinationBucketName": return getOrCreateConfiguration(target).getDestinationBucketName();
        case "destinationobjectname":
        case "destinationObjectName": return getOrCreateConfiguration(target).getDestinationObjectName();
        case "endpoint": return getOrCreateConfiguration(target).getEndpoint();
        case "includebody":
        case "includeBody": return getOrCreateConfiguration(target).isIncludeBody();
        case "includefolders":
        case "includeFolders": return getOrCreateConfiguration(target).isIncludeFolders();
        case "includeusermetadata":
        case "includeUserMetadata": return getOrCreateConfiguration(target).isIncludeUserMetadata();
        case "includeversions":
        case "includeVersions": return getOrCreateConfiguration(target).isIncludeVersions();
        case "keyname":
        case "keyName": return getOrCreateConfiguration(target).getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "length": return getOrCreateConfiguration(target).getLength();
        case "matchetag":
        case "matchETag": return getOrCreateConfiguration(target).getMatchETag();
        case "maxconnections":
        case "maxConnections": return getOrCreateConfiguration(target).getMaxConnections();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return getOrCreateConfiguration(target).getMaxMessagesPerPoll();
        case "minioclient":
        case "minioClient": return getOrCreateConfiguration(target).getMinioClient();
        case "modifiedsince":
        case "modifiedSince": return getOrCreateConfiguration(target).getModifiedSince();
        case "moveafterread":
        case "moveAfterRead": return getOrCreateConfiguration(target).isMoveAfterRead();
        case "notmatchetag":
        case "notMatchETag": return getOrCreateConfiguration(target).getNotMatchETag();
        case "objectlock":
        case "objectLock": return getOrCreateConfiguration(target).isObjectLock();
        case "objectname":
        case "objectName": return getOrCreateConfiguration(target).getObjectName();
        case "offset": return getOrCreateConfiguration(target).getOffset();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "pojorequest":
        case "pojoRequest": return getOrCreateConfiguration(target).isPojoRequest();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "prefix": return getOrCreateConfiguration(target).getPrefix();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "recursive": return getOrCreateConfiguration(target).isRecursive();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "secure": return getOrCreateConfiguration(target).isSecure();
        case "serversideencryption":
        case "serverSideEncryption": return getOrCreateConfiguration(target).getServerSideEncryption();
        case "serversideencryptioncustomerkey":
        case "serverSideEncryptionCustomerKey": return getOrCreateConfiguration(target).getServerSideEncryptionCustomerKey();
        case "startafter":
        case "startAfter": return getOrCreateConfiguration(target).getStartAfter();
        case "storageclass":
        case "storageClass": return getOrCreateConfiguration(target).getStorageClass();
        case "unmodifiedsince":
        case "unModifiedSince": return getOrCreateConfiguration(target).getUnModifiedSince();
        case "useversion1":
        case "useVersion1": return getOrCreateConfiguration(target).isUseVersion1();
        case "versionid":
        case "versionId": return getOrCreateConfiguration(target).getVersionId();
        default: return null;
        }
    }
}


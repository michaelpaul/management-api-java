# TerminalActionsCompanyLevelApi

All URIs are relative to *https://management-test.adyen.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompaniesCompanyIdAndroidApps**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdAndroidApps) | **GET** /companies/{companyId}/androidApps | Get a list of Android apps |
| [**getCompaniesCompanyIdAndroidCertificates**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdAndroidCertificates) | **GET** /companies/{companyId}/androidCertificates | Get a list of Android certificates |
| [**getCompaniesCompanyIdTerminalActions**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActions) | **GET** /companies/{companyId}/terminalActions | Get a list of terminal actions |
| [**getCompaniesCompanyIdTerminalActionsActionId**](TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActionsActionId) | **GET** /companies/{companyId}/terminalActions/{actionId} | Get terminal action |


<a name="getCompaniesCompanyIdAndroidApps"></a>
# **getCompaniesCompanyIdAndroidApps**
> AndroidAppsResponse getCompaniesCompanyIdAndroidApps(companyId, pageNumber, pageSize)

Get a list of Android apps

Returns a list of the Android apps that are available for the company identified in the path.  These apps have been uploaded to Adyen and can be installed or uninstalled on Android payment terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminalActionsCompanyLevelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://management-test.adyen.com/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TerminalActionsCompanyLevelApi apiInstance = new TerminalActionsCompanyLevelApi(defaultClient);
    String companyId = "companyId_example"; // String | The unique identifier of the company account.
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 20 items on a page.
    try {
      AndroidAppsResponse result = apiInstance.getCompaniesCompanyIdAndroidApps(companyId, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdAndroidApps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The unique identifier of the company account. | |
| **pageNumber** | **Integer**| The number of the page to fetch. | [optional] |
| **pageSize** | **Integer**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional] |

### Return type

[**AndroidAppsResponse**](AndroidAppsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - the request has succeeded. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

<a name="getCompaniesCompanyIdAndroidCertificates"></a>
# **getCompaniesCompanyIdAndroidCertificates**
> AndroidCertificatesResponse getCompaniesCompanyIdAndroidCertificates(companyId, pageNumber, pageSize)

Get a list of Android certificates

Returns a list of the Android certificates that are available for the company identified in the path. Typically, these certificates enable running apps on Android payment terminals. The certifcates in the list have been uploaded to Adyen and can be installed or uninstalled on Android terminals through [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api).  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminalActionsCompanyLevelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://management-test.adyen.com/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TerminalActionsCompanyLevelApi apiInstance = new TerminalActionsCompanyLevelApi(defaultClient);
    String companyId = "companyId_example"; // String | The unique identifier of the company account.
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 20 items on a page.
    try {
      AndroidCertificatesResponse result = apiInstance.getCompaniesCompanyIdAndroidCertificates(companyId, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdAndroidCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The unique identifier of the company account. | |
| **pageNumber** | **Integer**| The number of the page to fetch. | [optional] |
| **pageSize** | **Integer**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional] |

### Return type

[**AndroidCertificatesResponse**](AndroidCertificatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - the request has succeeded. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

<a name="getCompaniesCompanyIdTerminalActions"></a>
# **getCompaniesCompanyIdTerminalActions**
> ListExternalTerminalActionsResponse getCompaniesCompanyIdTerminalActions(companyId, pageNumber, pageSize, status, type)

Get a list of terminal actions

Returns the [terminal actions](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) that have been scheduled for the company identified in the path.The response doesn&#39;t include actions that are scheduled by Adyen. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminalActionsCompanyLevelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://management-test.adyen.com/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TerminalActionsCompanyLevelApi apiInstance = new TerminalActionsCompanyLevelApi(defaultClient);
    String companyId = "companyId_example"; // String | The unique identifier of the company account.
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 20 items on a page.
    String status = "status_example"; // String | Returns terminal actions with the specified status.  Allowed values: **pending**, **successful**, **failed**, **cancelled**, **tryLater**.
    String type = "type_example"; // String | Returns terminal actions of the specified type.  Allowed values: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, **UninstallAndroidCertificate**.
    try {
      ListExternalTerminalActionsResponse result = apiInstance.getCompaniesCompanyIdTerminalActions(companyId, pageNumber, pageSize, status, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The unique identifier of the company account. | |
| **pageNumber** | **Integer**| The number of the page to fetch. | [optional] |
| **pageSize** | **Integer**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional] |
| **status** | **String**| Returns terminal actions with the specified status.  Allowed values: **pending**, **successful**, **failed**, **cancelled**, **tryLater**. | [optional] |
| **type** | **String**| Returns terminal actions of the specified type.  Allowed values: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, **UninstallAndroidCertificate**. | [optional] |

### Return type

[**ListExternalTerminalActionsResponse**](ListExternalTerminalActionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - the request has succeeded. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

<a name="getCompaniesCompanyIdTerminalActionsActionId"></a>
# **getCompaniesCompanyIdTerminalActionsActionId**
> ExternalTerminalAction getCompaniesCompanyIdTerminalActionsActionId(companyId, actionId)

Get terminal action

Returns the details of the [terminal action](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api) identified in the path. To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminalActionsCompanyLevelApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://management-test.adyen.com/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    TerminalActionsCompanyLevelApi apiInstance = new TerminalActionsCompanyLevelApi(defaultClient);
    String companyId = "companyId_example"; // String | The unique identifier of the company account.
    String actionId = "actionId_example"; // String | The unique identifier of the terminal action.
    try {
      ExternalTerminalAction result = apiInstance.getCompaniesCompanyIdTerminalActionsActionId(companyId, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminalActionsCompanyLevelApi#getCompaniesCompanyIdTerminalActionsActionId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The unique identifier of the company account. | |
| **actionId** | **String**| The unique identifier of the terminal action. | |

### Return type

[**ExternalTerminalAction**](ExternalTerminalAction.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK - the request has succeeded. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |


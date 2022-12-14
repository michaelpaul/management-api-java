# TerminalsTerminalLevelApi

All URIs are relative to *https://management-test.adyen.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTerminals**](TerminalsTerminalLevelApi.md#getTerminals) | **GET** /terminals | Get a list of terminals


<a name="getTerminals"></a>
# **getTerminals**
> ListTerminalsResponse getTerminals(searchQuery, countries, merchantIds, storeIds, brandModels, pageNumber, pageSize)

Get a list of terminals

Returns the payment terminals that the API credential has access to and that match the query parameters.  When using &#x60;searchQuery&#x60;, other query parameters are ignored.  To make this request, your API credential must have one of the following [roles](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Terminal actions read * Management API—Terminal actions read and write

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminalsTerminalLevelApi;

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

    TerminalsTerminalLevelApi apiInstance = new TerminalsTerminalLevelApi(defaultClient);
    String searchQuery = "searchQuery_example"; // String | Returns terminals with an ID that contains the specified string. If present, other query parameters are ignored.
    String countries = "countries_example"; // String | Returns terminals located in the countries specified by their [two-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    String merchantIds = "merchantIds_example"; // String | Returns terminals that belong to the merchant accounts specified by their unique merchant account ID.
    String storeIds = "storeIds_example"; // String | Returns terminals that are assigned to the [stores](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores) specified by their unique store ID.
    String brandModels = "brandModels_example"; // String | Returns terminals of the [models](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) specified in the format *brand.model*.
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 20 items on a page.
    try {
      ListTerminalsResponse result = apiInstance.getTerminals(searchQuery, countries, merchantIds, storeIds, brandModels, pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminalsTerminalLevelApi#getTerminals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchQuery** | **String**| Returns terminals with an ID that contains the specified string. If present, other query parameters are ignored. | [optional]
 **countries** | **String**| Returns terminals located in the countries specified by their [two-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). | [optional]
 **merchantIds** | **String**| Returns terminals that belong to the merchant accounts specified by their unique merchant account ID. | [optional]
 **storeIds** | **String**| Returns terminals that are assigned to the [stores](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores) specified by their unique store ID. | [optional]
 **brandModels** | **String**| Returns terminals of the [models](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) specified in the format *brand.model*. | [optional]
 **pageNumber** | **Integer**| The number of the page to fetch. | [optional]
 **pageSize** | **Integer**| The number of items to have on a page, maximum 100. The default is 20 items on a page. | [optional]

### Return type

[**ListTerminalsResponse**](ListTerminalsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |


# PaymentMethodsMerchantLevelApi

All URIs are relative to *https://management-test.adyen.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantsMerchantIdPaymentMethodSettings**](PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettings) | **GET** /merchants/{merchantId}/paymentMethodSettings | Get all payment methods
[**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Get payment method details
[**patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](PaymentMethodsMerchantLevelApi.md#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **PATCH** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Update a payment method
[**postMerchantsMerchantIdPaymentMethodSettings**](PaymentMethodsMerchantLevelApi.md#postMerchantsMerchantIdPaymentMethodSettings) | **POST** /merchants/{merchantId}/paymentMethodSettings | Request a payment method


<a name="getMerchantsMerchantIdPaymentMethodSettings"></a>
# **getMerchantsMerchantIdPaymentMethodSettings**
> PaymentMethodResponse getMerchantsMerchantIdPaymentMethodSettings(merchantId, storeId, businessLineId, pageSize, pageNumber)

Get all payment methods

Returns details for all payment methods of the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsMerchantLevelApi;

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

    PaymentMethodsMerchantLevelApi apiInstance = new PaymentMethodsMerchantLevelApi(defaultClient);
    String merchantId = "merchantId_example"; // String | The unique identifier of the merchant account.
    String storeId = "storeId_example"; // String | The unique identifier of the store for which to return the payment methods.
    String businessLineId = "businessLineId_example"; // String | The unique identifier of the Business Line for which to return the payment methods.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 10 items on a page.
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    try {
      PaymentMethodResponse result = apiInstance.getMerchantsMerchantIdPaymentMethodSettings(merchantId, storeId, businessLineId, pageSize, pageNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettings");
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
 **merchantId** | **String**| The unique identifier of the merchant account. |
 **storeId** | **String**| The unique identifier of the store for which to return the payment methods. | [optional]
 **businessLineId** | **String**| The unique identifier of the Business Line for which to return the payment methods. | [optional]
 **pageSize** | **Integer**| The number of items to have on a page, maximum 100. The default is 10 items on a page. | [optional]
 **pageNumber** | **Integer**| The number of the page to fetch. | [optional]

### Return type

[**PaymentMethodResponse**](PaymentMethodResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

<a name="getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId"></a>
# **getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**
> PaymentMethod getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId)

Get payment method details

Returns details for the merchant account and the payment method identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsMerchantLevelApi;

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

    PaymentMethodsMerchantLevelApi apiInstance = new PaymentMethodsMerchantLevelApi(defaultClient);
    String merchantId = "merchantId_example"; // String | The unique identifier of the merchant account.
    String paymentMethodId = "paymentMethodId_example"; // String | The unique identifier of the payment method.
    try {
      PaymentMethod result = apiInstance.getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsMerchantLevelApi#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId");
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
 **merchantId** | **String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **String**| The unique identifier of the payment method. |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

<a name="patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId"></a>
# **patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**
> PaymentMethod patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId, updatePaymentMethodInfo)

Update a payment method

Updates payment method details for the merchant account and the payment method identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read and write 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsMerchantLevelApi;

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

    PaymentMethodsMerchantLevelApi apiInstance = new PaymentMethodsMerchantLevelApi(defaultClient);
    String merchantId = "merchantId_example"; // String | The unique identifier of the merchant account.
    String paymentMethodId = "paymentMethodId_example"; // String | The unique identifier of the payment method.
    UpdatePaymentMethodInfo updatePaymentMethodInfo = new UpdatePaymentMethodInfo(); // UpdatePaymentMethodInfo | 
    try {
      PaymentMethod result = apiInstance.patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId(merchantId, paymentMethodId, updatePaymentMethodInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsMerchantLevelApi#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId");
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
 **merchantId** | **String**| The unique identifier of the merchant account. |
 **paymentMethodId** | **String**| The unique identifier of the payment method. |
 **updatePaymentMethodInfo** | [**UpdatePaymentMethodInfo**](UpdatePaymentMethodInfo.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |

<a name="postMerchantsMerchantIdPaymentMethodSettings"></a>
# **postMerchantsMerchantIdPaymentMethodSettings**
> PaymentMethod postMerchantsMerchantIdPaymentMethodSettings(merchantId, paymentMethodSetupInfo)

Request a payment method

Sends a request to add a new payment method to the merchant account identified in the path.  To make this request, your API credential must have the following [role](https://docs.adyen.com/development-resources/api-credentials#api-permissions): * Management API—Payment methods read and write 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentMethodsMerchantLevelApi;

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

    PaymentMethodsMerchantLevelApi apiInstance = new PaymentMethodsMerchantLevelApi(defaultClient);
    String merchantId = "merchantId_example"; // String | The unique identifier of the merchant account.
    PaymentMethodSetupInfo paymentMethodSetupInfo = new PaymentMethodSetupInfo(); // PaymentMethodSetupInfo | 
    try {
      PaymentMethod result = apiInstance.postMerchantsMerchantIdPaymentMethodSettings(merchantId, paymentMethodSetupInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsMerchantLevelApi#postMerchantsMerchantIdPaymentMethodSettings");
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
 **merchantId** | **String**| The unique identifier of the merchant account. |
 **paymentMethodSetupInfo** | [**PaymentMethodSetupInfo**](PaymentMethodSetupInfo.md)|  | [optional]

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK - the request has succeeded. |  -  |
**204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
**400** | Bad Request - a problem reading or understanding the request. |  -  |
**401** | Unauthorized - authentication required. |  -  |
**403** | Forbidden - insufficient permissions to process the request. |  -  |
**422** | Unprocessable Entity - a request validation error. |  -  |
**500** | Internal Server Error - the server could not process the request. |  -  |


# MyApiCredentialApi

All URIs are relative to *https://management-test.adyen.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMeAllowedOriginsOriginId**](MyApiCredentialApi.md#deleteMeAllowedOriginsOriginId) | **DELETE** /me/allowedOrigins/{originId} | Remove allowed origin |
| [**getMe**](MyApiCredentialApi.md#getMe) | **GET** /me | Get API credential details |
| [**getMeAllowedOrigins**](MyApiCredentialApi.md#getMeAllowedOrigins) | **GET** /me/allowedOrigins | Get allowed origins |
| [**getMeAllowedOriginsOriginId**](MyApiCredentialApi.md#getMeAllowedOriginsOriginId) | **GET** /me/allowedOrigins/{originId} | Get allowed origin details |
| [**postMeAllowedOrigins**](MyApiCredentialApi.md#postMeAllowedOrigins) | **POST** /me/allowedOrigins | Add allowed origin |


<a name="deleteMeAllowedOriginsOriginId"></a>
# **deleteMeAllowedOriginsOriginId**
> deleteMeAllowedOriginsOriginId(originId)

Remove allowed origin

Removes the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) specified in the path. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MyApiCredentialApi;

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

    MyApiCredentialApi apiInstance = new MyApiCredentialApi(defaultClient);
    String originId = "originId_example"; // String | Unique identifier of the allowed origin.
    try {
      apiInstance.deleteMeAllowedOriginsOriginId(originId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyApiCredentialApi#deleteMeAllowedOriginsOriginId");
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
| **originId** | **String**| Unique identifier of the allowed origin. | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content - the request has been successfully processed, but there is no additional content. |  -  |
| **400** | Bad Request - a problem reading or understanding the request. |  -  |
| **401** | Unauthorized - authentication required. |  -  |
| **403** | Forbidden - insufficient permissions to process the request. |  -  |
| **422** | Unprocessable Entity - a request validation error. |  -  |
| **500** | Internal Server Error - the server could not process the request. |  -  |

<a name="getMe"></a>
# **getMe**
> MeApiCredential getMe()

Get API credential details

Returns your [API credential](https://docs.adyen.com/development-resources/api-credentials) details based on the API Key you used in the request.  You can make this request with any of the Management API roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MyApiCredentialApi;

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

    MyApiCredentialApi apiInstance = new MyApiCredentialApi(defaultClient);
    try {
      MeApiCredential result = apiInstance.getMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyApiCredentialApi#getMe");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MeApiCredential**](MeApiCredential.md)

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

<a name="getMeAllowedOrigins"></a>
# **getMeAllowedOrigins**
> AllowedOriginsResponse getMeAllowedOrigins()

Get allowed origins

Returns the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) of your [API credential](https://docs.adyen.com/development-resources/api-credentials) based on the API key you used in the request.  You can make this request with any of the Management API roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MyApiCredentialApi;

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

    MyApiCredentialApi apiInstance = new MyApiCredentialApi(defaultClient);
    try {
      AllowedOriginsResponse result = apiInstance.getMeAllowedOrigins();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyApiCredentialApi#getMeAllowedOrigins");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllowedOriginsResponse**](AllowedOriginsResponse.md)

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

<a name="getMeAllowedOriginsOriginId"></a>
# **getMeAllowedOriginsOriginId**
> AllowedOrigin getMeAllowedOriginsOriginId(originId)

Get allowed origin details

Returns the details of the [allowed origin](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) specified in the path. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MyApiCredentialApi;

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

    MyApiCredentialApi apiInstance = new MyApiCredentialApi(defaultClient);
    String originId = "originId_example"; // String | Unique identifier of the allowed origin.
    try {
      AllowedOrigin result = apiInstance.getMeAllowedOriginsOriginId(originId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyApiCredentialApi#getMeAllowedOriginsOriginId");
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
| **originId** | **String**| Unique identifier of the allowed origin. | |

### Return type

[**AllowedOrigin**](AllowedOrigin.md)

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

<a name="postMeAllowedOrigins"></a>
# **postMeAllowedOrigins**
> AllowedOriginsResponse postMeAllowedOrigins(createAllowedOriginRequest)

Add allowed origin

Adds an allowed origin to the list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) of your API credential. The API key from the request is used to identify the [API credential](https://docs.adyen.com/development-resources/api-credentials).  You can make this request with any of the Management API roles.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MyApiCredentialApi;

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

    MyApiCredentialApi apiInstance = new MyApiCredentialApi(defaultClient);
    CreateAllowedOriginRequest createAllowedOriginRequest = new CreateAllowedOriginRequest(); // CreateAllowedOriginRequest | 
    try {
      AllowedOriginsResponse result = apiInstance.postMeAllowedOrigins(createAllowedOriginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MyApiCredentialApi#postMeAllowedOrigins");
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
| **createAllowedOriginRequest** | [**CreateAllowedOriginRequest**](CreateAllowedOriginRequest.md)|  | [optional] |

### Return type

[**AllowedOriginsResponse**](AllowedOriginsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
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




# CreateApiCredentialResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**links** | [**ApiCredentialLinks**](ApiCredentialLinks.md) |  |  [optional]
**active** | **Boolean** | Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration. | 
**allowedIpAddresses** | **List&lt;String&gt;** | List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error. | 
**allowedOrigins** | [**List&lt;AllowedOrigin&gt;**](AllowedOrigin.md) | List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential. |  [optional]
**apiKey** | **String** | The API key for the API credential that was created. | 
**clientKey** | **String** | Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations. | 
**description** | **String** | Description of the API credential. |  [optional]
**id** | **String** | Unique identifier of the API credential. | 
**password** | **String** | The password for the API credential that was created. | 
**roles** | **List&lt;String&gt;** | List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. | 
**username** | **String** | The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**. | 




# openapi-java-client

Management API
- API version: 1
  - Build date: 2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]

Configure and manage your Adyen company and merchant accounts, stores, and payment terminals.
## Authentication
Each request to the Management API must be signed with an API key. [Generate your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) in the Customer Area and then set this key to the `X-API-Key` header value.

To access the live endpoints, you need to generate a new API key in your live Customer Area.
## Versioning

Management API handles versioning as part of the endpoint URL. For example, to send a request to version 1 of the `/companies/{companyId}/webhooks` endpoint, use:

```text
https://management-test.adyen.com/v1/companies/{companyId}/webhooks
```

  For more information, please visit [https://www.adyen.help/hc/en-us/community/topics](https://www.adyen.help/hc/en-us/community/topics)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountCompanyLevelApi;

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

    AccountCompanyLevelApi apiInstance = new AccountCompanyLevelApi(defaultClient);
    Integer pageNumber = 56; // Integer | The number of the page to fetch.
    Integer pageSize = 56; // Integer | The number of items to have on a page, maximum 100. The default is 10 items on a page.
    try {
      ListCompanyResponse result = apiInstance.getCompanies(pageNumber, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountCompanyLevelApi#getCompanies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://management-test.adyen.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountCompanyLevelApi* | [**getCompanies**](docs/AccountCompanyLevelApi.md#getCompanies) | **GET** /companies | Get a list of company accounts
*AccountCompanyLevelApi* | [**getCompaniesCompanyId**](docs/AccountCompanyLevelApi.md#getCompaniesCompanyId) | **GET** /companies/{companyId} | Get a company account
*AccountCompanyLevelApi* | [**getCompaniesCompanyIdMerchants**](docs/AccountCompanyLevelApi.md#getCompaniesCompanyIdMerchants) | **GET** /companies/{companyId}/merchants | Get a list of merchant accounts
*AccountMerchantLevelApi* | [**getMerchants**](docs/AccountMerchantLevelApi.md#getMerchants) | **GET** /merchants | Get a list of merchant accounts
*AccountMerchantLevelApi* | [**getMerchantsMerchantId**](docs/AccountMerchantLevelApi.md#getMerchantsMerchantId) | **GET** /merchants/{merchantId} | Get a merchant account
*AccountMerchantLevelApi* | [**postMerchants**](docs/AccountMerchantLevelApi.md#postMerchants) | **POST** /merchants | Create a merchant account
*AccountMerchantLevelApi* | [**postMerchantsMerchantIdActivate**](docs/AccountMerchantLevelApi.md#postMerchantsMerchantIdActivate) | **POST** /merchants/{merchantId}/activate | Request to activate a merchant account
*AccountStoreLevelApi* | [**getMerchantsMerchantIdStores**](docs/AccountStoreLevelApi.md#getMerchantsMerchantIdStores) | **GET** /merchants/{merchantId}/stores | Get a list of stores
*AccountStoreLevelApi* | [**getMerchantsMerchantIdStoresStoreId**](docs/AccountStoreLevelApi.md#getMerchantsMerchantIdStoresStoreId) | **GET** /merchants/{merchantId}/stores/{storeId} | Get a store
*AccountStoreLevelApi* | [**getStores**](docs/AccountStoreLevelApi.md#getStores) | **GET** /stores | Get a list of stores
*AccountStoreLevelApi* | [**getStoresStoreId**](docs/AccountStoreLevelApi.md#getStoresStoreId) | **GET** /stores/{storeId} | Get a store
*AccountStoreLevelApi* | [**patchMerchantsMerchantIdStoresStoreId**](docs/AccountStoreLevelApi.md#patchMerchantsMerchantIdStoresStoreId) | **PATCH** /merchants/{merchantId}/stores/{storeId} | Update a store
*AccountStoreLevelApi* | [**patchStoresStoreId**](docs/AccountStoreLevelApi.md#patchStoresStoreId) | **PATCH** /stores/{storeId} | Update a store
*AccountStoreLevelApi* | [**postMerchantsMerchantIdStores**](docs/AccountStoreLevelApi.md#postMerchantsMerchantIdStores) | **POST** /merchants/{merchantId}/stores | Create a store
*AccountStoreLevelApi* | [**postStores**](docs/AccountStoreLevelApi.md#postStores) | **POST** /stores | Create a store
*AllowedOriginsCompanyLevelApi* | [**deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsCompanyLevelApi.md#deleteCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **DELETE** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
*AllowedOriginsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
*AllowedOriginsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
*AllowedOriginsCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsCompanyLevelApi.md#postCompaniesCompanyIdApiCredentialsApiCredentialIdAllowedOrigins) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin
*AllowedOriginsMerchantLevelApi* | [**deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsMerchantLevelApi.md#deleteMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **DELETE** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Delete an allowed origin
*AllowedOriginsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Get a list of allowed origins
*AllowedOriginsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId**](docs/AllowedOriginsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOriginsOriginId) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId} | Get an allowed origin
*AllowedOriginsMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins**](docs/AllowedOriginsMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdAllowedOrigins) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/allowedOrigins | Create an allowed origin
*ApiCredentialsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentials**](docs/ApiCredentialsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentials) | **GET** /companies/{companyId}/apiCredentials | Get a list of API credentials
*ApiCredentialsCompanyLevelApi* | [**getCompaniesCompanyIdApiCredentialsApiCredentialId**](docs/ApiCredentialsCompanyLevelApi.md#getCompaniesCompanyIdApiCredentialsApiCredentialId) | **GET** /companies/{companyId}/apiCredentials/{apiCredentialId} | Get an API credential
*ApiCredentialsCompanyLevelApi* | [**patchCompaniesCompanyIdApiCredentialsApiCredentialId**](docs/ApiCredentialsCompanyLevelApi.md#patchCompaniesCompanyIdApiCredentialsApiCredentialId) | **PATCH** /companies/{companyId}/apiCredentials/{apiCredentialId} | Update an API credential.
*ApiCredentialsCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentials**](docs/ApiCredentialsCompanyLevelApi.md#postCompaniesCompanyIdApiCredentials) | **POST** /companies/{companyId}/apiCredentials | Create an API credential.
*ApiCredentialsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentials**](docs/ApiCredentialsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentials) | **GET** /merchants/{merchantId}/apiCredentials | Get a list of API credentials
*ApiCredentialsMerchantLevelApi* | [**getMerchantsMerchantIdApiCredentialsApiCredentialId**](docs/ApiCredentialsMerchantLevelApi.md#getMerchantsMerchantIdApiCredentialsApiCredentialId) | **GET** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Get an API credential
*ApiCredentialsMerchantLevelApi* | [**patchMerchantsMerchantIdApiCredentialsApiCredentialId**](docs/ApiCredentialsMerchantLevelApi.md#patchMerchantsMerchantIdApiCredentialsApiCredentialId) | **PATCH** /merchants/{merchantId}/apiCredentials/{apiCredentialId} | Update an API credential
*ApiCredentialsMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentials**](docs/ApiCredentialsMerchantLevelApi.md#postMerchantsMerchantIdApiCredentials) | **POST** /merchants/{merchantId}/apiCredentials | Create an API credential
*ApiKeyCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey**](docs/ApiKeyCompanyLevelApi.md#postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateApiKey) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/generateApiKey | Generate new API key
*ApiKeyMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey**](docs/ApiKeyMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateApiKey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey | Generate new API key
*ClientKeyCompanyLevelApi* | [**postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateClientKey**](docs/ClientKeyCompanyLevelApi.md#postCompaniesCompanyIdApiCredentialsApiCredentialIdGenerateClientKey) | **POST** /companies/{companyId}/apiCredentials/{apiCredentialId}/generateClientKey | Generate new client key
*ClientKeyMerchantLevelApi* | [**postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey**](docs/ClientKeyMerchantLevelApi.md#postMerchantsMerchantIdApiCredentialsApiCredentialIdGenerateClientKey) | **POST** /merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateClientKey | Generate new client key
*MyApiCredentialApi* | [**deleteMeAllowedOriginsOriginId**](docs/MyApiCredentialApi.md#deleteMeAllowedOriginsOriginId) | **DELETE** /me/allowedOrigins/{originId} | Remove allowed origin
*MyApiCredentialApi* | [**getMe**](docs/MyApiCredentialApi.md#getMe) | **GET** /me | Get API credential details
*MyApiCredentialApi* | [**getMeAllowedOrigins**](docs/MyApiCredentialApi.md#getMeAllowedOrigins) | **GET** /me/allowedOrigins | Get allowed origins
*MyApiCredentialApi* | [**getMeAllowedOriginsOriginId**](docs/MyApiCredentialApi.md#getMeAllowedOriginsOriginId) | **GET** /me/allowedOrigins/{originId} | Get allowed origin details
*MyApiCredentialApi* | [**postMeAllowedOrigins**](docs/MyApiCredentialApi.md#postMeAllowedOrigins) | **POST** /me/allowedOrigins | Add allowed origin
*PaymentMethodsMerchantLevelApi* | [**getMerchantsMerchantIdPaymentMethodSettings**](docs/PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettings) | **GET** /merchants/{merchantId}/paymentMethodSettings | Get all payment methods
*PaymentMethodsMerchantLevelApi* | [**getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](docs/PaymentMethodsMerchantLevelApi.md#getMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **GET** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Get payment method details
*PaymentMethodsMerchantLevelApi* | [**patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId**](docs/PaymentMethodsMerchantLevelApi.md#patchMerchantsMerchantIdPaymentMethodSettingsPaymentMethodId) | **PATCH** /merchants/{merchantId}/paymentMethodSettings/{paymentMethodId} | Update a payment method
*PaymentMethodsMerchantLevelApi* | [**postMerchantsMerchantIdPaymentMethodSettings**](docs/PaymentMethodsMerchantLevelApi.md#postMerchantsMerchantIdPaymentMethodSettings) | **POST** /merchants/{merchantId}/paymentMethodSettings | Request a payment method
*PayoutSettingsMerchantLevelApi* | [**deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#deleteMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **DELETE** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Delete a payout setting
*PayoutSettingsMerchantLevelApi* | [**getMerchantsMerchantIdPayoutSettings**](docs/PayoutSettingsMerchantLevelApi.md#getMerchantsMerchantIdPayoutSettings) | **GET** /merchants/{merchantId}/payoutSettings | Get a list of payout settings
*PayoutSettingsMerchantLevelApi* | [**getMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#getMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **GET** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Get a payout setting
*PayoutSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId**](docs/PayoutSettingsMerchantLevelApi.md#patchMerchantsMerchantIdPayoutSettingsPayoutSettingsId) | **PATCH** /merchants/{merchantId}/payoutSettings/{payoutSettingsId} | Update a payout setting
*PayoutSettingsMerchantLevelApi* | [**postMerchantsMerchantIdPayoutSettings**](docs/PayoutSettingsMerchantLevelApi.md#postMerchantsMerchantIdPayoutSettings) | **POST** /merchants/{merchantId}/payoutSettings | Add a payout setting
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdAndroidApps**](docs/TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdAndroidApps) | **GET** /companies/{companyId}/androidApps | Get a list of Android apps
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdAndroidCertificates**](docs/TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdAndroidCertificates) | **GET** /companies/{companyId}/androidCertificates | Get a list of Android certificates
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalActions**](docs/TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActions) | **GET** /companies/{companyId}/terminalActions | Get a list of terminal actions
*TerminalActionsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalActionsActionId**](docs/TerminalActionsCompanyLevelApi.md#getCompaniesCompanyIdTerminalActionsActionId) | **GET** /companies/{companyId}/terminalActions/{actionId} | Get terminal action
*TerminalActionsTerminalLevelApi* | [**postTerminalsScheduleActions**](docs/TerminalActionsTerminalLevelApi.md#postTerminalsScheduleActions) | **POST** /terminals/scheduleActions | Create a terminal action
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdBillingEntities**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdBillingEntities) | **GET** /companies/{companyId}/billingEntities | Get a list of billing entities
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdShippingLocations**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdShippingLocations) | **GET** /companies/{companyId}/shippingLocations | Get a list of shipping locations
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalModels**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalModels) | **GET** /companies/{companyId}/terminalModels | Get a list of terminal models
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalOrders**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalOrders) | **GET** /companies/{companyId}/terminalOrders | Get a list of orders
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalOrdersOrderId**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalOrdersOrderId) | **GET** /companies/{companyId}/terminalOrders/{orderId} | Get an order
*TerminalOrdersCompanyLevelApi* | [**getCompaniesCompanyIdTerminalProducts**](docs/TerminalOrdersCompanyLevelApi.md#getCompaniesCompanyIdTerminalProducts) | **GET** /companies/{companyId}/terminalProducts | Get a list of terminal products
*TerminalOrdersCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalOrdersOrderId**](docs/TerminalOrdersCompanyLevelApi.md#patchCompaniesCompanyIdTerminalOrdersOrderId) | **PATCH** /companies/{companyId}/terminalOrders/{orderId} | Update an order
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdShippingLocations**](docs/TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdShippingLocations) | **POST** /companies/{companyId}/shippingLocations | Create a shipping location
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdTerminalOrders**](docs/TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdTerminalOrders) | **POST** /companies/{companyId}/terminalOrders | Create an order
*TerminalOrdersCompanyLevelApi* | [**postCompaniesCompanyIdTerminalOrdersOrderIdCancel**](docs/TerminalOrdersCompanyLevelApi.md#postCompaniesCompanyIdTerminalOrdersOrderIdCancel) | **POST** /companies/{companyId}/terminalOrders/{orderId}/cancel | Cancel an order
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdBillingEntities**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdBillingEntities) | **GET** /merchants/{merchantId}/billingEntities | Get a list of billing entities
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdShippingLocations**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdShippingLocations) | **GET** /merchants/{merchantId}/shippingLocations | Get a list of shipping locations
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalModels**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalModels) | **GET** /merchants/{merchantId}/terminalModels | Get a list of terminal models
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalOrders**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalOrders) | **GET** /merchants/{merchantId}/terminalOrders | Get a list of orders
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalOrdersOrderId**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalOrdersOrderId) | **GET** /merchants/{merchantId}/terminalOrders/{orderId} | Get an order
*TerminalOrdersMerchantLevelApi* | [**getMerchantsMerchantIdTerminalProducts**](docs/TerminalOrdersMerchantLevelApi.md#getMerchantsMerchantIdTerminalProducts) | **GET** /merchants/{merchantId}/terminalProducts | Get a list of terminal products
*TerminalOrdersMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalOrdersOrderId**](docs/TerminalOrdersMerchantLevelApi.md#patchMerchantsMerchantIdTerminalOrdersOrderId) | **PATCH** /merchants/{merchantId}/terminalOrders/{orderId} | Update an order
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdShippingLocations**](docs/TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdShippingLocations) | **POST** /merchants/{merchantId}/shippingLocations | Create a shipping location
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdTerminalOrders**](docs/TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdTerminalOrders) | **POST** /merchants/{merchantId}/terminalOrders | Create an order
*TerminalOrdersMerchantLevelApi* | [**postMerchantsMerchantIdTerminalOrdersOrderIdCancel**](docs/TerminalOrdersMerchantLevelApi.md#postMerchantsMerchantIdTerminalOrdersOrderIdCancel) | **POST** /merchants/{merchantId}/terminalOrders/{orderId}/cancel | Cancel an order
*TerminalSettingsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalLogos**](docs/TerminalSettingsCompanyLevelApi.md#getCompaniesCompanyIdTerminalLogos) | **GET** /companies/{companyId}/terminalLogos | Get the terminal logo
*TerminalSettingsCompanyLevelApi* | [**getCompaniesCompanyIdTerminalSettings**](docs/TerminalSettingsCompanyLevelApi.md#getCompaniesCompanyIdTerminalSettings) | **GET** /companies/{companyId}/terminalSettings | Get terminal settings
*TerminalSettingsCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalLogos**](docs/TerminalSettingsCompanyLevelApi.md#patchCompaniesCompanyIdTerminalLogos) | **PATCH** /companies/{companyId}/terminalLogos | Update the terminal logo
*TerminalSettingsCompanyLevelApi* | [**patchCompaniesCompanyIdTerminalSettings**](docs/TerminalSettingsCompanyLevelApi.md#patchCompaniesCompanyIdTerminalSettings) | **PATCH** /companies/{companyId}/terminalSettings | Update terminal settings
*TerminalSettingsMerchantLevelApi* | [**getMerchantsMerchantIdTerminalLogos**](docs/TerminalSettingsMerchantLevelApi.md#getMerchantsMerchantIdTerminalLogos) | **GET** /merchants/{merchantId}/terminalLogos | Get the terminal logo
*TerminalSettingsMerchantLevelApi* | [**getMerchantsMerchantIdTerminalSettings**](docs/TerminalSettingsMerchantLevelApi.md#getMerchantsMerchantIdTerminalSettings) | **GET** /merchants/{merchantId}/terminalSettings | Get terminal settings
*TerminalSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalLogos**](docs/TerminalSettingsMerchantLevelApi.md#patchMerchantsMerchantIdTerminalLogos) | **PATCH** /merchants/{merchantId}/terminalLogos | Update the terminal logo
*TerminalSettingsMerchantLevelApi* | [**patchMerchantsMerchantIdTerminalSettings**](docs/TerminalSettingsMerchantLevelApi.md#patchMerchantsMerchantIdTerminalSettings) | **PATCH** /merchants/{merchantId}/terminalSettings | Update terminal settings
*TerminalSettingsStoreLevelApi* | [**getMerchantsMerchantIdStoresReferenceTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#getMerchantsMerchantIdStoresReferenceTerminalLogos) | **GET** /merchants/{merchantId}/stores/{reference}/terminalLogos | Get the terminal logo
*TerminalSettingsStoreLevelApi* | [**getMerchantsMerchantIdStoresReferenceTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#getMerchantsMerchantIdStoresReferenceTerminalSettings) | **GET** /merchants/{merchantId}/stores/{reference}/terminalSettings | Get terminal settings
*TerminalSettingsStoreLevelApi* | [**getStoresStoreIdTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#getStoresStoreIdTerminalLogos) | **GET** /stores/{storeId}/terminalLogos | Get the terminal logo
*TerminalSettingsStoreLevelApi* | [**getStoresStoreIdTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#getStoresStoreIdTerminalSettings) | **GET** /stores/{storeId}/terminalSettings | Get terminal settings
*TerminalSettingsStoreLevelApi* | [**patchMerchantsMerchantIdStoresReferenceTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#patchMerchantsMerchantIdStoresReferenceTerminalLogos) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalLogos | Update the terminal logo
*TerminalSettingsStoreLevelApi* | [**patchMerchantsMerchantIdStoresReferenceTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#patchMerchantsMerchantIdStoresReferenceTerminalSettings) | **PATCH** /merchants/{merchantId}/stores/{reference}/terminalSettings | Update terminal settings
*TerminalSettingsStoreLevelApi* | [**patchStoresStoreIdTerminalLogos**](docs/TerminalSettingsStoreLevelApi.md#patchStoresStoreIdTerminalLogos) | **PATCH** /stores/{storeId}/terminalLogos | Update the terminal logo
*TerminalSettingsStoreLevelApi* | [**patchStoresStoreIdTerminalSettings**](docs/TerminalSettingsStoreLevelApi.md#patchStoresStoreIdTerminalSettings) | **PATCH** /stores/{storeId}/terminalSettings | Update terminal settings
*TerminalSettingsTerminalLevelApi* | [**getTerminalsTerminalIdTerminalLogos**](docs/TerminalSettingsTerminalLevelApi.md#getTerminalsTerminalIdTerminalLogos) | **GET** /terminals/{terminalId}/terminalLogos | Get the terminal logo
*TerminalSettingsTerminalLevelApi* | [**getTerminalsTerminalIdTerminalSettings**](docs/TerminalSettingsTerminalLevelApi.md#getTerminalsTerminalIdTerminalSettings) | **GET** /terminals/{terminalId}/terminalSettings | Get terminal settings
*TerminalSettingsTerminalLevelApi* | [**patchTerminalsTerminalIdTerminalLogos**](docs/TerminalSettingsTerminalLevelApi.md#patchTerminalsTerminalIdTerminalLogos) | **PATCH** /terminals/{terminalId}/terminalLogos | Update the logo
*TerminalSettingsTerminalLevelApi* | [**patchTerminalsTerminalIdTerminalSettings**](docs/TerminalSettingsTerminalLevelApi.md#patchTerminalsTerminalIdTerminalSettings) | **PATCH** /terminals/{terminalId}/terminalSettings | Update terminal settings
*TerminalsTerminalLevelApi* | [**getTerminals**](docs/TerminalsTerminalLevelApi.md#getTerminals) | **GET** /terminals | Get a list of terminals
*UsersCompanyLevelApi* | [**getCompaniesCompanyIdUsers**](docs/UsersCompanyLevelApi.md#getCompaniesCompanyIdUsers) | **GET** /companies/{companyId}/users | Get a list of users
*UsersCompanyLevelApi* | [**getCompaniesCompanyIdUsersUserId**](docs/UsersCompanyLevelApi.md#getCompaniesCompanyIdUsersUserId) | **GET** /companies/{companyId}/users/{userId} | Get user details
*UsersCompanyLevelApi* | [**patchCompaniesCompanyIdUsersUserId**](docs/UsersCompanyLevelApi.md#patchCompaniesCompanyIdUsersUserId) | **PATCH** /companies/{companyId}/users/{userId} | Update user details
*UsersCompanyLevelApi* | [**postCompaniesCompanyIdUsers**](docs/UsersCompanyLevelApi.md#postCompaniesCompanyIdUsers) | **POST** /companies/{companyId}/users | Create a new user
*UsersMerchantLevelApi* | [**getMerchantsMerchantIdUsers**](docs/UsersMerchantLevelApi.md#getMerchantsMerchantIdUsers) | **GET** /merchants/{merchantId}/users | Get a list of users
*UsersMerchantLevelApi* | [**getMerchantsMerchantIdUsersUserId**](docs/UsersMerchantLevelApi.md#getMerchantsMerchantIdUsersUserId) | **GET** /merchants/{merchantId}/users/{userId} | Get user details
*UsersMerchantLevelApi* | [**patchMerchantsMerchantIdUsersUserId**](docs/UsersMerchantLevelApi.md#patchMerchantsMerchantIdUsersUserId) | **PATCH** /merchants/{merchantId}/users/{userId} | Update a user
*UsersMerchantLevelApi* | [**postMerchantsMerchantIdUsers**](docs/UsersMerchantLevelApi.md#postMerchantsMerchantIdUsers) | **POST** /merchants/{merchantId}/users | Create a new user
*WebhooksCompanyLevelApi* | [**deleteCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#deleteCompaniesCompanyIdWebhooksWebhookId) | **DELETE** /companies/{companyId}/webhooks/{webhookId} | Remove a webhook
*WebhooksCompanyLevelApi* | [**getCompaniesCompanyIdWebhooks**](docs/WebhooksCompanyLevelApi.md#getCompaniesCompanyIdWebhooks) | **GET** /companies/{companyId}/webhooks | List all webhooks
*WebhooksCompanyLevelApi* | [**getCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#getCompaniesCompanyIdWebhooksWebhookId) | **GET** /companies/{companyId}/webhooks/{webhookId} | Get a webhook
*WebhooksCompanyLevelApi* | [**patchCompaniesCompanyIdWebhooksWebhookId**](docs/WebhooksCompanyLevelApi.md#patchCompaniesCompanyIdWebhooksWebhookId) | **PATCH** /companies/{companyId}/webhooks/{webhookId} | Update a webhook
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooks**](docs/WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooks) | **POST** /companies/{companyId}/webhooks | Set up a webhook
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac**](docs/WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooksWebhookIdGenerateHmac) | **POST** /companies/{companyId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
*WebhooksCompanyLevelApi* | [**postCompaniesCompanyIdWebhooksWebhookIdTest**](docs/WebhooksCompanyLevelApi.md#postCompaniesCompanyIdWebhooksWebhookIdTest) | **POST** /companies/{companyId}/webhooks/{webhookId}/test | Test a webhook
*WebhooksMerchantLevelApi* | [**deleteMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#deleteMerchantsMerchantIdWebhooksWebhookId) | **DELETE** /merchants/{merchantId}/webhooks/{webhookId} | Remove a webhook
*WebhooksMerchantLevelApi* | [**getMerchantsMerchantIdWebhooks**](docs/WebhooksMerchantLevelApi.md#getMerchantsMerchantIdWebhooks) | **GET** /merchants/{merchantId}/webhooks | List all webhooks
*WebhooksMerchantLevelApi* | [**getMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#getMerchantsMerchantIdWebhooksWebhookId) | **GET** /merchants/{merchantId}/webhooks/{webhookId} | Get a webhook
*WebhooksMerchantLevelApi* | [**patchMerchantsMerchantIdWebhooksWebhookId**](docs/WebhooksMerchantLevelApi.md#patchMerchantsMerchantIdWebhooksWebhookId) | **PATCH** /merchants/{merchantId}/webhooks/{webhookId} | Update a webhook
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooks**](docs/WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooks) | **POST** /merchants/{merchantId}/webhooks | Set up a webhook
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac**](docs/WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooksWebhookIdGenerateHmac) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/generateHmac | Generate an HMAC key
*WebhooksMerchantLevelApi* | [**postMerchantsMerchantIdWebhooksWebhookIdTest**](docs/WebhooksMerchantLevelApi.md#postMerchantsMerchantIdWebhooksWebhookIdTest) | **POST** /merchants/{merchantId}/webhooks/{webhookId}/test | Test a webhook


## Documentation for Models

 - [AdditionalSettings](docs/AdditionalSettings.md)
 - [AdditionalSettingsResponse](docs/AdditionalSettingsResponse.md)
 - [Address](docs/Address.md)
 - [Address2](docs/Address2.md)
 - [AllowedOrigin](docs/AllowedOrigin.md)
 - [AllowedOriginsResponse](docs/AllowedOriginsResponse.md)
 - [Amount](docs/Amount.md)
 - [Amount2](docs/Amount2.md)
 - [AndroidApp](docs/AndroidApp.md)
 - [AndroidAppsResponse](docs/AndroidAppsResponse.md)
 - [AndroidCertificate](docs/AndroidCertificate.md)
 - [AndroidCertificatesResponse](docs/AndroidCertificatesResponse.md)
 - [ApiCredential](docs/ApiCredential.md)
 - [ApiCredentialLinks](docs/ApiCredentialLinks.md)
 - [ApplePayInfo](docs/ApplePayInfo.md)
 - [BcmcInfo](docs/BcmcInfo.md)
 - [BillingEntitiesResponse](docs/BillingEntitiesResponse.md)
 - [BillingEntity](docs/BillingEntity.md)
 - [CardholderReceipt](docs/CardholderReceipt.md)
 - [CartesBancairesInfo](docs/CartesBancairesInfo.md)
 - [Company](docs/Company.md)
 - [CompanyApiCredential](docs/CompanyApiCredential.md)
 - [CompanyLinks](docs/CompanyLinks.md)
 - [CompanyUser](docs/CompanyUser.md)
 - [Connectivity](docs/Connectivity.md)
 - [Contact](docs/Contact.md)
 - [CreateAllowedOriginRequest](docs/CreateAllowedOriginRequest.md)
 - [CreateApiCredentialResponse](docs/CreateApiCredentialResponse.md)
 - [CreateCompanyApiCredentialRequest](docs/CreateCompanyApiCredentialRequest.md)
 - [CreateCompanyApiCredentialResponse](docs/CreateCompanyApiCredentialResponse.md)
 - [CreateCompanyUserRequest](docs/CreateCompanyUserRequest.md)
 - [CreateCompanyUserResponse](docs/CreateCompanyUserResponse.md)
 - [CreateCompanyWebhookRequest](docs/CreateCompanyWebhookRequest.md)
 - [CreateMerchantApiCredentialRequest](docs/CreateMerchantApiCredentialRequest.md)
 - [CreateMerchantRequest](docs/CreateMerchantRequest.md)
 - [CreateMerchantResponse](docs/CreateMerchantResponse.md)
 - [CreateMerchantUserRequest](docs/CreateMerchantUserRequest.md)
 - [CreateMerchantWebhookRequest](docs/CreateMerchantWebhookRequest.md)
 - [CreateUserResponse](docs/CreateUserResponse.md)
 - [Currency](docs/Currency.md)
 - [CustomNotification](docs/CustomNotification.md)
 - [DataCenter](docs/DataCenter.md)
 - [EventUrl](docs/EventUrl.md)
 - [ExternalTerminalAction](docs/ExternalTerminalAction.md)
 - [GenerateApiKeyResponse](docs/GenerateApiKeyResponse.md)
 - [GenerateClientKeyResponse](docs/GenerateClientKeyResponse.md)
 - [GenerateHmacKeyResponse](docs/GenerateHmacKeyResponse.md)
 - [GiroPayInfo](docs/GiroPayInfo.md)
 - [Gratuity](docs/Gratuity.md)
 - [Hardware](docs/Hardware.md)
 - [IdName](docs/IdName.md)
 - [InstallAndroidAppDetails](docs/InstallAndroidAppDetails.md)
 - [InstallAndroidCertificateDetails](docs/InstallAndroidCertificateDetails.md)
 - [InvalidField](docs/InvalidField.md)
 - [JSONObject](docs/JSONObject.md)
 - [JSONPath](docs/JSONPath.md)
 - [KlarnaInfo](docs/KlarnaInfo.md)
 - [Links](docs/Links.md)
 - [LinksElement](docs/LinksElement.md)
 - [ListCompanyApiCredentialsResponse](docs/ListCompanyApiCredentialsResponse.md)
 - [ListCompanyResponse](docs/ListCompanyResponse.md)
 - [ListCompanyUsersResponse](docs/ListCompanyUsersResponse.md)
 - [ListExternalTerminalActionsResponse](docs/ListExternalTerminalActionsResponse.md)
 - [ListMerchantApiCredentialsResponse](docs/ListMerchantApiCredentialsResponse.md)
 - [ListMerchantResponse](docs/ListMerchantResponse.md)
 - [ListMerchantUsersResponse](docs/ListMerchantUsersResponse.md)
 - [ListStoresResponse](docs/ListStoresResponse.md)
 - [ListTerminalsResponse](docs/ListTerminalsResponse.md)
 - [ListWebhooksResponse](docs/ListWebhooksResponse.md)
 - [Logo](docs/Logo.md)
 - [MeApiCredential](docs/MeApiCredential.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantLinks](docs/MerchantLinks.md)
 - [MinorUnitsMonetaryValue](docs/MinorUnitsMonetaryValue.md)
 - [ModelConfiguration](docs/ModelConfiguration.md)
 - [ModelFile](docs/ModelFile.md)
 - [Name](docs/Name.md)
 - [Name2](docs/Name2.md)
 - [Nexo](docs/Nexo.md)
 - [OfflineProcessing](docs/OfflineProcessing.md)
 - [Opi](docs/Opi.md)
 - [OrderItem](docs/OrderItem.md)
 - [PaginationLinks](docs/PaginationLinks.md)
 - [PayPalInfo](docs/PayPalInfo.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [PaymentMethodSetupInfo](docs/PaymentMethodSetupInfo.md)
 - [PayoutSettings](docs/PayoutSettings.md)
 - [PayoutSettingsRequest](docs/PayoutSettingsRequest.md)
 - [PayoutSettingsResponse](docs/PayoutSettingsResponse.md)
 - [Profile](docs/Profile.md)
 - [ReceiptOptions](docs/ReceiptOptions.md)
 - [ReceiptPrinting](docs/ReceiptPrinting.md)
 - [ReleaseUpdateDetails](docs/ReleaseUpdateDetails.md)
 - [RequestActivationResponse](docs/RequestActivationResponse.md)
 - [RestServiceError](docs/RestServiceError.md)
 - [ScheduleTerminalActionsRequest](docs/ScheduleTerminalActionsRequest.md)
 - [ScheduleTerminalActionsResponse](docs/ScheduleTerminalActionsResponse.md)
 - [Settings](docs/Settings.md)
 - [ShippingLocation](docs/ShippingLocation.md)
 - [ShippingLocationsResponse](docs/ShippingLocationsResponse.md)
 - [Signature](docs/Signature.md)
 - [SofortInfo](docs/SofortInfo.md)
 - [Store](docs/Store.md)
 - [StoreCreationRequest](docs/StoreCreationRequest.md)
 - [StoreCreationWithMerchantCodeRequest](docs/StoreCreationWithMerchantCodeRequest.md)
 - [StoreSplitConfiguration](docs/StoreSplitConfiguration.md)
 - [Surcharge](docs/Surcharge.md)
 - [SwishInfo](docs/SwishInfo.md)
 - [Terminal](docs/Terminal.md)
 - [TerminalActionScheduleDetail](docs/TerminalActionScheduleDetail.md)
 - [TerminalModelsResponse](docs/TerminalModelsResponse.md)
 - [TerminalOrder](docs/TerminalOrder.md)
 - [TerminalOrderRequest](docs/TerminalOrderRequest.md)
 - [TerminalOrdersResponse](docs/TerminalOrdersResponse.md)
 - [TerminalProduct](docs/TerminalProduct.md)
 - [TerminalProductsResponse](docs/TerminalProductsResponse.md)
 - [TerminalSettings](docs/TerminalSettings.md)
 - [TestCompanyWebhookRequest](docs/TestCompanyWebhookRequest.md)
 - [TestOutput](docs/TestOutput.md)
 - [TestWebhookRequest](docs/TestWebhookRequest.md)
 - [TestWebhookResponse](docs/TestWebhookResponse.md)
 - [Timeouts](docs/Timeouts.md)
 - [UninstallAndroidAppDetails](docs/UninstallAndroidAppDetails.md)
 - [UninstallAndroidCertificateDetails](docs/UninstallAndroidCertificateDetails.md)
 - [UpdatableAddress](docs/UpdatableAddress.md)
 - [UpdateCompanyApiCredentialRequest](docs/UpdateCompanyApiCredentialRequest.md)
 - [UpdateCompanyUserRequest](docs/UpdateCompanyUserRequest.md)
 - [UpdateCompanyWebhookRequest](docs/UpdateCompanyWebhookRequest.md)
 - [UpdateMerchantApiCredentialRequest](docs/UpdateMerchantApiCredentialRequest.md)
 - [UpdateMerchantUserRequest](docs/UpdateMerchantUserRequest.md)
 - [UpdateMerchantWebhookRequest](docs/UpdateMerchantWebhookRequest.md)
 - [UpdatePaymentMethodInfo](docs/UpdatePaymentMethodInfo.md)
 - [UpdatePayoutSettingsRequest](docs/UpdatePayoutSettingsRequest.md)
 - [UpdateStoreRequest](docs/UpdateStoreRequest.md)
 - [Url](docs/Url.md)
 - [User](docs/User.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookLinks](docs/WebhookLinks.md)
 - [WifiProfiles](docs/WifiProfiles.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

### BasicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developer-experience@adyen.com


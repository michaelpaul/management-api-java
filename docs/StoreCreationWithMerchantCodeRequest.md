

# StoreCreationWithMerchantCodeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**Address2**](Address2.md) |  |  |
|**businessLineIds** | **List&lt;String&gt;** | The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businesslines__resParam_id) that the store is associated with. If not specified, the business line of the merchant account is used. Required when there are multiple business lines under the merchant account. |  [optional] |
|**description** | **String** | Your description of the store. |  |
|**externalReferenceId** | **String** | When using the Zip payment method: The location ID that Zip has assigned to your store. |  [optional] |
|**merchantId** | **String** | The unique identifier of the merchant account that the store belongs to. |  |
|**phoneNumber** | **String** | The phone number of the store, including &#39;+&#39; and country code. |  |
|**reference** | **String** | Your reference to recognize the store by. Also known as the store code.  Allowed characters: Lowercase and uppercase letters without diacritics, numbers 0 through 9, hyphen (-), and underscore (_). |  [optional] |
|**shopperStatement** | **String** | The store name to be shown on the shopper&#39;s bank or credit card statement and on the shopper receipt. Maximum length: 22 characters; can&#39;t be all numbers. |  |
|**splitConfiguration** | [**StoreSplitConfiguration**](StoreSplitConfiguration.md) |  |  [optional] |




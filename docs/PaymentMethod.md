

# PaymentMethod


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applePay** | [**ApplePayInfo**](ApplePayInfo.md) |  |  [optional]
**bcmc** | [**BcmcInfo**](BcmcInfo.md) |  |  [optional]
**businessLineId** | **String** | The unique identifier of the business line. |  [optional]
**cartesBancaires** | [**CartesBancairesInfo**](CartesBancairesInfo.md) |  |  [optional]
**countries** | **List&lt;String&gt;** | The list of countries where a payment method is available. By default, all countries supported by the payment method. |  [optional]
**currencies** | **List&lt;String&gt;** | The list of currencies that a payment method supports. By default, all currencies supported by the payment method. |  [optional]
**enabled** | **Boolean** | Indicates whether the payment method is enabled (**true**) or disabled (**false**). |  [optional]
**giroPay** | [**GiroPayInfo**](GiroPayInfo.md) |  |  [optional]
**id** | **String** | The identifier of the resource. | 
**klarna** | [**KlarnaInfo**](KlarnaInfo.md) |  |  [optional]
**paypal** | [**PayPalInfo**](PayPalInfo.md) |  |  [optional]
**sofort** | [**SofortInfo**](SofortInfo.md) |  |  [optional]
**storeId** | **String** | The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any. |  [optional]
**swish** | [**SwishInfo**](SwishInfo.md) |  |  [optional]
**type** | **String** | Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). |  [optional]






# PaymentMethodSetupInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applePay** | [**ApplePayInfo**](ApplePayInfo.md) |  |  [optional] |
|**bcmc** | [**BcmcInfo**](BcmcInfo.md) |  |  [optional] |
|**businessLineId** | **String** | The unique identifier of the business line. |  [optional] |
|**cartesBancaires** | [**CartesBancairesInfo**](CartesBancairesInfo.md) |  |  [optional] |
|**countries** | **List&lt;String&gt;** | The list of countries where a payment method is available. By default, all countries supported by the payment method. |  [optional] |
|**currencies** | **List&lt;String&gt;** | The list of currencies that a payment method supports. By default, all currencies supported by the payment method. |  [optional] |
|**giroPay** | [**GiroPayInfo**](GiroPayInfo.md) |  |  [optional] |
|**klarna** | [**KlarnaInfo**](KlarnaInfo.md) |  |  [optional] |
|**paypal** | [**PayPalInfo**](PayPalInfo.md) |  |  [optional] |
|**shopperInteraction** | [**ShopperInteractionEnum**](#ShopperInteractionEnum) | The sales channel. Required if the merchant account does not have a sales channel. When you provide this field, it overrides the default sales channel set on the merchant account.  Possible values: **eCommerce**, **pos**, **contAuth**, and **moto**.  |  [optional] |
|**sofort** | [**SofortInfo**](SofortInfo.md) |  |  [optional] |
|**storeId** | **String** | The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any. |  [optional] |
|**swish** | [**SwishInfo**](SwishInfo.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api). |  |



## Enum: ShopperInteractionEnum

| Name | Value |
|---- | -----|
| ECOMMERCE | &quot;eCommerce&quot; |
| POS | &quot;pos&quot; |
| MOTO | &quot;moto&quot; |
| CONTAUTH | &quot;contAuth&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALIPAY | &quot;alipay&quot; |
| AMEX | &quot;amex&quot; |
| APPLEPAY | &quot;applepay&quot; |
| BCMC | &quot;bcmc&quot; |
| BLIK | &quot;blik&quot; |
| CARTEBANCAIRE | &quot;cartebancaire&quot; |
| CUP | &quot;cup&quot; |
| DINERS | &quot;diners&quot; |
| DIRECTEBANKING | &quot;directEbanking&quot; |
| DIRECTDEBIT_GB | &quot;directdebit_GB&quot; |
| DISCOVER | &quot;discover&quot; |
| EBANKING_FI | &quot;ebanking_FI&quot; |
| EFTPOS_AUSTRALIA | &quot;eftpos_australia&quot; |
| GIROCARD | &quot;girocard&quot; |
| GIROPAY | &quot;giropay&quot; |
| IDEAL | &quot;ideal&quot; |
| INTERAC_CARD | &quot;interac_card&quot; |
| JCB | &quot;jcb&quot; |
| KLARNA | &quot;klarna&quot; |
| KLARNA_ACCOUNT | &quot;klarna_account&quot; |
| KLARNA_PAYNOW | &quot;klarna_paynow&quot; |
| MAESTRO | &quot;maestro&quot; |
| MBWAY | &quot;mbway&quot; |
| MC | &quot;mc&quot; |
| MOBILEPAY | &quot;mobilepay&quot; |
| MULTIBANCO | &quot;multibanco&quot; |
| PAYPAL | &quot;paypal&quot; |
| PAYSHOP | &quot;payshop&quot; |
| SWISH | &quot;swish&quot; |
| TRUSTLY | &quot;trustly&quot; |
| VISA | &quot;visa&quot; |
| WECHATPAY | &quot;wechatpay&quot; |
| WECHATPAY_POS | &quot;wechatpay_pos&quot; |






# ModelConfiguration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **String** | Payment method, like **eftpos_australia** or **mc**. See the [possible values](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).  | 
**currencies** | [**List&lt;Currency&gt;**](Currency.md) | Currency, and surcharge percentage or amount. | 
**sources** | [**SourcesEnum**](#SourcesEnum) | Funding source. Possible values: * **Credit** * **Debit** |  [optional]



## Enum: SourcesEnum

Name | Value
---- | -----




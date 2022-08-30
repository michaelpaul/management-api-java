

# UpdateStoreRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**UpdatableAddress**](UpdatableAddress.md) |  |  [optional]
**businessLineIds** | **List&lt;String&gt;** | The unique identifiers of the [business lines](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businesslines__resParam_id) that the store is associated with. |  [optional]
**description** | **String** | The description of the store. |  [optional]
**externalReferenceId** | **String** | When using the Zip payment method: The location ID that Zip has assigned to your store. |  [optional]
**splitConfiguration** | [**StoreSplitConfiguration**](StoreSplitConfiguration.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the store. Possible values are:  - **active**: This value is assigned automatically when a store is created.  - **inactive**: The maximum [transaction limits and number of Store-and-Forward transactions](https://docs.adyen.com/point-of-sale/determine-account-structure/configure-features#payment-features) for the store are set to 0. This blocks new transactions, but captures are still possible. - **closed**: The terminals of the store are reassigned to the merchant inventory, so they can&#39;t process payments.  You can change the status from **active** to **inactive**, and from **inactive** to **active** or **closed**.  Once **closed**, a store can&#39;t be reopened. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
CLOSED | &quot;closed&quot;
INACTIVE | &quot;inactive&quot;




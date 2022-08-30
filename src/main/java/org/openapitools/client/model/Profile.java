/*
 * Management API
 * Configure and manage your Adyen company and merchant accounts, stores, and payment terminals. ## Authentication Each request to the Management API must be signed with an API key. [Generate your API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key) in the Customer Area and then set this key to the `X-API-Key` header value.  To access the live endpoints, you need to generate a new API key in your live Customer Area. ## Versioning  Management API handles versioning as part of the endpoint URL. For example, to send a request to version 1 of the `/companies/{companyId}/webhooks` endpoint, use:  ```text https://management-test.adyen.com/v1/companies/{companyId}/webhooks ```
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ModelFile;

/**
 * Profile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class Profile {
  public static final String SERIALIZED_NAME_AUTH_TYPE = "authType";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private String authType;

  public static final String SERIALIZED_NAME_AUTO_WIFI = "autoWifi";
  @SerializedName(SERIALIZED_NAME_AUTO_WIFI)
  private Boolean autoWifi;

  public static final String SERIALIZED_NAME_BSS_TYPE = "bssType";
  @SerializedName(SERIALIZED_NAME_BSS_TYPE)
  private String bssType;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Integer channel;

  public static final String SERIALIZED_NAME_DEFAULT_PROFILE = "defaultProfile";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PROFILE)
  private Boolean defaultProfile;

  public static final String SERIALIZED_NAME_EAP = "eap";
  @SerializedName(SERIALIZED_NAME_EAP)
  private String eap;

  public static final String SERIALIZED_NAME_EAP_CA_CERT = "eapCaCert";
  @SerializedName(SERIALIZED_NAME_EAP_CA_CERT)
  private ModelFile eapCaCert;

  public static final String SERIALIZED_NAME_EAP_CLIENT_CERT = "eapClientCert";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_CERT)
  private ModelFile eapClientCert;

  public static final String SERIALIZED_NAME_EAP_CLIENT_KEY = "eapClientKey";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_KEY)
  private ModelFile eapClientKey;

  public static final String SERIALIZED_NAME_EAP_CLIENT_PWD = "eapClientPwd";
  @SerializedName(SERIALIZED_NAME_EAP_CLIENT_PWD)
  private String eapClientPwd;

  public static final String SERIALIZED_NAME_EAP_IDENTITY = "eapIdentity";
  @SerializedName(SERIALIZED_NAME_EAP_IDENTITY)
  private String eapIdentity;

  public static final String SERIALIZED_NAME_EAP_INTERMEDIATE_CERT = "eapIntermediateCert";
  @SerializedName(SERIALIZED_NAME_EAP_INTERMEDIATE_CERT)
  private ModelFile eapIntermediateCert;

  public static final String SERIALIZED_NAME_EAP_PWD = "eapPwd";
  @SerializedName(SERIALIZED_NAME_EAP_PWD)
  private String eapPwd;

  public static final String SERIALIZED_NAME_HIDDEN_SSID = "hiddenSsid";
  @SerializedName(SERIALIZED_NAME_HIDDEN_SSID)
  private Boolean hiddenSsid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PSK = "psk";
  @SerializedName(SERIALIZED_NAME_PSK)
  private String psk;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  public static final String SERIALIZED_NAME_WSEC = "wsec";
  @SerializedName(SERIALIZED_NAME_WSEC)
  private String wsec;

  public Profile() { 
  }

  public Profile authType(String authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.
   * @return authType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.")

  public String getAuthType() {
    return authType;
  }


  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public Profile autoWifi(Boolean autoWifi) {
    
    this.autoWifi = autoWifi;
    return this;
  }

   /**
   * Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.
   * @return autoWifi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.")

  public Boolean getAutoWifi() {
    return autoWifi;
  }


  public void setAutoWifi(Boolean autoWifi) {
    this.autoWifi = autoWifi;
  }


  public Profile bssType(String bssType) {
    
    this.bssType = bssType;
    return this;
  }

   /**
   * Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.
   * @return bssType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.")

  public String getBssType() {
    return bssType;
  }


  public void setBssType(String bssType) {
    this.bssType = bssType;
  }


  public Profile channel(Integer channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.")

  public Integer getChannel() {
    return channel;
  }


  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public Profile defaultProfile(Boolean defaultProfile) {
    
    this.defaultProfile = defaultProfile;
    return this;
  }

   /**
   * Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.
   * @return defaultProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.")

  public Boolean getDefaultProfile() {
    return defaultProfile;
  }


  public void setDefaultProfile(Boolean defaultProfile) {
    this.defaultProfile = defaultProfile;
  }


  public Profile eap(String eap) {
    
    this.eap = eap;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**
   * @return eap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**")

  public String getEap() {
    return eap;
  }


  public void setEap(String eap) {
    this.eap = eap;
  }


  public Profile eapCaCert(ModelFile eapCaCert) {
    
    this.eapCaCert = eapCaCert;
    return this;
  }

   /**
   * Get eapCaCert
   * @return eapCaCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelFile getEapCaCert() {
    return eapCaCert;
  }


  public void setEapCaCert(ModelFile eapCaCert) {
    this.eapCaCert = eapCaCert;
  }


  public Profile eapClientCert(ModelFile eapClientCert) {
    
    this.eapClientCert = eapClientCert;
    return this;
  }

   /**
   * Get eapClientCert
   * @return eapClientCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelFile getEapClientCert() {
    return eapClientCert;
  }


  public void setEapClientCert(ModelFile eapClientCert) {
    this.eapClientCert = eapClientCert;
  }


  public Profile eapClientKey(ModelFile eapClientKey) {
    
    this.eapClientKey = eapClientKey;
    return this;
  }

   /**
   * Get eapClientKey
   * @return eapClientKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelFile getEapClientKey() {
    return eapClientKey;
  }


  public void setEapClientKey(ModelFile eapClientKey) {
    this.eapClientKey = eapClientKey;
  }


  public Profile eapClientPwd(String eapClientPwd) {
    
    this.eapClientPwd = eapClientPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **tls**. The password of the RSA key file, if that file is password-protected.
   * @return eapClientPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `eap` **tls**. The password of the RSA key file, if that file is password-protected.")

  public String getEapClientPwd() {
    return eapClientPwd;
  }


  public void setEapClientPwd(String eapClientPwd) {
    this.eapClientPwd = eapClientPwd;
  }


  public Profile eapIdentity(String eapIdentity) {
    
    this.eapIdentity = eapIdentity;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.")

  public String getEapIdentity() {
    return eapIdentity;
  }


  public void setEapIdentity(String eapIdentity) {
    this.eapIdentity = eapIdentity;
  }


  public Profile eapIntermediateCert(ModelFile eapIntermediateCert) {
    
    this.eapIntermediateCert = eapIntermediateCert;
    return this;
  }

   /**
   * Get eapIntermediateCert
   * @return eapIntermediateCert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelFile getEapIntermediateCert() {
    return eapIntermediateCert;
  }


  public void setEapIntermediateCert(ModelFile eapIntermediateCert) {
    this.eapIntermediateCert = eapIntermediateCert;
  }


  public Profile eapPwd(String eapPwd) {
    
    this.eapPwd = eapPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapPwd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `eap` **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.")

  public String getEapPwd() {
    return eapPwd;
  }


  public void setEapPwd(String eapPwd) {
    this.eapPwd = eapPwd;
  }


  public Profile hiddenSsid(Boolean hiddenSsid) {
    
    this.hiddenSsid = hiddenSsid;
    return this;
  }

   /**
   * Indicates if the network doesn&#39;t broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.
   * @return hiddenSsid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the network doesn't broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.")

  public Boolean getHiddenSsid() {
    return hiddenSsid;
  }


  public void setHiddenSsid(Boolean hiddenSsid) {
    this.hiddenSsid = hiddenSsid;
  }


  public Profile name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Your name for the Wi-Fi profile.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your name for the Wi-Fi profile.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Profile psk(String psk) {
    
    this.psk = psk;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-psk or **wpa2-psk**. The password to the wireless network.
   * @return psk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For `authType` **wpa-psk or **wpa2-psk**. The password to the wireless network.")

  public String getPsk() {
    return psk;
  }


  public void setPsk(String psk) {
    this.psk = psk;
  }


  public Profile ssid(String ssid) {
    
    this.ssid = ssid;
    return this;
  }

   /**
   * The name of the wireless network.
   * @return ssid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the wireless network.")

  public String getSsid() {
    return ssid;
  }


  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public Profile wsec(String wsec) {
    
    this.wsec = wsec;
    return this;
  }

   /**
   * The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**
   * @return wsec
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**")

  public String getWsec() {
    return wsec;
  }


  public void setWsec(String wsec) {
    this.wsec = wsec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.authType, profile.authType) &&
        Objects.equals(this.autoWifi, profile.autoWifi) &&
        Objects.equals(this.bssType, profile.bssType) &&
        Objects.equals(this.channel, profile.channel) &&
        Objects.equals(this.defaultProfile, profile.defaultProfile) &&
        Objects.equals(this.eap, profile.eap) &&
        Objects.equals(this.eapCaCert, profile.eapCaCert) &&
        Objects.equals(this.eapClientCert, profile.eapClientCert) &&
        Objects.equals(this.eapClientKey, profile.eapClientKey) &&
        Objects.equals(this.eapClientPwd, profile.eapClientPwd) &&
        Objects.equals(this.eapIdentity, profile.eapIdentity) &&
        Objects.equals(this.eapIntermediateCert, profile.eapIntermediateCert) &&
        Objects.equals(this.eapPwd, profile.eapPwd) &&
        Objects.equals(this.hiddenSsid, profile.hiddenSsid) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.psk, profile.psk) &&
        Objects.equals(this.ssid, profile.ssid) &&
        Objects.equals(this.wsec, profile.wsec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, autoWifi, bssType, channel, defaultProfile, eap, eapCaCert, eapClientCert, eapClientKey, eapClientPwd, eapIdentity, eapIntermediateCert, eapPwd, hiddenSsid, name, psk, ssid, wsec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoWifi: ").append(toIndentedString(autoWifi)).append("\n");
    sb.append("    bssType: ").append(toIndentedString(bssType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    defaultProfile: ").append(toIndentedString(defaultProfile)).append("\n");
    sb.append("    eap: ").append(toIndentedString(eap)).append("\n");
    sb.append("    eapCaCert: ").append(toIndentedString(eapCaCert)).append("\n");
    sb.append("    eapClientCert: ").append(toIndentedString(eapClientCert)).append("\n");
    sb.append("    eapClientKey: ").append(toIndentedString(eapClientKey)).append("\n");
    sb.append("    eapClientPwd: ").append(toIndentedString(eapClientPwd)).append("\n");
    sb.append("    eapIdentity: ").append(toIndentedString(eapIdentity)).append("\n");
    sb.append("    eapIntermediateCert: ").append(toIndentedString(eapIntermediateCert)).append("\n");
    sb.append("    eapPwd: ").append(toIndentedString(eapPwd)).append("\n");
    sb.append("    hiddenSsid: ").append(toIndentedString(hiddenSsid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    wsec: ").append(toIndentedString(wsec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


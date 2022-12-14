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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Profile;
import org.openapitools.client.model.Settings;

/**
 * WifiProfiles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:56:39.721579+02:00[Europe/Amsterdam]")
public class WifiProfiles {
  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<Profile> profiles = null;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Settings settings;

  public WifiProfiles() { 
  }

  public WifiProfiles profiles(List<Profile> profiles) {
    
    this.profiles = profiles;
    return this;
  }

  public WifiProfiles addProfilesItem(Profile profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<Profile>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * List of remote Wi-Fi profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of remote Wi-Fi profiles")

  public List<Profile> getProfiles() {
    return profiles;
  }


  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }


  public WifiProfiles settings(Settings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Settings getSettings() {
    return settings;
  }


  public void setSettings(Settings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WifiProfiles wifiProfiles = (WifiProfiles) o;
    return Objects.equals(this.profiles, wifiProfiles.profiles) &&
        Objects.equals(this.settings, wifiProfiles.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profiles, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WifiProfiles {\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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


/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import java.io.File;
import java.io.IOException;

/**
 * UploadFileWithRequiredFileBody
 */

public class UploadFileWithRequiredFileBody {
  public static final String SERIALIZED_NAME_ADDITIONAL_METADATA = "additionalMetadata";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_METADATA)
  private String additionalMetadata;

  public static final String SERIALIZED_NAME_REQUIRED_FILE = "requiredFile";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FILE)
  private File requiredFile;


  public UploadFileWithRequiredFileBody additionalMetadata(String additionalMetadata) {
    
    this.additionalMetadata = additionalMetadata;
    return this;
  }

   /**
   * Additional data to pass to server
   * @return additionalMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data to pass to server")

  public String getAdditionalMetadata() {
    return additionalMetadata;
  }


  public void setAdditionalMetadata(String additionalMetadata) {
    this.additionalMetadata = additionalMetadata;
  }


  public UploadFileWithRequiredFileBody requiredFile(File requiredFile) {
    
    this.requiredFile = requiredFile;
    return this;
  }

   /**
   * file to upload
   * @return requiredFile
  **/
  @ApiModelProperty(required = true, value = "file to upload")

  public File getRequiredFile() {
    return requiredFile;
  }


  public void setRequiredFile(File requiredFile) {
    this.requiredFile = requiredFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileWithRequiredFileBody uploadFileWithRequiredFileBody = (UploadFileWithRequiredFileBody) o;
    return Objects.equals(this.additionalMetadata, uploadFileWithRequiredFileBody.additionalMetadata) &&
        Objects.equals(this.requiredFile, uploadFileWithRequiredFileBody.requiredFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMetadata, requiredFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileWithRequiredFileBody {\n");
    sb.append("    additionalMetadata: ").append(toIndentedString(additionalMetadata)).append("\n");
    sb.append("    requiredFile: ").append(toIndentedString(requiredFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


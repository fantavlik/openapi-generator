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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * TestEnumParametersBody
 */

public class TestEnumParametersBody implements Parcelable {
  /**
   * Gets or Sets enumFormStringArray
   */
  @JsonAdapter(EnumFormStringArrayEnum.Adapter.class)
  public enum EnumFormStringArrayEnum {
    GREATER_THAN(">"),
    
    DOLLAR("$");

    private String value;

    EnumFormStringArrayEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumFormStringArrayEnum fromValue(String value) {
      for (EnumFormStringArrayEnum b : EnumFormStringArrayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumFormStringArrayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumFormStringArrayEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumFormStringArrayEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumFormStringArrayEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_FORM_STRING_ARRAY = "enum_form_string_array";
  @SerializedName(SERIALIZED_NAME_ENUM_FORM_STRING_ARRAY)
  private List<EnumFormStringArrayEnum> enumFormStringArray = null;

  /**
   * Form parameter enum test (string)
   */
  @JsonAdapter(EnumFormStringEnum.Adapter.class)
  public enum EnumFormStringEnum {
    _ABC("_abc"),
    
    _EFG("-efg"),
    
    _XYZ_("(xyz)");

    private String value;

    EnumFormStringEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnumFormStringEnum fromValue(String value) {
      for (EnumFormStringEnum b : EnumFormStringEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnumFormStringEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumFormStringEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnumFormStringEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EnumFormStringEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENUM_FORM_STRING = "enum_form_string";
  @SerializedName(SERIALIZED_NAME_ENUM_FORM_STRING)
  private EnumFormStringEnum enumFormString = EnumFormStringEnum._EFG;

  public TestEnumParametersBody() {
  }

  public TestEnumParametersBody enumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    
    this.enumFormStringArray = enumFormStringArray;
    return this;
  }

  public TestEnumParametersBody addEnumFormStringArrayItem(EnumFormStringArrayEnum enumFormStringArrayItem) {
    if (this.enumFormStringArray == null) {
      this.enumFormStringArray = new ArrayList<EnumFormStringArrayEnum>();
    }
    this.enumFormStringArray.add(enumFormStringArrayItem);
    return this;
  }

   /**
   * Form parameter enum test (string array)
   * @return enumFormStringArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Form parameter enum test (string array)")

  public List<EnumFormStringArrayEnum> getEnumFormStringArray() {
    return enumFormStringArray;
  }


  public void setEnumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    this.enumFormStringArray = enumFormStringArray;
  }


  public TestEnumParametersBody enumFormString(EnumFormStringEnum enumFormString) {
    
    this.enumFormString = enumFormString;
    return this;
  }

   /**
   * Form parameter enum test (string)
   * @return enumFormString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Form parameter enum test (string)")

  public EnumFormStringEnum getEnumFormString() {
    return enumFormString;
  }


  public void setEnumFormString(EnumFormStringEnum enumFormString) {
    this.enumFormString = enumFormString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestEnumParametersBody testEnumParametersBody = (TestEnumParametersBody) o;
    return Objects.equals(this.enumFormStringArray, testEnumParametersBody.enumFormStringArray) &&
        Objects.equals(this.enumFormString, testEnumParametersBody.enumFormString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumFormStringArray, enumFormString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestEnumParametersBody {\n");
    sb.append("    enumFormStringArray: ").append(toIndentedString(enumFormStringArray)).append("\n");
    sb.append("    enumFormString: ").append(toIndentedString(enumFormString)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(enumFormStringArray);
    out.writeValue(enumFormString);
  }

  TestEnumParametersBody(Parcel in) {
    enumFormStringArray = (List<EnumFormStringArrayEnum>)in.readValue(null);
    enumFormString = (EnumFormStringEnum)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<TestEnumParametersBody> CREATOR = new Parcelable.Creator<TestEnumParametersBody>() {
    public TestEnumParametersBody createFromParcel(Parcel in) {
      return new TestEnumParametersBody(in);
    }
    public TestEnumParametersBody[] newArray(int size) {
      return new TestEnumParametersBody[size];
    }
  };
}


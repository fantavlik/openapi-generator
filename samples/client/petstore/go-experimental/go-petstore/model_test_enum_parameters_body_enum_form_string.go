/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

import (
	"encoding/json"
	"fmt"
)

// TestEnumParametersBodyEnumFormString Form parameter enum test (string)
type TestEnumParametersBodyEnumFormString string

// List of testEnumParametersBodyEnumFormString
const (
	TEST_ENUM_PARAMETERS_BODY_ENUM_FORM_STRING_ABC TestEnumParametersBodyEnumFormString = "_abc"
	TEST_ENUM_PARAMETERS_BODY_ENUM_FORM_STRING_EFG TestEnumParametersBodyEnumFormString = "-efg"
	TEST_ENUM_PARAMETERS_BODY_ENUM_FORM_STRING_XYZ TestEnumParametersBodyEnumFormString = "(xyz)"
)

func (v *TestEnumParametersBodyEnumFormString) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := TestEnumParametersBodyEnumFormString(value)
	for _, existing := range []TestEnumParametersBodyEnumFormString{ "_abc", "-efg", "(xyz)",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid TestEnumParametersBodyEnumFormString", *v)
}

// Ptr returns reference to testEnumParametersBodyEnumFormString value
func (v TestEnumParametersBodyEnumFormString) Ptr() *TestEnumParametersBodyEnumFormString {
	return &v
}

type NullableTestEnumParametersBodyEnumFormString struct {
	value *TestEnumParametersBodyEnumFormString
	isSet bool
}

func (v NullableTestEnumParametersBodyEnumFormString) Get() *TestEnumParametersBodyEnumFormString {
	return v.value
}

func (v *NullableTestEnumParametersBodyEnumFormString) Set(val *TestEnumParametersBodyEnumFormString) {
	v.value = val
	v.isSet = true
}

func (v NullableTestEnumParametersBodyEnumFormString) IsSet() bool {
	return v.isSet
}

func (v *NullableTestEnumParametersBodyEnumFormString) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTestEnumParametersBodyEnumFormString(val *TestEnumParametersBodyEnumFormString) *NullableTestEnumParametersBodyEnumFormString {
	return &NullableTestEnumParametersBodyEnumFormString{value: val, isSet: true}
}

func (v NullableTestEnumParametersBodyEnumFormString) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTestEnumParametersBodyEnumFormString) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


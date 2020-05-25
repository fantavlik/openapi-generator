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

// StatusItems the model 'StatusItems'
type StatusItems string

// List of statusItems
const (
	STATUS_ITEMS_AVAILABLE StatusItems = "available"
	STATUS_ITEMS_PENDING StatusItems = "pending"
	STATUS_ITEMS_SOLD StatusItems = "sold"
)

func (v *StatusItems) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := StatusItems(value)
	for _, existing := range []StatusItems{ "available", "pending", "sold",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid StatusItems", *v)
}

// Ptr returns reference to statusItems value
func (v StatusItems) Ptr() *StatusItems {
	return &v
}

type NullableStatusItems struct {
	value *StatusItems
	isSet bool
}

func (v NullableStatusItems) Get() *StatusItems {
	return v.value
}

func (v *NullableStatusItems) Set(val *StatusItems) {
	v.value = val
	v.isSet = true
}

func (v NullableStatusItems) IsSet() bool {
	return v.isSet
}

func (v *NullableStatusItems) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStatusItems(val *StatusItems) *NullableStatusItems {
	return &NullableStatusItems{value: val, isSet: true}
}

func (v NullableStatusItems) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStatusItems) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


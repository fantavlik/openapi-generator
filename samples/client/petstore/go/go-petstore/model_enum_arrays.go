/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore
// EnumArrays struct for EnumArrays
type EnumArrays struct {
	JustSymbol EnumArraysJustSymbol `json:"just_symbol,omitempty"`
	ArrayEnum []EnumArraysArrayEnumItems `json:"array_enum,omitempty"`
}

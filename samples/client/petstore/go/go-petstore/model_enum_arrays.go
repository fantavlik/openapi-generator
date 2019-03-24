/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

type EnumArrays struct {
	JustSymbol EnumArraysJustSymbol `json:"just_symbol,omitempty"`
	ArrayEnum EnumArraysArrayEnum `json:"array_enum,omitempty"`
}

type EnumArraysJustSymbol string

// List of EnumArraysJustSymbol
const (
	JUST_SYMBOL_GREATER_THAN_OR_EQUAL_TO EnumArraysJustSymbol = ">="
	JUST_SYMBOL_DOLLAR EnumArraysJustSymbol = "$"
)

type EnumArraysArrayEnum []string

// List of EnumArraysArrayEnum
const (
	ARRAY_ENUM_FISH EnumArraysArrayEnum = "fish"
	ARRAY_ENUM_CRAB EnumArraysArrayEnum = "crab"
)

/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore
import (
	"os"
)
// UploadFileBody struct for UploadFileBody
type UploadFileBody struct {
	// Additional data to pass to server
	AdditionalMetadata string `json:"additionalMetadata,omitempty" xml:"additionalMetadata"`
	// file to upload
	File *os.File `json:"file,omitempty" xml:"file"`
}

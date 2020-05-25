/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


import java.io.Serializable
/**
 * 
 * @param name Updated name of the pet
 * @param status Updated status of the pet
 */
data class UpdatePetWithFormBody (
    /* Updated name of the pet */
    val name: kotlin.String? = null,
    /* Updated status of the pet */
    val status: kotlin.String? = null
) : Serializable 
{
	companion object {
		private const val serialVersionUID: Long = 123
	}
}


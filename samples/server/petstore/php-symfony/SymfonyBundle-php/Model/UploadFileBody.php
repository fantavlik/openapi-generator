<?php
/**
 * UploadFileBody
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the UploadFileBody model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */
class UploadFileBody 
{
        /**
     * Additional data to pass to server
     *
     * @var string|null
     * @SerializedName("additionalMetadata")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $additionalMetadata;

    /**
     * file to upload
     *
     * @var UploadedFile|null
     * @SerializedName("file")
     * @Assert\Type("UploadedFile")
     * @Type("UploadedFile")
     */
    protected $file;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->additionalMetadata = isset($data['additionalMetadata']) ? $data['additionalMetadata'] : null;
        $this->file = isset($data['file']) ? $data['file'] : null;
    }

    /**
     * Gets additionalMetadata.
     *
     * @return string|null
     */
    public function getAdditionalMetadata()
    {
        return $this->additionalMetadata;
    }

    /**
     * Sets additionalMetadata.
     *
     * @param string|null $additionalMetadata  Additional data to pass to server
     *
     * @return $this
     */
    public function setAdditionalMetadata($additionalMetadata = null)
    {
        $this->additionalMetadata = $additionalMetadata;

        return $this;
    }

    /**
     * Gets file.
     *
     * @return UploadedFile|null
     */
    public function getFile(): ?UploadedFile
    {
        return $this->file;
    }

    /**
     * Sets file.
     *
     * @param UploadedFile|null $file  file to upload
     *
     * @return $this
     */
    public function setFile(UploadedFile $file = null)
    {
        $this->file = $file;

        return $this;
    }
}



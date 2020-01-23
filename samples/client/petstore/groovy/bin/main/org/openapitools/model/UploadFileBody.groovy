package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UploadFileBody {
    /* Additional data to pass to server */
    String additionalMetadata
    /* file to upload */
    File file
}

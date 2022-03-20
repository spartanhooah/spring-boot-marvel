package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Images are represented as a partial path and an extension.
 * For more information see: https://developer.marvel.com/documentation/images
 *
 * @author yonatankarp
 */
data class Image(
    /**
     * The directory path of to the image.
     */
    @JsonProperty("path")
    var path: String,

    /**
     * The file extension for the image.
     */
    @JsonProperty("extension")
    var extension: String
) {
    @JsonCreator
    internal constructor() : this("", "")
}

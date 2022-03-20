package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * URLs are references to web pages or deep links into applications. (When
 * present in a result set, it is preferred that you use these to link back to
 * Marvel.) Many resources will have more than one representation on the web so
 * URLs are generally presented as an array of URL resources.
 *
 * @author yonatankarp
 */
data class Url(
    /**
     * A text identifier for the URL.
     */
    @JsonProperty("type")
    var type: String,

    /**
     * 	A full URL (including scheme, domain, and path).
     */
    @JsonProperty("url")
    var url: String
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this("", "")
}

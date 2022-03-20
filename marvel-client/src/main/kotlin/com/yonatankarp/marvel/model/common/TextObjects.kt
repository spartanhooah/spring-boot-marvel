package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Text objects are bits of descriptive text which are attached to an entity.
 *
 * @author yonatankarp
 */
data class TextObjects(
    /**
     * The string description of the text object (e.g. solicit text, preview text, etc.).
     */
    @JsonProperty("type")
    var type: String,

    /**
     * A language code denoting which language the text object is written in.
     */
    @JsonProperty("language")
    var language: String,

    /**
     * The text of the text object.
     */
    @JsonProperty("text")
    var text: String
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this("", "", "")
}

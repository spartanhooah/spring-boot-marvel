package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A model representing a single price in the Marvel API.
 *
 * @author yonatankarp
 */
data class Price(
    /**
     * The type of the price.
     */
    @JsonProperty("type")
    var type: String,

    /**
     * The amount
     */
    @JsonProperty("price")
    var price: Int
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this("", 0)
}

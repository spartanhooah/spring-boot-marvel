package com.yonatankarp.marvel.model.common

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Resource lists are collections of summary views within the context of another
 * entity type. For example, the list of creators attached to a comic would be
 * presented as resource list inside the full representation of that comic.
 *
 * @author yonatankarp
 */
@Suppress("kotlin:S6218")
data class ResourceList<T>(
    /**
     * The number of total available resources in this list.
     */
    @JsonProperty("available")
    var available: Int,

    /**
     * The number of resources returned in this resource list (up to 20).
     */
    @JsonProperty("returned")
    var returned: Int,

    /**
     * The path to the list of full view representations of the items in this
     * resource list.
     */
    @JsonProperty("collectionURI")
    var collectionUri: String,

    /**
     * A list of summary views of the items in this resource list.
     */
    @JsonProperty("items")
    var items: Array<T>
) {
    @Suppress("UNCHECKED_CAST")
    @JsonCreator
    internal constructor() : this(0, 0, "", emptyArray<Any>() as Array<T>)

    @Suppress("Duplicates", "kotlin:S3776")
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResourceList<*>

        if (available != other.available) return false
        if (returned != other.returned) return false
        if (collectionUri != other.collectionUri) return false
        if (!items.contentEquals(other.items)) return false

        return true
    }

    @Suppress("Duplicates", "kotlin:S3776")
    override fun hashCode(): Int {
        var result = available
        result = 31 * result + returned
        result = 31 * result + collectionUri.hashCode()
        result = 31 * result + items.contentHashCode()
        return result
    }
}

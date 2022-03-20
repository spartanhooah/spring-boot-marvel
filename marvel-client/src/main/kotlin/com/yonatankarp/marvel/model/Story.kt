package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import java.time.OffsetDateTime

/**
 * A model representing a single story in the Marvel API.
 *
 * @author yonatankarp
 */
data class Story(
    /**
     * The unique ID of the story resource.
     */
    @JsonProperty("id")
    var id: Int,

    /**
     * The story title.
     */
    @JsonProperty("title")
    var title: String,

    /**
     * A short description of the story.
     */
    @JsonProperty("description")
    var description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String,

    /**
     * The story type e.g. interior story, cover, text story.
     */
    @JsonProperty("type")
    var type: String,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime,

    /**
     * The representative image for this story.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image,

    /**
     * A resource list containing comics in which this story takes place.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing series in which this story appears.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>,

    /**
     * 	A resource list of the events in which this story appears.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>,

    /**
     * A resource list of characters which appear in this story.
     */
    @JsonProperty("characters")
    var character: ResourceList<CharacterSummary>,

    /**
     * A resource list of creators who worked on this story.
     */
    @JsonProperty("creators")
    var creator: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the issue in which this story was originally
     * published.
     */
    @JsonProperty("originalIssue")
    var originalIssue: ComicsSummary
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this(
        0,
        "",
        "",
        "",
        "",
        OffsetDateTime.MIN,
        Image(),
        ResourceList<ComicsSummary>(),
        ResourceList<SeriesSummary>(),
        ResourceList<EventSummary>(),
        ResourceList<CharacterSummary>(),
        ResourceList<CreatorSummary>(),
        ComicsSummary()
    )
}

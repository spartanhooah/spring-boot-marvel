package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a single event in the Marvel API.
 *
 * @author yonatankarp
 */
data class Event(
    /**
     * The unique ID of the event resource.
     */
    @JsonProperty("id")
    var id: Int,

    /**
     * The title of the event.
     */
    @JsonProperty("title")
    var title: String,

    /**
     * A description of the event.
     */
    @JsonProperty("description")
    var description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String,

    /**
     * A set of public website URLs for the event.
     */
    @JsonProperty("urls")
    var urls: Set<Url>,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime,

    /**
     * The date of publication of the first issue in this event.
     */
    @JsonProperty("start")
    var start: OffsetDateTime,

    /**
     * The date of publication of the last issue in this event.
     */
    @JsonProperty("end")
    var end: OffsetDateTime,

    /**
     * The representative image for this event.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image,

    /**
     * A resource list containing the comics in this event.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing the stories in this event.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>,

    /**
     * A resource list containing the series in this event.
     */
    @JsonProperty("series")
    var series: ResourceList<SeriesSummary>,

    /**
     * A resource list containing the characters which appear in this event.
     */
    @JsonProperty("characters")
    var characters: ResourceList<CharacterSummary>,

    /**
     * A resource list containing creators whose work appears in this event.
     */
    @JsonProperty("creators")
    var creators: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the event which follows this event.
     */
    @JsonProperty("next")
    var next: EventSummary,

    /**
     * A summary representation of the event which preceded this event.
     */
    @JsonProperty("previous")
    var previous: EventSummary
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this(
        0,
        "",
        "",
        "",
        emptySet(),
        OffsetDateTime.MIN,
        OffsetDateTime.MIN,
        OffsetDateTime.MIN,
        Image(),
        ResourceList<ComicsSummary>(),
        ResourceList<StorySummary>(),
        ResourceList<SeriesSummary>(),
        ResourceList<CharacterSummary>(),
        ResourceList<CreatorSummary>(),
        EventSummary(),
        EventSummary()
    )
}

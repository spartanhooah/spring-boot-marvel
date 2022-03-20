package com.yonatankarp.marvel.model

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import com.yonatankarp.marvel.model.common.Url
import java.time.OffsetDateTime

/**
 * A model representing a single series in the Marvel API.
 *
 * @author yonatankarp
 */
data class Series(
    /**
     * The unique ID of the series resource.
     */
    @JsonProperty("id")
    var id: Int,

    /**
     * The canonical title of the series.
     */
    @JsonProperty("title")
    var title: String,

    /**
     * A description of the series.
     */
    @JsonProperty("description")
    var description: String,

    /**
     * The canonical URL identifier for this resource.
     */
    @JsonProperty("resourceURI")
    var resourceUri: String,

    /**
     * A set of public website URLs for the resource.
     */
    @JsonProperty("urls")
    var urls: Set<Url>,

    /**
     * The first year of publication for the series.
     */
    @JsonProperty("startYear")
    var startYear: Int,

    /**
     * The last year of publication for the series (conventionally, 2099 for
     * ongoing series).
     */
    @JsonProperty("endYear")
    var endYear: Int,

    /**
     * The age-appropriateness rating for the series.
     */
    @JsonProperty("rating")
    var rating: String,

    /**
     * The date the resource was most recently modified.
     */
    @JsonProperty("modified")
    var modified: OffsetDateTime,

    /**
     * The representative image for this series.
     */
    @JsonProperty("thumbnail")
    var thumbnail: Image,

    /**
     * A resource list containing comics in this series.
     */
    @JsonProperty("comics")
    var comics: ResourceList<ComicsSummary>,

    /**
     * A resource list containing stories which occur in comics in this series.
     */
    @JsonProperty("stories")
    var stories: ResourceList<StorySummary>,

    /**
     * A resource list containing events which take place in comics in this
     * series.
     */
    @JsonProperty("events")
    var events: ResourceList<EventSummary>,

    /**
     * A resource list containing characters which appear in comics in this
     * series.
     */
    @JsonProperty("characters")
    var characters: ResourceList<CharacterSummary>,

    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    @JsonProperty("creators")
    var creators: ResourceList<CreatorSummary>,

    /**
     * A summary representation of the series which follows this series.
     */
    @JsonProperty("next")
    var next: SeriesSummary,

    /**
     * A summary representation of the series which preceded this series.
     */
    @JsonProperty("previous")
    var previous: SeriesSummary
) {
    @Suppress("unused")
    @JsonCreator
    internal constructor() : this(
        0,
        "",
        "",
        "",
        emptySet(),
        0,
        0,
        "",
        OffsetDateTime.MIN,
        Image(),
        ResourceList<ComicsSummary>(),
        ResourceList<StorySummary>(),
        ResourceList<EventSummary>(),
        ResourceList<CharacterSummary>(),
        ResourceList<CreatorSummary>(),
        SeriesSummary(),
        SeriesSummary()
    )
}

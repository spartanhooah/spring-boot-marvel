@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.yonatankarp.marvel.model

/**
 * @author yonatankarp
 */

/**
 * This entity is the base summary for all other summaries returned from Marvel.
 *
 * @param resourceUri url reference to consume the full entity
 * @param name the name of the entity
 */
sealed class BaseSummary(
    val resourceUri: String,
    val name: String
)

/**
 * A Comics summary includes reference to the comics entity and the comics name.
 *
 * @param resourceUri url reference to consume the full comics entity
 * @param name the name of the comics
 */
class ComicsSummary(resourceUri: String, name: String) : BaseSummary(resourceUri, name)

/**
 * A Series summary includes reference to the series entity and the series name.
 */
class SeriesSummary(resourceUri: String, name: String) : BaseSummary(resourceUri, name)

/**
 * A Story summary includes reference to the story entity, type, and the story
 * name.
 *
 * @param resourceUri url reference to consume the full story entity
 * @param name the name of the story
 * @param type the type of the story (e.g. cover, interiorStory)
 */
class StorySummary(resourceUri: String, name: String, val type: String) : BaseSummary(resourceUri, name)

/**
 * An Event summary includes reference to the event entity and the event name.
 *
 * @param resourceUri url reference to consume the full event entity
 * @param name the name of the event
 */
class EventSummary(resourceUri: String, name: String) : BaseSummary(resourceUri, name)

/**
 * A Creator summary includes reference to the creator entity, role, and the
 * creator name.
 *
 * @param resourceUri url reference to consume the full creator entity
 * @param name the name of the creator
 * @param role the role of the creator (e.g. writer)
 */
class CreatorSummary(resourceUri: String, name: String, val role: String) : BaseSummary(resourceUri, name)

/**
 * A Character summary includes reference to the character entity and the character name.
 *
 * @param resourceUri url reference to consume the full character entity
 * @param name the name of the character
 */
class CharacterSummary(resourceUri: String, name: String) : BaseSummary(resourceUri, name)

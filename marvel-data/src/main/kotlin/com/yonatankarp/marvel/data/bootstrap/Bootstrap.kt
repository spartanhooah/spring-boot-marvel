package com.yonatankarp.marvel.data.bootstrap

import com.yonatankarp.marvel.data.repository.CharacterRepository
import com.yonatankarp.marvel.data.repository.ComicsRepository
import com.yonatankarp.marvel.data.repository.CreatorRepository
import com.yonatankarp.marvel.data.repository.EventRepository
import com.yonatankarp.marvel.data.repository.SeriesRepository
import com.yonatankarp.marvel.data.repository.StoryRepository
import com.yonatankarp.marvel.model.Character
import com.yonatankarp.marvel.model.common.Image
import com.yonatankarp.marvel.model.common.ResourceList
import java.time.OffsetDateTime
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class Bootstrap(
    val characterRepository: CharacterRepository,
    val comicsRepository: ComicsRepository,
    val creatorRepository: CreatorRepository,
    val eventRepository: EventRepository,
    val seriesRepository: SeriesRepository,
    val storyRepository: StoryRepository
) : ApplicationListener<ContextRefreshedEvent> {
  override fun onApplicationEvent(event: ContextRefreshedEvent) {
    characterRepository.save(
        Character(
            1,
            "Thor",
            "God of Thunder",
            OffsetDateTime.now(),
            "",
            emptySet(),
            Image(),
            ResourceList(),
            ResourceList(),
            ResourceList(),
            ResourceList()))
  }
}

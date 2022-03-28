package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Story
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface StoryRepository : JpaRepository<Story, Int>

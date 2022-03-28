package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface EventRepository : JpaRepository<Event, Int>

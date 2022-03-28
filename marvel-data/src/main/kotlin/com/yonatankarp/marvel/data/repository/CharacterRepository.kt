package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Character
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface CharacterRepository : JpaRepository<Character, Int>

package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Creator
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface CreatorRepository : JpaRepository<Creator, Int>

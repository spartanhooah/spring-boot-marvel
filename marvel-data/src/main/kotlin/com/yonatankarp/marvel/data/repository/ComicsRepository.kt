package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Comics
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface ComicsRepository : JpaRepository<Comics, Int>

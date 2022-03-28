package com.yonatankarp.marvel.data.repository

import com.yonatankarp.marvel.model.Series
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository sealed interface SeriesRepository : JpaRepository<Series, Int>

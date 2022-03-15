package com.yonatankarp.marvel.utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class MarvelApiClientTest {


    @Autowired
    private lateinit var marvelApiClient: MarvelApiClient

    @Test
    fun `should do stuff`() {
        val result = marvelApiClient.generateHeroUrl(100, 0)
        println(result)
    }
}

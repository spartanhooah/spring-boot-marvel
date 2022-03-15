package com.yonatankarp.marvel.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class HashGeneratorTest {

    private lateinit var generator: HashGenerator

    @BeforeEach
    fun setUp() {
        generator = HashGenerator(PUBLIC_KEY, PRIVATE_KEY)
    }

    @Test
    fun `should generate correct hash code`() {
        // Given
        val timestamp = 1L

        // When
        val actual = generator.generate(timestamp)

        // Then
        val expected = "852d790bf3313eeecf72b436795fa4d9"
        assertEquals(expected, actual)
    }

    companion object {
        private const val PUBLIC_KEY = "public-key"
        private const val PRIVATE_KEY = "private-key"
    }
}

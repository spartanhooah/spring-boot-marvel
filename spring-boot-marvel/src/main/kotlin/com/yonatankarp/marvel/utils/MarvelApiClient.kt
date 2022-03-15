package com.yonatankarp.marvel.utils

import okhttp3.OkHttpClient
import okhttp3.Request
import org.apache.tomcat.jni.Time
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class MarvelApiClient(
    private val hashGenerator: HashGenerator,
    @Value("\${marvel.api.url}") private val marvelApiUrl: String,
    private val client: OkHttpClient
) {
    fun generateHeroUrl(batchSize: Long, offset: Long): String? {
        val timestamp = System.currentTimeMillis()
        val hash = hashGenerator.generate(timestamp)

        val request = Request.Builder()
            .url("${marvelApiUrl}/v1/public/characters?ts=${timestamp}&apikey=${hashGenerator.publicKey}&hash=${hash}")
            .build()

        val response = client.newCall(request).execute()

        return response.body?.string()
    }

}

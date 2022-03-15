package com.yonatankarp.marvel.config

import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MarvelConfig {
    @Bean
    fun okHttpClient() = OkHttpClient()
}

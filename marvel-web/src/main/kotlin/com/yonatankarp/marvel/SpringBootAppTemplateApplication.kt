package com.yonatankarp.marvel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.yonatankarp.marvel"]) class SpringBootAppTemplateApplication

fun main(args: Array<String>) {
  runApplication<SpringBootAppTemplateApplication>(*args)
}

package com.example.shortenerkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShortenerKotlinApplication

fun main(args: Array<String>) {
	runApplication<ShortenerKotlinApplication>(*args)
}

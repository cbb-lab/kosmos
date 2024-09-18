package io.kosmos.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KosmosApplication

fun main(args: Array<String>) {
    runApplication<KosmosApplication>(*args)
}

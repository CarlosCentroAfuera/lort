package com.lotr.server.lort

import kotlinx.serialization.json.Json
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.io.File
import kotlinx.serialization.decodeFromString


@SpringBootApplication
class LortServerApplication

val characterList = Json.decodeFromString<CharacterList>(File("character.json").readText())

fun main(args: Array<String>) {
	runApplication<LortServerApplication>(*args)
}

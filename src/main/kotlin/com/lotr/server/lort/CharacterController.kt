package com.lotr.server.lort

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CharacterController {

    @GetMapping("getHumans")
    fun getHumans(): List<Doc> {
        return characterList.docs.filter {
            it.race.equals("human", true)
        }
    }

    // TODO: getElfs

    // TODO: getOrcs

    // TODO: getDragons

    // TODO: getGoodGuys (Elfs + Humans)

    // TODO: getBadGuys (Orcs + Dragons)

    // TODO: getOthers (no good guy, no bad guy)




}
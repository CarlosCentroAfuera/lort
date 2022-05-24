// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json          = Json(JsonConfiguration.Stable)
// val characterList = json.parse(CharacterList.serializer(), jsonString)

package com.lotr.server.lort

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterList (
    val docs: List<Doc>
)

@Serializable
data class Doc (
    @SerialName("_id")
    val id: String,

    val height: String,
    val race: String,
    val gender: String? = null,
    val birth: String,
    val spouse: String,
    val death: String,
    val realm: String,
    val hair: String,
    val name: String,

    @SerialName("wikiUrl")
    val wikiURL: String? = null
)

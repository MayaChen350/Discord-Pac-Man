package io.github.mayachen350.discordPacMan

import kotlinx.coroutines.await

external val VITE_DISCORD_CLIENT_ID: String

val discordSDK: DiscordSDK = DiscordSDK("1302143801741152258")

suspend fun main() {
    println("Started the sdk!")
    println("1302143801741152258")
    val result =
        discordSDK.ready()
            .then {
                console.log("Discord SDK is ready!")
            }.catch {
                console.log("woopsie didnt work")
            }.await()
    println("Ended!")
}
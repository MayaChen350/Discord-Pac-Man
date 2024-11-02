package io.github.mayachen350.discordPacMan.client

import kotlinx.browser.document

@JsModule("@discord/embedded-app-sdk")
external class DiscordSDK

fun main() {
    println("Hello World!")

    // Load image
    val rocketLogo: String = "/rocket.png"

    // Create an image element
    val img = document.createElement("img")
    img.setAttribute("src", rocketLogo)
    document.body?.appendChild(img)
}
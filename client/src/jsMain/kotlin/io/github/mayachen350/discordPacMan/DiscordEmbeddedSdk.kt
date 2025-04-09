@file:JsModule("@discord/embedded-app-sdk")

package io.github.mayachen350.discordPacMan

import kotlin.js.Promise

external class DiscordSDK(clientId: String) {
    fun ready(): Promise<Unit>
}
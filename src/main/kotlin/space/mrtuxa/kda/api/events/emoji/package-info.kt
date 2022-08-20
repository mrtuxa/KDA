/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Events that track [added emojis][net.dv8tion.jda.api.events.emoji.EmojiAddedEvent]
 * and [removed emojis][net.dv8tion.jda.api.events.emoji.EmojiRemovedEvent].
 * <br></br>Important to remember that [Custom Emojis][net.dv8tion.jda.api.entities.emoji.RichCustomEmoji] are not the same as unicode emoji!
 *
 *
 * **Requirements**<br></br>
 *
 *
 * These events require the [EMOJI][net.dv8tion.jda.api.utils.cache.CacheFlag.EMOJI] CacheFlag to be enabled, which requires
 * the [GUILD_EMOJIS_AND_STICKERS][net.dv8tion.jda.api.requests.GatewayIntent.GUILD_EMOJIS_AND_STICKERS] intent.
 *
 * <br></br>[createLight(String)][net.dv8tion.jda.api.JDABuilder.createLight] disables that CacheFlag by default!
 */
package space.mrtuxa.kda.api.events.emoji

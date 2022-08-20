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
 * Events indicating the [GuildVoiceState][net.dv8tion.jda.api.entities.GuildVoiceState] updates
 * for one of the [Guild][net.dv8tion.jda.api.entities.Guild]'s [Members][net.dv8tion.jda.api.entities.Member].
 * <br></br>Every update is an extensions of the [GenericGuildVoiceEvent][net.dv8tion.jda.api.events.guild.voice.GenericGuildVoiceEvent]
 * and has specifications for explicit voice state features such as mute/deafen
 *
 *
 * **Requirements**<br></br>
 *
 *
 * These events require the [VOICE_STATE][net.dv8tion.jda.api.utils.cache.CacheFlag.VOICE_STATE] CacheFlag to be enabled, which requires
 * the [GUILD_VOICE_STATES][net.dv8tion.jda.api.requests.GatewayIntent.GUILD_VOICE_STATES] intent.
 *
 * <br></br>[createLight(String)][net.dv8tion.jda.api.JDABuilder.createLight] disables that CacheFlag by default!
 *
 *
 * Additionally, these events require the [MemberCachePolicy][net.dv8tion.jda.api.utils.MemberCachePolicy]
 * to cache the updated members. Discord does not specifically tell us about the updates, but merely tells us the
 * member was updated and gives us the updated member object. In order to fire specific events like these we
 * need to have the old member cached to compare against.
 */
package space.mrtuxa.kda.api.events.guild.voice

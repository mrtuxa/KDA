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
package space.mrtuxa.kda.api.entities

import space.mrtuxa.kda.api.entities.ChannelType
import java.util.*
import javax.annotation.Nonnull

/**
 * Enum used to differentiate between the different types of Discord channels.
 */
enum class ChannelType @JvmOverloads constructor(
    /**
     * The Discord id key used to represent the channel type.
     *
     * @return The id key used by discord for this channel type.
     */
    val id: Int,
    /**
     * The sorting bucket for this channel type.
     *
     * @return The sorting bucket
     */
    val sortBucket: Int,
    /**
     * Whether this ChannelType is present for a [GuildChannel]
     *
     * @return Whether or not this a GuildChannel
     */
    val isGuild: Boolean = false
) {
    /**
     * A [TextChannel][net.dv8tion.jda.api.entities.TextChannel], Guild-Only.
     */
    TEXT(0, 0, true),

    /**
     * A [PrivateChannel][net.dv8tion.jda.api.entities.PrivateChannel].
     */
    PRIVATE(1, -1),

    /**
     * A [VoiceChannel][net.dv8tion.jda.api.entities.VoiceChannel], Guild-Only.
     */
    VOICE(2, 1, true),

    /**
     * A Group. (unused)
     */
    GROUP(3, -1),

    /**
     * A [Category][net.dv8tion.jda.api.entities.Category], Guild-Only.
     */
    CATEGORY(4, 2, true),

    /**
     * A [NewsChannel][net.dv8tion.jda.api.entities.NewsChannel], Guild-Only.
     */
    NEWS(5, 0, true),

    /**
     * A [StageChannel], Guild-Only.
     */
    STAGE(13, 1, true), GUILD_NEWS_THREAD(10, -1, true), GUILD_PUBLIC_THREAD(11, -1, true), GUILD_PRIVATE_THREAD(
        12,
        -1,
        true
    ),

    /**
     * Unknown Discord channel type. Should never happen and would only possibly happen if Discord implemented a new
     * channel type and JDA had yet to implement support for it.
     */
    UNKNOWN(-1, -2);

    /**
     * Whether channels of this type support audio connections.
     *
     * @return True, if channels of this type support audio
     */
    val isAudio: Boolean
        get() = when (this) {
            VOICE, STAGE -> true
            else -> false
        }

    /**
     * Whether channels of this type support message sending.
     *
     * @return True, if channels of this type support messages
     */
    val isMessage: Boolean
        get() = when (this) {
            TEXT, VOICE, NEWS, PRIVATE, GROUP -> true
            else -> isThread
        }

    /**
     * Whether channels of this type are [ThreadChannels][ThreadChannel].
     * This mostly exists to make handling threads simpler than having to check 3 separate ChannelTypes every time.
     *
     * @return True, if channels of this type are [ThreadChannel]
     */
    val isThread: Boolean
        get() = when (this) {
            GUILD_NEWS_THREAD, GUILD_PUBLIC_THREAD, GUILD_PRIVATE_THREAD -> true
            else -> false
        }

    companion object {
        /**
         * Static accessor for retrieving a channel type based on its Discord id key.
         *
         * @param  id
         * The id key of the requested channel type.
         *
         * @return The ChannelType that is referred to by the provided key. If the id key is unknown, [.UNKNOWN] is returned.
         */
        @Nonnull
        fun fromId(id: Int): ChannelType {
            for (type in values()) {
                if (type.id == id) return type
            }
            return UNKNOWN
        }

        /**
         * An [java.util.EnumSet] populated with all channel types using the provided sorting bucket.
         *
         * @param  bucket
         * The sorting bucket
         *
         * @return Possibly-empty [java.util.EnumSet] for the bucket
         */
        @Nonnull
        fun fromSortBucket(bucket: Int): EnumSet<ChannelType> {
            val types = EnumSet.noneOf(ChannelType::class.java)
            for (type in values()) {
                if (type.sortBucket == bucket) types.add(type)
            }
            return types
        }
    }
}
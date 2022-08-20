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
 * Implementation for [AuditLogEntry][net.dv8tion.jda.api.audit.AuditLogEntry]
 * and all utilities needed for its structure.
 * To retrieve entries use the [AuditLogPaginationAction][net.dv8tion.jda.api.requests.restaction.pagination.AuditLogPaginationAction]
 * which can be retrieved from any [Guild][net.dv8tion.jda.api.entities.Guild] instance
 * through [Guild.retrieveAuditLogs()][net.dv8tion.jda.api.entities.Guild.retrieveAuditLogs].
 *
 *
 * Each Entry contains a set of [AuditLogChanges][net.dv8tion.jda.api.audit.AuditLogChange].
 * <br></br>To identify what kind of entry is represented use [ActionType][net.dv8tion.jda.api.audit.ActionType]!
 *
 * @since  3.1.1
 */
package space.mrtuxa.kda.api.audit

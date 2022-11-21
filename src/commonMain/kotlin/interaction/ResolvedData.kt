package cloud.drakon.tempest.interaction

import cloud.drakon.tempest.channel.Attachment
import cloud.drakon.tempest.channel.Channel
import cloud.drakon.tempest.channel.message.Message
import cloud.drakon.tempest.guild.GuildMember
import cloud.drakon.tempest.permissions.Role
import cloud.drakon.tempest.user.User
import kotlinx.serialization.Serializable

/**
 * If data for a Member is included, data for its corresponding User will also be included.
 * @property users the ids and User objects
 * @property members the ids and partial Member objects
 * @property roles the ids and Role objects
 * @property channels the ids and partial Channel objects
 * @property messages the ids and partial Message objects
 * @property attachments the ids and attachment objects
 */
@Serializable class ResolvedData(
    val users: Map<String, User>? = null,
    val members: Map<String, GuildMember>? = null,
    val roles: Map<String, Role>? = null,
    val channels: Map<String, Channel>? = null,
    val messages: Map<String, Message>? = null,
    val attachments: Map<String, Attachment>? = null,
)
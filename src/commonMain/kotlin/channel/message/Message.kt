package channel.message

import application.Application
import channel.Attachment
import channel.Channel
import channel.ChannelMention
import channel.Reaction
import channel.embed.Embed
import components.Component
import interaction.MessageInteraction
import kotlinx.serialization.Serializable
import permissions.Role
import sticker.Sticker
import sticker.StickerItem
import user.User

/**
 * Represents a message sent in a channel within Discord.
 * @property id id of the message
 * @property channel_id id of the channel the message was sent in
 * @property author the author of this message. The author object follows the structure of the user object, but is only a valid user in the case where the message is generated by a user or bot user. If the message is generated by a webhook, the author object corresponds to the webhook's id, username, and avatar. You can tell if a message is generated by a webhook by checking for the `webhook_id` on the message object.
 * @property content contents of the message. An app will receive empty values in the content, embeds, attachments, and components fields if they have not configured (or been approved for) the `MESSAGE_CONTENT` privileged intent (`1 << 15`).
 * @property timestamp when this message was sent
 * @property edited_timestamp when this message was edited (or null if never)
 * @property tts whether this was a TTS message
 * @property mention_everyone whether this message mentions everyone
 * @property mentions users specifically mentioned in the message
 * @property mention_roles roles specifically mentioned in this message
 * @property mention_channels channels specifically mentioned in this message. Not all channel mentions in a message will appear in `mention_channels`. Only textual channels that are visible to everyone in a lurkable guild will ever be included. Only crossposted messages (via Channel Following) currently include `mention_channels` at all. If no mentions in the message meet these requirements, this field will not be sent.
 * @property attachments any attached files. An app will receive empty values in the content, embeds, attachments, and components fields if they have not configured (or been approved for) the `MESSAGE_CONTENT` privileged intent (`1 << 15`).
 * @property embeds any embedded content. An app will receive empty values in the content, embeds, attachments, and components fields if they have not configured (or been approved for) the `MESSAGE_CONTENT` privileged intent (`1 << 15`).
 * @property reactions reactions to the message
 * @property nonce used for validating a message was sent
 * @property pinned whether this message is pinned
 * @property webhook_id if the message is generated by a webhook, this is the webhook's id
 * @property type type of message
 * @property activity sent with Rich Presence-related chat embeds
 * @property application sent with Rich Presence-related chat embeds
 * @property application_id if the message is an Interaction or application-owned webhook, this is the id of the application
 * @property message_reference data showing the source of a crosspost, channel follow add, pin, or reply message
 * @property flags message flags combined as a bitfield
 * @property referenced_message the message associated with the message_reference. This field is only returned for messages with a `type` of `19` (REPLY) or `21` (THREAD_STARTER_MESSAGE). If the message is a reply but the `referenced_message` field is not present, the backend did not attempt to fetch the message that was being replied to, so its state is unknown. If the field exists but is null, the referenced message was deleted.
 * @property interaction sent if the message is a response to an Interaction
 * @property thread the thread that was started from this message, includes thread member object
 * @property components sent if the message contains components like buttons, action rows, or other interactive components. An app will receive empty values in the content, embeds, attachments, and components fields if they have not configured (or been approved for) the `MESSAGE_CONTENT` privileged intent (`1 << 15`).
 * @property sticker_items sent if the message contains stickers
 * @property stickers **Deprecated** the stickers sent with the message
 * @property position A generally increasing integer (there may be gaps or duplicates) that represents the approximate position of the message in a thread, it can be used to estimate the relative position of the message in a thread in company with `total_message_sent` on parent thread
 */
@Serializable class Message(
    val id: String,
    val channel_id: String,
    val author: User,
    val content: String,
    val timestamp: String,
    val edited_timestamp: String?,
    val tts: Boolean,
    val mention_everyone: Boolean,
    val mentions: Array<User>,
    val mention_roles: Array<Role>,
    val mention_channels: Array<ChannelMention>? = null,
    val attachments: Array<Attachment>,
    val embeds: Array<Embed>,
    val reactions: Array<Reaction>? = null,
    val nonce: String? = null,
    val pinned: Boolean,
    val webhook_id: String? = null,
    val type: Byte,
    val activity: MessageActivity? = null,
    val application: Application? = null,
    val application_id: String? = null,
    val message_reference: MessageReference? = null,
    val flags: Byte,
    val referenced_message: Message? = null,
    val interaction: MessageInteraction? = null,
    val thread: Channel? = null,
    val components: Array<Component>? = null,
    val sticker_items: Array<StickerItem>? = null,
    @Deprecated(message = "Deprecated") val stickers: Array<Sticker>? = null,
    val position: UInt? = null,
)

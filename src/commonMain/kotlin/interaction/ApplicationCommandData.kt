package interaction

import kotlinx.serialization.Serializable

/**
 * @property id the `ID` of the invoked command
 * @property name the `name` of the invoked command
 * @property type the `type` of the invoked command
 * @property resolved converted users + roles + channels + attachments
 * @property options the params + values from the user
 * @property guild_id the id of the guild the command is registered to
 * @property target_id id of the user or message targeted by a user or message command
 */
@Serializable class ApplicationCommandData(
    val id: String,
    val name: String,
    val type: Byte,
    val resolved: ResolvedData? = null,
    val options: Array<ApplicationCommandInteractionDataOption>? = null,
    val guild_id: String? = null,
    val target_id: String? = null,
): InteractionData

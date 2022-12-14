package cloud.drakon.ktdiscord.permissions

import kotlin.js.JsExport
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @property botId the id of the bot this role belongs to
 * @property integrationId the id of the integration this role belongs to
 * @property premium_subscriber whether this is the guild's premium subscriber role
 */
@JsExport @Serializable class RoleTags(
    @SerialName("bot_id") val botId: String? = null,
    @SerialName("integration_id") val integrationId: String? = null,
)

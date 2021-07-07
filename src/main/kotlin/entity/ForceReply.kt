package entity

data class ForceReply(
    val forceReply: Boolean = true,
    val inputFieldPlaceholder: String,
    val selective: Boolean
)

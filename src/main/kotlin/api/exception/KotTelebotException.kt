package api.exception

private const val MESSAGE_TEXT_IS_EMPTY = "Bad Request: message text is empty"
private const val CHAT_NOT_FOUND = "Bad Request: chat not found"

sealed class KotTelebotException : Exception() {

    class ChatNotFoundException(
        val statusCode: Int,
        val description: String
    ) : KotTelebotException()

    class MessageTextIsEmptyException(
        val statusCode: Int,
        val description: String
    ) : KotTelebotException()

    class UnknownException(
        val statusCode: Int,
        val description: String
    ) : KotTelebotException()

    companion object {
        fun create(statusCode: Int, description: String): KotTelebotException {
            return when (description) {
                MESSAGE_TEXT_IS_EMPTY -> MessageTextIsEmptyException(statusCode, description)
                CHAT_NOT_FOUND -> ChatNotFoundException(statusCode, description)
                else -> UnknownException(statusCode, description)
            }
        }
    }
}


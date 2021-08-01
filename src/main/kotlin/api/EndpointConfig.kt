package api

class EndpointConfig(
    token: String,
    serverLink: String = standardTelegramRoot
) {

    private val linkRegex =
        "^https?://(www\\.)?[-a-zA-Z0-9@:%._+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()!@:%_+.~#?&/=]*)/\$".toRegex()

    private val root = "${serverLink}bot$token"
    val getMe = "${root}/getMe"
    val sendMessage = "${root}/sendMessage"
    val forwardMessage = "${root}/forwardMessage"

    init {
        require(serverLink.matches(linkRegex))
    }

    companion object {
        const val standardTelegramRoot = "https://api.telegram.org/"
    }
}
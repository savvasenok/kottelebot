package entity

data class File(
    val fileId: String,
    val fileUniqueId: String,
    val fileSize: Int,
    val filePath: String?
) {
    val downloadLink =
        if (filePath == null) null else "PLACEHOLDER/$filePath" // TODO Replace with real link from here https://core.telegram.org/bots/api#file
}

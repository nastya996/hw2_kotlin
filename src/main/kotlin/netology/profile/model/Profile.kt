package netology.profile.model


class Profile(
    val id: Long,
    val login: String,
    val name: String,
    val surname: String,
    val status: String,
    val avatarUrl: String
) {
    val fullname: String
        get() = "$name $surname"
}
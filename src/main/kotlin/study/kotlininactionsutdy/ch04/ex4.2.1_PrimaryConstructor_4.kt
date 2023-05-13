package ch04.PrimaryConstructor4

open class User(val nickname: String,
           val isSubscribed: Boolean = true)

class TwitterUser(nickname: String): User(nickname)
package ch04.PrimaryConstructor1

class User constructor(
    nickname: String,
    isSubscribed: Boolean = true
) {
    val nickname: String
    val isSubscribed: Boolean
    init {
        this.nickname = nickname
        this.isSubscribed = isSubscribed
    }
}

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", false)
    println(bob.isSubscribed)
    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}
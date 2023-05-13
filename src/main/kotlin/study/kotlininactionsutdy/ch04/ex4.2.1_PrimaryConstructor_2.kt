package ch04.PrimaryConstructor2

class User(
    _nickname: String,
    _isSubscribed: Boolean = true
) {
    val nickname = _nickname
    val isSubscribed = _isSubscribed
}

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", false)
    println(bob.isSubscribed)
}
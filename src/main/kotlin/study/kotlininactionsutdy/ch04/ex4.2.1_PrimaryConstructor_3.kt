package ch04.PrimaryConstructor3

class User(val nickname: String,
           val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", false)
    println(bob.isSubscribed)
    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}


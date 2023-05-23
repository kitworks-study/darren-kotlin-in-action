package ch05.AccessingVariablesInScope1

fun printMessagesWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
}
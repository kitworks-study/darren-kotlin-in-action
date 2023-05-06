package ch02.StringTemplate

fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "World"}!")
}

fun simpleStringTemplate(first: String, last: String) = "${first}${last}"
fun complexStringTemplate(array: Array<String>) = "${if (array.size > 0) array[0] else "empty"}"

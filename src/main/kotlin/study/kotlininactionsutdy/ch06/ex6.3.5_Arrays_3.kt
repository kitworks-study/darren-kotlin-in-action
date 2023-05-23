package ch06.Arrays3

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
}
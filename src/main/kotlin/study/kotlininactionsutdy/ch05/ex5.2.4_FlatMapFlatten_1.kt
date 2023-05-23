package ch05.FlatMapFlatten1

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}

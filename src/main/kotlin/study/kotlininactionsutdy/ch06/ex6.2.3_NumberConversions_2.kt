package ch06.NumberConversions2

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    val b: Byte = 1
    val l = b + 1L
    foo(42)
}

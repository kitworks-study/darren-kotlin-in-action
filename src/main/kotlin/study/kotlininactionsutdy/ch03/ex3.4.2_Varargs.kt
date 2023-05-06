package ch03.Varargs

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}

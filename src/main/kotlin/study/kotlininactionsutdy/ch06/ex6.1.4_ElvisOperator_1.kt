package ch06.ElvisOperator1

fun strLenSafe(s: String?): Int = s?.length ?: 0
fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}
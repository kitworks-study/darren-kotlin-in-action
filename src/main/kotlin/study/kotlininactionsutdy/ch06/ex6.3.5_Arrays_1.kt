package ch06.Arrays1

fun main(args: Array<String>) {
    val arr = arrayOf("a", "b", "c")
    for (i in arr.indices) {
         println("Argument $i is: ${arr[i]}")
    }
}

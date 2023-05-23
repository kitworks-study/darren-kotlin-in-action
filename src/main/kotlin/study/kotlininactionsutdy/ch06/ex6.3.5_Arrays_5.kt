package ch06.ex3_5_5_Arrays4

fun main(args: Array<String>) {
    val arr = Array<String>(5) { i -> ('a' + i).toString()}
    arr.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}

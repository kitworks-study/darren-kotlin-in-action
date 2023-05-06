package ch02.Function

fun main(args: Array<String>) {
    println("General Function: ${max(1,2)}")
    println("Function with Statement: ${max2(1,2)}")
}

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun max2(a: Int, b: Int) = if (a > b) a else b


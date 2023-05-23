package ch05.LambdaExpression1

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1,2))
}
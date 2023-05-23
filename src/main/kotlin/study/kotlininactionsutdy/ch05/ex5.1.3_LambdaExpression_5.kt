package ch05.LambdaExpression5

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int ->
        println("${x}와 ${y}의 더하기 연산!")
        x + y
    }

    println(sum(7,3))
}
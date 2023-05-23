package ch05.LambdaExpression4

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("김철수", 29), Person("김영희", 31))
    val names = people.joinToString(separator = ", ",
        transform = { it.name })

    println(names)
}

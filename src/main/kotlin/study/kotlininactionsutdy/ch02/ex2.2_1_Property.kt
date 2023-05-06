package ch02.Property
fun main(args: Array<String>) {
    val person2 = Person ("김철수", false)
    println("person2.name = ${person2.name}")
    println("person2.isMarried = ${person2.isMarried}")
}
class Person(
    val name: String,
    var isMarried: Boolean
)
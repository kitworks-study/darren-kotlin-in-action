package ch06.PlatformTypes

import study.kotlininactionsutdy.ch06.Person
import java.util.*

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").uppercase(Locale.getDefault()) + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person(null))
}

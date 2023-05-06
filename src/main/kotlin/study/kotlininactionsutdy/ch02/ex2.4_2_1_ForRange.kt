package ch02.ForRange

fun main(args: Array<String>) {
    forRange()
}
fun forRange() {
    val oneToTen = 1..10

    for(i in oneToTen) {
        println(i)
    }
}

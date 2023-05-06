package ch02.CustomAccessor
fun main(args: Array<String>) {
    val rectangle = Rectangle(100,200)
    println("Rectangle.isSquare = ${rectangle.isSquare}")
}
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}
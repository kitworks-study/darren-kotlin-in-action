package ch04.InterfacesInKotlin

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button: Clickable {
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}
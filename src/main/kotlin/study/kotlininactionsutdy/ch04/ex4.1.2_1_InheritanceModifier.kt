package ch04.InheritanceModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton: Clickable {
    fun disable() {}

    open fun animate() {}

    override fun click() {}

    //    final override fun click() {}
}
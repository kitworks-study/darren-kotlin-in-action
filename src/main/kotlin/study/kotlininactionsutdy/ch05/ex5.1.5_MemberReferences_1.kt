package ch05.MemberReferences1

fun salute() = println("Salute!")
fun main(args: Array<String>) {
    run(::salute)
}

package ch05.MemberReferences2

data class Person(val name: String, val age: Int)
fun main(args: Array<String>) {
    val createPerson = ::Person
    val p = createPerson("홍길동", 30)
    println(p)
}

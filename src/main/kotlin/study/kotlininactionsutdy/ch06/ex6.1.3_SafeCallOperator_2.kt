package ch06.SafeCallOperator2

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) = employee.manager?.name

fun main(args: Array<String>) {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}

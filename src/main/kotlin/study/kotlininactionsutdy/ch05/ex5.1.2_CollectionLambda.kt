package ch05.CollectionLambda

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>): Person? {
    var maxAge = 0;
    var theOldestPerson: Person? = null;
    for (person in people) {
        if(person.age > maxAge) {
            maxAge = person.age
            theOldestPerson = person
        }
    }
    return theOldestPerson
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(findTheOldest(people))
    println(people.maxByOrNull { it.age })
}
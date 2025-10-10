package org.example.lessons.lesson08

fun main() {

    val simpleString = "Это простая строка"

    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = firstName + " " + lastName
//    println(fullName)
    val age = 30
    val greeting = "Привет! Меня зовут $firstName, и мне $age лет."
//    println(greeting)

    class Person(val name: String, val age: Int)

    val person = Person("Алексей", 25)
    val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."
    println(introduction)

    val detail = "Here are ${getDetails()}"

}

fun getDetails(): String {
    return "very interesting details"
}
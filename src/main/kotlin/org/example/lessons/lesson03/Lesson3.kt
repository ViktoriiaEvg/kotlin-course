package org.example.lessons.lesson03

const val PI_1 = 3.14
class Lesson3 {

    lateinit var phoneNumber: String

    val lazyValue: String by lazy {
        "Hello, this is a lazy string!"
    }

    companion object {
        const val PI_2 = 3.14
    }

    val name: String = "Alice"

    var age: Int = 30

    fun example(){
        age = 31
    }

    var score: Int = 10
    //нуллабельная (nullable) переменная
    var speed: Double? = null

    fun example1(){
        speed?.dec()
    }

    var count: Int = 0
        get(){
            return if (field > 100) field else 0
        }
        set(value){
            if (value >= 0) field = value
        }
}
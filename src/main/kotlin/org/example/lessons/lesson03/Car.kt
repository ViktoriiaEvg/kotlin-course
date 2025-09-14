package org.example.lessons.lesson03

const val wheels: Int = 4

class Car {
    val vinCode: String = "j34irj43r0j34r"

    var color: String = "Red"

    var mileage: Int = 0

    lateinit var owner: String

    val report: String by lazy {
        "Here is the report"
    }

}
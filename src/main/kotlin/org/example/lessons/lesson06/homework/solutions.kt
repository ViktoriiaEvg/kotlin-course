package org.example.lessons.lesson06.homework

fun main() {
    season(13)
    age(12)
    move(5)
    bonuses(1234)
    type("docx")
    temp(23, 'C')
    clothes(45)
    movie(19)
}

fun season(month: Int){
    when (month){
        12, 1, 2 -> println("Winter")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        else -> println("Out of range")
    }
}

fun age(age: Int){
    when (age) {
        in 1..2 -> {
            println("Dogs age is: " + age * 10.5)
        }
        in 3..99 -> {
            println("Dogs age is: " + ((age - 2) * 4 + 10.5 * 2))
        }
        else -> {
            println("Out of range")
        }
    }
}

fun move(distance: Int){
    when {
        distance in 0 .. 1 -> println("Take a walk")
        distance in 2.. 5 -> println("Ride a bike")
        distance > 5 -> println("Take a car")
        else -> println("Out of range")
    }
}

fun bonuses(total: Int){
    if (total in 1..1000){
        println("Bonuses added: " +  (total/100 * 2))
    } else if (total > 1000) {
        println("Bonuses added: " + (total/100 * 3))
    } else {
        println("Out of range")
    }
}

fun type(extension: String){
    when (extension) {
        "docx", "doc" -> {
            println("Text doc")
        }
        "jpeg", "png" -> {
            println("Image")
        }
        "xls" -> {
            println("Table")
        }
        else -> {
            println("Unexpected type")
        }
    }
}

fun temp(degrees: Int, sys: Char){
    when (sys) {
        'C' -> {
            println("Fahrenheit weather is " + (degrees * 9.0 / 5 + 32) + "F")
        }
        'F' -> {
            println("Celsius weather is " + ((degrees - 32) * 5.0 / 9) + "C")
        }
        else -> {
            println("Unexpected system")
        }
    }
}

fun clothes(temp: Int){
    if (temp < - 30 || temp > 35) {
        println("Stay home")
    } else if (temp < 10) {
        println("Wear a jacket and a hat")
    } else if (temp in 10..18){
        println("Wear a windbreaker")
    } else {
        println("Wear shorts and a t-shirt")
    }
}

fun movie(age: Int){
    when (age){
        in 0..9 -> println("Movies for children")
        in 10 until 18 -> println("Teenage movies")
        else -> println("Adult movies")
    }
}
package org.example.lessons.lesson07.homework

fun main(){
//    multiplicationTable()
//    sumArg(5)
//    factArg(5)
//    sumEvenArg(7)
//    rectangle()
    forSumEvensOdds(5)
}

// Используя вложенный цикл реализовать таблицу умножения, как на картинке.
fun multiplicationTable(){
    for (i in 1..10){
        for (j in 1..10){
            print("${i * j} ")
        }
        println()
    }
}

//Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun sumArg(arg: Int){
    if (arg < 1){
        println("Argument is less than 1")
    } else {
        var sum: Int = 0
        for (i in 1..arg) {
            sum += i
        }
        println("Sum of numbers between 1 and $arg is $sum")
    }
}

// Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factArg(arg: Int){
    if (arg < 1){
        println("Argument is less than 1")
    }
    else {
        var result: Int = 1
        var i: Int = 1
        while (i <= arg){
            result *= i
            i++
        }
        println("Factorial of $arg is $result")
    }
}
// Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun sumEvenArg(arg: Int){
    if (arg < 2){
        println("Argument is less than 2")
    }
    else {
        var result: Int = 0
        var i: Int = 2
        while (i <= arg){
            if (i % 2 == 0){
                result += i
            }
            i++
        }
        println("Sums of even numbers from 2 to $arg is $result")
    }
}
// Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun rectangle(){
    var i: Int = 0
    var j: Int = 0
    while (i < 3){
        while(j < 5){
            print('*')
            j++
        }
        i++
        j = 0
        if (i != 3) {
            println()
        }
    }
}
// Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun forSumEvensOdds(arg: Int){
    if (arg < 1){
        println("Argument is less than 1")
    }
    else {
        var oddSum: Int = 0
        var evenSum: Int = 0
        for (i in 1..arg){
            if (i % 2 == 0){
                evenSum += i
            } else {
                oddSum += i
            }
        }
        println("Sum of even numbers is $evenSum, sum of odd numbers is $oddSum")
    }
}
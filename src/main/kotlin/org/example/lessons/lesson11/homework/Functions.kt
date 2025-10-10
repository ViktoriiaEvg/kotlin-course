package org.example.lessons.lesson11.homework

fun main(){

}

//Задачи на сигнатуру метода
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//
//Не принимает аргументов и не возвращает значения.
fun justHere() {

}

//Принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int): Int {
    return a + b
}

//Принимает строку и ничего не возвращает.
fun noReturn(a: String){
    //nothing here
}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun avg(numbers: List<Int>): Double {
    return numbers.average()
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
internal fun stringLength(str: String?): Int? {
    return str?.length
}

//Не принимает аргументов и возвращает nullable вещественное число.
fun noArgNullable(): Double? {
    return null
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
internal fun internalNoReturn(list: List<Int>?) {
    // something here
}

//Принимает целое число и возвращает nullable строку.
fun intNull(value: Int): String? {
    if (value > 5) {
        val str = value.toString()
        return str
    }
    else {
        return null
    }
}

//Не принимает аргументов и возвращает список nullable строк.
fun noInputList(): List<String?> {
    return listOf("hello", null, "world")
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun stringBoolean(str: String?, number: Int?): Boolean? {
    return true
}

//Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int): Int {
    return a * 2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    return a / 2 == 0
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}


//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}

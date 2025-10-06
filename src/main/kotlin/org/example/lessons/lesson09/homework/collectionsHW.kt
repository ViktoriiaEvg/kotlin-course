package org.example.lessons.lesson09.homework

import kotlin.times

fun main() {
    //Работа с массивами Array

    //Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers = arrayOf(1, 2, 3, 4, 5)

    //Создайте пустой массив строк размером 10 элементов.
    val stringArray = Array<String>(10) { "" }

    //Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val doubles = Array(5) { index -> (index * 2).toDouble() }

    //Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val intArray = IntArray(5)
    for (i in intArray.indices) {
        intArray[i] = i * 3
    }

    //Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val nullArray: Array<String?> = arrayOf(null, "строка1", "строка2")

    //Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val copiedArray = IntArray(originalArray.size)

    for (i in originalArray.indices) {
        copiedArray[i] = originalArray[i]
    }

    //Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычтя значения одного из другого. Распечатайте полученные значения.
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val resultArray = IntArray(array1.size)

    for (i in array1.indices) {
        resultArray[i] = array1[i] - array2[i]
    }

    for (value in resultArray) {
        println(value)
    }

    //Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val numArray = intArrayOf(1, 3, 10, 7, 9)
    var index = 0
    var foundIndex = -1

    while (index < numArray.size) {
        if (numArray[index] == 5) {
            foundIndex = index
            break
        }
        index++
    }

    println(foundIndex)

    //Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val enumArray = intArrayOf(2, 7, 10, 15, 22)

    for (num in enumArray) {
        val parity = if (num % 2 == 0) "чётное" else "нечётное"
        println("$num $parity")
    }
}

//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun findAndPrintElement(arr: Array<String>, search: String) {
    for (element in arr) {
        if (element.contains(search)) {
            println(element)
            return
        }
    }
    println("Элемент не найден")
}

//    Работа со списками List
fun lists(){
//    Создайте пустой неизменяемый список целых чисел.
    val emptyList: List<Int> = emptyList()

//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val stableList = listOf("Hello", "World", "Kotlin")

//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutableList = mutableListOf(1, 2, 3, 4, 5)

//    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    mutableList.addAll(listOf(6, 7, 8))
//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val helloList = mutableListOf("Hello", "World", "Kotlin")
    helloList.remove("World")
//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val numbers = listOf(1, 2, 3, 4, 5)

    for (number in numbers) {
        println(number)
    }

//    Создайте список строк и получите из него второй элемент, используя его индекс.
    val list = listOf("Hello", "World", "Kotlin")
    val secondElement = list[1]
    println(secondElement)

//    Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val newList = mutableListOf(10, 20, 30, 40, 50)
    newList[2] = 1212
    println(newList)
//    Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list1 = listOf("Hello", "World")
    val list2 = listOf("Goodbye", "Kotlin")
    val combinedList = mutableListOf<String>()
    for (item in list1) {
        combinedList.add(item)
    }
    for (item in list2) {
        combinedList.add(item)
    }
    println(combinedList)
//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val compNumbers = listOf(10, 5, 7, 3, 12, 8)
    var min = compNumbers[0]
    var max = compNumbers[0]
    for (num in compNumbers) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }
    println("Минимум: $min")
    println("Максимум: $max")

//    Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val allNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenNumbers = mutableListOf<Int>()
    for (num in allNumbers) {
        if (num % 2 == 0) {
            evenNumbers.add(num)
        }
    }
    println(evenNumbers)
}
//Работа с Множествами Set
fun sets() {
//    Создайте пустое неизменяемое множество целых чисел.
    val emptySet: Set<Int> = emptySet()
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val immutableSet: Set<Int> = setOf(1, 2, 3)
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    mutableSet.add("Swift")
    mutableSet.add("Go")
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val numSet = mutableSetOf(1, 2, 3, 4, 5)
    numSet.remove(2)
    println(numSet)
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val coolSet = setOf(1, 2, 3, 4, 5)
    for (element in coolSet) {
        println(element)
    }

//    Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val stringSet = setOf("Kotlin", "Java", "Scala")
    val newList = mutableListOf<String>()

    for (item in stringSet) {
        newList.add(item)
    }
}

//    Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
fun containsString(set: Set<String>, search: String): Boolean {
    for (element in set) {
        if (element == search) {
            return true
        }
    }
    return false
}
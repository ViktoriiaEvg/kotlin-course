package org.example.lessons.lesson10.homework

import java.time.LocalDate

fun main() {
    //Задачи на работу со словарём
    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val dict = mapOf<Int, Int>()

    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val dict1 = mapOf<Float, Double>(0.234234f to 2.5, 454.444f to 500.0)

    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val dict2 = mutableMapOf<Int, String>()

    //Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    dict2[1] = "Arsenal"
    dict2[2] = "Liverpool"
    dict2[3] = "Liverpoo2"
    dict2[4] = "Liverpoo3"

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    println(dict2[1])
    println(dict2[12])

    //Удалите определенный элемент из изменяемого словаря по его ключу.
    dict2.remove(2)

    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val dict3 = mapOf<Double, Int>(25.0 to 5, 23.5 to 3, 123.0 to 11, 1.3 to 0)
    for ((key, value) in dict3) {
        if (value == 0) {
            println("бесконечность")
        }
        else {
            val result = key / value
            println("$key разделить на $value равно $result")
        }
    }


    //Измените значение для существующего ключа в изменяемом словаре.
    dict2[3] = "ManCity"
    println(dict2)

    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val dict4 = mapOf<String, Int>("Alex" to 5, "Max" to 34, "Jennifer" to 23)
    val dict5 = mapOf<String, Int>("Zena" to 23, "Gabrielle" to 23, "Joshua" to 45)

    val combinedDict = mutableMapOf<String, Int>()

    for ((key, value) in dict4) {
        combinedDict[key] = value
    }

    for ((key, value) in dict5) {
        combinedDict[key] = value
    }
    println(combinedDict)

    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val dict6 = mutableMapOf<String, MutableList<Int>>()
    dict6["first"] = mutableListOf(4, 5, 7)
    dict6["second"] = mutableListOf(5, 4, 7)
    dict6["third"] = mutableListOf(12, 14, 16)

    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val dict7 = mutableMapOf<Int, MutableSet<String>>()
    dict7[1] = mutableSetOf("orange", "green")
    dict7[2] = mutableSetOf("red", "blue")
    dict7[3] = mutableSetOf("black", "white")
    val set = dict7[3]
    set?.add("purple")
    println(set)

    //Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val dict8 = mapOf(
        Pair(1, 2) to "first",
        Pair(4, 5) to "forth",
        Pair(5, 9) to "fifth",
        Pair(7, 8) to "seventh"
    )

    for ((key, value) in dict8) {
        if (key.first == 5 || key.second == 5) {
            println("Значение: $value, пара: $key")
        }
    }


    //Задачи на подбор оптимального типа для словаря
    //
    //Словарь библиотека: Ключи - автор книги, значения - список книг
    val library = mutableMapOf<String, MutableList<String>>()
    //Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants = mutableMapOf<String, MutableList<String>>()

    //Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val quarters = mapOf<String, MutableList<String>>()

    //Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val treatment = mutableMapOf<LocalDate, MutableList<String>>()

    //Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val guide = mutableMapOf<String, MutableMap<String, MutableList<String>>>()
}



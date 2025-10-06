package org.example.lessons.lesson08.homework

fun main() {
//    transform("Я не уверен в успехе этого проекта")
//    dateFromLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")
//    maskCardNumber("4539 1488 0343 6467")
//    maskEmail("example@gmail.com")
//    extractFileName("C:/Пользователи/Документы/report.txt")
    makeAbbreviation("Объектно Ориентированное Программирование")

}

//1. Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.

fun transform(sentence: String){
    //замена "невозможно"
    if (sentence.contains("невозможно"))
    {
        println(sentence.replace("невозможно", "совершенно точно возможно, просто требует времени"))
    }
    //добавление при "Я не уверен"
    if (sentence.startsWith("Я не уверен")) {
        println("$sentence, но моя интуиция говорит об обратном")
    }
    //замена "катастрофы")
    if (sentence.contains("катастрофа")){
        println(sentence.replace("катастрофа", "интересное событие"))
    }
    //замена "без проблем"
    if (sentence.endsWith("без проблем", ignoreCase = true)) {
        println(sentence.replace("без проблем", "с парой интересных вызовов на пути"))
    }

    //проверка, что слово одно
    val trimmed = sentence.trim()

    if (!trimmed.contains(" ")) {
        println("Иногда, $trimmed, но не всегда")
    }

}

//2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но формат всегда такой). Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.

fun dateFromLog(logString: String) {
    // Ищем стрелочку для выделения даты/времени
    val delimiterIndex = logString.indexOf("->")

    // Отделяем дату + время
    val dateTimePart = logString.substring(delimiterIndex + 2).trim()

    // Разделяем по пробелу на дату и время
    val parts = dateTimePart.split(" ")

    val date = parts[0]
    val time = parts[1]

    println(date)
    println(time)
}

//3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".

fun maskCardNumber(cardNumber: String) {
    //отделяем цифры
    val digits = cardNumber.filter { it.isDigit() }
    val maskedDigits = "*".repeat(digits.length - 4) + digits.takeLast(4)
    var i = 0
    println( cardNumber.map {
        if (it.isDigit()) maskedDigits[i++] else it
    }.joinToString(""))
}

//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()

fun maskEmail(email: String){
    println(email.replace("@", " [at] ").replace(".", " [dot] "))
}

//5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым). Извлеките название файла с расширением.
fun extractFileName(filePath: String){
    val separatorIndex = filePath.lastIndexOf('/')
    println(if (separatorIndex != -1 && separatorIndex < filePath.length - 1) {
        filePath.substring(separatorIndex + 1)
    } else {
        filePath  // вернуть исходную строку, если разделитель не найден
    })
}

//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел). Создайте аббревиатуру из начальных букв слов (например, "ООП").

fun makeAbbreviation(phrase: String){
    val words = phrase.split(" ")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotEmpty()) {  // на всякий случай
            abbreviation += word[0].uppercaseChar()
        }
    }
    println(abbreviation)
}
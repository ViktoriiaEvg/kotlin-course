package org.example.lessons.lesson07.homework

fun main(){
//    forOne()
//    forEven()
//    forReverse()
//    forDecrease()
//    forStep()
//    forThird()
//    forSize()
//    whileSquares()
//    whileDecrease()
//    doWhile()
//    doWhileIncrease()
//    breakSix()
//    whileInfinite()
//    continueOdd()
    continueWhile()
}

// Напишите цикл for, который выводит числа от 1 до 5.
fun forOne(){
    for (i in 1..5){
        println(i)
    }
}

// Напишите цикл for, который выводит четные числа от 1 до 10.
fun forEven(){
    for (i in 1..10){
        if (i % 2 == 0) {
            println(i)
        }
    }
}

// Создайте цикл for, который выводит числа от 5 до 1.
fun forReverse(){
    for (i in 5 downTo 1){
        println(i)
    }
}

// Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2
fun forDecrease(){
    for (i in 10 downTo 1){
        println(i - 2)
    }
}

// Используйте цикл for с шагом 2 для вывода чисел от 1 до 9
fun forStep(){
    for (i in 1..9 step 2){
        println(i)
    }
}

// Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20
fun forThird(){
    for (i in 1..20 step 3){
        println(i)
    }
}

// Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
fun forSize(){
    val size: Int = 23
    for (i in 3 until size step 2){
        println(i)
    }
}

// Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun whileSquares(){
    var i = 1
    while (i <= 5) {
        println(i * i)
        i ++
    }
}

// Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun whileDecrease(){
    var number: Int = 10
    while (number != 5){
        number--
    }
    println("The result is $number")
}

// Используйте цикл do while, чтобы вывести числа от 5 до 1.
fun doWhile(){
    var i: Int = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}

// Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun doWhileIncrease(){
    var i: Int = 5
    do {
        i++
    } while (i < 10)
    println("The resulting counter is $i")
}

// Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun breakSix(){
    for (i in 1..10){
        if (i == 6){
            break
        }
        println(i)
    }
}

// Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun whileInfinite(){
    var i: Int = 1
    while (i > 0){
        println(i)
        i++
        if (i == 10) {
            println("i is 10! Finished!")
            break
        }
    }
}

// В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
fun continueOdd(){
    for (i in 1..10){
        if (i % 2 == 0){
            continue
        }
        println(i)
    }
}

// Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun continueWhile(){
    var i: Int = 1
    while (i <= 10){
        if (i % 3 == 0){
            i++
            continue
        }
        println(i)
        i++
    }
}
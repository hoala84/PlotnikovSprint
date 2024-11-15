package org.example.lesson5

import kotlin.random.Random


fun main() {

    val number1 = Random.nextInt(0, 43)
    val number2 = Random.nextInt(0, 43)
    val number3 = Random.nextInt(0, 43)
    val winNumbers = mutableListOf<Int>(number1, number2, number3)

    val userInputs = mutableListOf<Int>()

    println("Введите три числа от 0 до 42")
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()

    userInputs.add(input1)
    userInputs.add(input2)
    userInputs.add(input3)

    val result = winNumbers.intersect(userInputs).size

    when (result) {
        3 -> println("Вы угадали все числа! Вы выиграли джекпот!")
        2 -> println("Вы угадали два числа! Вы получаете крупный приз!")
        1 -> println("Вы угадали одно число! Вы получаете утешительный приз.")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }
    println("Выигрышные номера: $winNumbers")

}
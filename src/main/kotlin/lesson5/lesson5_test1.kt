package org.example.lesson5

import kotlin.random.Random


fun main() {

    val number1 = Random.nextInt(0, 100)
    val number2 = Random.nextInt(0, 100)

    println("Введите сумму этих чисел: $number1 и $number2")
    val userInput = readln().toInt()

    if (userInput == (number1 + number2)) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")

}
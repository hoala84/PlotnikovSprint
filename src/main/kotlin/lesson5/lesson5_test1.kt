package org.example.lesson5

fun main() {

    val range = 1..100
    val number1 = range.random()
    val number2 = range.random()

    println("Введите сумму этих чисел: $number1 и $number2")
    val userInput = readln().toInt()

    if (userInput == (number1 + number2)) {
        println("Добро пожаловать!")
    } else println("Доступ запрещен.")

}
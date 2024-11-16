package org.example.lesson5

fun main() {

    val number1 = 22
    val number2 = 33

    println("Введите первое число от 0 до 42")
    val userInput = readln().toInt()

    println("Введите второе число от 0 до 42")
    val userInput2 = readln().toInt()

    if (((userInput == number1) || (userInput == number2)) && ((userInput2 == number1) || (userInput2 == number2))) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userInput == number1 || userInput == number2 || userInput2 == number1 || userInput2 == number2) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("Выигрышные номера: $number1 и $number2")

}
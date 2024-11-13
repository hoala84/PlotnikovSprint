package org.example.lesson3

fun main() {

    val name = "Иван"
    val greetDay = "Добрый день"
    val greetEvening = "Добрый вечер"
    val space = ' '
    val comma = ','
    val exclam = '!'

    var greeting = "$greetDay$comma$space$name$exclam"
    println(greeting)

    greeting = "$greetEvening$comma$space$name$exclam"
    println(greeting)
}
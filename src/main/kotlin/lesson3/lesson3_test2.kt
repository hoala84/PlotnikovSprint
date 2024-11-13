package org.example.lesson3

fun main() {

    var secondName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    val space = ' '
    var age = 20
    val comma = ','

    println("$secondName$space$firstName$space$patronymic$comma$space$age")

    secondName = "Сидорова"
    age = 22

    println("$secondName$space$firstName$space$patronymic$comma$space$age")

}
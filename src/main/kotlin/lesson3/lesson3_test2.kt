package org.example.lesson3

fun main() {

    val secondName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    val newSecondName = "Сидорова"
    val space = ' '
    val age1 = 20
    val age2 = 22

    println(secondName + space + firstName + space + patronymic + ", $age1")
    println(newSecondName + space + firstName + space + patronymic + ", $age2")

}
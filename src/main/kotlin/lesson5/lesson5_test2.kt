package org.example.lesson5

import java.time.LocalDate

const val AGEDONE = 18

fun main() {
    println("Введите год рождения:")
    val userYearInput = readln().toShort()
    val currentYear = LocalDate.now().year

    if ((currentYear - userYearInput) >= AGEDONE) {
        println("Показать экран со скрытым контентом")
    } else println("Контент запрещен")

}
package org.example.lesson5

const val CMM = 100

fun main() {

    println("Введите ваш вес (в килограммах):")
    val weight = readln().toDouble()

    println("Введите ваш рост (в сантиметрах):")
    val heightCm = readln().toDouble()

    val heightInM = heightCm / CMM

    val imt = weight / (heightInM * heightInM)

    val category = when {
        imt < 18.5 -> "Недостаточная масса тела"
        imt >= 18.5 && imt < 25 -> "Нормальная масса тела"
        imt >= 25 && imt < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(imt))
    println("Категория: $category")
}


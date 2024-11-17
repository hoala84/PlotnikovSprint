package org.example.lesson5

const val LITROV = 100

fun main() {

    println("Введите расстояние поездки (в километрах):")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива:")
    val fuelPrice = readln().toDouble()

    val totalFuel = (distance * fuelConsumption) / LITROV

    val totalCost = totalFuel * fuelPrice

    println("Общее количество необходимого топлива: %.2f литров".format(totalFuel))
    println("Итоговая стоимость поездки: %.2f руб.".format(totalCost))
}
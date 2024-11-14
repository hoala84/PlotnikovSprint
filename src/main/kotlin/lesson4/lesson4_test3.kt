package org.example.lesson4


fun main() {

    val weatherSun: Boolean = true
    val tentOpen: Boolean = true
    val humidityPercent: Int = 20
    val season: String = "зима"

    val result = weatherSun && tentOpen && humidityPercent == 20 && season != "зима"

   println("Благоприятные ли условия сейчас для роста бобовых? $result")

}
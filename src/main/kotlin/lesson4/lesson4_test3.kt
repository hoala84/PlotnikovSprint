package org.example.lesson4

const val WEATHERSUN: Boolean = true
const val TENTOPEN: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "зима"

fun main() {

    val weatherTodaySun: Boolean = true
    val tentTodayOpen: Boolean = true
    val humidityToday: Int = 20
    val seasonToday:String = "зима"



    val result = weatherTodaySun == WEATHERSUN && tentTodayOpen == TENTOPEN && humidityToday == HUMIDITY && seasonToday != SEASON

   println("Благоприятные ли условия сейчас для роста бобовых? $result")

}
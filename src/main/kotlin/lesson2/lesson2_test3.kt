package org.example.lesson2

fun main(){

    val hourStart: Int = 9
    val minutesStart: Int = 39
    val totalTime: Int = 457

    val totalMinutes = hourStart * 60 + minutesStart + totalTime

    val hoursFinish = (totalMinutes / 60) % 24
    val minutesFinish = totalMinutes % 60

    println("$hoursFinish:$minutesFinish")

}
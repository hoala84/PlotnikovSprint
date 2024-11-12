package org.example.lesson2

const val TIME = 60
const val DAY = 24

fun main() {

    val hourStart: Int = 9
    val minutesStart: Int = 39
    val totalTime: Int = 457

    val totalMinutes = hourStart * TIME + minutesStart + totalTime

    val hoursFinish = (totalMinutes / TIME) % DAY
    val minutesFinish = totalMinutes % TIME

    println("$hoursFinish:$minutesFinish")

}
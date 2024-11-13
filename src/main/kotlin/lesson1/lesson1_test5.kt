package org.example.lesson1

const val TIME = 60

fun main() {

    val seconds: Short = 6480
    val minutes = seconds / TIME
    val remainsSeconds = seconds - minutes * TIME
    val hours = minutes / TIME
    val remainsMinutes = minutes - hours * TIME

    println("%02d:%02d:%02d".format(hours, remainsMinutes, remainsSeconds))

}
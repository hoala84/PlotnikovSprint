package org.example.lesson1

const val TIME = 60

fun main() {

    val seconds: Short = 6480
    val minutes = seconds / TIME
    val remainsSeconds = seconds - minutes * TIME
    val hours = minutes / TIME
    val remainsMinutes = minutes - hours * TIME

    val formattedHours = "%02d".format(hours)
    val formattedMinutes = "%02d".format(remainsMinutes)
    val formattedSeconds = "%02d".format(remainsSeconds)


    print("$formattedHours:$formattedMinutes:$formattedSeconds")


}
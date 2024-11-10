package org.example.lesson1

fun main(){

    val seconds: Short = 6480
    val minutes = seconds/60
    val remainsSeconds = seconds - minutes*60
    val hours = minutes/60
    val remainsMinutes = minutes - hours*60

    val formattedHours = "%02d".format(hours)
    val formattedMinutes = "%02d".format(remainsMinutes)
    val formattedSeconds = "%02d".format(remainsSeconds)


    print("$formattedHours:$formattedMinutes:$formattedSeconds")


}
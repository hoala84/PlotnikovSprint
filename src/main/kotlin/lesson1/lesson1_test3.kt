package org.example.lesson1

fun main(){
    val year = 1961
    var hour = 9
    var minute = 7

    println(year)
    println(String.format("%02d", hour))
    println(String.format("%02d", minute))

    hour = 10
    minute = 55
    print("$hour:$minute")

}
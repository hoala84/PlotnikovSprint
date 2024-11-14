package org.example.lesson3

fun main() {

    val number = readln().toInt()

    for (i in 1..9) {

        println("$number x $i = ${number * i}")

    }
}
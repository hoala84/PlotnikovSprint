package org.example.lesson2

fun main() {

    val contribution = 70000.0
    val rate = 16.7 / 100
    val time = 20

    val result = contribution * Math.pow(1 + rate, time.toDouble())

    val formatResult = String.format("%.3f", result)

    println(formatResult)
}
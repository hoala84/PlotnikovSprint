package org.example.lesson3

fun main() {

    val input = "D2-D4;0"
    val parts = input.split(";")
    val fromTo = parts[0]
    val motion = parts[1]
    val motionParts = fromTo.split("-")
    val from = motionParts[0]
    val to = motionParts[1]

    println(from)
    println(to)
    println(motion)
}
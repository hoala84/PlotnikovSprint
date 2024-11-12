package org.example.lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buff = 20

    val overCrystal = (crystalOre * buff) / 100
    val overIron = (ironOre * buff) / 100

    println("Кристаллическая руда: ${overCrystal.toInt()}")
    println("Железная руда: ${overIron.toInt()}")


}
package org.example.lesson2

fun main(){

    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val overCrystal = (crystalOre * buff).toInt()
    val overIron = (ironOre * buff).toInt()

    println("Кристаллическая руда: $overCrystal")
    println("Железная руда: $overIron")




}
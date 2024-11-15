package org.example.lesson4

const val CREWMIN = 55
const val CREWMAX = 70
const val PROVISIONSMIN = 50

fun main() {

    println("Введите наличие повреждений")
    val damage: Boolean = readln().toBoolean()
    println("Введите численность экипажа")
    val crew: Int = readln().toInt()
    println("Введите кол-во провизии")
    val provisions: Int = readln().toInt()
    println("Погода благоприятная?")
    val weatherGood: Boolean = readln().toBoolean()

    val result =
        (!damage && (crew in CREWMIN..CREWMAX) && (provisions > PROVISIONSMIN) && (!weatherGood || weatherGood)) ||
                (damage && (crew == CREWMAX) && (provisions >= PROVISIONSMIN) && (!weatherGood || weatherGood))

    println("Корабль может приступить к плаванию: $result ")

}
package org.example.lesson4


fun main() {

    val trainingDay = 1
    val armsAndAbs = trainingDay % 2 != 0
    val legsAndBack = trainingDay % 2 == 0

    val output = """
        Упражнения для рук:       $armsAndAbs
        Упражнения для ног:       $legsAndBack
        Упражнения для спины:     $legsAndBack
        Упражнения для пресса:    $armsAndAbs
    """.trimIndent()

    println(output)

}
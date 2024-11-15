package org.example.lesson4


fun main() {

    val trainingDay = 1
    val isEven: Boolean = trainingDay % 2 == 0
    val armsAndAbs = !isEven
    val legsAndBack = isEven

    val output = """
        Упражнения для рук:       $armsAndAbs
        Упражнения для ног:       $legsAndBack
        Упражнения для спины:     $legsAndBack
        Упражнения для пресса:    $armsAndAbs
    """.trimIndent()

    println(output)

}
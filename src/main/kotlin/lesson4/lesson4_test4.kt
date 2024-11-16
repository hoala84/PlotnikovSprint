package org.example.lesson4


fun main() {

    val trainingDay = 1
    val isEven: Boolean = trainingDay % 2 == 0

    val output = """
        Упражнения для рук:       ${!isEven} 
        Упражнения для ног:       ${isEven} 
        Упражнения для спины:     ${isEven} 
        Упражнения для пресса:    ${!isEven} 
    """.trimIndent()

    println(output)

}
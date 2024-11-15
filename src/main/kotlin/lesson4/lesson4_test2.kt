package org.example.lesson4

const val WEIGHTMINAVERAGE = 35
const val WEIGHTMAXAVERAGE = 100
const val VOLUMEMAXAVERAGE = 100

fun main() {

    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    println(
        "Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': ${
            (weight1 > WEIGHTMINAVERAGE)
                    && (weight1 <= WEIGHTMAXAVERAGE)
                    && (volume1 < VOLUMEMAXAVERAGE)
        } \n" +
                "Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': ${
                    (weight2 > WEIGHTMINAVERAGE)
                            && (weight2 <= WEIGHTMAXAVERAGE)
                            && (volume2 < VOLUMEMAXAVERAGE)
                }"
    )

}
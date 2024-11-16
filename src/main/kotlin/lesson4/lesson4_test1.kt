package org.example.lesson4

const val NUMBEROFTABLES = 13

fun main() {

    val reservedToday = 13
    val reservedTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${(NUMBEROFTABLES != reservedToday) && NUMBEROFTABLES > reservedToday} \n"
                + "Доступность столиков на завтра: ${(NUMBEROFTABLES != reservedTomorrow) && NUMBEROFTABLES > reservedTomorrow}"
    )

}
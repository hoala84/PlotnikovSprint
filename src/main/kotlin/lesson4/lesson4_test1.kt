package org.example.lesson4

fun main() {

    val numberOfTables = 13
    val reservedToday = 13
    val reservedTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${(numberOfTables != reservedToday) && numberOfTables > reservedToday} \n"
                + "Доступность столиков на завтра: ${(numberOfTables != reservedTomorrow) && numberOfTables > reservedTomorrow}"
    )

}
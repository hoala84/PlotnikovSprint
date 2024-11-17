package org.example.lesson5

const val USERNAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {

    println("пожалуйста, вводите свое имя")
    val userNameInput = readln().toString()

    if (userNameInput != USERNAME) {
        println("Вам необходимо зарегистрироваться")
    }

    if (userNameInput == USERNAME) {
        println("пожалуйста, введите свой пароль")
        val passwordInput = readln().toString()

        if (passwordInput == PASSWORD) {
            println("Пользователь $userNameInput, вам разрешено входить на борт корабля \"Heart of Gold\"")
        } else println("Пароль не верный")

    }
}
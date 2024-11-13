package org.example.lesson3

fun main() {

    var from = "E2"
    var to = "E4"
    var motion = 1

    var motionString = "[$from-$to;$motion]"
    println(motionString)

    from = "D2"
    to = "D3"
    motion = 2

    motionString = "[$from-$to;$motion]"
    println(motionString)
}
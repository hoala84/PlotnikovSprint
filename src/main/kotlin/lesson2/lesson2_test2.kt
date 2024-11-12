package org.example.lesson2

fun main(){

    val numberOFWorkers: Int = 50
    val salaryOfWorker: Int = 30000
    val numberOfInterns: Int = 30
    val salaryOfIntern: Int = 20000

    val sumSalaryOfWorkers = numberOFWorkers * salaryOfWorker
    val sumSalary = sumSalaryOfWorkers + (numberOfInterns * salaryOfIntern)
    val averageSalary = sumSalary / (numberOfInterns + numberOFWorkers)

    println(sumSalaryOfWorkers)
    println(sumSalary)
    println(averageSalary)

}
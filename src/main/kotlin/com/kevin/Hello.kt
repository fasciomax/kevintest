package com.kevin

fun main() {
//    println("Hello Kotlin")
    Human().hello()
    val h = Human()
    h.hello()
}

class Human{
    val age = 25
    val bike = "XSR900"
    var weight = 77.5
    val name = "Kevin"
    fun hello() {
    println("Hello Kotlin")
    }
}
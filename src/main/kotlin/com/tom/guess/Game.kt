package com.tom.guess

import java.util.*

fun main(agrs: Array<String>){
    val secret = Random().nextInt(100).toByte()
    val scanner = Scanner(System.`in`)
    var number : Byte = -1
    while (number != secret){
        print("Please enter a number: ")
        number = scanner.nextByte()
        when{
            number > secret -> println("lower")
            number < secret -> println("higher")
            else -> println("Great, number is $secret")
        }
    }

}
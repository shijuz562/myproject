package com.tom.guess

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(100)
    var num: Int
    for (i in 1..10) {
        print("Please enter a number(${i}/10): ")
        num = scanner.nextInt()
        if (i == 10 && num != secret){
            println("You lost, this number is $secret")
            break
        }
        when {
            num < secret -> println("higher")
            num > secret -> println("lower")
            else -> {
                println("Gread, this number is $secret")
                break
            }
        }

    }
}
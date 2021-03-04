package com.tom

fun main(args: Array<String>){
    val h = Human(68.8f, 1.68f)
    println(h.bmi())

   /* val first = "沈"
    val last = "俊璋"
    println("My name is "+first + last)

    var age : Byte
    age = 23
    println("My age is "+ age)

    var weight = 69.8f
    val height = 168
    println("My weight is "+weight)
    println("My height is "+ height)*/

}


class Human(var weight:Float, var height:Float){

    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin class")
    }
}
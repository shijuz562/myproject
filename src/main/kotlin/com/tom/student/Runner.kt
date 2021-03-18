package com.tom.student

fun main(args : Array<String>){
    var mandarin : Byte = 65
    var english : Byte = 45
    var math : Byte = 89
    val stu = Student1(89,56,89)
    println(stu.print())
}



class Student1(var mandarin: Byte, var english: Byte, var math: Byte,var id : Byte = 1, var name : String? = null){
    var averang : Float = 0.0f

    fun print(){
        println("$mandarin + $english + $math \taverage = ${average()}\n" +
                "high = ${high()}\tgrading = ${grading()}\nhightype = ${highType()}")
    }

    fun average() :Float {
        this.averang = (mandarin + english + math).toFloat()  / 3
        return averang
    }

    fun high() =
        when{
            mandarin >= english && mandarin >= math  -> mandarin
            english >= mandarin && english >= math -> english
            else -> math
        }
    fun highType() =
        when{
            mandarin > english && mandarin > math  -> "mandarin"
            english > mandarin && english > math -> "english"
            math > english && math > mandarin -> "math"
            mandarin == english && mandarin != math-> "mandarin and english"
            mandarin == math && mandarin != english-> "mandarin and math"
            english == math && mandarin != english-> "english and math"
            else -> "mandarin and english and math"
        }

    fun grading() = when(averang.toByte()){
        in 90..100 -> 'A'
        in 80 .. 89 -> 'B'
        in 70 .. 79 -> 'C'
        in 60 .. 69 -> 'D'
        else -> 'F'
    }
}
package com.mycleancode

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    println(calc(3, 10))

    var value: Int = 5
    var sum: Double = 10.5
    var text: String = "Hello Kotlin"
    val value1: Int = 10

    if (value > 5) {
        println(">5")
    }

    value = 6
    // because value1 -> final val don't work -> value1 = 11

    var valueNull: Int? = null
    if (valueNull != null && valueNull > 6) {
        println("valueNull not null")
    }

    var result: Int = value1 + 10
    var valueMinus: Int = -5
    //нельзя хранить отрицательные значения     var valueMinus: UInt = -5
    var valueUInt: UInt = 5u

    var valueUIntMax: UInt = UInt.MAX_VALUE
    var valueUIntMin: UInt = UInt.MIN_VALUE

    println(UInt.MIN_VALUE.toString() + "..." + UInt.MAX_VALUE.toString())
    println(Int.MIN_VALUE.toString() + "..." + Int.MAX_VALUE.toString())

    when (value) {
        1, 2, 4 -> {
            println(" 1, 2, 4")
        }

        in 5..6 -> {
            println("between 5 - 6")
        }

        10 -> {
            println("10")
        }

        else -> {
            println("----")
        }
    }

    //array



}

fun calc(a: Int, b: Int): Int {
    return a + b
}
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
    val arrayInt: Array<Int> = Array<Int>(3) { 150; 200; 300 }
    val arrayInt2 = Array<Int>(3) { 150; 200; 300 }
    val arrayInt3 = Array(3) { 150; 200; 300 }
    // arrayInt[0] = 0
    // array from 5, 5 , 5, ...1000ps
    val arrayInt4 = Array(1000) { 5 }
    val arrayInt5 = arrayOf(150, 300, 100)
    val arrayOfNulls = arrayOfNulls<Int>(3)

    val intArray = IntArray(3) { 1;45;6 }
    val intArrayOf = intArrayOf(4, 57, 8)
    val arrayOfString = arrayOf("home", "flat", "house")

    // for and while
    //for i = 0..10 = 11 times
    for (i in 0..10) {
        println("i = $i")
    }
    //for i = 0..9 = 10 times
    for (i in 0 until 10) {
        println("i = $i")
    }

    //for i = 0, 3, 6, 9 = 4 times
    for (i in 0 until 10 step 3) {
        println("i = $i")
    }

    //for i = 10, 5, 0 = 3 times
    for (i in 10 downTo 0 step 5) {
        println("i = $i")
    }
    //for variant #1
    for (i in 0 until arrayOfString.size) {
        println("i = $i, value = ${arrayOfString[i]}")
    }
    //for variant #2
    for (value in arrayOfString) {
        println("value = $value")
    }
    //for variant #3
    for (index in arrayOfString.indices) {
        println("i = $index, value = ${arrayOfString[index]}")
    }
    //for variant #3
    for ((i, value) in arrayOfString.withIndex()) {
        println("i = $i, value = $value")
    }

    mainLoop@ for ((i, value) in arrayInt.withIndex()) {
        println("i = $i, value = $value")
        for (v in arrayOfString) {
            println("valueStr = $v")
            break@mainLoop
        }
    }

    var x: Int = 0
    while (x < 5) {
        println("x = $x")
        x++
    }

    //Collection
    val arrayList = ArrayList<String>()

    val list = listOf("111", "222", "333")
    val textStr = list.get(0)
    val textStr1 = list[0]
    println("text = $textStr")
    for (element in list) {
        println("for 1 element $element")
    }

    val mutableListOf = mutableListOf("111", "222", "333")
    mutableListOf.add("444")
    for (element in mutableListOf) {
        println("for 2 element $element")
    }

    val students = mutableListOf(
        Student(name = "Anat", age = 19),
        Student(name = "Petr", age = 22),
        Student(name = "Ivan", age = 21),
        Student(name = "Serg", age = 17)
    )

    for (student in students) {
        println("student: ${student.name}")
    }

    students.forEach {
        println("student: ${it.name}")
    }

    val mapOf = mutableMapOf(
        "Anat" to Student("Anat", 19),
        "Petr" to Student("Petr", 22),
        "Ivan" to Student("Ivan", 21),
        "Serg" to Student("Serg", 17)
    )

    mapOf.forEach { student ->
        println("key = ${student.key}, value = ${student.value.age}")
    }

    val name = mapOf["Anat"]
    println(name)

    val stringSet = setOf("234", "6642", "9695948")
    stringSet.forEach {
        println("element set - ${it}")
    }

}

fun calc(a: Int, b: Int): Int {
    return a + b
}
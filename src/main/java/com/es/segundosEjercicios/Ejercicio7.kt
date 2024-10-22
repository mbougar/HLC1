package com.es.segundosEjercicios

fun main() {
    println(multiplicar(5))

    // Para la lambda no necesitamos una interfaz
    val operacion: (Int, Int) -> Int = { a, b -> a + b }
    println(operacion(3, 4))
}

fun multiplicar(num: Int): Int {
    return num * 2
}
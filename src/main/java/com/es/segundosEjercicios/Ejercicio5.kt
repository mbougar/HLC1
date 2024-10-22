package com.es.segundosEjercicios
/*
* Ejercicio5:
*
* Kotlin permite instanciar en el constructor lo cual ahorra mucho codigo, ademas las funciones en Kotlin
* no tienen que especificar un return salvo que retornen algo
* */

class Personaje(
    val nombre: String,
    var vida: Int,
    val ataque: Int) {

    fun mostrarInfo() {
        println("Nombre $nombre, Vida: $vida, Ataque: $ataque")
    }
}

fun main() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}
package com.es.segundosEjercicios

/*

Ejercicio 3:

En kotlin el bucle for es mas simple, simplemente tienes que darle un nombre a la variable que va a recorrer la coleccion
y poner "in" seguido de la colección.

*/

fun main() {

    val cofres = listOf("Espada", "Escudo", "Poción")
    for (cofre in cofres) {
        println("Has encontrado: $cofre")
    }

}
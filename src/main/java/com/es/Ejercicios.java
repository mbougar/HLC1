package com.es;

public class Ejercicios {

    /*
    * estado = (energia > 50) ? "Fuerte" : "Débil";
    * Kotlin: val estado = if (energia > 50) "Fuerte" else "Débil"
    *
    * En kotlin usamos el if else con else if para dar un valor dependiendo de una variable, en java
    * se puede usar el operador terniario para evaluar el valor de una variable y asignar otros valores dependiendo de el.
    * */

    public static void ejercicio2() {

        int energia = 40;
        String estado = (energia > 50) ? "Fuerte" : "Débil";
        System.out.println(estado);
    }

    /*
     * Ejercicio 4:
     * Tanto en kotlin como en Java existe el break y el continue con exactamente la misma utilidad.
     * La principal diferencia es la facilidad de uso de los rangos en kotlin con respecto a Java.
     * */

    public static void ejercicio4() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) System.out.println("Estoy en un bucle");
            if (i == 3) continue;
            if (i == 4) break;
        }
    }

    /*
     * Ejercicio 6:
     *
     * Kotlin usa el operador ? para asegurarse de la nullidad de las variables, Java te permite asignar null directamente
     * haciendo que el trabajo con nulos en Java sea menos seguro
     * */

    public static void ejercicio6() {
        String personaje = null;

        if (personaje != null) {
            System.out.println("El personaje es " + personaje);
        } else {
            System.out.println("No hay personaje.");
        }
    }
}

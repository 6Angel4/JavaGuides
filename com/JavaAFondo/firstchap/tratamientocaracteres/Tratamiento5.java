package com.JavaAFondo.firstchap.tratamientocaracteres;

public class Tratamiento5 {
    public static void main(String[] args) {
        //Prefijos y Sufijos
        String cadena = "Esta es una cadena";
        System.out.println(cadena.startsWith("Esta"));  //retorna un boolean
        System.out.println(cadena.startsWith("esta"));  //retorna un boolean
        System.out.println(cadena.endsWith("cadena"));  //retorna un boolean
        System.out.println(cadena.endsWith("Cadena"));  //retorna un boolean
    }
}

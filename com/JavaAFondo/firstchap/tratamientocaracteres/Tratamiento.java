package com.JavaAFondo.firstchap.tratamientocaracteres;

public class Tratamiento {
    public static void main(String[] args) {
        //Acceder a los caracteres de una cadena
        String cadena = "Esta es mi cadena";
        System.out.println(cadena.charAt(0));// Uso del metodo charAt() para acceder al indice "0"
        System.out.println(cadena.charAt(5));
        System.out.println(cadena.charAt(cadena.length()-1));// Muestra el ultimo caracter

        char c;
        for (int i=0;i<cadena.length();i++){
            c = cadena.charAt(i);// charAt() devuelve un tipo char, osea que ya no es un String
            System.out.println(i+"->"+c);
        }

    }
}

package com.JavaAFondo.firstchap.tratamientocaracteres;

public class Tratamiento7 {
    public static void main(String[] args) {
        //Conversion entre numeros y cadenas
        int i = 50;
        String sInt = Integer.toString(i);  //Convertir de Entero a Cadena
        int iString = Integer.parseInt(sInt);   //Convertir de Cadena (String) a Entero

        System.out.println("valor inicial: "+i);
        System.out.println("Entero a cadena: "+(sInt+1));
        System.out.println("Cadena a entero: "+(iString+1));
    }
}

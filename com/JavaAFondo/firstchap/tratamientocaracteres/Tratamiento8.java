package com.JavaAFondo.firstchap.tratamientocaracteres;

public class Tratamiento8 {
    public static void main(String[] args) {
        //ReGex para particionar cadenas.
        String cadena = "A|B|C|D";
        //split particiona cadenas a partir de una regex
        String[] tokens = cadena.split("[|]");
        System.out.println(tokens.length);
        for (int i=0;i<tokens.length;i++){
            System.out.println(tokens[i]);
        }
    }
}

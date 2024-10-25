package com.JavaAFondo.firstchap.exercice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una fecha: DDMMYYYY");
        int fecha = scanner.nextInt();
        dateStringTransform(fecha);
    }
    //Convertir Fecha a String
    public static String dateStringTransform(int fechaIngresada){
        String fechaCambiada = Integer.toString(fechaIngresada);
        System.out.println("Fecha Cambiada: "+fechaCambiada);
        //Comprobar Longitud
        if (fechaCambiada.length() != 8){
            throw new IllegalArgumentException("La fecha no cumple con el numero de caracteres");
        }
        //Insert /
        String fechaConSlash = fechaCambiada.substring(0,2)+"/"+
                fechaCambiada.substring(2,4)+"/"+
                fechaCambiada.substring(4);
        System.out.println("Fecha formateada: "+fechaConSlash);
        return fechaConSlash;
    }

}

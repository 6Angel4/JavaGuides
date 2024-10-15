package com.JavaAFondo.firstchap;

/*
    Estructuras de DECISION
    if
    if-else
    switch
    if-inline (operador ternario)
 */

import  java.util.Scanner;

public class EstructuraDecisionIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        //(condicion)
        if (edad > 18){//inicio de bloque if
            //si condicion = TRUE, ejecuta bloque de sentencias
            System.out.println("Mayor de edad");//sentencia o statement
        }//fin de bloque if
    }
}

package com.JavaAFondo.firstchap;

import java.util.Scanner;

public class EstructuraDesicionInLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int age = scanner.nextInt();
        String msg = (age>18) ? "Pass" : "Not Pass"; //El operador ternario se compone de una (condicion), ? (ejecuta si condicion = TRUE), : (ejecuta si condicion = FALSE)

        System.out.println(age+" "+msg);
    }
}

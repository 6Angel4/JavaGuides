package com.JavaAFondo.firstchap;

import java.util.Scanner;

public class EstructuraDecisionIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input age: ");
        int age = scanner.nextInt();

        //Condicion
        if (age > 18){//bloque de condicion if
            System.out.println("pass");//sentencia a ejecutar si CONDICION es TRUE
        }else {//bloque de condicion else
            System.out.println("not pass");//sentencia a ejecutar si CONDICION es FALSE
        }//.bloque de condicion else
    }
}

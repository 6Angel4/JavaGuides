package com.JavaAFondo.firstchap;

import java.util.Scanner;

public class EstructuraIterativaWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar num: ");
        int num = scanner.nextInt();

        while (num<20){
            System.out.println("valor de num ACTUAL: "+num);
            num++;  //incrementa en 1
            System.out.println("valor de num DESPUES de ++: "+num);
        }
    }
}

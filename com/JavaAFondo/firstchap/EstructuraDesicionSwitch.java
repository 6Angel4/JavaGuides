package com.JavaAFondo.firstchap;

import java.util.Scanner;

public class EstructuraDesicionSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println(opcion);
                break;
            case 2:
                System.out.println(opcion);
                break;
            case 3:
                System.out.println(opcion);
                break;
            default:
                System.out.println(opcion+" opcion no valida!!");
        }
    }
}

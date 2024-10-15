package com.JavaAFondo.firstchap;

/*
    1.3.1 Entrada y Salida de datos
    Ingreso de datos por consola = ingreso ded datos por la pantalla
    Ingreso de datos por teclado = ingreso de datos por teclado
 */

//Se importa la clase Scanner para ingresar datos por TECLADO
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Instanciar la clase Scanner en la var scanner
        System.out.println("Ingresa tu nombre:"); //Mnesaje con indicacion al usuario
        String nombre = scanner.nextLine(); //Variable nombre contiene el metodo .nextLine() del objeto Scanner (scanner = Scanner)

        System.out.println("Nombre: "+nombre); //Valor de la variable nombre (valor ingresado por teclado)
    }
}

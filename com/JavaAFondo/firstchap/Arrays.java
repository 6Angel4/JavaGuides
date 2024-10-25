package com.JavaAFondo.firstchap;

public class Arrays {
    public static void main(String[] args) {
        int arr []; //Un arreglo de ENTEROS
        arr = new int[5];   //Un arreglo con solo 5 espacios o cajitas, no se puede modificar este espacio
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);   //Castear el numero generado en a ENTEROS
            System.out.print("|"+arr[i]+"|");
        }
    }
}

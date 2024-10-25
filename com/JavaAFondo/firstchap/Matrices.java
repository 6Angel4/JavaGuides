package com.JavaAFondo.firstchap;

public class Matrices {
    public static void main(String[] args) {
        //Define una matriz de n x m
        int n = 3, m = 3;
        int matriz[][] = new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matriz[i][j] = (int)(Math.random()*100);
            }//.columnas
        }//.filas

        for (int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matriz[i][j]+"\t");
            }//.columnas
            System.out.println();
        }//.filas


    }
}

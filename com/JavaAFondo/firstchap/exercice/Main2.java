package com.JavaAFondo.firstchap.exercice;

public class Main2 {
    public static void main(String[] args) {

        int num1 = (int) (Math.random()*100);
        int num2 = (int) (Math.random()*100);
        int counter = 0;
        boolean status = false;


        do{
            int numRes = num1+num2;
            String iString = Integer.toString(numRes);
            if (iString.contains("88")){
                System.out.println(num1+"\t"+num2);
                System.out.println("Res=" + (num1 + num2));
                System.out.println(true);
                status = true;
            }else {
                System.out.println(num1+"\t"+num2);
                System.out.println("Res=" + (num1 + num2));
                System.out.println(false);
                status = false;
                counter++;
                num1 = (int) (Math.random()*100);
                num2 = (int) (Math.random()*100);
            }
            System.out.println("Intento:"+counter);
        }while (status!=true);

    }
}
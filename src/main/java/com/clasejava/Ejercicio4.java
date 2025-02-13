package com.clasejava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero:");
         numero = teclado.nextInt();

       
        
         if (numero %2 == 0){
            System.out.println("El nuumero es par");
        }else{
            System.out.println(" El numero es impar");
        }

        teclado.close();
    }


}

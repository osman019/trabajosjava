package com.clasejava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();

        int contador = 1;
        
        while (contador <= 10) {
            System.out.println(numero + " " + contador + " = " + (numero * contador));
            contador++;
        }

         teclado.close();
    }
}

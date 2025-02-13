package com.clasejava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre;
        int edad;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = teclado.nextLine();

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        System.out.println("el nombre es: " + nombre );
        System.out.println("La edad es: " + edad);

        teclado.close();


    }
    
}

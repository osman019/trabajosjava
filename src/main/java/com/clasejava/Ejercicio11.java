package com.clasejava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

         System.out.println("ingrese el saldo inicial de la cuenta: ");
         double saldo = teclado.nextDouble();

         System.out.println("Ingrese el deposito mensual fijo: ");
         double deposito = teclado.nextDouble();

         System.out.println("Ingrese la tasa de interes anual: ");
         double interesAnual = teclado.nextDouble();

         System.out.println("Ingrese el numero de meses de simulacion: ");
         int meses = teclado.nextInt();



         double tasaInteresmensual = interesAnual / 12/ 100;
         System.out.println("\nSimulacion de depositos");
         System.out.println("-----------------------------------------------------------------------");
         System.out.printf("%-5s %-15s %-15s %-10s %-10s %-10s%n",
         "Mes", "Saldo Inicial", "Deposito", "Interés", "Nuevo Saldo");
         System.out.println("-----------------------------------------------------------------------");

         for (int mes = 1; mes  <= meses; mes++ ){
         double = saldoInicial = saldo; 
         double interesgenerado 


            
         }


    }
}

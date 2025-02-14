package com.clasejava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double saldo = teclado.nextDouble();

        System.out.print("Ingrese el depósito mensual fijo: ");
        double depositoMensual = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = teclado.nextDouble();

        System.out.print("Ingrese el número de meses de simulación: ");
        int meses = teclado.nextInt();

        double tasaMensual = (tasaAnual / 100) / 12;

        System.out.println("\nTabla de Crecimiento del Saldo");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s%n", "Mes", "Saldo Inicial", "Depósito", "Interés", "Saldo Final");
        System.out.println("-----------------------------------------------------");

        for (int mes = 1; mes <= meses; mes++) {
            double saldoInicial = saldo;
            saldo += depositoMensual;
            double interesGenerado = saldo * tasaMensual;
            saldo += interesGenerado;

            System.out.printf("%-5d %-15.2f %-10.2f %-10.2f %-10.2f%n",
                    mes, saldoInicial, depositoMensual, interesGenerado, saldo);
        }

        teclado.close();
    }
}

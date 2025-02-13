package com.clasejava;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto inicial de inversión: ");
        double P = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Ingrese el número de años de inversión: ");
        int t = scanner.nextInt();

        System.out.println("Seleccione la frecuencia de capitalización:");
        System.out.println("1. Mensual");
        System.out.println("2. Trimestral");
        System.out.println("3. Semestral");
        System.out.println("4. Anual");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        int n;
        switch (opcion) {
            case 1:
                n = 12;
                break;
            case 2:
                n = 4;
                break;
            case 3:
                n = 2;
                break;
            case 4:
                n = 1;
                break;
            default:
                System.out.println("Opción inválida. Se usará capitalización anual.");
                n = 1;
        }

        double r = tasaAnual / 100;

        System.out.println("\nTabla de Crecimiento de la Inversión");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s %-15s%n", "Año", "Capital Inicial", "Interés Ganado", "Saldo Final");
        System.out.println("-----------------------------------------------------------");

        double saldo = P;

        for (int i = 1; i <= t; i++) {
            double montoFinal = saldo * Math.pow(1 + (r / n), n);
            double interesGanado = montoFinal - saldo;

            System.out.printf("%-5d %-15.2f %-15.2f %-15.2f%n", i, saldo, interesGanado, montoFinal);

            saldo = montoFinal;
        }

        scanner.close();
    }
}
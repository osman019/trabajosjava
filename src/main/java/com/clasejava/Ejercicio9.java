package com.clasejava;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double P = teclado.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = teclado.nextDouble();

        System.out.print("Ingrese el plazo del préstamo (en años): ");
        int plazoAnios = teclado.nextInt();

        double r = (tasaAnual / 100) / 12;
        int n = plazoAnios * 12;
        double C = (P * r) / (1 - Math.pow(1 + r, -n));

        System.out.println("\nTabla de Amortización");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s %-10s %-10s %-10s%n",
                "Cuota", "Saldo Inicial", "Cuota Mensual", "Interés", "Capital", "Saldo");
        System.out.println("-----------------------------------------------------------------------");

        double saldo = P;

        for (int i = 1; i <= n; i++) {
            double interesPagado = saldo * r;
            double capitalPagado = C - interesPagado;
            double saldoPendiente = saldo - capitalPagado;

            System.out.printf("%-5d %-15.2f %-15.2f %-10.2f %-10.2f %-10.2f%n",
                    i, saldo, C, interesPagado, capitalPagado, saldoPendiente);

            saldo = saldoPendiente;
        }

        teclado.close();
    }
}

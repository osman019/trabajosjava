package com.clasejava;

import java.util.Scanner;

public class ejerciciopropina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("        SIMULADOR DE PROPINA");
            System.out.println("========================================");
            System.out.println("1. Calcular propina y total a pagar");
            System.out.println("2. Calcular total a pagar dividido entre varias personas");
            System.out.println("3. Salir");
            System.out.println("========================================");
            System.out.print("Por favor, elige una opción (1-3): ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    calcularPropina(teclado);
                    break;
                case 2:
                    dividirCuenta(teclado);
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el Simulador de Propina!");
                    break;
            }
        } while (opcion != 3);

        teclado.close();
    }

    public static void calcularPropina(Scanner scanner) {
        char repetir;
        do {
            System.out.println("\n========================================");
            System.out.println("         Cálculo de Propina");
            System.out.println("========================================");

            System.out.print("Ingrese el monto total de la cuenta: $");
            double cuenta = scanner.nextDouble();

            System.out.print("Ingrese el porcentaje de propina (por ejemplo: 15): ");
            double porcentaje = scanner.nextDouble();

            double propina = cuenta * (porcentaje / 100);
            double total = cuenta + propina;

            System.out.println("========================================");
            System.out.printf("La propina calculada es: $%.2f\n", propina);
            System.out.printf("El total a pagar es: $%.2f\n", total);
            System.out.println("========================================");

            System.out.print("¿Quieres calcular nuevamente? (S/N): ");
            repetir = scanner.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');
    }

    public static void dividirCuenta(Scanner scanner) {
        char repetir;
        do {
            System.out.println("\n========================================");
            System.out.println("    Dividir Cuenta entre Varias Personas");
            System.out.println("========================================");

            System.out.print("Ingrese el monto total de la cuenta: $");
            double totalCuenta = scanner.nextDouble();

            System.out.print("Ingrese el porcentaje de propina (por ejemplo: 15): ");
            double porcentaje = scanner.nextDouble();
          
            System.out.print("Ingrese el número de personas: ");
            int personas = scanner.nextInt();
             
            double propina = totalCuenta * (porcentaje / 100);
            double totalPagar = totalCuenta + propina;
            double montoPorPersona = totalPagar / personas;

            System.out.println("========================================");
            System.out.printf("La propina calculada es: $%.2f\n", propina);
            System.out.printf("El total a pagar es: $%.2f\n", totalPagar);
            System.out.printf("Monto por persona: $%.2f\n", montoPorPersona);
            System.out.println("========================================");

            System.out.print("¿Quieres calcular nuevamente? (S/N): ");
            repetir = scanner.next().charAt(0);

        } while (repetir == 'S' || repetir == 's');
    }
}
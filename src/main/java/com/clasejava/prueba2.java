package com.clasejava;

import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int dia;
        System.out.println("ingrese un numero del 1 al 5: ");
        dia = teclado.nextInt();
        
        switch (dia) {
            case 1: 
            System.out.println("lunes");    
                break;
            case 2: 
            System.out.println("Martes");
                break;
            case 3: 
            System.out.println("Miercoles");
            break;
            case 4: 
            System.out.println("jueves");
            break;
            case 5: 
            System.out.println("viernes");
            teclado.close();  }
    }
}

package com.clasejava;

import java.util.Scanner;

public class taller11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    String s = teclado.nextLine();

    int start = teclado.nextInt();
    int end = teclado.nextInt();

    String resultado = s.substring(start, end);
    System.out.println(resultado);

    teclado.close();
    }
    
}

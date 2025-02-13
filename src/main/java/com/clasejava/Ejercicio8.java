package com.clasejava;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         String s = "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z. ";
        

        
         s = teclado.nextLine();
        int start = teclado.nextInt();
        int end = teclado.nextInt();

        System.out.println(s.substring(start, end));
        
        teclado.close();
    }
}

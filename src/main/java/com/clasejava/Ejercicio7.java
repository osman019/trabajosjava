package com.clasejava;


import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        Random ramdon = new Random();


int min = 1;
int max = 100;

int numramdon = min + ramdon.nextInt(max - min +1);
System.out.println("Nuemro al azar entre "+ min + " y "+ max+ " es: " + numramdon);


    }
}

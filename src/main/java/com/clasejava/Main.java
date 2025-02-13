package com.clasejava;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        
       /*String texto = "Progamacion en Java";
    
       System.out.println("longitud:" + texto.length());
       System.out.println("caracter en poscicion 5:" + texto.charAt(5));
       System.out.println("subcadena: " + texto.substring(1, 12));
       System.out.println("En minusculas: " + texto.toLowerCase());
       System.out.println("En mayusculas:" + texto.toUpperCase());
       System.out.println("Sin espacios:" + texto.trim());
       System.out.println("Reemplazo: " + texto.replace('a', 'o'));
       System.out.println("¿Empieza con 'Pro'? " +
        texto.trim().startsWith("Pro"));
        System.out.println("¿Contiene 'Java'? " + texto.contains("Java"));*/

        /*String texto = "  Aprender java es divertido y util   ";

        String subcadena1 = texto.substring(11);
        System.out.println("Subcadena 1 :" + subcadena1);

        String subcadena2 = texto.substring(11, 15);
        System.out.println("subcadena2: " + subcadena2
        );

        String textoLimpio = texto.trim(); // Quita espacios iniciales y finales
        String subcadena3 = textoLimpio.substring(0, 8);
        System.out.println("subcadena3: " + subcadena3);*/

        /*String nombre = "Juan";
        int edad = 30;
        String mensaje = String.format("Mi nombre es %s,  y tengo %d años", nombre, edad);
        System.out.println(mensaje);

        String saludo1 = "Hola" + " " + "Mundo";
        System.out.println("Operador + :" + saludo1);*/

       /*  Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro:");
        String libro = teclado.nextLine();

        //////////////////////////////////////////////////////////*/ 
        
        String  caracteres = "f65h16553hb5314f2sf2556132238tf23h52315";
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();


        for (int i=0; i< 10; i++){
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }
        System.out.println("Contrsena generada: " + contrasena.toString());
        
        
    }
}
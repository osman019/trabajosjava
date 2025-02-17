package com.clasejava;
// metodos de sobrecarga
public class prueba9 {
  public static int sumar(int a) {
    return a + 10;
  }



    public static int sumar(int a, int b){
    return a + b;
}

public static void main(String[]args){
    System.out.println("suma con un numero:" + sumar(5));
    System.out.println("suma con dos numeros. "+ sumar(5, 10));
}

   }


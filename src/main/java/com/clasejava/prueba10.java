package com.clasejava;

import java.util.Optional;

public class prueba10 {
    public static void saludar(Optional <String> nombre){
        System.out.println("hola,"+ nombre.orElse("invitado") + "!");
    }

public static void main(String[] args){
    saludar(Optional.of("spock"));
    saludar(Optional.empty());
}
    }


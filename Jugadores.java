package com.mycompany.jugadores;

public class Jugadores {

    public static void main(String[] args) {

        // Jugador 1
        String nombre1 = "Sergio";
        String apellido1 = "Rochet";
        int numero1 = 1;

        // Jugador 2
        String nombre2 = "Jose Maria";
        String apellido2 = "Gimenez";
        int numero2 = 2;

        // Jugador 3
        String nombre3 = "Ronald";
        String apellido3 = "Araujo";
        int numero3 = 3;

        // Jugador 4
        String nombre4 = "Matias";
        String apellido4 = "Olivera";
        int numero4 = 4;

        // Jugador 5
        String nombre5 = "Manuel";
        String apellido5 = "Ugarte";
        int numero5 = 5;

        // Mostrar jugadores
        System.out.println(nombre1 + " " + apellido1 + " - Camiseta " + numero1);
        System.out.println(nombre2 + " " + apellido2 + " - Camiseta " + numero2);
        System.out.println(nombre3 + " " + apellido3 + " - Camiseta " + numero3);
        System.out.println(nombre4 + " " + apellido4 + " - Camiseta " + numero4);
        System.out.println(nombre5 + " " + apellido5 + " - Camiseta " + numero5);

        // Suma de camisetas
        int suma = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.println();
        System.out.println("Suma de los numeros de camiseta: " + suma);
    }
}
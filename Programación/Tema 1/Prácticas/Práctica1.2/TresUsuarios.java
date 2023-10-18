/**
 * TresUsuarios.java
 * Programa que lee e imprime los datos de tres personas.
 * ajp - 2018.09.19, modificado por Javier Muñoz Solano 25.9.2023
 */

import java.util.Scanner;

public class TresUsuarios {
    public static void main(String[] args) {

        /* teclado es un canal de entrada por teclado a través de un Scanner.
           Necesita importar el paquete java.util
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Persona 1 - Introduce tu nombre: ");
        String nombre1 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 1 - Introduce tus apellidos: ");
        String apellidos1 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 1 - Introduce tu NIF: ");
        String nif1 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 1 - Introduce tu dirección postal: ");
        String direccion1 = teclado.nextLine();		// Variable texto.

        System.out.print("\nPersona 2 - Introduce tu nombre: ");
        String nombre2 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 2 - Introduce tus apellidos: ");
        String apellidos2 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 2 - Introduce tu NIF: ");
        String nif2 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 2 - Introduce tu dirección postal: ");
        String direccion2 = teclado.nextLine();		// Variable texto.
        
        System.out.print("\nPersona 3 - Introduce tu nombre: ");
        String nombre3 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 3 - Introduce tus apellidos: ");
        String apellidos3 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 3 - Introduce tu NIF: ");
        String nif3 = teclado.nextLine();		// Variable texto.
        System.out.print("Persona 3 - Introduce tu dirección postal: ");
        String direccion3 = teclado.nextLine();		// Variable texto.

        System.out.println("\nPersona 3: " + nombre3 + " " + apellidos3 + ", " + nif3 + ", " + direccion3);
        System.out.println("Persona 2: " + nombre2 + " " + apellidos2 + ", " + nif2 + ", " + direccion2);
        System.out.println("Persona 1: " + nombre1 + " " + apellidos1 + ", " + nif1 + ", " + direccion1);

        teclado.close();

    }
}
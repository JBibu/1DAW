/**
* MayorDeTres.java
* Programa simple que compara 3 números introducidos.
* ajp - 2018.09.19, modificado por Javier Muñoz Solano 25.9.2023
*/

import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {

        /* teclado es un canal de entrada por teclado a través de un Scanner.
           Necesita importar el paquete java.util
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce número 1: ");
        String numtext1 = teclado.nextLine();		// Variable texto.

        System.out.print("Introduce número 2: ");
        String numtext2 = teclado.nextLine();		// Variable texto.

        System.out.print("Introduce número 3: ");
        String numtext3 = teclado.nextLine();		// Variable texto.

        int num1 = Integer.parseInt(numtext1);
        int num2 = Integer.parseInt(numtext2);
        int num3 = Integer.parseInt(numtext3);

       if (num1 > num2 && num1 > num3) {
           System.out.println("El número " + num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es el mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número " + num3 + " es el mayor");
        } else {
            System.out.println("Los números son iguales");
        }
           
        teclado.close();

    }
} 
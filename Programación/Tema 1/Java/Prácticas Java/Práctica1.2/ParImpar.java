/**
 * ParImpar.java
 * Programa simple que dice si el número es par o impar.
 * ajp - 2018.09.19, modificado por Javier Muñoz Solano 25.9.2023
 */

 import java.util.Scanner;

 public class ParImpar {
     public static void main(String[] args) {

         /* teclado es un canal de entrada por teclado a través de un Scanner.
            Necesita importar el paquete java.util
          */
         Scanner teclado = new Scanner(System.in);

         System.out.print("Introduce número 1: ");
         String numtext1 = teclado.nextLine();		// Variable texto.

         int num1 = Integer.parseInt(numtext1);

        if (num1 % 2 == 0) {    // Si el resto de dividir el número entre 2 es 0, es par.
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
            
         teclado.close();

     }
 }
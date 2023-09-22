/**
 * Nombre1.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * ajp - 2018.09.19, modificado por Javier Muñoz Solano 22.9.2023
 */

 import java.util.Scanner;

 public class Nombre1 {
     public static void main(String[] args) {

         /* teclado es un canal de entrada por teclado a través de un Scanner.
            Necesita importar el paquete java.util
          */
         Scanner teclado = new Scanner(System.in);

         System.out.print("Introduce el nombre de la persona 1: ");
         String nombre1 = teclado.nextLine();		// Variable de texto. 

         System.out.print("Introduce la edad de la persona 1: ");
         int edad1 = teclado.nextInt();		// Variable de texto. 

         teclado.nextLine();    // nextLine() para limpiar el buffer

         System.out.print("Introduce el nombre de la persona 2: ");
         String nombre2 = teclado.nextLine();		// Variable de texto. 

         System.out.print("Introduce la edad de la persona 2: ");
         int edad2 = teclado.nextInt();		// Variable de texto. 

         System.out.println(nombre1 + " tiene " + edad1);
         System.out.println(nombre2 + " tiene " + edad2);

         teclado.close();

     }
 }
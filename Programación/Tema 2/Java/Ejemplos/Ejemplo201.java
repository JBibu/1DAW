package Ejemplos;
import java.util.Scanner;

public class Ejemplo201 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce la edad de una persona: ");
    int edad = teclado.nextInt();

    String mayor = (edad >= 18) ? "Sí" : "No";
    System.out.println("¿Es mayor de edad? " + mayor);

    teclado.close();
    System.out.print("Fin del programa.");
    
  }
}
package Ejemplos;
import java.util.Scanner;

public class Ejemplo206 {
    public static void main(String[] args){

        System.out.print("Introduce el tamaño del array: ");
        Scanner entrada = new Scanner(System.in);
        int tamano = entrada.nextInt();

        int[] numeros = new int[tamano];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Introduce un número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nFin del programa");
    }
}

package Ejemplos;
import java.util.Scanner;

public class Ejemplo205 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Introduce un número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        entrada.close();

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
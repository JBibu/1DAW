package Ejemplos;
import java.util.Scanner;

public class Ejemplo204 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un texto: ");
        String texto = entrada.nextLine();

        System.out.println("Caracteres: " + texto.length());
        for (int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
        }

        entrada.close();

        int[] numeros = {5,2,322,4,6,33,666,9,10};

        System.out.println("Cantidad de números: " + numeros.length);
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }
}
package Ejemplos;
import java.util.Scanner;

public class Ejemplo203 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el final del bucle: ");
        int fin = teclado.nextInt();

        for (int i = 0; i <= fin; i += 2) {
            System.out.println(i);
        }

        teclado.close();

    }    
}
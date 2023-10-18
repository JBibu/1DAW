import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args){
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = entrada.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = entrada.nextInt();

        entrada.close();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.println("Los números ordenados son: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

    }
}
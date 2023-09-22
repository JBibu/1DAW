import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        int resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación de los dos números es: " + resultado);

        teclado.close();

    }
}
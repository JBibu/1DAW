import java.util.Scanner;

public class Ejemplo05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número con decimales: ");
        double numero = teclado.nextDouble();

        System.out.print("Introduce una base: ");
        int base = teclado.nextInt();
        System.out.println("Introdue un exponente: ");
        int exponente = teclado.nextInt();

        System.out.println("El resultado en ceil es: " + Math.ceil(numero));
        System.out.println("El resultado en floor es: " + Math.floor(numero));

        System.out.println("El resultado de la potencia es: " + Math.pow(base, exponente));

        System.out.println("El resultado de la raíz cuadrada es: " + Math.sqrt(numero));

        teclado.close();
    }
}
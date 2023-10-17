import java.util.Scanner;

public class EjemploPráctico201 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo mayor que 0: ");
        int numero = entrada.nextInt();

        entrada.close();

        if (numero <= 0) {
            System.out.println("El número introducido es inválido.");
            return;
        }

        System.out.println("Números impares:");
        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }

        System.out.println("Números pares:");
        for (int i = 2; i <= numero; i += 2) {
            System.out.println(i);
        }
        
    }
}

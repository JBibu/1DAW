import java.util.Scanner;

public class Ejercicio002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el valor inicial del intervalo: ");
        int valorInicial = entrada.nextInt();

        System.out.print("Introduce el valor final del intervalo: ");
        int valorFinal = entrada.nextInt();

        entrada.close();

        for (int i = valorInicial; i <= valorFinal; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
        
    }
}

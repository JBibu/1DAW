import java.util.Scanner;

public class Ejemplo214 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int[] numeros = {6, 4, 5, 9, 1, 7, 3, 8, 2};

        int mayor = numeros[0];
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nGráfico de barras:");

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros[i]; j++) {
                System.out.print("体");
            }
            System.out.println();
        }

        for(int i = 0; i < numeros.length; i++) {
            for(int j = i; j < numeros.length; j++){
                if(numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.println();

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nGráfico de barras:");

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros[i]; j++) {
                System.out.print("体");
            }
            System.out.println();
        }

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < mayor - numeros[i]; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < numeros[i]; j++) {
                System.out.print("体");
            }
            System.out.println();
        }

        teclado.close();

    }
}

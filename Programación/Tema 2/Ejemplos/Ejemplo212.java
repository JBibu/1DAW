import java.util.Scanner;

public class Ejemplo212 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        int[] numeros = {6, 4, 5, 9, 1, 7, 3, 8, 2};

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for(int i = 1; i < numeros.length; i++) {
            for(int j = 0; j < numeros.length - i; j++){
                if(numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        teclado.close();

    }
}
import java.util.Scanner;

public class Ejemplo213 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int[] numeros = {6, 4, 5, 9, 1, 7, 3, 8, 2};

        for(int i = 0; i < numeros.length; i++) {
            for(int j = i; j < numeros.length; j++){
                if(numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
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
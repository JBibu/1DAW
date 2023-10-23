import java.util.Scanner;

public class EjemploPráctico301 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Introduce número "+(i+1)+": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Introduce un número para comprobar si está en la array:");
        int numero = entrada.nextInt();
        
        entrada.close();

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == numero){
                System.out.print("El número "+numero+" está en la posición "+i+"\n");
            }
        }

    }
}
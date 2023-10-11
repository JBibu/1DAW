
import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int suma = 0;
        int contador = 0;

        do{
            System.out.print("Introduce un número: ");
            numero = entrada.nextInt();
            suma += numero;
            contador++;
        }while(numero > 0);

        entrada.close();
        
        System.out.println("La media de los números introducidos es: " + suma);
        System.out.println("La media de los números introducidos es: " + (double)suma/(contador-1));
        
    }
}
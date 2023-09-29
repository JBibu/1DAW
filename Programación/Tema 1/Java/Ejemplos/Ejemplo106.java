import java.util.Scanner;

public class Ejemplo106 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        }

        teclado.close();
        
    }
}
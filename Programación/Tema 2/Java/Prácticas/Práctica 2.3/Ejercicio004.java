import java.util.Scanner;
import java.lang.Math;


public class Ejercicio004 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroIntroducido = 0;
        
        while (numeroIntroducido != numAleatorio) {
            System.out.print("Introduce un número entre 1 y 100: ");
            numeroIntroducido = entrada.nextInt();
            intentos++;
            
            if (numeroIntroducido < numAleatorio) {
                System.out.println("El número oculto es mayor.");
            } else if (numeroIntroducido > numAleatorio) {
                System.out.println("El número oculto es menor.");
            }
        }
        
        System.out.println("CORRECTO, El número oculto era " + numAleatorio + ".");
        System.out.println("Has necesitado " + intentos + " intentos.");

        entrada.close();
    }
}
import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        
        // Objeto tipo Scanner para
        // leer por teclado en la consola
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Introduce un nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("El nombre " + nombre);

        teclado.close();

    }
}
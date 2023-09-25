import java.util.Scanner;

public class ComprobarEdad {
    public static void main(String[] args) {

        /* teclado es un canal de entrada por teclado a través de un Scanner.
           Necesita importar el paquete java.util
         */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        String edadtext = teclado.nextLine();		// Variable texto.
        int edad = Integer.parseInt(edadtext);

        if (edad < 0 || edad > 120) {   // Si la edad es menor que 0 o mayor que 120, no es válida.
            System.out.println("La edad introducida no es válida");
        } else if (edad < 18) {        // Si la edad es menor que 18, es menor de edad.
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad < 65) {   // Si la edad es mayor o igual que 18 y menor que 65, es adulto en edad de trabajar.
            System.out.println("Eres adulto en edad de trabajar");
        } else {   // Si la edad es mayor o igual que 65, es jubilado.
            System.out.println("Eres jubilado");
        }

        teclado.close();

    }
}
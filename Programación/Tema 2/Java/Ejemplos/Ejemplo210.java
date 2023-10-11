import java.util.Scanner;

public class Ejemplo210 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        String respuesta = "s";

        while (respuesta.equals("s")) {
            contador++;
            System.out.println("Vuelta " + contador);
            System.out.print("¿Quieres seguir pulsando la s?: ");
            respuesta = teclado.nextLine();
        }
        
        teclado.close();

        System.out.println("Has pulsado " + contador + " veces la s");

    }
}


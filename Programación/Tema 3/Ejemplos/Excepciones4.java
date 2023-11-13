import java.util.Scanner;

public class Excepciones4 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Inicio del programa");

        int numero = pedirInt("Introduce un numero: ");

        System.out.println("El numero introducido es: " + numero);
        
        System.out.println("Fin del programa");
    }

    public static int pedirInt (String enunciado){
        int numero;

        while (true){
            System.out.print(enunciado);
        
            try {    
                numero = Integer.parseInt(teclado.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("El valor introducido no es un numero");
            }
        }

        return numero;
    }
}
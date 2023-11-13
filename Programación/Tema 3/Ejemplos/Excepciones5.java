import java.util.Scanner;

public class Excepciones5 {

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Inicio del programa");

        int numero1 = pedirint("Introduce el primer numero: ");
        int numero2 = pedirint("Introduce el segundo numero: ");

        mostrarDivision (numero1, numero2);
        
        System.out.println("Fin del programa");
    }

    public static void mostrarDivision(int numero1, int numero2){
        try {
            System.out.println(numero1 + "/" + numero2 + " = " + (numero1/numero2));
        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println("Fin de la operacion");
        }
    }

    public static int pedirint (String enunciado){
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
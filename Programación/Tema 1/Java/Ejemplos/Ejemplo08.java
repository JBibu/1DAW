import java.util.Scanner;

public class Ejemplo08 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Operaciones:\n+ --> Suma\n- --> Resta\n* --> Multiplicación\n/ --> División\nElige una opción: ");
        char opcion = entrada.next().charAt(0);

        System.out.print("Introduce el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = entrada.nextDouble();

        switch (opcion){
            case '+':
                System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                break;
            case '-':
                System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                break;
            case '*':
                System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                break;
            case '/':
                System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                break;
            default:
                System.out.println("Opción incorrecta.");
        }

        entrada.close();
        System.out.println("Fin del programa");

    }
}
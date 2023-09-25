import java.util.Scanner;

public class EjemploPráctico03 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.print("Elige una operación (+, -, x, /): ");
        char operacion = teclado.next().charAt(0);

        if(operacion == '+'){
            System.out.print("El resultado de la suma es: " + (num1 + num2));
        } else if(operacion == '-'){
            System.out.print("El resultado de la resta es: " + (num1 - num2));
        } else if(operacion == 'x' || operacion == 'X'){
            System.out.print("El resultado de la multiplicación es: " + (num1 * num2));
        } else if(operacion == '/'){
            System.out.print("El resultado de la división es: " + (num1 / num2));
        } else {
            System.out.print("Operación no válida");
        }

        System.out.println("Fin del programa.");

        teclado.close();

    }
}
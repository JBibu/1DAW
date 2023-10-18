import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
         
        Scanner entrada = new Scanner(System.in);

        while (true){

            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Terminar");
            System.out.print("Introduce una opción: ");
            int opcion = entrada.nextInt();

            if (opcion == 1){
                System.out.print("Introduce un número: ");
                int num1 = entrada.nextInt();
                System.out.print("Introduce otro número: ");
                int num2 = entrada.nextInt();
                System.out.println("La suma de los números es: " + (num1 + num2));
            } else if (opcion == 2){
                System.out.print("Introduce un número: ");
                int num1 = entrada.nextInt();
                System.out.print("Introduce otro número: ");
                int num2 = entrada.nextInt();
                System.out.println("La resta de los números es: " + (num1 - num2));
            } else if (opcion == 3){
                System.out.print("Introduce un número: ");
                int num1 = entrada.nextInt();
                System.out.print("Introduce otro número: ");
                int num2 = entrada.nextInt();
                System.out.println("La multiplicación de los números es: " + (num1 * num2));
            } else if (opcion == 4){
                System.out.print("Introduce un número: ");
                int num1 = entrada.nextInt();
                System.out.print("Introduce otro número: ");
                int num2 = entrada.nextInt();
                System.out.println("La división de los números es: " + (num1 / num2));
            } else if (opcion == 5){
                break;
            } else {
                System.out.println("Opción incorrecta.");
            }
            
        }

        entrada.close();

    }
}

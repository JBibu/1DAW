import java.util.Scanner;

public class Menu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Opción 1\n2. Opción 2\n3. Opción 3\n4. Opción 4");
        System.out.print("\nElige una opción: ");
        int opcion = entrada.nextInt();

        entrada.close();

        if (opcion == 1) {
            System.out.println("Has elegido la opción 1");
        } else if (opcion == 2) {
            System.out.println("Has elegido la opción 2");
        } else if (opcion == 3) {
            System.out.println("Has elegido la opción 3");
        } else if (opcion == 4) {
            System.out.println("Has elegido la opción 4");
        } else {
            System.out.println("Opción no válida");
        }
        
    }
}
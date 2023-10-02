import java.util.Scanner;

public class Menu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Opción 1\n2. Opción 2\n3. Opción 3\n4. Opción 4");
        System.out.print("\nElige una opción: ");
        int opcion = entrada.nextInt();

        entrada.close();

        System.out.println("\nHas elegido la opción " + opcion);

    }
}

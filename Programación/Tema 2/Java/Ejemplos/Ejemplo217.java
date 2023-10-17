import java.util.Scanner;

public class Ejemplo217 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        double nota;

        do {
            do {
                System.out.print("Introduce una nota: ");
                nota = entrada.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota no es válida.");
                }
            } while (nota < 0 || nota > 10);

            System.out.println("La nota es válida.");

        if (nota < 5) {
            System.out.println("Insuficiente.");
        } else if (nota < 6) {
            System.out.println("Suficiente.");
        } else if (nota < 7) {
            System.out.println("Bien.");
        } else if (nota < 9) {
            System.out.println("Notable.");
        } else {
            System.out.println("Sobresaliente.");
        }

        // Que admita solo n o s

        do {
            System.out.print("¿Quieres introducir otra nota? (s/n): ");
            continuar = entrada.nextLine();

    }
}

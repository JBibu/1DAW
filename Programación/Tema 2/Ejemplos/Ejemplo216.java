import java.util.Scanner;

public class Ejemplo216 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Pedir 5 textos
        String[] textos = new String[5];
        for (int i = 0; i < textos.length; i++) {
            System.out.print("Introduce un texto: ");
            textos[i] = entrada.nextLine();
        }

        // Ordenación burbuja con compareToIgnoreCase
        for (int i = 1; i < textos.length; i++) {
            for (int j = 0; j < textos.length - i; j++) {
                if (textos[j].compareToIgnoreCase(textos[j + 1]) > 0) {
                    String aux = textos[j];
                    textos[j] = textos[j + 1];
                    textos[j + 1] = aux;
                }
            }
        }
        
        // Print textos
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);
        }

    }
}

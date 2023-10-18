import java.util.Scanner;

public class Ejemplo215 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String[] textos = {"Hola me llamo David", "Hola me llamo Raúl", "Buenas me llamo Juan", "Se puede?", "Buenas noches"};
        // Burbuja original
        for (int i = 1; i < textos.length; i++) {
            for (int j = 0; j < textos.length - i; j++) {
                if (textos[j].compareTo(textos[j + 1]) > 0) {
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

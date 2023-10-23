import java.util.Scanner;

public class Ejemplo301 {
    public static void main(String[] args){
        
        // Pedir nombre apellidos y edad
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce tus apellidos: ");
        String apellidos = entrada.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt();

        entrada.close();

        mostrarInfo(nombre, apellidos, edad);

    }

    public static void mostrarInfo(String nombre, String apellidos, int edad){
        // Mostrar por pantalla los valores recibidos
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        
    }
}

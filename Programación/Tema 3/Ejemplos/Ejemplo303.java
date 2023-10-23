import java.util.Scanner;

public class Ejemplo303 {
    public static void main(String[] args){
        
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
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        compruebaEdad(edad);

    }

    public static void compruebaEdad(int edad){
        
        if(edad < 0 || edad > 120){
            System.out.println("(EDAD NO VÁLIDA)");
        }else{
            System.out.println("Edad: " + edad);
        }
        
    }
}
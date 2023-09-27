import java.util.Scanner;

public class EjemploPráctico06 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        // Introducir precio base
        System.out.print("Introduzca el precio base: ");
        double precioBase = teclado.nextDouble();

        // Introducir descuento
        System.out.print("Introduzca el descuento (en porcentaje): ");
        double descuento = teclado.nextDouble();

        // Calcular precio final
        if (precioBase >= 0 && descuento >= 0 && descuento <= 100) {
            double precioFinal = precioBase - (precioBase * descuento / 100);
            System.out.println("El precio final es: " + precioFinal);
        } else {
            System.out.println("Los datos introducidos no son correctos");
        }

        teclado.close();
        
    }
}
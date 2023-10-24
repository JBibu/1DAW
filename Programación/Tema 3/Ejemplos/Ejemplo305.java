import java.util.Scanner;

public class Ejemplo305 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String repetir = "S";
        
        do{
            System.out.print("Introduce número 1: ");
            double a = entrada.nextDouble();
            System.out.print("Introduce número 2: ");
            double b = entrada.nextDouble();
            System.out.print("Introduce número 3: ");
            double c = entrada.nextDouble();
            
            comprobar(a, b, c);
            
            System.out.print("¿Desea repetir el programa? (S/N): ");
            repetir = entrada.next().toUpperCase();
            
            while (!repetir.equals("S") && !repetir.equals("N")) {
                System.out.print("Respuesta inválida. ¿Desea repetir el programa? (S/N): ");
                repetir = entrada.next().toUpperCase();
            }
        }
        while (repetir.equals("S"));
        
        entrada.close();
    }

    public static void comprobar(double a, double b, double c) {
            
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Los números no pueden ser negativos o cero.");
            } else if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Los números no forman un triángulo válido.");
            }
            
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
    }

}
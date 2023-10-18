import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un valor real 1: ");
        double num1 = entrada.nextDouble();
        System.out.print("Introduce un valor real 2: ");
        double num2 = entrada.nextDouble();
        System.out.print("Introduce un valor real 3: ");
        double num3 = entrada.nextDouble();

        entrada.close();

        double a = num1;
        double b = num2;
        double c = num3;

        double disc = Math.pow(b, 2) - 4 * a * c;

        if (disc < 0) {
            System.out.println("La ecuación no tiene soluciones reales.");
        } else if (disc == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una solución real: " + x);
        } else {
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("La ecuación tiene dos soluciones reales: " + x1 + " y " + x2);
        }

    }
}

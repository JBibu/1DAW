import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {
    public static void main(String[] args){
         
        Scanner entrada = new Scanner(System.in);

        while (true){
        System.out.print("Introduce un número con varios decimales: ");
        double num = entrada.nextDouble();
        System.out.print("Introduce a cuantos decimales se quiere redondear: ");
        int decimales = entrada.nextInt();

        double resultado = Math.rint(num * Math.pow(10, decimales)) / Math.pow(10, decimales);

        System.out.println("El número redondeado es: " + resultado);

        System.out.print("Quieres continuar? (s/n): ");
        String continuar = entrada.next();

        if (continuar.equalsIgnoreCase("n")) {
            break;
        }

        entrada.close();

        }
    }
}

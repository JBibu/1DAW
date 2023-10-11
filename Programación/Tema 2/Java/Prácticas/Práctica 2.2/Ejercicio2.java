import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el capital principal inicial: ");
        double capital = entrada.nextDouble();
        System.out.print("Introduce el tipo de interés anual: ");
        double interes = entrada.nextDouble();
        System.out.print("Introduce el número de años: ");
        int años = entrada.nextInt();

        entrada.close();

        System.out.println("Los intereses son: " + capital * interes / 100);

        double capitalFinal = capital * Math.pow((1 + interes / 100), años);

        System.out.println("El capital final es: " + capitalFinal);

    }
}
import java.util.Scanner;

public class EjemploPráctico107 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una opción: \n1 - Celsius a Fahrenheit \n2 - Fahrenheit a Celsius \n3 - Kilómetros a millas \n4 - Millas a kilómetros \n\nElige una opción: ");
        int opcion = teclado.nextInt();

        if (opcion == 1){
            System.out.print("Introduce los grados Celsius: ");
            double celsius = teclado.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
        } else if (opcion == 2){
            System.out.print("Introduce los grados Fahrenheit: ");
            double fahrenheit = teclado.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius.");
        } else if (opcion == 3){
            System.out.print("Introduce los kilómetros: ");
            double kilometros = teclado.nextDouble();
            double millas = kilometros / 1.609;
            System.out.println(kilometros + " kilómetros son " + millas + " millas.");
        } else if (opcion == 4){
            System.out.print("Introduce las millas: ");
            double millas = teclado.nextDouble();
            double kilometros = millas * 1.609;
            System.out.println(millas + " millas son " + kilometros + " kilómetros.");
        } else {
            System.out.println("Opción incorrecta.");
        }

        teclado.close();

    }
}

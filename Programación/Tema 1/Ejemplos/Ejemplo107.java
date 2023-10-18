import java.util.Scanner;

public class Ejemplo107 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número del 0 al 10: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        int numero2 = teclado.nextInt();

        // Que el número sea mayor o igual que 0 y menor o igual que 10
        if(numero1 >= 0 && numero1 <= 10){
            System.out.print("El número es válido!");
        } else {
            System.out.print("El número NO es válido");
        }

        if(numero1 > numero2){
            System.out.print("El primer número es mayor que el segundo");
        } else if(numero1 < numero2){
            System.out.print("El primer número es menor que el segundo");
        } else {
            System.out.print("Los números son iguales");
        }

        teclado.close();
        System.out.print("Fin del programa");
    }
}

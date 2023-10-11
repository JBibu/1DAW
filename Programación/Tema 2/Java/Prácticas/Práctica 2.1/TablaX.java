import java.util.Scanner;

public class TablaX {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
        int numero = entrada.nextInt();

        entrada.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

    }
}
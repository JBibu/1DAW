import java.util.Scanner;

public class Ejemplo211 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suma = 0;

        while (suma < 25) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduce numero "+(i+1)+": ");
                int num = teclado.nextInt();
                suma += num;
            }
            if (suma < 25) {
                System.out.println("La suma es menor que 25, vuelve a introducir los numeros.");
            }
        }
        
        teclado.close();

        System.out.println("La suma es mayor o igual que 25.");

    }
}

import java.util.Scanner;

public class Ejemplo209 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.print("Introduce un número: ");
        int num = input.nextInt();
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }

        input.close();

    }
}
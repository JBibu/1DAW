import java.util.Scanner;

public class Ejemplo208 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Indica cantidad de líneas: ");
        int lineas = input.nextInt();

        input.close();

        for (int i = lineas; i > 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("体 ");
            }
            System.out.println();
        
        }
    }
}
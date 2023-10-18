import java.util.Scanner;

public class EjemploPráctico101 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int year = teclado.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.print("El año es bisiesto");
        } else {
            System.out.print("El año NO es bisiesto");
        }

        teclado.close();

    }
}

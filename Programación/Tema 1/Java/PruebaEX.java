import java.util.Scanner;

public class PruebaEX {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce mes del año: ");
        int mes = entrada.nextInt();
        
        entrada.close();

        switch (mes) {
            case 2:
                System.out.println("El mes tiene 28 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes tiene 30 días");
                break;
            default:
                System.out.println("El mes tiene 31 días");
        }

        if (mes == 2) {
            System.out.println("El mes tiene 28 días");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 días");
        } else {
            System.out.println("El mes tiene 31 días");
        }
    }
}
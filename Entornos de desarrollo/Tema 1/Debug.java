import java.util.Scanner;

public class Debug{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String texto = entrada.nextLine();

        System.out.print("Introduce número entero 1: ");
        int num1 = entrada.nextInt();
        System.out.print("Introduce número entero 2: ");
        int num2 = entrada.nextInt();
        System.out.print("Introduce número entero 3: ");
        int num3 = entrada.nextInt();

        System.out.print("Introduce número con decimales: ");
        double numd = entrada.nextDouble();

        entrada.close();

        if(num1 < 0){
            num1 = Math.abs(num1);
        }if(num2 < 0){
            num2 = Math.abs(num2);
        }if(num3 < 0){
            num3 = Math.abs(num3);
        }

        int resultado = num2 * num3 + num1;
        int arriba = (int)Math.ceil(numd);
        int abajo = (int)Math.floor(numd);

        System.out.println("El texto introducido es: " + texto);
        System.out.println("El resultado de la operación " + num2 + " x " + num3 + " + " + num1 + " es: " + resultado);
        System.out.println("El número entero más próximo por arriba es: " + arriba);
        System.out.println("El número entero más próximo por abajo es: " + abajo);

    }
}
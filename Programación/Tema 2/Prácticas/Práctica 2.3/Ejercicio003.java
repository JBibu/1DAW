import java.util.Scanner;

public class Ejercicio003 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el número de término que quieres calcular: ");
        int num1 = entrada.nextInt();

        entrada.close();

        if (num1 < 0){
            System.out.printf("El número tiene que ser positivo o cero ");
        } else if (num1 == 0){
            System.out.printf("El término "+num1+" de la sucesión de Fibonacci es 0\n");
        } else if (num1 == 1){
            System.out.printf("El término "+num1+" de la sucesión de Fibonacci es 1\n");
        } else {
            int a = 0;
            int b = 1;
            int resultado = 0;
            
            for (int i = 1; i < num1; i++){
                resultado = a + b;
                a = b;
                b = resultado;
            }
            System.out.printf("El término "+num1+" de la sucesión de Fibonacci es "+resultado+"\n");
        }
    }
}

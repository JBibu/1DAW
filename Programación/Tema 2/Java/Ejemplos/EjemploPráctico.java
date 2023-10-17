import java.util.Scanner;

public class EjemploPráctico {
    public static void main(String []args){

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = teclado.nextInt();
        int digitos = 1;

        teclado.close();

        while(true){
            num=num/10;
            if(Math.abs(num) > 0){
                digitos++;
            }else{
                break;
            }
        }
        
        System.out.println("Tiene "+digitos+" dígitos");

    }
}

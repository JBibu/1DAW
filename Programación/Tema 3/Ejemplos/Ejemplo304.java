import java.util.Scanner;

public class Ejemplo304 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el lado del cuadrado: ");
        int lado = entrada.nextInt();

        entrada.close();

        mostrarCuadrado(lado);

    }

    public static void mostrarCuadrado(int lado){
        
        if(lado < 0){
            System.out.println("El lado no puede ser negativo");
            return;
        }

        for(int i = 0; i < lado; i++){
            for(int j = 0; j < lado; j++){
                if(i == 0 || i == lado - 1 || j == 0 || j == lado - 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

}

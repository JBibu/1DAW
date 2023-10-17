public class Ejercicio8 {
    public static void main(String[] args){
         
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = entrada.nextInt();

        entrada.close();

        for (int i = 0; i < tamaño; i++) {
            if (i == 0 || i == tamaño - 1) {
                for (int j = 0; j < tamaño; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < tamaño; j++) {
                    if (j == 0 || j == tamaño - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            
            System.out.println();
            
        }
        
    }
}

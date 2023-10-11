public class Ejercicio9 {
    public static void main(String[] args){
         
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int num = entrada.nextInt();

        entrada.close();
            
        if (num < 0) {
            System.out.println("El número introducido no es positivo.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);

        }
    }
}

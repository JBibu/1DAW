public class Ejercicio3 {
    public static void main(String[] args){
     
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        
        int suma = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce un número: ");
            int num = entrada.nextInt();
            suma += num;
        }

        entrada.close();

        System.out.println("La suma de los números es: " + suma);

    }
}

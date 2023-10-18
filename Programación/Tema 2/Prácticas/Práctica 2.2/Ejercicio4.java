public class Ejercicio4 {
    public static void main(String[] args){
         
            java.util.Scanner entrada = new java.util.Scanner(System.in);
            
            int mayor = 0;

            while (true) {
                System.out.print("Introduce un número: ");
                int num = entrada.nextInt();
                if (num > mayor) {
                    mayor = num;
                }
                System.out.print("Quieres continuar? (s/n): ");
                String continuar = entrada.next();
                if (continuar.equalsIgnoreCase("n")) {
                    break;
                }
            }

            entrada.close();

            System.out.println("El mayor de los números es: " + mayor);
            
    }
}

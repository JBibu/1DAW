import java.util.Scanner;

public class Java2 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce Java de la forma que quieras: ");
        String java = entrada.nextLine(); 
        
        entrada.close();

        if (java.trim().equalsIgnoreCase("java")) {
            System.out.println("Has escrito Java");
        } else {
            System.out.println("No has escrito Java melón");
        }

    }
}
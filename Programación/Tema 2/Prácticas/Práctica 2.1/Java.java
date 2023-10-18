import java.util.Scanner;

public class Java {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce \"Java\" con la mayúscula o muere: ");
        String java = entrada.nextLine(); 
        
        entrada.close();

        if (java.equals("Java")) {
            System.out.println("Has escrito Java");
        } else {
            System.out.println("No has escrito Java melón");
        }

    }
}
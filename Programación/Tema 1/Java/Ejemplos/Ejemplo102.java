public class Ejemplo102 {
  public static void main(String[] args) {

    // Crear 3 variables numéricas, que el programa las pida por teclado
    System.out.print("Introduce el número 1: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el número 2: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el número 3: ");
    int num3 = Integer.parseInt(System.console().readLine());

    // Sumar las 3 variables y mostrar el resultado
    int suma = num1 + num2 + num3;
    System.out.println("La suma de los 3 números es: " + suma);

    // Jijijiji
    byte b = 127;
    b++;  // b = b + 1;
    System.out.println(b);
    
  }
}
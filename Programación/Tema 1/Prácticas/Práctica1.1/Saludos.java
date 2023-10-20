/**
 * Saludos.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * ajp - 2018.09.19
 */

//import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class Saludos { // Identificador de clase pública
	public static void main(String[] args) { // Comienzo del programa
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		//Scanner teclado = new Scanner(System.in); // Crea un objeto Scanner

		int numOrden;			// Variable numérica tipo entero.
		//String nombre = "";		// Variable de texto tipo String. 

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;
		System.out.println("Hola,"); // Salto de línea al acabar.
		System.out.print("Soy un modesto "); // No salta de línea.
		System.out.print("programa de ordenador...\n"); // Salto de línea con \n.
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nº " + numOrden); // Salto de línea al acabar.
		numOrden++; // Incrementa el valor de numOrden en 1.
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden); // Salto de línea al acabar.
		System.out.println("\nFin programa...");  // Salto de línea antes y después.
	}
}

/**
 *  Se importa la clase Scanner para recibir entrada del usuario.
 *  Se declara la clase Saludos como pública.
 *  Se empieza el programa con main.
 *  Se crea un objeto Scanner llamado teclado.
 *  Se declaran las variables numOrden y nombre (inicializada pero sin nada).
 *  Se le asigna el valor 1 a numOrden.
 *  El programa muestra varios mensajes de bienvenida en la consola
 *  La primera línea muestra "Hola," y salta de línea.
 *  La segunda muestra "Soy un modesto " y no salta de línea.
 *  La tercera muestra "programa de ordenador..." y salta de línea (con \n).
 *  La cuarta muestra "Bienvenido al Curso." Una tabulación, concatenado con "Este es el saludo nº " y el valor de numOrden. Salta de línea.
 *  Se incrementa el valor de numOrden en 1.
 *  La quinta muestra "Bienvenido a Java." Una tabulación, concatenado con "Este es el saludo nº " y el valor de numOrden incrementado. Salta de línea.
 *  La sexta muestra "\nFin programa..." con un salto de línea antes y otro después.
 * 
 *  El programa sacaría por pantalla:
 *  Hola,
 *	Soy un modesto programa de ordenador...
 *	Bienvenido al Curso.	Este es el saludo nº 1
 *	Bienvenido a Java.	Este es el saludo nº 2
 *
 *	Fin programa...
 *
 *  Identificadores: numOrden, nombre, teclado, args.
 *  Constantes literales: "Hola,", "Soy un modesto ", "programa de ordenador...\n", "Bienvenido al Curso.\t", "Este es el saludo nº ", "Bienvenido a Java.\t", "\nFin programa...".
 *  Datos primitivos: int (numOrden).
 */
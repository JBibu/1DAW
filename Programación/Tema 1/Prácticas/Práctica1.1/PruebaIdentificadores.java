/**
 * PruebaIdentificadores.java
 * Programa de ejemplo para probar identificadores.
 * Javier Muñoz - 2023.9.20
 */

public class PruebaIdentificadores {
    public static void main(String[] args) {
  
        int _alpha;         // Válido
        float FLOAT;        // Válido (porque está en mayúsculas)
        // int 1_de_muchos;    // Inválido: No puede comenzar con un número
        int maxValor;       // Válido
        int cuantos;        // Válido
        // String "dado";      // Invalido: No se puede usar comillas
        int Nbytes;         // Válido
        // String pink.panter; // Inválido: El punto no está permitido
        // int int;            // Inválido: Es una palabra reservada
        // int qué_dices?;     // Inválido: No se permiten signos de interrogación
        int Número;         // Válido aunque lleva acento
        // int cadena 2;       // Inválido: No se permiten espacios
        int Cañón;          // Válido aunque lleve acento
        int café;           // Válido aunque lleve acento
        // int Mesa-3;         // Inválido: No se permiten guiones
        int Return;         // Válido (porque está en mayúsculas)
        int While;          // Válido (porque está en mayúsculas)
        int __if;           // Válido
        // int Bloque#4;       // Inválido: No se permite el carácter especial "#"
        // int c o s a;        // Inválido: No se permiten espacios
        int _CaPrIcHoSo_;   // Valido
        // int 8ªRoca;         // Inválido: No se permite el carácter especial "ª"
        // int 3d2;            // Inválido: No es un número entero
        // int Hoja3/5;        // Inválido: No se permite el carácter especial  "/" (División)

        // Inicialización de variables
        _alpha = 3;
        FLOAT = 3.1416f;
        maxValor = 99999;
        cuantos = 45;
        Nbytes = 1024;
        Número = 123;
        Cañón = 1;
        café = 2;
        Return = 3;
        While = 4;
        __if = 5;
        _CaPrIcHoSo_ = 6;

        // Impresión de variables
        System.out.println("_alpha = " + _alpha);
        System.out.println("FLOAT = " + FLOAT);
        System.out.println("maxValor = " + maxValor);
        System.out.println("cuantos = " + cuantos);
        System.out.println("Nbytes = " + Nbytes);
        System.out.println("Número = " + Número);
        System.out.println("Cañón = " + Cañón);
        System.out.println("café = " + café);
        System.out.println("Return = " + Return);
        System.out.println("While = " + While);
        System.out.println("__if = " + __if);
        System.out.println("_CaPrIcHoSo_ = " + _CaPrIcHoSo_);
        
    }
}

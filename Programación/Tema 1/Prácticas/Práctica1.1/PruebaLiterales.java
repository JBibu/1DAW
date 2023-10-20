/**
 * PruebaLiterales.java
 * Programa de ejemplo para probar literales.
 * Javier Muñoz - 2023.9.20
 */

public class PruebaLiterales {
    public static void main(String[] args) {
        
        double literal1 = -11.1; // Válido
        double literal2 = -88.28; // Válido
        double literal3 = 0.3e27; // Válido: Notación científica
        // double literal4 = 23e2.3; // Inválido: No se permite un exponente con decimales
        String literal5 = "cañón"; // Válido: Cadena de caracteres
        int literal6 = 0377; // Válido: Número octal
        int literal7 = 9999; // Válido: Número decimal
        // int literal8 = 099; // Inválido: Los números octales no pueden tener dígitos 8 y 9
        double literal9 = +521.6; // Válido: Número decimal con signo positivo (aunque mejor quitarlo)
        double literal10 = 1.26; // Válido: Número decimal
        double literal11 = 5E-002; // Válido: Notación científica
        int literal12 = 0xFE; // Válido: Número hexadecimal
        int literal13 = 0b101010; // Válido: Número binario
        float literal14 = 1.26f; // Válido: Número decimal float
        char literal15 = '\n'; // Válido: Carácter de escape para salto de línea, cuenta como un sólo carácter
        // char literal16 = 'while'; // Inválido: Solo se permite un carácter entre comillas simples
        // char literal17 = '\xFE'; // Inválido: Solo se permite un carácter entre comillas simples
        int literal18 = 1234; // Válido: Número decimal
        double literal19 = .567; // Válido: Equivalente a 0.567
        int literal20 = 0xFFFE; // Válido: Número hexadecimal
        // String literal21 = XGA; // Inválido: XGA no es una constante literal válida
        String literal22 = "a"; // Válido: Cadena de un solo carácter
        // String literal23 = 'abc'; // Inválido: Debe usar comillas dobles para cadenas
        // double literal24 = 02.45; // Inválido: El número no puede comenzar con cero decimal
        char literal25 = 'a'; // Válido
        // String literal26 = xF2E; // Inválido
        int literal27 = 0xf; // Válido: Número hexadecimal
        // String literal28 = abc; // Inválido
        // String literal29 = ab"c; // Inválido
        // String literal30 = "abc; // Inválido
        // String literal31 = "abc'; // Inválido
        // String literal32 = a'; // Inválido
        String literal33 = "abc;"; // Válido
        // String literal34 = "abc'" // Inválido: Para poner la comilla simple al final, se debe usar \'
        String literal35 = "abc\""; // Válido: Cadena de caracteres con comilla doble al final
        String literal36 = "true"; // Válido: Pero no es un valor booleano
        // boolean literal37 = True; // Inválido: "True" no es igual a "true"
        boolean literal38 = false; // Valido
        char literal39 = '\\'; // Válido: Carácter para la barra invertida
        
        // Impresión de variables
        System.out.println("literal1 = " + literal1);
        System.out.println("literal2 = " + literal2);
        System.out.println("literal3 = " + literal3);
        System.out.println("literal5 = " + literal5);
        System.out.println("literal6 = " + literal6);
        System.out.println("literal7 = " + literal7);
        System.out.println("literal9 = " + literal9);
        System.out.println("literal10 = " + literal10);
        System.out.println("literal11 = " + literal11);
        System.out.println("literal12 = " + literal12);
        System.out.println("literal13 = " + literal13);
        System.out.println("literal14 = " + literal14);
        System.out.println("literal15 = " + literal15);
        System.out.println("literal18 = " + literal18);
        System.out.println("literal19 = " + literal19);
        System.out.println("literal20 = " + literal20);
        System.out.println("literal22 = " + literal22);
        System.out.println("literal25 = " + literal25);
        System.out.println("literal27 = " + literal27);
        System.out.println("literal33 = " + literal33);
        System.out.println("literal35 = " + literal35);
        System.out.println("literal36 = " + literal36);
        System.out.println("literal38 = " + literal38);
        System.out.println("literal39 = " + literal39);

    }
}
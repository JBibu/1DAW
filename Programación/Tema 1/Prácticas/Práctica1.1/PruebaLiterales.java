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
        
    }
}
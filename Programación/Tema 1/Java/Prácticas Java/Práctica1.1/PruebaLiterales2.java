/**
 * PruebaLiterales2.java
 * Programa de ejemplo para probar envoltorios.
 * Javier Muñoz - 2023.9.20
 */

public class PruebaLiterales2 {
    public static void main(String[] args) {
        
        Double literal1 = -11.1; // Double valido para negativo y decimal
        Double literal2 = -88.28; // Double valido para negativo y decimal
        Double literal3 = 0.3e27; // Double valido para decimal con notación científica
        String literal5 = "cañón"; // String valido para cadena de caracteres
        Integer literal6 = 0377; // Integer valido para octal
        Integer literal7 = 9999; // Integer valido para entero
        Double literal9 = +521.6; // Double valido para entero con signo positivo
        Double literal10 = 1.26; // Double valido para decimal
        Double literal11 = 5E-002; // Double valido para número con notación científica
        Integer literal12 = 0xFE; // Integer valido para hexadecimal
        Integer literal13 = 0b101010; // Integer valido para binario
        Float literal14 = 1.26f; // Float valido para decimal float
        Character literal15 = '\n'; // Character valido para un char
        Integer literal18 = 1234; // Integer valido para entero
        Double literal19 = .567; // Double valido para decimal
        Integer literal20 = 0xFFFE; // Integer valido para hexadecimal
        String literal22 = "a"; // String valido para char
        Character literal25 = 'a'; // Character valido para char
        Integer literal27 = 0xf; // Integer valido para hexadecimal
        String literal33 = "abc;"; // String valido para cadena de caracteres
        String literal35 = "abc\""; // String valido para cadena de caracteres
        String literal36 = "true"; // String valido para cadena de caracteres
        Boolean literal38 = false; // Boolean valido para booleano
        Character literal39 = '\\'; // Character valido para un char

        // El resto de literales no son validos para los tipos de datos envoltorios, aunque
        // se pueden declarar como String

        // No sé hacer bucles

        System.out.println("literal1: " + literal1);
        System.out.println("literal2: " + literal2);
        System.out.println("literal3: " + literal3);
        System.out.println("literal5: " + literal5);
        System.out.println("literal6: " + literal6);
        System.out.println("literal7: " + literal7);
        System.out.println("literal9: " + literal9);
        System.out.println("literal10: " + literal10);
        System.out.println("literal11: " + literal11);
        System.out.println("literal12: " + literal12);
        System.out.println("literal13: " + literal13);
        System.out.println("literal14: " + literal14);
        System.out.println("literal15: " + literal15);
        System.out.println("literal18: " + literal18);
        System.out.println("literal19: " + literal19);
        System.out.println("literal20: " + literal20);
        System.out.println("literal22: " + literal22);
        System.out.println("literal25: " + literal25);
        System.out.println("literal27: " + literal27);
        System.out.println("literal33: " + literal33);
        System.out.println("literal35: " + literal35);
        System.out.println("literal36: " + literal36);
        System.out.println("literal38: " + literal38);
        System.out.println("literal39: " + literal39);

    }
}
// Se incluye la librería "stdio.h"
#include <stdio.h>

int main(){

    // Hacer print de "Hello world!"
    printf("Hello world!\n\n");
    
    // Declarar una variable tipo entero (int) que se va a llamar "num"
    int num;

    // Para asignar valores a una variable se hace de la siguiente manera:
    // nombre_de_la_variable = valor;

    // Pedir al usuario que meta un número (%d significa que es un entero de tipo decimal)
    printf("Mete un número: ");
    scanf("%d", &num);

    // Hacer print del número que ha metido el usuario
    printf("El número es %d\n", num);

    // return 0 significa que el programa ha terminado correctamente
    return 0;

}
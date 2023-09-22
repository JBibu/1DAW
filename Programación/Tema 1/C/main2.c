// Se incluye la librería "stdio.h"
#include <stdio.h>

int main(){

    // Declarar una variable tipo char que se va a llamar "name", 10 caracteres
    char name[10];

    // Declarar una variable tipo entero (int) que se va a llamar "age"
    int age;

    // Pedir al usuario que meta su nombre (%s significa que es un string)
    printf("Introduce tu nombre (10 carácteres máximo): ");
    scanf("%s", name);

    // Pedir al usuario que meta su edad
    printf("Introduce tu edad: ");
    scanf("%d", &age);

    // Hacer print del nombre y la edad del usuario
    printf("Hola, me llamo %s y tengo %d años\n", name, age);

    // return 0 significa que el programa ha terminado correctamente
    return 0;

}
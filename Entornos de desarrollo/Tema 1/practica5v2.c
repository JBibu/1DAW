#include <stdio.h>

int main() {

    char texto[100];    // 100 caracteres máximo
    int palabras = 0, i;

    printf("Introduce un texto: ");
    fgets(texto, 100, stdin);   // stdin = standard input

    for (i = 0; texto[i] != '\0'; i++) {    // '\0' = NULL (fin de cadena)
        if (texto[i] == ' ' || texto[i] == '\n' || texto[i] == '\t') { 
            palabras++;
            printf("\n");
        } else {
            printf("%c", texto[i]);
        }
    }

    printf("\nEl texto tiene %d palabras.\n", palabras);

    return 0;
}
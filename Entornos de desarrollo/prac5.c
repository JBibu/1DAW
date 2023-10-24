#include <stdio.h>

int main() {
    int numeros[10];
    int i;
    char opcion;
    
    do {
        // Pedir al usuario que ingrese 10 números
        for (i = 0; i < 10; i++) {
            printf("Ingrese el numero %d: ", i+1);
            scanf("%d", &numeros[i]);
        }
        
        // Ordenar los números de menor a mayor
        ordenar(numeros, 10);
        
        // Mostrar los números ordenados por la salida de consola
        printf("Numeros ordenados:\n");
        for (i = 0; i < 10; i++) {
            printf("%d ", numeros[i]);
        }
        printf("\n");
        
        // Preguntar al usuario si quiere repetir el proceso o finalizar
        printf("¿Desea repetir el proceso? S/N: ");
        scanf(" %c", &opcion);
    } while (opcion == 'S' || opcion == 's');
    
    return 0;
}
 
void ordenar(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
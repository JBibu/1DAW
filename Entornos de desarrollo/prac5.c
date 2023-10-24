#include <stdio.h>

int main() {

    int numeros[10];
    int i;
    char opcion;
    
    do {

        for (i = 0; i < 10; i++) {  // Pedir 10 números
            printf("Ingrese el numero %d: ", i+1);
            scanf("%d", &numeros[i]);
        }
        
        ordenar(numeros, 10);   // Llamada a la función ordenar
        
        printf("Numeros ordenados:\n"); // Mostrar los números ordenados
        for (i = 0; i < 10; i++) {
            printf("%d ", numeros[i]);
        }
        printf("\n");
        
        printf("¿Desea repetir el proceso? S/N: "); // Preguntar si se quiere repetir
        scanf(" %c", &opcion);
        
    } while (opcion == 'S' || opcion == 's');
    
    return 0;

}
 
void ordenar(int arr[], int n) {    // Función ordenar

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
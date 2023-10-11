print("Parte 1")

numeros = []
for i in range(10):
    numeros.append(int(input("Introduce número nº" + str(i+1) + ": ")))

print("El numero mayor es: ", max(numeros))
print("El numero menor es: ", min(numeros))

print("Parte 2")

numeros2 = []

while True:
    for i in range(10):
        numeros2.append(int(input("Introduce número nº" + str(i+1) + ": ")))


#Ordenar con algorimo de burbuja
    for i in range(len(numeros2)-1):
        for j in range(len(numeros2)-1):
            if numeros2[j] > numeros2[j+1]:
                numeros2[j], numeros2[j+1] = numeros2[j+1], numeros2[j]
    
    print("El numero mayor es: ", numeros2[-1])

    respuesta = input("¿Desea repetir el proceso? (S/N): ")
    if respuesta == "S" or respuesta == "s":
        numeros2 = []
        continue
    else:
        break

# Ventajas y desventajas de usar sort() y sorted() en Python:
# sorted() devuelve una lista ordenada y no modifica la lista original
# sort() modifica la lista original y no devuelve nada
# sorted() es más flexible que sort(), puede manejar más tipos de datos, en cambio sort()
# solo funciona con listas, aunque es más rápido que sorted()


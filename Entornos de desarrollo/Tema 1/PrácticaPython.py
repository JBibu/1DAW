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

    for i in range(len(numeros2)-1):
        for j in range(len(numeros2)-1):
            if numeros2[j] > numeros2[j+1]:
                numeros2[j], numeros2[j+1] = numeros2[j+1], numeros2[j]
    
    print("De menor a mayor: ", numeros2)

    respuesta = input("¿Desea repetir el proceso? (S/N): ")
    if respuesta == "S" or respuesta == "s":
        numeros2 = []
        continue
    else:
        break

# Ventajas y desventajas de bubble sort:
# Ventajas: Es sencillo de implementar y de entender, también es breve.
# Desventajas: Es lento, ya que tiene que recorrer el array varias veces, tampoco es eficiente con arrays grandes.



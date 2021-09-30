import java.text.MessageFormat;
import java.util.Arrays;

import static java.lang.Math.*;

public class EjercicioArreglos100Num {

    public static void main(String[] args) {
        //Edgar Vazquez - Java - Ejercicio Arreglo con 100 Numeros Enteros
        // 1.- Crear Arreglo que permita 100 numeros enteros
        // 2.- Llenar Arreglo con numero aleatorios
        // int numero = (int)(Math.random() * 100);
        // 3.- Mostrar el nunero mayor en consola
        // 4.- Mostrar el numero menor en consola
        // 5.- Mostrar numeros Primos
        // 6.- Mostrar numeros Pares
        // 7.- Ordenar Numeros en form ascendente
        // 8.- Caclular promedio de la suma del arreglo
        // 9.- Sumar el primer y ultimo valor del arreglo
        // 10.- Mostrar mensaje "Existe Cien" si hay alguno en el arreglo


        // Declaracion de Variables y Arreglo
        int[] numEnteros = new int[100];
        int mayor = numEnteros[0];
        int menor = numEnteros[1];
        int i, x, j, z; // Variables para usadas para Iterar con Funciones For
        int numPrimo, sumaPU = 0;
        double sum = 0;
        boolean esPrimo, es100 = false, siesPar = false;

        // Funciona para asignar numeros random al Arreglo
        for (int numerosIndice = 0; numerosIndice < numEnteros.length; numerosIndice++) {
            numEnteros[numerosIndice] = (int) (random() * 100);
            // Ordenar Numeros ASC
            Arrays.sort(numEnteros, 0, 100);
            System.out.println(numEnteros[numerosIndice] + " ");

            // Buscar el numero Mayor en el Arreglo
            for (i = 0; i < numEnteros.length; i++) {
                if (numEnteros[i] >= mayor) {
                    mayor = numEnteros[i];
                }
                for (x = 0; x < numEnteros.length; x++) {
                    if (numEnteros[x] < menor) {
                        menor = numEnteros[x];
                    }
                }
                // Obteniendo Promedio del Arreglo  y Suma del primer y ultima valor del Arreglo
                for (int sumX = 0; sumX < numEnteros.length; sumX++) {
                    sum = (sum + numEnteros[sumX]) / 100;
                    sumaPU = numEnteros[0] + numEnteros[99];
                }
            }
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);
        System.out.println("El promedio del arreglo es :" + sum);
        System.out.println("Suma del primer y ultimo valor es :" + sumaPU);

        // Buscar numeros Pares en el Arreglo
        for (j = 0; j < numEnteros.length; j++) {
            esPrimo = true;
            for (numPrimo = 2; numPrimo < j; numPrimo++) {
                if (j % numPrimo == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo)
                System.out.println("Los numeros primos son: " + j);
        }
        // Imprimiendo Numeros Pares
        for (z = 0; z < numEnteros.length; z++) {
            if (numEnteros[z] % 2 == 0)
                System.out.println("Son numeros pares: " + numEnteros[z] + " ");
        }
        // Existe 100 (Probado con 99)
        for (int chen : numEnteros) {
            if (chen == 100) {
                es100 = true;
            }
            if (es100)
                System.out.println("Existe cien");
            break;
        }
    }
}

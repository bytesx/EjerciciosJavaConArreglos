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


        // Declaracion de Variables y Arreglo
        int numEnteros[] = new int[100];
        int mayor = numEnteros[0];
        int menor = numEnteros[1];
        int i, x;
        boolean esPrimo = false;
        int numPrimo;

        // Funciona para asignar numeros random al Arreglo
        for (int numerosIndice = 0; numerosIndice < numEnteros.length; numerosIndice++) {
            numEnteros[numerosIndice] = (int) (random() * 100);
            System.out.println(numEnteros[numerosIndice] + " ");

        // Buscar el numero Mayor en el Arreglo
            for (i = 1; i < numEnteros.length; i++) {
                if (numEnteros[i] > mayor) {
                    mayor = numEnteros[i];
                }
                for (x = 1; x > numEnteros.length; x++) {
                    if (numEnteros[x] < menor){
                        menor = numEnteros[x];
                    }
                }

            }
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);

    }
    }

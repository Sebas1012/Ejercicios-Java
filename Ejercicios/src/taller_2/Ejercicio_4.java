package taller_2;

import java.util.Scanner;

public class Ejercicio_4 {
    static Scanner entrada = new Scanner(System.in);

    public void vectoresPrimerosYUltimos() {
        // Ingresamos la dimension del vector
        System.out.println("Por favor digite la cantidad de elementos del vector: ");
        int elementos = entrada.nextInt();
        int[] vector = new int[elementos];

        //Ingresar numeros aleatorios en el vector
        for (int i = 0; i < elementos; i++) {
            vector[i] = 1 + (int) (Math.random() * 100);
        }

        //Mostrar numeros ingresados aleatoriamente del vector
        for (int i = 0; i < elementos; i++) {
            System.out.print(vector[i] + " ");
        }

        /*
        Comenzamos a resolver el ejercicio 4.

        Lo primero sera crear un vector 2, donde guardaremos el vector ordenado de la forma especificada.
        Asignaremos los valores necesarios en el vector2
        Crearemos un segundo ciclo, y incrementaremos el valor de i, ya que la posicion i, en este segundo ciclo tendra un nuevo valor.
        romperemos con el ciclo una vez guarde el valor del vector en la posicion j, en el vector2 en la posicion i
         */

        int[] vector2 = new int[elementos];
        int contadorI = 0;
        int contadorJ = vector.length - 1;

        // Recorremos las posiciones asignando los valores del primer vector.
        for (int i = 0; i < vector.length; i++) {
            vector2[i] = vector[contadorI];
            contadorI++;
            for (int j = contadorJ; j > i; ) {
                i++;
                vector2[i] = vector[j];
                break;
            }
            contadorJ--;
        }

        System.out.println("\n \n" + "Imprimo el arreglo ordenado:" + "\n");

        //Mostrar numeros ingresados al vector 2
        for (int i = 0; i < elementos; i++) {
            System.out.print(vector2[i] + " ");
        }

    }

    public static void main(String[] args) {
        Ejercicio_4 primerosYUltimos = new Ejercicio_4();

        primerosYUltimos.vectoresPrimerosYUltimos();


    }
}

package taller_2;

import java.util.Scanner;

public class Ejercicio_4 {
    static Scanner entrada = new Scanner(System.in);

    public void vectoresPrimerosYUltimos() {
        // Dimension del vector y almacenar
        System.out.println("Por favor digite la cantidad de elementos del vector: ");
        int elementos = entrada.nextInt();
        int[] vector = new int[elementos];


        //Ingresar numeros aleatorios
        for (int i = 0; i < elementos; i++) {
            vector[i] = 1 + (int) (Math.random() * 100);
        }

        //Mostrar numeros ingresados aleatoriamente del vector
        for (int i = 0; i < elementos; i++) {
            System.out.print(vector[i] + " ");
        }

        //Ejercicio 4:
        int[] vector2 = new int[elementos];
        int contadorI = 0;
        int contadorJ = vector.length - 1;

        for (int i = 0; i < vector.length; i++) {
            vector2[i] = vector[contadorI];
            contadorI++;
            for (int j = contadorJ; j > i; ) {
                i++;
                vector2[i] = vector[j];
                break;
            }
            contadorJ--;
            System.out.println(" ");
        }
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

package taller_2;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_2 {
    int contador = 0;
    static Scanner entrada = new Scanner(System.in);


    public void cantidadVeces() {

        // Dimension del vector y almacenar
        System.out.println("Por favor digite la cantidad de elementos del vector: ");
        int n = entrada.nextInt();
        int[] vec = new int[n];

        //Ingresar numeros aleatorios
        for (int i = 0; i < n; i++) {
            vec[i] = 1 + (int) (Math.random() * 100);
        }

        //Mostrar numeros ingresados aleatoriamente del vector
        for (int i = 0; i < n; i++) {
            System.out.println(vec[i] + "\t");
        }

        //Definir numero a buscar
        System.out.println("Por favor ingrese un numero entero");
        int numero = entrada.nextInt();

        //Buscar cantidad de veces que el numero se repite
        for (int i = 0; i < n; i++) {
            if (numero == vec[i]) {
                contador += +1;
            }
        }
        //Imprimir resultado
        if (contador > 0) {
            System.out.println("\nEl dato aparece en total: " + contador + " veces.");

        } else {
            System.out.print("nEl dato no aparece en el vector");
        }
    }

    public void vectoresPrimerosYUltimos() {
        // Dimension del vector y almacenar
        System.out.println("Por favor digite la cantidad de elementos del vector: ");
        int elementos = entrada.nextInt();
        int[] vec = new int[elementos];


        //Ingresar numeros aleatorios
        for (int i = 0; i < elementos; i++) {
            vec[i] = 1 + (int) (Math.random() * 100);
        }

        //Mostrar numeros ingresados aleatoriamente del vector
        for (int i = 0; i < elementos; i++) {
            System.out.println(vec[i] + "\t");
        }

        //Ejercicio 4:
        int[] vec2 = new int[elementos];
        int contadorI = 0;
        int contadorJ = vec.length - 1;

        for (int i = 0; i < vec.length; i++) {
            vec2[i] = vec[contadorI];
            contadorI++;
            for (int j = contadorJ; j > i; ) {
                i++;
                vec2[i] = vec[j];
                System.out.println(vec2[i]);
                break;
            }
            contadorJ--;
        }
        //Mostrar numeros ingresados al vector 2
        for (int i = 0; i < elementos; i++) {
            System.out.print(vec2[i] + " ");
        }


    }

    public static void main(String[] args) {

        Ejercicio_2 contarVeces = new Ejercicio_2();
        Ejercicio_2 primerosYUltimos = new Ejercicio_2();


        //contarVeces.cantidadVeces();
        primerosYUltimos.vectoresPrimerosYUltimos();


    }

}

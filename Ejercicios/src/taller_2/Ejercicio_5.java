package taller_2;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio_5 {

    public static int[] union(int[] vectorA, int[] vectorB) {

        int contador = 0;
        int unionVectores[] = new int[vectorA.length+vectorB.length];

        //Ingreso los valores del arreglo vectorA
        for (int i = 0; i < vectorA.length; i++) {
            unionVectores[i] = vectorA[i];
        }
        //Ingreso los valores del arreglo vectorB
        for (int i = vectorA.length; i < vectorA.length+vectorB.length; i++) {
            unionVectores[i] = vectorB[contador++];
        }
        return unionVectores;
    }

    public static int[] noRepetir(int[] _unionVectores) {

        //Ordenamos el arreglo y accedemos al tamanio de la union
        Arrays.sort(_unionVectores);
        int tamaño_union = _unionVectores.length;

        // Ingresamos los numeros al arreglo pero sin repetir
        int cont = 0;
        for (int i = 0; i < tamaño_union-1 ; i++) {
            /*      Explicacion de el siguiente if:
            Si el siguiente if se cumple, quiere decir que:
             el valor que se aloja en la posicion _unionVectores[i] es igual al que le sigue.

             De forma que no necesitamos que lo guarde por que luego de esa misma vuelta la posicion de "i" sera el mismo valor.

             Una ves tengamos el ultimo valor repetido, entonces ahi si guardamos el valor de la posicion "i" en -unionVectores[]
             de esta forma evitamos ingresar nuevamente datos repetidos y nos aseguramos de ingresar cada dato alojado a lo largo del arreglo.
             */
            if (_unionVectores[i]!=_unionVectores[i+1]){
                _unionVectores[cont++] = _unionVectores[i];
            }

        }
        _unionVectores[cont++] = _unionVectores[tamaño_union-1];
        // Creamos un arreglo unicamente con los datos sin repetir
        int [] union = new int[cont];
        for (int k = 0; k < cont; k++) {
            union[k] = _unionVectores[k];
        }
        return union;

    }

    public static void main(String[] args) {

        int tamaño_vector = 10;

        int vector_1[] = new int[tamaño_vector];
        int vector_2[] = new int[tamaño_vector];

        for (int i = 0; i < tamaño_vector; i++) {
            vector_1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i + 1) + " del vector 1"));
        }

        for (int i = 0; i < tamaño_vector; i++) {
            vector_2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i + 1) + " del vector 2"));
        }

        System.out.println(Arrays.toString(noRepetir(union(vector_1,vector_2))));
    }
}





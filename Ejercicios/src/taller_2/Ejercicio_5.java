package taller_2;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio_5 {
    public static void main(String[] args) {

        int tamaño_vector = 10, j = 0;

        int vector_1[] = new int[tamaño_vector];
        int vector_2[] = new int[tamaño_vector];
        int union[] = new int[tamaño_vector * 2];
        int union_temporal[] = new int[tamaño_vector];
        int interseccion[] = new int[tamaño_vector * 2];

        for(int i = 0; i < tamaño_vector; i++){
            vector_1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i+1) + " del vector 1"));
        }

        for(int i = 0; i < tamaño_vector; i++){
            vector_2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i+1) + " del vector 2"));
        }

        /*Union*/
        for(int x = 0; x < tamaño_vector * 2; x++){
            if(x < tamaño_vector){
                union[x] = vector_1[x];
            }

            if(x >= tamaño_vector){
                union[x] = vector_2[x - tamaño_vector];
            }

            System.out.print(" " + union[x]);
        }

    }
}

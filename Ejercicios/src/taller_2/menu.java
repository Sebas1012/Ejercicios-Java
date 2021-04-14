package taller_2;

import javax.swing.*;
import java.util.Arrays;

public class menu {
    public static void main(String[] args) {

        /* --------------------------- Ejercicio 5 ---------------------------- */
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

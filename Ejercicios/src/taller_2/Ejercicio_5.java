package taller_2;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio_5 {
    public static void main(String[] args) {

        int tamaño_vector = 3, j = 0;
        int contador = 0;
        int union[] = new int[tamaño_vector * 2];
        int vector_1[] = new int[tamaño_vector];
        int vector_2[] = new int[tamaño_vector];

        int interseccion[] = new int[tamaño_vector * 2];

        for (int i = 0; i < tamaño_vector; i++) {



            vector_1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i + 1) + " del vector 1"));
        }

        for (int i = 0; i < tamaño_vector; i++) {
            vector_2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + (i + 1) + " del vector 2"));



        }

        /*Union*/

        /*for (int x = 0; x < tamaño_vector * 2; x++) {
            *//*Union*//*
            if (x < tamaño_vector) {
                union[x] = vector_1[x];
            }

            if (x >= tamaño_vector) {
                union[x] = vector_2[x - tamaño_vector];
            }

            System.out.print(union[x] + " ");

        }*/


        for (int i = 0; i < vector_1.length; i++) {
            System.out.println(vector_1[i]);
            System.out.println(vector_2[i]);
            for (int z = 0; z < vector_2.length; z++) {
                if(vector_1[i] == vector_2[z]){

                    union[i] = vector_2[z];


                    contador++;

                }else{
                    union[i] = vector_2[z];
                }
                i++;
                String both = arrayUtils.addAll(vector_1,vector_2)
            }

            System.out.print(union[i] + " ");
        }



        /*Interseccion*/


    }
}

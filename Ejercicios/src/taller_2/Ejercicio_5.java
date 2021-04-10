package taller_2;

import javax.swing.*;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int vector_1[] = new int[3];
        int vector_2[] = new int[3];
        int union[] = new int[6];
        int interseccion[] = new int[6];
        int temp;

        for (int i = 0; i < vector_1.length; i++){
            vector_1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion "+ i + " en el vector 1: "));
            vector_2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion "+ i + " en el vector 2: "));

            union[i] = vector_1[i];
        }

        /*Union*/
        for (int x = union.length - vector_1.length; x < union.length; x++){
            for(int z = 0; z < vector_1.length; z++){
                if(union[z] == vector_2[z]){
                    union[z] = union[z+1];
                }else{

                }
            }
        }



    }
}

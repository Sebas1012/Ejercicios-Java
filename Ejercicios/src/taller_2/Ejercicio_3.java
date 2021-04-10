package taller_2;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int numero_enteros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar: "));
        int vector[] = new int[numero_enteros];
        int contador[] = new int[numero_enteros];

        /*Codigo sacado de https://www.youtube.com/watch?v=iGkAJbrzcSQ*/
        for (int i = 0; i < numero_enteros; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "+ i + ": "));
            contador[vector[i]] += 1;
        }
        /*----------------------------------------------------*/

        for (int x = 0; x < numero_enteros; x++){
            JOptionPane.showMessageDialog(null, "Numero " + vector[x] + " se repite " + contador[x] + " veces");
        }

    }
}

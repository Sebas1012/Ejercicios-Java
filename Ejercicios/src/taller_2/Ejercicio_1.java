package taller_2;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {


        int numero_enteros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar: "));
        int vector[] = new int [numero_enteros];
        double acumulador = 0, promedio = 0, cercano = 0;

        for(int i = 0; i < numero_enteros; i++){
            vector[i] =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "+ i + ": "));
            acumulador = acumulador + vector[i];
        }

        promedio = acumulador / numero_enteros;

        /* Este codigo fue sacado de la web:
        https://www.sololearn.com/Discuss/2368527/como-obtengo-el-numero-mas-cercano-de-un-promedio-en-java*/
        for(int x = 0; x < numero_enteros - 1; x++){
            if (promedio - vector[x] > promedio - vector[x + 1]){
                cercano = vector[x + 1];
            }
        }
        /*---------------------------------------------------------*/

        JOptionPane.showMessageDialog(null,"Promedio: " + promedio + "\nNumero cercano al promedio: " + cercano );
    }
}

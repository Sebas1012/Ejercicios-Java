/*
package taller_2;

import javax.swing.*;

public class Ejercicios {

    //Atributos para el promedio
    */
/*int numero_enteros;
    static int vector[];
    public static int numero_enteros;
    static double acumulador = 0;
    static double promedio = 0;
    static double cercano = 0;*//*


    public void almacenarNumeros() {

        */
/*this.numero_enteros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar: "));*//*



        int numero_enteros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar: "));
        //vector[] = new int [numero_enteros];



        for(int i = 0; i < numero_enteros; i++){
            vector[i] =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "+ i + ": "));
            acumulador = acumulador + vector[i];
        }
    }

    public void mostrarPromedio() {

        almacenarNumeros();

        promedio = acumulador / numero_enteros;

        */
/* Este codigo fue sacado de la web:
        https://www.sololearn.com/Discuss/2368527/como-obtengo-el-numero-mas-cercano-de-un-promedio-en-java*//*


        for(int x = 0; x < numero_enteros - 1; x++){
            if (promedio - vector[x] > promedio - vector[x + 1]){
                cercano = vector[x + 1];
            }
        }
        */
/*---------------------------------------------------------*//*


        JOptionPane.showMessageDialog(null,"Promedio: " + promedio + "\nNumero cercano al promedio: " + cercano );
    }



}
*/

package taller_2;

import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int numero_enteros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a almacenar: "));
        int vector[] = new int[numero_enteros];
        int contador = 0;

        /*Creo ciclo para llenar array con valores ingresados opr el usuario*/
        for (int i = 0; i < numero_enteros; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero "+ i + ": "));
        }

        /*Creo 2 ciclos for para validar si el numero en la posicion i esta repetido en cada una de las posiciones, para ello uso x*/
        for (int i = 0; i < numero_enteros; i++){
            for (int x = 0; x < numero_enteros; x++){
                /*Valido si esa repetido, y si es asi sumo un uno al contador*/
                if(vector[i] == vector[x]){
                    contador++;
                }

            }
            /*Valido si el contador es igual a 1 es porque solo se encuentra 1 vez en el array y por ende no esta repetido, de lo contrario es por que si esta repetido*/
            if(contador == 1){
                System.out.println("El numero " + vector[i] + " no esta repetido");
            }else{
                System.out.println("El numero " + vector[i] + " esta repetido " + contador + " veces");
            }

            /*Reinicio el contador*/
            contador = 0;
        }

    }
}

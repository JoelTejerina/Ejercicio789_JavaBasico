package curso.java.ejercicios789;

import java.util.Scanner;

public class MainEjercicioTres {
    public static void main(String[] args) {
        //3)Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] enterosBidimensionales = {
                {10, 30, 50, 70, 90},
                {20, 40, 60, 80, 100}
        };

        for (int i = 0; i < enterosBidimensionales.length; i++) {
            System.out.println("Recorriendo la Fila: " + i);

            for (int j = 0; j < enterosBidimensionales[1].length; j++) {
                System.out.println("Posicion de Columna: " + j + " Valor: " + enterosBidimensionales[i][j]);
            }
        }
    }
}

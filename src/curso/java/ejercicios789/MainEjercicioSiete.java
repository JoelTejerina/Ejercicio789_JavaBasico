package curso.java.ejercicios789;

import java.util.ArrayList;

public class MainEjercicioSiete {
    public static void main(String[] args) {
        //7)Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i < 11;i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size();i++){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
        System.out.println(numeros);
    }
}

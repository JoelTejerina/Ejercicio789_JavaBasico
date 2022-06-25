package curso.java.ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainEjercicioSeis {
    public static void main(String[] args) {
        //6)Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("joel");
        nombres.add("enzo");
        nombres.add("zoe");
        nombres.add("camila");

        LinkedList<String> nombresCopiado = new LinkedList<>(nombres);

        for (String n: nombres) {
            System.out.println(n);
        }
        System.out.println("*****************************");
        for (String n : nombresCopiado) {
            System.out.println(n);
        }
    }
}

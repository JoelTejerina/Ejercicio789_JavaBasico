package curso.java.ejercicios789;

import java.util.Vector;

public class MainEjercicioCuatro {
    public static void main(String[] args) {
        //4)Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> nombres = new Vector<String>();
        nombres.add("Joel");
        nombres.add("Pedro");
        nombres.add("Luis");
        nombres.add("Juan");
        nombres.add("Lucas");

        nombres.remove(1);
        nombres.remove("Luis");

        for (String n : nombres) {
            System.out.println(n);
        }
    }
}

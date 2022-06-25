package curso.java.ejercicios789;

import java.util.*;

public class MainEjercicioUno {
    public static void main(String[] args) {
        //1)Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        String texto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        texto = scanner.nextLine();

        texto = reverse(texto);

        System.out.println(texto);
    }
    public static String reverse(String texto) {
       int textoLongitud = texto.length();
        String textoAlReves = "";

        for (int i = texto.length() ;  1 <= textoLongitud; i--){
            textoLongitud--;
            textoAlReves+= texto.charAt(textoLongitud);
        }
        return textoAlReves;
    }
}
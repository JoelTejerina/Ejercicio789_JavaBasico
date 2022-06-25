package curso.java.ejercicios789;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class MainEjercicioNueve {
    public static void main(String[] args) {
        //9)Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        funcionFileInFileOut("C:/Users/Joel/in.txt","C:/Users/Joel/ejemplo.txt");
    }
    public static void funcionFileInFileOut(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream pr = new PrintStream(fileOut);
            pr.write(datos);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

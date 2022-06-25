package curso.java.ejercicios789;

import java.io.*;
import java.util.*;

public class MainEjercicioDiez {
    public static void main(String[] args) {
        //10)Sorpréndenos creando un programa de tu elección que utilice
        // InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        try {
            funcionFileInFileOut("C:/Users/Joel/in.txt","C:/Users/Joel/ejemplo.txt");
        }catch (Exception e){
            System.out.println("Error general");
            e.printStackTrace();
        }

    }
    public static void funcionFileInFileOut(String fileIn, String fileOut) throws IOException, FileNotFoundException{
        try {
            InputStream in = new FileInputStream(fileIn);
            List<String> nombres = new ArrayList<>();
            nombres.add("hola");
            nombres.add("mundo");
            nombres.add("como");
            nombres.add("estan");

            HashMap<Integer, String> listaDeNombresConId = new HashMap<>();
            listaDeNombresConId.put(1, "Joel");
            listaDeNombresConId.put(2, "Zahira");
            listaDeNombresConId.put(3, "Zoe");
            listaDeNombresConId.put(4, "Fede");
            listaDeNombresConId.put(5, "Javier");

            byte[] datos = in.readAllBytes();

            PrintStream pr = new PrintStream(fileOut);
            pr.write(datos);

            for (HashMap.Entry<Integer, String> entry : listaDeNombresConId.entrySet()) {
                pr.write(entry.getKey());
                pr.write(entry.getValue().getBytes());
            }

            for (String n : nombres) {
                pr.write(n.getBytes());
            }
        }catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }catch (Exception e){
            throw new IOException();
        }
    }
}

package curso.java.ejercicios789;

public class MainEjercicioDos {
    public static void main(String[] args) {
        //2)Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        int i = 0;
        String[] cadenaDeTextos = {"Hola", "mundo", "como", "estan"};
        for (String c: cadenaDeTextos) {
            System.out.println("Recorriendo la cadena de texto: " + c + " Indice: " + i++);
        }
    }
}

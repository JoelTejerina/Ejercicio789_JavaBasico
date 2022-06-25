package curso.java.ejercicios789;

import java.io.IOException;

public class MainEjercicioOcho {
    public static void main(String[] args) {
        //8)Crea una función DividePorCero.
        // Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        // que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        // Finalmente, mostraremos en cualquier caso: "Demo de código".

        try {
            dividePorCero(2, 0);
        }catch (Exception e){
            System.out.println("Esto no se puede hacer");
            e.printStackTrace();
        }

    }
    public static  int dividePorCero(int numerado, int denominador) throws IOException, ArithmeticException {
        int division;
        try {
            division = numerado / denominador;
        } catch (ArithmeticException e){
            throw  new IOException();
        }
        return division;
    }
}


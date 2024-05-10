package dominioVirtual;

import contenido.Ejemplar;
import dominioVirtual.contenido.Categoria;
import individuo.Lector;

public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Lector estudiante = new Lector("Ariel", "Tandazo");

        // Crear un libro
        Categoria libro = new Categoria("Can't Hurt Me", "SuperacionPersonal", "Sección A");

        // Asignar el libro al estudiante
        Ejemplar copia = new Ejemplar(Categoria);
}

}
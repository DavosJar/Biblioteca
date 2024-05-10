import biblioteca.Biblioteca;
import biblioteca.Seccion;
import publicacion.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
      /*Autor autor = new Autor("Juan", "Perez", "Mexicano");
        Revista revista = new Revista("Java Magazine", "12/12/2020", "Oracle", autor, 12, 1, Categoria.ACADEMICO);
        System.out.println(revista);
        Libro libro = new Libro("Java 8", "12/12/2020", "Oracle", autor, "123456", 200, 10, "Programacion en Java", Genero.ACADEMICO);
        System.out.println(libro);
        Seccion seccion = new Seccion(1, 10, 35, 0);
        Ejemplar ejemplar = new Ejemplar("12/12/2020", EstadoEjemplar.NUEVO, false, true, libro, seccion, null);
        System.out.println(ejemplar);*/

        Biblioteca biblioteca = new Biblioteca("Biblioteca", "Calle 123", "123456", "pepe@gmail,com", null);
        biblioteca.agregarSeccion();

    }

}
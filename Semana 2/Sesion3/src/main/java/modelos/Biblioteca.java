package modelos;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList();
    }

    public void agregarLibro(String titulo) {
        libros.add(new Libro(titulo));
    }

    private class Libro {
        private String titulo;

        public Libro() {}

        public Libro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void mostrarLibros() {
        System.out.println("Libros disponibles: ");
        for (Libro libro : libros) {
            System.out.println("-" + libro.getTitulo());
        }
        System.out.println("*".repeat(13));
    }
}

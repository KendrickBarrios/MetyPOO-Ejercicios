import modelos.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("\u001B[34m");

        Curso curso = new Curso("Metodologia y POO");
        Profesor dimitrick = new Profesor("Dimitrick Navarro");
        Profesor noel = new Profesor("Noel Gavarrete");
        dimitrick.ensenarCurso(curso);

        Departamento fia = new Departamento();
        fia.setNombre("Facultad de Ingenieria y Arquitectura");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(dimitrick);

        System.out.println(fia.getNombre());
        System.out.println("=".repeat(13));
        for (Profesor doc : fia.getProfesores()) {
            System.out.println(doc.getNombre());
            System.out.println("=".repeat(13));
        }

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("Fundamentos de Programacion");
        biblioteca.agregarLibro("Como programar en Java");

        biblioteca.mostrarLibros();

        Perro elPerro = new Perro();
        elPerro.setNombre("Nalo");
        System.out.print(elPerro.getNombre() + " hace ");
        elPerro.hacerSonido();
    }
}

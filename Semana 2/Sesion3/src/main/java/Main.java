import modelos.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("\u001B[34m");
        System.out.println("waos");
        Curso curso = new Curso("Metodologia y POO");
        Profesor dimitrick = new Profesor("Dimitrick Navarro");
        dimitrick.ensenarCurso(curso);
        Departamento fia = new Departamento();
        fia.setNombre("Facultad de Ingenieria y Arquitectura");
        Profesor noel = new Profesor("Noel Gavarrete");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(dimitrick);
        System.out.println(fia.getNombre());
        System.out.println("=".repeat(13));
        for (Profesor doc : fia.getProfesores()) {
            System.out.println(doc.getNombre());
            System.out.println("=".repeat(13));
        }
    }
}

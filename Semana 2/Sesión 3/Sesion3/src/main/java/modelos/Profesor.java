package modelos;

public class Profesor {
    private String nombre;

    public Profesor() {
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ensenarCurso(Curso curso){
        System.out.println(nombre + " esta ensenando "
                + curso.getNombre());
    }
}

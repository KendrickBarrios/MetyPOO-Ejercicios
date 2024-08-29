package modelos;

public class Animal {
    private String nombre;

    public Animal() {}

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido () {
        System.out.println("Sonido generico");
    }
}

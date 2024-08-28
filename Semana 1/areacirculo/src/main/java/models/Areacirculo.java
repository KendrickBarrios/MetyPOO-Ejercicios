package models;

public class Areacirculo {
    private float radio;

    public Areacirculo() {
    }

    public Areacirculo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return (float) (Math.pow(radio, 2) * Math.PI);
    }
}

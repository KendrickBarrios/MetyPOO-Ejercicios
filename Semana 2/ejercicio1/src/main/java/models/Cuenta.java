package models;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
            System.out.println("El nuevo saldo de la cuenta es " + this.cantidad);
        } else {
            System.out.println("No se puede hacer un deposito por un valor de 0 o menor.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > this.cantidad) {
            System.out.println("El retiro excede el saldo actual de la cuenta en " + (cantidad - this.cantidad) + ". El nuevo saldo de la cuenta es 0.");
        } else {
            this.cantidad -= cantidad;
            System.out.println("El nuevo saldo de la cuenta es " + this.cantidad);
        }
    }
}

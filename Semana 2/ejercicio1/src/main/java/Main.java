import models.Cuenta;
import models.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.setTitular("Kendrick Barrios");
        miCuenta.setCantidad(1234.5);
        System.out.println("El saldo inicial de la cuenta es " + miCuenta.getCantidad());
        miCuenta.ingresar(2000);
        miCuenta.retirar(5000);
        Serie serie = new Serie("Juego de Tronos", 8, "Fantasia", "David Benioff");
        System.out.println(serie);
    }
}

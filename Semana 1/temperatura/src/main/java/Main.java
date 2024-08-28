import models.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que convierte temperaturas entre Celsius y Fahrenheit");
        char op;
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();
        System.out.println("Elija una opcion: ");
        System.out.println("(1) Convertir Celsius a Fahrenheit");
        System.out.println("(2) Convertir Fahrenheit a Celsius");
        op = sc.next().charAt(0);
        switch (op) {
            case '1':
                conversor.setCelsius();
                conversor.celsiusFahrenheit();
                break;
            case '2':
                conversor.setFahrenheit();
                conversor.fahrenheitCelsius();
                break;
            default:
                System.out.println("Por favor, elija una opcion valida (1 o 2).");
        }
    }
}

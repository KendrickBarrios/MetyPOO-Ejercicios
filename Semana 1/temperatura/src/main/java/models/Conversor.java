package models;

import java.util.Scanner;

public class Conversor {
    private float celsius;
    private float fahrenheit;

    public Conversor(){
    }

    public Conversor(float celsius, float fahrenheit){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius ( >= -273.15): ");
        float cels = Float.parseFloat(sc.nextLine());
        while (cels < -273.15) {
            System.out.println("El valor ingresado debe ser mayor al cero absoluto.");
            System.out.print("Ingrese un valor >= -273.15: ");
            cels = Float.parseFloat(sc.nextLine());
        }
        this.celsius = cels;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit ( >= -496.67): ");
        float fahr = Float.parseFloat(sc.nextLine());
        while (fahr < -496.67){
            System.out.print("Ingrese un valor >= -496.67: ");
            System.out.println("El valor ingresado debe ser mayor al cero absoluto.");
            fahr = Float.parseFloat(sc.nextLine());
        }
        this.fahrenheit = fahr;
    }

    public void celsiusFahrenheit() {
        if (Float.isNaN(celsius)) {
            System.out.println("No hay un valor en Celsius para convertir a Fahrenheit.");
        } else {
            float f = (float) (1.8 * celsius + 32);
            System.out.println(celsius + " grados Celsius equivalen a " + f + " grados Fahrenheit.");
        }
    }

    public void fahrenheitCelsius() {
        if (Float.isNaN(fahrenheit)) {
            System.out.println("No hay un valor en Fahrenheit para convertir a Celsius.");
        } else {
            float c = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + c + " grados Celsius.");
        }
    }
}

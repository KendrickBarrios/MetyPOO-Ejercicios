import models.Areacirculo;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float radio, area;
        Areacirculo areacirculo = new Areacirculo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que calcula el area de un circulo.");
        System.out.print("Ingrese el valor del radio: ");
        radio = sc.nextFloat();
        while (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
            System.out.print("Ingrese un numero valido: ");
            radio = sc.nextFloat();
        }
        areacirculo.setRadio(radio);
        area = areacirculo.calcularArea();
        System.out.print("El area del circulo es: ");
        System.out.printf("%.2f Unidades cuadradas", area);
    }
}

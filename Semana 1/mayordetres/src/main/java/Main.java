import models.Mayor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el " + (i + 1) + "° numero: ");
            arr[i] = sc.nextInt();
        }
        Mayor mayor = new Mayor(arr[0], arr[1], arr[2]);
        System.out.println("El mayor de los 3 numeros ingresados es: " + mayor.mayorDeTres());
    }
}

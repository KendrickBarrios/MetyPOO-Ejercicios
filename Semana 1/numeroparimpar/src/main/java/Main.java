import models.Verificador;


public class Main {
    public static void main(String[] args) {
        System.out.println("Programa que verifica si un entero dado es par o impar.");
        Verificador verif = new Verificador();
        verif.setValor();
        if (verif.parImpar() == true) {
            System.out.print("\u001B[34m");
            System.out.println("El valor " + verif.getValor() + " es par.");
        } else {
            System.out.print("\u001B[31m");
            System.out.println("El valor " + verif.getValor() + " es impar.");
        }
    }
}

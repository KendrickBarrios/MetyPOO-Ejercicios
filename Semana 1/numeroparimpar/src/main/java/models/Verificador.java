package models;

import java.util.Scanner;

// clase que verifica si el valor dado es par o impar
public class Verificador {
    private int valor;

    public Verificador(){
    }

    public Verificador(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor a verificar: ");
        int val = Integer.parseInt(sc.nextLine());
        this.valor = val;
    }

    public boolean parImpar() {
        if (valor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

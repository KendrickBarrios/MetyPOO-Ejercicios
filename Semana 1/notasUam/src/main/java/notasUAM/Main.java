package notasUAM;

import modelos.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("\u001B[32m");
        System.out.println("UAM");
        // crear objeto estudiante
        Estudiante est = new Estudiante();
        String nombres, apellidos, cif, asignatura;
        int nota1, nota2, nota3, nf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los siguientes datos: ");
        System.out.print("CIF: ");
        cif = sc.nextLine();
        System.out.print("Nombres: ");
        nombres = sc.nextLine();
        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Asignatura: ");
        asignatura = sc.nextLine();
        System.out.print("Corte 1: ");
        nota1 = Integer.parseInt(sc.nextLine());
        System.out.print("Corte 2: ");
        nota2 = Integer.parseInt(sc.nextLine());
        System.out.print("Corte 3: ");
        nota3 = Integer.parseInt(sc.nextLine());

        est.setCif(cif);
        est.setNombres(nombres);
        est.setApellidos(apellidos);
        est.setAsignatura(asignatura);
        est.setCorte1(nota1);
        est.setCorte2(nota2);
        est.setCorte3(nota3);

        nf = est.obtNotaFinal();
        System.out.println("Nota final: " + nf);
        if (est.evalNotaFinal().equals("Aprobado.")) {
            System.out.print("\u001B[34m");
        } else {
            System.out.print("\u001B[31m");
        }
        System.out.println(est.evalNotaFinal());
        System.out.print("\u001B[32m");
        System.out.println(est.evalConvocatoria());
    }
}


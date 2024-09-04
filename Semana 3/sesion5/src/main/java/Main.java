import modelos.Admission;
import modelos.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = sc.nextLine();
        System.out.print("Ingrese el CIF del estudiante: ");
        String cif = sc.nextLine();
        System.out.print("Ingrese el promedio del estudiante: ");
        float promedio = Float.parseFloat(sc.nextLine());

        while (promedio < 0 || promedio > 100) {
            System.out.println("El promedio tiene que estar en el rango de 0-100.");
            System.out.print("Ingrese el promedio del estudiante: ");
            promedio = Float.parseFloat(sc.nextLine());
        }

        // se crean los objetos estudiante y admision
        Student estudiante = new Student(promedio, carrera, cif, nombre, apellido);
        Admission admision = new Admission();

        // se determina si el estudiante cumple con el requisito de beca
        admision.calcScholarship(estudiante);

        // se envia el mensaje a consola
        System.out.print(estudiante.getFirstName() + " " + estudiante.getLastName());
        if (estudiante.isScholarship()) {
            System.out.println(" tiene derecho a beca.");
        } else {
            System.out.println(" no tiene derecho a beca.");
        }

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.print("Ingrese el promedio del estudiante: ");
            promedio = Float.parseFloat(sc.nextLine());
            student.setAverage(promedio);
            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student.getAverage() + " " + student.isScholarship());
        }
    }
}

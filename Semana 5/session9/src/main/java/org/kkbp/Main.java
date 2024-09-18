package org.kkbp;

import org.kkbp.dao.StudentDao;
import org.kkbp.models.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDao students = new StudentDao();
        /* Student student1 = new Student("Kendrick", 23, "kendrick@gmail.com");
        Student student2 = new Student("Luis", 25, "luis@gmail.com");
        Student student3 = new Student("Maria", 22, "maria@gmail.com");


        if(students.store(student1)) {
            System.out.println("Student stored correctly.");
        } else {
            System.out.println("Couldn't store student.");
        }
        students.store(student2);
        students.store(student3);
        students.showStudents(); */

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String menu = "\n1. Add student\n" +
                "2. Find student\n" +
                "3. Show students\n" +
                "4. Calculate student's mean age\n" +
                "5. Exit program\n" +
                "Enter you choice: ";
        while (option != 5) {
            System.out.println(menu);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the name of the student: ");
                    String name = sc.next();
                    System.out.println("Enter the age of the student: ");
                    int age = sc.nextInt();
                    System.out.println("Enter the email address of the student: ");
                    String email = sc.next();
                    Student student = new Student(name, age, email);
                    students.store(student);
                    break;
                case 2:
                    System.out.println("Enter the name of the student: ");
                    String nameToFind = sc.next();
                    students.findByName(nameToFind);
                    break;
                case 3:
                    students.showStudents();
                    break;
                case 4:
                    double meanAge = students.calcMeanAge();
                    if (meanAge != 0) {
                        System.out.println("Student's mean age: " + meanAge);
                    } else {
                        System.out.println("Student's list is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }
    }
}
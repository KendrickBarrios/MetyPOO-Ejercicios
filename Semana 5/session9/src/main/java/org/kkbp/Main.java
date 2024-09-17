package org.kkbp;

import org.kkbp.dao.StudentDao;
import org.kkbp.models.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kendrick", 23, "kendrick@gmail.com");
        Student student2 = new Student("Luis", 25, "luis@gmail.com");
        Student student3 = new Student("Maria", 22, "maria@gmail.com");

        StudentDao students = new StudentDao();
        if(students.store(student1)) {
            System.out.println("Student stored correctly.");
        } else {
            System.out.println("Couldn't store student.");
        }
        students.store(student2);
        students.store(student3);
        students.showStudents();
    }
}
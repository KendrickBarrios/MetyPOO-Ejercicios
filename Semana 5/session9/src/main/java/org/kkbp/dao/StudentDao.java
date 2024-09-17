package org.kkbp.dao;

import org.kkbp.interfaces.Session9;
import org.kkbp.models.Student;

import java.util.ArrayList;

public class StudentDao implements Session9 {
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        Student student = (Student) object;
        try {
            students.add(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByName(String name) {
        try {
            for (Student student : students) {
                if (student.getName().equals(name)) {
                    System.out.println(student);
                }
            }
            System.out.println("Student was not found.");
        } catch (Exception e) {
            System.out.println("An error has ocurred during the execution of findByName method. " + e.getMessage());
        }
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

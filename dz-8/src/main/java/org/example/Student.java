package org.example;

public class Student {
    private int student_id;
    private String first_name;
    private String last_name;

    public Student(int student_id, String first_name, String last_name) {
        this.student_id = student_id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getStudentId() {
        return student_id;
    }

    public String getFullName() {
        return first_name + " " + last_name;
    }
}
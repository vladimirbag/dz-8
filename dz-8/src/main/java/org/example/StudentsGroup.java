package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student captain;
    private List<Student> students;
    private List<String> tasks;

    public StudentsGroup(Student captain) {
        this.captain = captain;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void changeCaptain(Student newCaptain) {
        this.captain = newCaptain;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean markTaskDone(Student student, String task) {
        int studentId = student.getStudentId();
        for (Student s : students) {
            if (s.getStudentId() == studentId) {
                // Assume each task is unique, otherwise, you can use a task_id instead of a task string
                if (tasks.contains(task)) {
                    // Here, you can perform any additional checks or validation before marking the task done.
                    tasks.remove(task);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

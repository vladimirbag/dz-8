package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsGroup {
    private Student captain;
    private List<Student> students;
    private List<String> tasks;
    private Map<String, List<Student>> completedTasks;

    public StudentsGroup(Student captain) {
        this.captain = captain;
        this.students = new ArrayList<>();
        this.students.add(captain);
        this.tasks = new ArrayList<>();
        this.completedTasks = new HashMap<>();
    }

    public void changeCaptain(Student newCaptain) {
        if (!students.contains(newCaptain)) {
            students.add(newCaptain);
        }
        this.captain = newCaptain;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        if (student.equals(captain)) {
            System.out.println("Старосту не можна видалити з групи.");
            return;
        }
        students.remove(student);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean markTaskDone(Student student, String task) {
        if (!tasks.contains(task)) {
            System.out.println("Завдання '" + task + "' не знайдено.");
            return false;
        }

        List<Student> studentsWhoCompletedTask = completedTasks.getOrDefault(task, new ArrayList<>());
        studentsWhoCompletedTask.add(student);
        completedTasks.put(task, studentsWhoCompletedTask);
        return false;
    }
}

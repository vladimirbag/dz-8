package org.example;

public class Main {
    public static void main(String[] args) {
        // Створюємо декілька об'єктів класу Student
        Student student1 = new Student(1, "John", "Doe");
        Student student2 = new Student(2, "Alice", "Smith");
        Student student3 = new Student(3, "Bob", "Johnson");

        // Створюємо об'єкт класу StudentsGroup і передаємо старосту (captain)
        StudentsGroup group = new StudentsGroup(student1);

        // Додаємо студентів до групи
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        // Додаємо завдання для всієї групи
        group.addTask("Learn encapsulation");
        group.addTask("Complete project");

        // Видаляємо студента з групи
        group.removeStudent(student3);

        // Змінюємо старосту групи
        group.changeCaptain(student2);

        // Позначаємо завдання як виконане для студента
        String task = "Learn encapsulation";
        if (group.markTaskDone(student1, task)) {
            System.out.println("Task '" + task + "' marked as done for student " + student1.getFullName() + ".");
        } else {
            System.out.println("Task '" + task + "' not found for student " + student1.getFullName() + ".");
        }
    }
}
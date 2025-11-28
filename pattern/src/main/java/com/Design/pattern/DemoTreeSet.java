package com.Design.pattern;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); 
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }
}

public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student(101, "Ravi", 85.5));
        students.add(new Student(102, "Priya", 90.0));
        students.add(new Student(103, "Naresh", 78.2));
        students.add(new Student(104, "Anita", 88.8));
        students.add(new Student(105, "Kumar", 92.3));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

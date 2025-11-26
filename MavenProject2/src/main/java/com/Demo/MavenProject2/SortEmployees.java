package com.Demo.MavenProject2;

import java.util.Arrays;

public class SortEmployees {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(3, "Alice", 50000),
            new Employee(1, "Bob", 70000),
            new Employee(2, "Charlie", 60000)
        };


        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Sorted by salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Arrays.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e1.id, e2.id));
        System.out.println("Sorted by id:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        
    }




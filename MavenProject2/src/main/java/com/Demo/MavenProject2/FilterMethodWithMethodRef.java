package com.Demo.MavenProject2;

import java.util.*;
import java.util.function.Predicate;

public class FilterMethodWithMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Charlie", "Arun", "David");

   
        Predicate<String> startsWithA = StringUtil::startsWithA;

  
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (startsWithA.test(name)) {
                filteredNames.add(name);
            }
        }

    
        filteredNames.forEach(System.out::println);
    }
}


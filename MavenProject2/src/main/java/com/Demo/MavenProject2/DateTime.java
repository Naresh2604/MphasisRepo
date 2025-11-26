package com.Demo.MavenProject2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String dateTimeString = "2025-11-24 16:52:30";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println("Parsed LocalDateTime: " + localDateTime);
    }
}
   
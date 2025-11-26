package com.Demo.MavenProject2;

public class TryResourceDemo {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            System.out.println("Starting try block\n");
            resource.doSomething();
            resource.failSomething();
            System.out.println("Done Something\n");
        } catch (Exception e) {
        	e.printStackTrace();
        	System.out.println("SHS");
        } finally {
        	System.out.println("finally block");
        }
    }
}
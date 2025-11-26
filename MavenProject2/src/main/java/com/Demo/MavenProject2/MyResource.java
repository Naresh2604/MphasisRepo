package com.Demo.MavenProject2;

class MyResource implements AutoCloseable {
	public MyResource() {
		System.out.println("Creating resource");
	}
	
    public void doSomething() {
        System.out.println("Using MyResource...");
    }
    
    public void failSomething() {
    	throw new RuntimeException("Hello fail");
    }
 
    @Override
    public void close() {
        System.out.println("Closing MyResource...");
    }
}
 

 
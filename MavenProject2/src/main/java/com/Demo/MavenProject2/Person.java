package com.Demo.MavenProject2;

public class Person {
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	Person(String name,int id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}



	private String name;
	private int id;
	private int age;
	
	public void checkEligibility() throws AgeNotSufficientException {
		if(this.age>18)
			 System.out.println("person is eligible to vote");
		else
			throw new AgeNotSufficientException("person age is less than 18");
	}
	
	

	public static void main(String[] args) throws AgeNotSufficientException {
		Person p=new Person("swapna",123,2);
		System.out.println(p);
		
		p.checkEligibility();
		
	

	}

}

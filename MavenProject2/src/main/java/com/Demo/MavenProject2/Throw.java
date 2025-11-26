package com.Demo.MavenProject2;

public class Throw {
	
	public static void  checkMethod(int a ,int b[]) {
		for(int i=0;i<=b.length;i++) {
			if(b[i]==0)
				throw new ArithmeticException();
			else if(i<=b.length)
				   throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	public static void main(String args[]) {
		int a=51,b[]= {24,23};
		checkMethod(a,b);
		
	}

}

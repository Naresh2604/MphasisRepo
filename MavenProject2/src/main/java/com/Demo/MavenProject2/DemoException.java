package com.Demo.MavenProject2;

public class DemoException {
	public static void main(String[] args) {
 		String str=null;
		try {
			System.out.println(str.charAt(5));
			
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println(ae.getMessage());
		}
		catch(NullPointerException ae) {
			System.err.println(ae.getMessage());
		}
		catch(RuntimeException ae) {
			System.out.println("ae");
			
		}
	
	

		System.out.println("application closed");
	}

}

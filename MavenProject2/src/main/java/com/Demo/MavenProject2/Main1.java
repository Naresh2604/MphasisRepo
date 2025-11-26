package com.Demo.MavenProject2;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
//		NamePrinter printer=(name) -> System.out.println("my name is" + name);
//		printer.printname("naresh");
		// TODO Auto-generated method stub
//		NamePrinter ni=(str) -> {System.out.println(new StringBuilder(str).reverse().toString());
//		
//		};
//		ni.StringReverse("Naresh");
//		NamePrinter ni=(num)->System.out.println (num%2==0 ? "even":"odd") ;
//		ni.EvenOdd(24);
//		String[] str= {"naresh","suresh","ramesh"};
//		NamePrinter ni=( String[] str1) -> {Arrays.sort(str);
//		for(String i:str)
//			System.out.println(i);
//		};
//			
//		ni.sort1(str);
		String[] str= {"naresh","suresh","ramesh"};
		NamePrinter ni=(String[] str1) -> { 
			int lengths[]=new int[str.length];
			for(int i=0;i<str.length;i++) {
				lengths[i]=str[i].length();
			}
			return lengths;
			
		};
		ni.findlength(str);

	}

}

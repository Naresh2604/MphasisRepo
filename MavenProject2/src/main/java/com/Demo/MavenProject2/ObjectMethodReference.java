package com.Demo.MavenProject2;

import java.util.function.Supplier;

public class ObjectMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myname="naresh";
		Supplier<Integer> lengthusinglambda=() ->  myname.length();
		Supplier<Integer> lengthusingMR=myname::length;
		System.out.println(lengthusingMR.get());

	}

}

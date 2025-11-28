package com.Design.pattern;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class DemoHashSet {
	public static void main(String[] args) {
		HashSet <Integer> hashset=new HashSet<Integer>();
		hashset.add(56);
		hashset.add(23);
		System.out.println(hashset);
		for(int i:hashset) {
			System.out.println(i);
		}
		LinkedHashSet<Integer> llset=new LinkedHashSet<>();
		llset.add(56);
		llset.add(23);
		System.out.println(llset);
		
		
		
	}
	}



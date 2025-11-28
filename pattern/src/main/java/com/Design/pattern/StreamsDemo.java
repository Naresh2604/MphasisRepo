package com.Design.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		Integer arr[]= {23,12,34,33,44};
		Arrays.stream(arr).forEach(System.out::println);
		List<Integer>iList=Arrays.stream(arr).collect(Collectors.toList());
		System.out.println(iList);
		Stream.of(arr).filter(n -> n%2==0).forEach(System.out::println);
		Arrays.stream(arr).map(num -> num+10).forEach(System.out::println);
		
		
 
	}

}

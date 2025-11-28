package com.Design.pattern;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {3,2,5,6,1,};
		System.out.println("enter the search element");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("element found at" +" " + (i+1) + "th position");
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("element not found");
		}
		

	}

}

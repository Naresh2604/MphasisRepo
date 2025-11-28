     package com.Design.pattern;

import java.util.Scanner;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println("enter the element to be searched");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("element found " + mid+1 + " " + "position");
				break;
			}else if(arr[mid]<key) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}if(low>high) {
			System.out.println("element not found");
		}

	}

}

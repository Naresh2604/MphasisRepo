package com.Design.pattern;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {23,34,54,23,12,53};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex])
					minindex=j;
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
			
		}for(int nums:arr) {
			System.out.println(nums);
			
		}
	


	}

}

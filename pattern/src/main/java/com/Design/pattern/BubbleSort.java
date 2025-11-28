package com.Design.pattern;

public class BubbleSort {

	public static void main(String[] args) {
       int arr[]= {23,54,45,12,34,67};
       int temp;
       for(int i=0;i<arr.length-1;i++) {
    	   for(int j=0;j<arr.length-i-1;j++) {
    		   if(arr[j]<arr[j+1]) {
    			   temp=arr[j];
    			   arr[j]=arr[j+1];
    			   arr[j+1]=temp;
    		   }
    	   }
    	   
    		   
    	   }for(int k=0;k<arr.length;k++) {
    		   System.out.println(arr[k]);
       }

	}

}

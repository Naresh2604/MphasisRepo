package com.Demo.MavenProject2;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		  int[] arr= {10,20,30,150};
		  System.out.println(Arrays.toString(arr));
          int[] crr=Arrays.copyOf(arr, 2);
          for(int ele:crr)
        	  System.out.println(ele);
          System.out.println(Arrays.toString(crr));

	}

}
           
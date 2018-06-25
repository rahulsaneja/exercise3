package com.stackroute.exercise3;

public class ConsecutiveNumbers {
	public boolean numberChecker(String str) {
		String splittedString[]=str.trim().split(",");
		  int arr[]= new int[7];
	       for(int i=0;i<7;i++) {
	           try {
	               arr[i]=Integer.parseInt(splittedString[i]);
	           } catch(Exception e) {
	               throw new IllegalArgumentException("only numbers are allowed");
	           }
	       }
	       for (int i = 0; i < arr.length - 1; i++) {
	            if ((arr[i + 1] - arr[i]) == 1||(arr[i + 1] - arr[i] == -1)) {
	            } else {
	                return  false;
	               
	            }
	       }
	       return true;
	}
}



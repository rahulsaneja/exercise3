package com.stackroute.exercise3;


public class MatrixAddition{
	public int[][] addMatrix(int a[][], int b[][]){
	 if(a.length!=b.length || a[0].length!=b[0].length)
		 throw new IllegalArgumentException("please enter a valid input");
	 int c[][]=new int[a.length][a[0].length];
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[0].length;j++) {
			 c[i][j]=a[i][j]+b[i][j];
		 
		 	}
	 	}
	return c;
	}
}
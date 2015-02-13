package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiply {
	
	//Multiply 2D matrix of m*n and p*q
	
	public static void multiplyMatrix(){
		
		Scanner in = new Scanner (System.in);
		System.out.println ("Enter the number of rows in first matrix");
		int m = in.nextInt();
		System.out.println ("Enter the number of columns in first matrix");
		int n = in.nextInt();
		
		System.out.println ("Enter the number of rows in 2nd matrix");
		int p = in.nextInt();
		System.out.println ("Enter the number of columns in 2nd matrix");
		int q = in.nextInt();
		
		if (n!=p)
		{
			System.out.println("Cannot multiply these matrices");
			return;
		}
		
		int[][] firstMatrix = new int[m][n];
		int[][] secondMatrix = new int[p][q];
		
		System.out.println("Input elements for First Matrix row to column");
		for (int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				firstMatrix[i][j] = in.nextInt();
		   }
		}
		System.out.println("Input elements for second Matrix row to column");
		for (int i=0; i<p;i++){
			for(int j=0; j<q; j++){
				secondMatrix[i][j] = in.nextInt();
		   }
		}
		
		
		//Print both the Matrices
		
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print(firstMatrix[i][j] + "\t"); //no new line print 
		    }
		    System.out.print("\n"); //After 1st row print new line;
		}
		
		for (int i = 0; i < p; i++) {
		    for (int j = 0; j < q; j++) {
		        System.out.print(secondMatrix[i][j] + "\t"); //no new line print 
		    }
		    System.out.print("\n"); //After 1st row print new line;
		}
	
	
	//Crux Multiply
	int[][] finalMatrix = new int[m][q];
	int sum =0;
		
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < q; j++) {
	    	  for (int z = 0; z< p; z++){
	    		  sum = sum + firstMatrix[i][z] *secondMatrix[z][j];
	    		
	    	}
	    	  finalMatrix[i][j] =sum;
	    	  sum=0;
	     }
	   }
	
		for ( int i = 0 ; i < m ; i++ )
	    {
	       for ( int j = 0 ; j < q ; j++ )
	          System.out.print(finalMatrix[i][j]+"\t");
	
	       System.out.print("\n");
	    }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixMultiply.multiplyMatrix();

	}

}

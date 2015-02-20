package Problems;

import java.util.Scanner;

public class ArrayMedian {

	public static int getMedian (int[] A, int[] B, int N ){
		
		int i=0;
		int j=0;
		int m1 =-1;
		int m2=-1;
		
		for (int count = 0; count<=N ;count++){
			if(i == N){
				m1=m2;
				m2= B[0];
				i++;
				break;
			}
			else if (j==N){
				m1=m2;
				m2 = A[0];
                j++;
                break;
			}
			
			if (A[i]<B[j]){
				m1 =m2;
				m2 = A[i];
				i++;
				
			}
			else {
				m1=m2;
				m2=A[j];
				j++;
			}
		}
		
		
		return (m1+m2)/2;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A = {1, 12, 15, 26, 38};
		int [] B = {2, 13, 17, 30, 45};
		
		if (A.length == B.length){
			System.out.println (ArrayMedian.getMedian(A,B,A.length));
		}
		else 
			System.out.println ("Cannot find median");
		
		
		

	}

}

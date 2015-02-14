package Problems;

/*Solution as similar to Geeks for Geeks in Java.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {
	
	public static Set<ArrayList<String>> permutations = new HashSet<ArrayList<String>>();
	
	
	
	public static void permuteArray(char[] c, int start, int length){
		if (start ==length)
			System.out.println(new String(c));
		else {
			for (int j=start; j<=length; j++){
				swap (c, start, j);
				permuteArray(c,start+1,length);
				swap (c, start, j); //BackTracking //Complexity is n*n! (Since recursion n! and for loop n times.)
			}
		}
	}
	
	public static void swap (char [] c, int firstIndex, int secondIndex){
		char temp = c[firstIndex];
		c[firstIndex] = c[secondIndex];
		c[secondIndex] = temp;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the string to Permute");
		String stringToPermute=in.nextLine();
		char [] stringToPermuteArray = stringToPermute.toCharArray();
		Permutation.permuteArray(stringToPermuteArray, 0,stringToPermuteArray.length-1 );
		
		// TODO Auto-generated method stub

	}

}

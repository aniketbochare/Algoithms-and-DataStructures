package Problems;

import java.util.Arrays;
import java.util.Collections;

public class AnagramChecker {
	
	public static boolean isAnagram (String s1, String s2){
		if (s1.length()!= s2.length()) return false;
		else{
			char [] chars1 = s1.toCharArray();
			char [] chars2 = s2.toCharArray();
             Arrays.sort(chars1);
             Arrays.sort(chars2);
             String sorteds1 = new String(chars1);
             String sorteds2 = new String(chars2);
             return(sorteds1.equals(sorteds2));
           
		}			
		
	}

	

	public static void main(String[] args) {
		
		String test1 = "Aniket";
		String test2 = "tekinA";
		System.out.println(AnagramChecker.isAnagram(test2, test1));
		// TODO Auto-generated method stub

	}

}

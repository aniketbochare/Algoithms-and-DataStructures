package Problems;

public class ReverseAndPalindrome {
	
	public static String reverse(String s){
		//System.out.println(s);
		
		char[] stringArray = s.toCharArray();
		int l = stringArray.length;
		for (int i =0; i<l/2; i++){
			char temp = stringArray[i];
			stringArray[i] = stringArray[l-1-i];
			stringArray[l-1-i] = temp;
		}
		
		return new String (stringArray);
		
	}
	
	public static boolean isPalindrome(String s){
		char[] stringArray = s.toCharArray();
		int l = stringArray.length;
		int i=0;
		while (i<l){
			if (stringArray[i] == stringArray[l-1])
			{
				i++;
				l--;
				
			}
			else
			 return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
	 String s = "Aniket";
	 String rev=ReverseAndPalindrome.reverse(s);
	 System.out.println(rev);
	 
	 String r = "mom";
	 boolean pal = ReverseAndPalindrome.isPalindrome(r);
	 if (pal)
		 System.out.println("Yes Palindrome");
	 else 
		 System.out.println("Not a Palindrome");
		
	}

}

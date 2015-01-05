package Problems;

public class StringReversal {
	
	public static String reverse (String s){
		if (s == null)
			return null;
		else {
			char [] sArray = s.toCharArray();
			int length = sArray.length;
		    int first = 0;
		    int last = length -1;
		    while(first<last) {
		    	char temp = sArray[first];
		    	sArray[first] = sArray[last];
		    	sArray[last] = temp;
		    	first++;
		    	last--;
		    }
		    return new String(sArray);
		    		
		}
	}


	public static void main(String[] args) {
		
		String test = "Aniket";
		System.out.println ("Reversed String = " +StringReversal.reverse(test));
		
		// TODO Auto-generated method stub

	}

}

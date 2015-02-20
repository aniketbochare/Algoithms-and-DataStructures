package Problems;

public class RecursiveReverse {
	
	public static String recursiveReverse(String s){
		
		if (s==null ||s.length()==1)
			return s;
		else 
			return recursiveReverse(s.substring(1)) + s.charAt(0);
		
	}
	
	//Uses divide and conquer.
	public static String reverseStringUsingRecursionSample(String sampleStr)

	{
	String rightString = "";String leftString = "";

	int len = sampleStr.length();

	if (len <= 1) return sampleStr;

	leftString = sampleStr.substring(0, len / 2);

	rightString = sampleStr.substring(len / 2, len);

	return reverseStringUsingRecursionSample(rightString) + reverseStringUsingRecursionSample(leftString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
		System.out.println(RecursiveReverse.recursiveReverse(s));

	}

}

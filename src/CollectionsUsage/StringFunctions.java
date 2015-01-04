package CollectionsUsage;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String steveQuote = " Your work is going to fill a large part of your life, "
				+ "and the only way to be truly satisfied is to do what you believe is great work. "
				+ "And the only way to do great work is to love what you do. If you haven't found it yet, keep looking. "
				+ "Don't settle. As with all matters of the heart, you'll know when you find it  ";
	   String sq = steveQuote;
	   
	   //Mostly used Instance functions testing. Immutable
	   System.out.println("steveQuote.length() = " +steveQuote.length());
	   System.out.println("steveQuote.charAt(2) = " +steveQuote.charAt(2));
	   System.out.println("steveQuote.codePointAt(9) = " +steveQuote.codePointAt(9));
	   System.out.println("steveQuote.compareTo(sq) = " +steveQuote.compareTo(sq));
	   System.out.println("steveQuote.concat = " +steveQuote.concat("- Steve Jobs"));
	   System.out.println("+steveQuote.hashCode() = " +steveQuote.hashCode());
	   System.out.println("steveQuote.indexOf w = " +steveQuote.indexOf("w"));
	   System.out.println("steveQuote.indexOf g after 5 index = " +steveQuote.indexOf("g", 5));
	   System.out.println("steveQuote.lastIndexOf e = " +steveQuote.lastIndexOf("e"));
	   System.out.println("steveQuote.substring(0,10) = " +steveQuote.substring(0,10));
	   System.out.println("steveQuote.toUpperCase() = " +steveQuote.toUpperCase());
	   System.out.println("steveQuote lower = " +steveQuote.toLowerCase());
	   System.out.println("steveQuote.toLowerCase() = " +steveQuote.replaceAll("work", "job"));
	   
	   System.out.println("steveQuote steveQuote.contains large part  steveQuote.contains = " +steveQuote.contains("large part"));
	   System.out.println("steveQuote steveQuote.endsWith find it  steveQuote.endsWith =  " +steveQuote.endsWith("find it  "));
	   char [] charQuote = steveQuote.toCharArray();
	   System.out.println("steveQuote steveQuote.isEmpty() = " +steveQuote.isEmpty());
	   
	   String viceversa = charQuote.toString();
	   System.out.println("Viceversa= " +viceversa);
	   
	   //Static Functions
	   
	   System.out.println("String.valueOf 1234 = " +String.valueOf("1234"));
	   System.out.println("String.valueOf 1234.55 = " +String.valueOf("1234.55"));
	   
	   long number1 = 12456;
	   double weight1 = 98.567;
	   
	   String weightString = Double.toString(weight1);
	   
	   
	   System.out.println("String value of number1 using Long.toString = " +Long.toString(number1));
	   //Rest of the primitive types follow similar pattern.
	   
	   //StringBuffer - Mutable,sync and StringBuilder not sync 
	   
	   StringBuilder sb = new StringBuilder("Larry Page and Segey Brin");
	   StringBuilder cf = new StringBuilder (" are of Google");
	   cf.append( 123);
	   cf.insert (5," cofounders");
	   
	   System.out.println("cf appended to sb = " +sb.append(cf));
	   
	   StringBuffer str = new StringBuffer("Hello");
	   str.reverse();
	   System.out.println(str);
	   
	   StringBuffer str1 = new StringBuffer("Hello World");
	   str1.replace( 6, 11, "java");
	   System.out.println(str1);
	   
	   //Most of the functions are mutating and similar between StringBuffer and StringBuilder.

	}

}

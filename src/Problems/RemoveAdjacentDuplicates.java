package Problems;

public class RemoveAdjacentDuplicates {
	/* Problem 1
	Input:  azxxzy
	Output: ay
	First "azxxzy" is reduced to "azzy". The string "azzy" contains duplicates, 
	so it is further reduced to "ay".
*/
	public static String RemoveAdjacents(String s){
		
		
		
		return s;
		
	}
	
/*Compress a string:-
 * abcabcaaaaaaaaaaaaabc -> a1b1c1a1b1c1a13b1c1 
 * */
	public static String compressString(String a){
		if(a.length()<2){return a;}
	    if(a.length()==2){if(a.charAt(0)==a.charAt(1)){return a.charAt(0)+"2";}else{return a;}}
	    for(int i=0;i<a.length();i++){
	        int c=i+1;
	        while(c<a.length()&&a.charAt(c)==a.charAt(i)){
	            c++;
	        }
	        if(c-i!=0){
	            a=a.substring(0,i+1)+(c-i)+a.substring(c);i++;
	        }

	    }
	    return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RemoveAdjacentDuplicates.compressString("aaabbcdddde"));

	}

}

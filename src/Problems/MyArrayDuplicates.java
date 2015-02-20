package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
 
public class MyArrayDuplicates {
	
	public static void usingHashMap(String[] input){
		HashMap<String,Integer> h = new <String,Integer> HashMap();
		for (String each : input){
			if (!h.containsKey(each)){
				h.put(each, 1); //Just having 1 shows it is only included once. Just like that
			 }
		  }	
		//System.out.println(h);
		for(String key : h.keySet()){
		System.out.println(key);
	}
		
   }
 
    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr); //Convert string array to tmplist.
        //create a treeset with the list, which eliminates duplicates
        TreeSet<String> unique = new TreeSet<String>(tmpList); //create TreeSet from List
        System.out.println(unique);
        System.out.println("Using Functions");
        MyArrayDuplicates.usingHashMap(strArr);
        
    }
}

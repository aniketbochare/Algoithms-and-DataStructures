package CollectionsUsage;

import java.util.*;

public class HashMapFunctions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,String> countryCapitals = new HashMap <String,String>(); //Blank Map and then put.
		
		countryCapitals.put("India", "New Delhi");
		countryCapitals.put("USA", "Washington DC");
		countryCapitals.put("Canada", "Ottawa");
		countryCapitals.put("UK", "London");
		
		System.out.println (countryCapitals);
		System.out.println (countryCapitals.get("UK"));
		
		System.out.println("Does HashMap contains USA as key: " + countryCapitals.containsKey("India"));
		System.out.println("Does HashMap contains Washington DC as value: " + countryCapitals.containsValue("Washington DC"));
		System.out.println("Does HashMap contains XX as value: " + countryCapitals.containsValue("XX")); 
		
		boolean isEmpty = countryCapitals.isEmpty();
		System.out.println("Is HashMap is empty: " + isEmpty);
		
		String countryKey = "Canada";
		Object capitalValue = countryCapitals.remove(countryKey);
		System.out.println("Following value is removed from Map: " + capitalValue);
		
		System.out.println (countryCapitals);

		System.out.println("***********End of Country Capitals************");
		

		//Initialize a map {{
		HashMap<Integer, String > charMap = new HashMap<Integer, String>(){{
	        put(1,"a");
	        put(2,"b");
	        put(3,"c");
	        put(4,"d");
	        put(5,"e");
	    }};
	    
	    System.out.println (charMap);
	    
	    //Using iterator
	    
	    Iterator<Integer> keySetIterator = charMap.keySet().iterator(); //Get iterator for all the keysets
	    
	    while (keySetIterator.hasNext()){
	    	Integer key = keySetIterator.next();
	    	System.out.println("Key = " +key + "Value = " +charMap.get(key));
	    }
	    
	    System.out.println("Size of Map: " + charMap.size());
	    
	    charMap.clear(); //clears hashmap , removes all element
	    System.out.println("Size of Map: " + charMap.size()); 


	    System.out.println("***********End of Charachter Map************");
	    
	    
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    
	    map.put(31, "Thirty One");
	    map.put(21, "Twenty One");
	    map.put(41, "Fourty One");

	    System.out.println("Unsorted HashMap: " + map);
	    TreeMap sortedHashMap = new TreeMap(map);      //Sorting create a TreeMap and then pass the HashMap and it will sort
	    System.out.println("Sorted HashMap: " + sortedHashMap); 
	    
	}


}

package CollectionsUsage;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFunctions {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mutable - ArrayList. Use this for programs.
		ArrayList<String> places = new ArrayList<String>();
		places.add("Buenos Aires");
		places.add("C—rdoba");
		places.add("La Plata");
		
		System.out.println("Size : " +places.size()); //Returns size
		System.out.println("IsEmpty? " +places.isEmpty());
		System.out.println("Contains Mumbai? " +places.contains("Mumbai"));
		
		System.out.println("List of Places : " +places);
		
		places.set(2, "New York"); //Using set change element of ArrayList.
		
		places.add("Mumbai");
		places.add("Delhi");
		places.add("Chennai");
		
		System.out.println("Contains Mumbai? " +places.contains("Mumbai"));
		
		System.out.println("List of Places : " +places);
		
		int indexXYZ = places.indexOf("XYZ");  //indexOf Returns -1 if the collection doesn't contain City 
		int indexOfMumbai = places.indexOf("Mumbai");  
		
		System.out.println("XYZ index= " +indexXYZ+ " and Mumbai index= " +indexOfMumbai);
		
		
		
		System.out.println("***********End of Places************");
		
		
		//Simple initializer with {{
		ArrayList<String> countries = new ArrayList<String>() {{
		    add("India");
		    add("USA");
		    add("UK");
		}};
		
		System.out.println("List of Countries : " +countries);
		
		System.out.println("***********End of Countries************");
        
		String [] thingsToDo = {"Shopping","Cooking","Running"}; 
		//Initialize as Array and then convert to arrayList using asList function.
		
		//Converting to List which is immutable
		
		List<String> myToDoList = new ArrayList<String>(Arrays.asList(thingsToDo)); 
		//Important if needs to convert from array initialize. Needs to be typecasted to String ArrayList.
		
		myToDoList.add("Cleaning");
		
		
		System.out.println("List of to dos : " +myToDoList);
		
		String [] newToDos = thingsToDo;
	
		thingsToDo[2] = "Studying";
		
		for (String thingToDo : thingsToDo) {
			//Printing arrays using enumerator.
			System.out.println(thingToDo);
		}
		
		System.out.println("Test new is equal to old : " +newToDos.equals(thingsToDo)); //Equality testing.
		
		//Arrays Class functions
		Arrays.sort(newToDos);
		
		
		for (String n : newToDos) {
			//Printing arrays using enumerator.
			System.out.println(n);
		}
		
		System.out.println("***********End of ToDos************");
		
		
	   Integer[] numbers = {5,2,4,3,1};
		
		for (String thingToDo : thingsToDo) {
			//Printing arrays using enumerator.
			System.out.println(thingToDo);
		}
		
        Arrays.sort(numbers);
		for (Integer number : numbers) {
			//Printing arrays using enumerator.
			System.out.println(number);
		}
			
		System.out.println("***********End of Numbers************");
		
	}

}

package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Given an array of Integer print all subsets;
//Understood logic from http://www.quora.com/How-do-I-generate-all-subsets-of-a-set-in-Java-iteratively
/*Logic :- if n = 4 there are  16 possible subsets 2^n and hence we can use a flag to iterate through those 4 elements
 * of a list by moving flag by << operator so keep flag as 1,2,4,8 and then use logical AND from 0 to 2^n=16 in this case
 * eg (Dont add anything firstime), (where bits are set result will not be =0 and then add that element).
 * If elements are {"A","B","C","D"} when index =5 (0101). Using left shift flag(1 and 4 will not be equal to 0 and hence we add elements B and D to set)
 * 
 */

public class SubsetIterator<E> {
	
	private final int max;
	private int index;
	private final List<E> set;
	//If needed store them in instance variable 
	
	public SubsetIterator(List<E> originalList){
		set = originalList;
		max = (1<< set.size());
		index=0;
	}
	
	public boolean hasNext(){
		return index< max;
	}
	
	public List <E> next(){
		List<E> newset = new ArrayList<E>();
		int flag =1;
		for(E element : set){
			if((index & flag)!=0){
				newset.add(element);
			}
			flag<<=1;
		}
		index++;
		return newset;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.println("What kind of elements you want to generate subsets for? String or Integer?");
		String answer = in.nextLine();
		if (answer.toString().equals("Integer")) {
			System.out.println ("Print the number of elements in the list");
			int numbers = in.nextInt();
			List<Integer>listofNumbers = new ArrayList<Integer>();
			System.out.println("Please input your numbers one by one");
			for (int i = 0; i<numbers; i++)
			{
				listofNumbers.add(in.nextInt());
			}
	        System.out.println(listofNumbers.toString());
	        SubsetIterator<Integer> it = new SubsetIterator<Integer>(listofNumbers);
	        while (it.hasNext()){
	        	System.out.println(it.next());
	        }
	        
		}
		else {
			System.out.println ("Print the number of elements in the list");
			int numbers = in.nextInt();
			List<String>listofStrings = new ArrayList<String>();
			System.out.println("Please input your Strings one by one");
			for (int i = 0; i<=numbers; i++)
			{
				String input = in.nextLine();
				if(!input.equals(""))
					listofStrings.add(input);
			}
	        System.out.println(listofStrings.toString());
	        
	        SubsetIterator<String> it = new SubsetIterator<String>(listofStrings);
	        while (it.hasNext()){
	        	System.out.println(it.next());
	        }
	        
			
		}
        
        
	}

}

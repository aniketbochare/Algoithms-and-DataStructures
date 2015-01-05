package Problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {
	//My Implementation.
	public static void removeDuplicateMap(String s) {
		if (s.isEmpty() ||s==null)
			return;
		else if (s.length() < 2)
			System.out.print(s);
		else{
			//Use LinkedHashMap since it maintains order of insertion.
			LinkedHashMap <Character,Integer> charCount = new LinkedHashMap <Character,Integer> ();
			for(Character c : s.toCharArray()) {
				if (!charCount.containsKey(c))
						charCount.put(c, 1);	
		}
			Iterator it = charCount.entrySet().iterator();
			while(it.hasNext()){
				Map.Entry <Character,Integer> pairs = (Map.Entry) it.next();
				System.out.print(pairs.getKey());
			}
			
	  }
		System.out.println();
}
	
	//Implementation by Gayle Lackmann
	public static void removeDuplicatesEff(char[] str) {
		if (str == null) return;
		int len = str.length;
		if (len < 2) return;

		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;

		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Aniiikeeet";
		String test2 = "A";
		String test3 = "AAAA";
		String test4 = "abcaabbccddedxzy";
		
		RemoveDuplicates.removeDuplicateMap(test);
		RemoveDuplicates.removeDuplicateMap(test2);
		RemoveDuplicates.removeDuplicateMap(test3);
		RemoveDuplicates.removeDuplicateMap(test4);

	}

}

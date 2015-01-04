package CollectionsUsage;

import java.util.*;

public class StackFunctions {
	
	static void showpush(Stack st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static void showpop(Stack st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }

	   public static void main(String args[]) {
	      Stack st = new Stack();
	      System.out.println("stack: " + st);
	      System.out.println("st.capacity()? : " +st.capacity());
	      showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99);
	      System.out.println("st.capacity()? : " +st.capacity());
	      System.out.println("Size of stack: " +st.size());
	      Stack cloneStack = (Stack) st.clone();
	      st.addAll(cloneStack);
	      st.addAll(cloneStack);
	      st.addAll(cloneStack);
	      System.out.println("Stack after addAll: " + st);
	      System.out.println("Clone stack: " + cloneStack);
	      
	      System.out.println("st.contains(42)? " + st.contains(42)); 
	    
	      Integer x = (Integer) st.get(2);
	      System.out.println("st.get(2) as String: " + x.toString()); 
	      cloneStack.clear();
	      System.out.println("Clone stack after clear: " + cloneStack);
	      //Bringing in ArrayList and copies the content of stack to Array List
	      ArrayList<Integer> mylist = new ArrayList<Integer>();
	      mylist.addAll(st);
	      System.out.println("My ArrayList" + mylist);
	      showpop(st);
	      showpop(st);
	      showpop(st);
	      System.out.println("Is Stack Empty? : " +st.isEmpty());
	      System.out.println("st.capacity();? : " +st.capacity());
	      System.out.println("st.firstElement()? : " +st.firstElement());
	      
	      st.clear();
	      
	      //clearing stack and its capacity starts with 10 and increases to 20 as per need.
	      try {
	         showpop(st);
	      } catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }
	   }


}

/**
 * @author Aniket Bochare
 * Implementation of Stack using LinkedList and using default implementations of LinkedList.
 * Date - 01/03/2015
 */
package DataStructures;

import java.util.LinkedList;


public class linkedStack {
	
    private LinkedList<Object> list = new LinkedList<Object>();
	
    public void push(Object item) {list.addFirst(item);}
    public Object pop() {return list.removeFirst();}
    public Object peek() {return list.getFirst();}
    public int size() {return list.size();}
    public boolean isEmpty() {return list.isEmpty();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

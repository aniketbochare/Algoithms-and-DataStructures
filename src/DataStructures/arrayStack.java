/**
 * @author Aniket Bochare
 * Implementation of Stack using fixed size (Arrays)
 * Date - 01/03/2015
 */

package DataStructures;

import java.util.Stack;
import java.util.NoSuchElementException;

public class arrayStack {
	
	private Object[] items;
	private int size = 0;
	
	public arrayStack(int size) {
		this.size = size;
	}
	
	public void push (Object item) {
		if (this.size == items.length) {
			throw new IllegalStateException ("Stack is full \n ");
		}
		items[size++] = item;
	}
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public Object pop () {
		if (!isEmpty()){
			Object itemPoped = items[size-1];
			items[--size] = null;
			return itemPoped;
		}
		else 
			throw new NoSuchElementException ("Empty Stack and cannot pop \n");
	}
	
	public Object peek () {
		if (!isEmpty())
			return items[size-1];
		else 
			throw new NoSuchElementException ("Empty Stack and cannot pop \n");
	}
	
	public static void main(String[] args) {
		
	}

}

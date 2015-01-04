/**
 * @author Aniket Bochare
 * Implementation of LinkedList
 * Date - 01/03/2015
 */

package DataStructures;

public class myLinkedList {
	
	public Node head;
	private int count;
	
	//LinkList Constructor
	
	myLinkedList () {
		this.head = new Node(null);
		this.count = 0;
	}
	
	//Append node to the list
	public void add(Object data) {
		Node newNode = new Node(data);
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		//newNode.next = null;
		count++;
	}
	
	//Add a node at index
	public void add(Object data, int index) {
		Node newNode = new Node(data);
		Node current = head;
		
		for (int i = 0 ; i<index; i++) {
			current = current.next;
		}
		
		newNode.next = current.next;
		current.next = newNode;
		count++;
	}
	
   //Get a node at index
	
	public Object get(int index) {
		
		Node current = head;
		for (int i = 0 ; i<=index; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	public boolean remove(int index) {
		
		if (index < 0 || index>= count)
		{
			return false;
		}
		Node current = head;
		for (int i = 0 ; i<index; i++) {
			if (current.next == null) return false;
			current = current.next;
		}
		Node nodeToDelete = current.next;
		current.next =  nodeToDelete.next;
		nodeToDelete.next = null;
		nodeToDelete.data = null;
		count--;
	    return true;	
	}
	
	 // returns the number of nodes in this LinkedList.
	public int size() {
        return count;
    }

	//Print the LinkedList
	public String toString() {
        Node current = head.next;
        String pList = "";
        while (current != null) {
        	pList += "[" + current.data.toString() + "]->";
            current = current.next;
        }
        return pList;
    }
	
	private static class Node {
		private Object data;
		private Node next;
		
		//Node Constructor
		Node (Object data) {
			this.data = data;
			this.next = null;
		}
		
		//Another Constructor
		
		Node (Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLinkedList myList = new myLinkedList();
		 
        // add elements to LinkedList
		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
 
        /*
         * Please note that primitive values can not be added into LinkedList
         * directly. They must be converted to their corresponding wrapper
         * class.
         */
 
        System.out.println("Initial List " + myList+ " and its size = " +myList.size());
        System.out.println("Get 3rd element: " + myList.get(3));
        System.out.println("Remove 2nd element: " + myList.remove(2));
        System.out.println("Get 3rd element: " + myList.get(3));
        System.out.println("Size of Linked List"  + myList.size());
        System.out.println("Print LinkedList" + myList);
		
	}

}

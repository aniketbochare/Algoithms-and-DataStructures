/**
 * @author Aniket Bochare
 * Implementation of Queue using fixed size (Arrays)
 * Date - 01/04/2015
 */

package DataStructures;

public class myQueue {
	
	private static final int MAX_QUEUE = 30;
	
	private int rear, front;
	private int[] items;
	
	//Also keep track of size.
	myQueue(){
		items = new int[30];
		rear = front = MAX_QUEUE -1;
	}

    boolean isEmpty(){
    	return ((rear == front) ? true : false);
    }
    
    boolean enqueue(int data){
    	if(rear == (MAX_QUEUE-1)){
    		rear =0 ;
    	}else {
    		rear++;
    	}
    	if (rear == front){
    		System.out.println("Overflow cant enqueue");
    		return false;
    	}
    	else{ 
    		items[rear] = data;
    	    return true;
    	}    
    }
    
    int dequeue (){
    	if (isEmpty())
    	{
    		System.out.println("Underflow cant dequeue");
    		return 0;
    	}
    	else{
		    	if (front == (MAX_QUEUE-1))
		    	{
		    		front = 0;
		    	}
		    	else {
		    		front++;
		    	}
		    	int itemToReturned = items[front];
		    	items[front] = 0;
		   return itemToReturned;
		    
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

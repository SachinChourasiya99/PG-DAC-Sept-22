/* 8. Write a Java program to append the specified element to the end of a linked list. */

import java.util.*;

class DiwaliCollection8
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.add(20);
		l.addLast(5);                                            
		l.add(50);
		l.addFirst(50);
	    		
		System.out.println("LinkedList : "+l);
			
	}
}

/*

Output :


C:\CdacDiwaliOffer22\Collection>java DiwaliCollection8
Original LinkedList : [50, 10, 20, 5, 50]

C:\CdacDiwaliOffer22\Collection>

*/
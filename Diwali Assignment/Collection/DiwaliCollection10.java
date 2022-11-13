/* 10. Write a Java program to insert elements into the linked list at the first and last position. */

import java.util.*;

class DiwaliCollection10
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);                                            
		l.add(40);
		l.add(50);
	    		
		System.out.println("Original LinkedList : "+l);
		l.addFirst(5);
		System.out.println("After adding a element at the first position in LinkedList : "+l);
		l.addLast(60);
		System.out.println("After adding a element at the last position in LinkedList : "+l);
	}
}


/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection10
Original LinkedList : [10, 20, 30, 40, 50]
After adding a element at the first position in LinkedList : [5, 10, 20, 30, 40, 50]
After adding a element at the last position in LinkedList : [5, 10, 20, 30, 40, 50, 60]

C:\CdacDiwaliOffer22\Collection>

*/


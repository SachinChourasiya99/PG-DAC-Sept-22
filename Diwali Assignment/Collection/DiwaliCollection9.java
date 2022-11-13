/* 9. Write a Java program to insert the specified element at the specified position in the linked list. */

import java.util.*;

class DiwaliCollection9
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
		l.add(2,25);
		System.out.println("After adding a element at specified position in LinkedList : "+l);
	}
}

/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection9
Original LinkedList : [10, 20, 30, 40, 50]
After adding a element at specified position in LinkedList : [10, 20, 25, 30, 40, 50]

C:\CdacDiwaliOffer22\Collection>

*/
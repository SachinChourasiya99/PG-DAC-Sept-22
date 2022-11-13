/* 14. Write a Java program to replace an element in a linked list. */

import java.util.*;

class DiwaliCollection14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(25);
		l.add(33);
		l.add(48);
		l.add(50);
	    		
		System.out.println("Original LinkedList : "+l);
		
		l.set(3,100);
		System.out.println("After replacement of element in LinkedList : "+l);
		
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Collection>javac DiwaliCollection14.java
Note: DiwaliCollection14.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection14
Original LinkedList : [10, 25, 33, 48, 50]
After replacement of element in LinkedList : [10, 25, 33, 100, 50]

C:\CdacDiwaliOffer22\Collection>


*/
/* 11. Write a Java program to display the elements and their positions in a linked list.  */

import java.util.*;

class DiwaliCollection11
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(25);
		l.add(33);
		l.add(48);
		l.add(50);
	    		
		System.out.println("Original LinkedList : "+l);
		
		System.out.println("Original LinkedList With Order : ");
		
		for(int i=0; i<l.size(); i++)
			System.out.println(l.get(i)+"--->"+i);
			
	}
}


/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection11
Original LinkedList : [10, 25, 33, 48, 50]
Original LinkedList With Order :
10--->0
25--->1
33--->2
48--->3
50--->4

C:\CdacDiwaliOffer22\Collection>

*/







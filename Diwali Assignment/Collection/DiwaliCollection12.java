/* 12. Write a Java program to check if a particular element exists in a linked list.  */

import java.util.*;

class DiwaliCollection12
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
		System.out.print("Enter a element to check it is exists or not : ");
		Integer key = sc.nextInt();
		Integer i = 0;
		
			if(l.contains(key))
				System.out.println("Element "+key+" is exists.");
			else
				System.out.println("Element "+key+" is not exists.");
		
	}
}

/*  
Output : 

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection12
Original LinkedList : [10, 25, 33, 48, 50]
Enter a element to check it is exists or not : 25
Element 25 is exists.

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection12
Original LinkedList : [10, 25, 33, 48, 50]
Enter a element to check it is exists or not : 31
Element 31 is not exists.

C:\CdacDiwaliOffer22\Collection>

*/








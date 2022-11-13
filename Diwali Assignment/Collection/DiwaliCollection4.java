/* 4. Write a Java program to sort a given array list. */

import java.util.*;

class DiwaliCollection4
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("Red");
		l.add("Black");
		l.add("White");
		l.add("Green");
		l.add("Yellow");
	    		
		System.out.println("Before sorting : "+l);
		Collections.sort(l);
		System.out.println("After sorting : "+l);
	}
}

/* 

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection4
Before sorting : [Red, Black, White, Green, Yellow]
After sorting : [Black, Green, Red, White, Yellow]

C:\CdacDiwaliOffer22\Collection>

*/







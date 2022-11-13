/* 6. Write a Java program of swap two elements in an array list. */

import java.util.*;

class DiwaliCollection6
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("Red");
		l.add("Black");
		l.add("White");
		l.add("Green");
		l.add("Yellow");
	    		
		System.out.println("Before Swap : "+l);
		Collections.swap(l,2,4);
		System.out.println("After Swap : "+l);
	}
}

/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection6
Before Swap : [Red, Black, White, Green, Yellow]
After Swap : [Red, Black, Yellow, Green, White]

C:\CdacDiwaliOffer22\Collection>

*/






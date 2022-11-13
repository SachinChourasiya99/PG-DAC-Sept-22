/* 5. Write a Java program to reverse elements in a array list. */

import java.util.*;

class DiwaliCollection5
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("Red");
		l.add("Black");
		l.add("White");
		l.add("Green");
		l.add("Yellow");
	    		
		System.out.println("Before reverse : "+l);
		Collections.reverse(l);
		System.out.println("After reverse : "+l);
	}
}

/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection5
Before reverse : [Red, Black, White, Green, Yellow]
After reverse : [Yellow, Green, White, Black, Red]

C:\CdacDiwaliOffer22\Collection>

*/







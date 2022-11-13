/* 2. Write a Java program to insert an element into the array list at the first position. */

import java.util.*;

class DiwaliCollection2
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("Red");
		l.add("Black");
		l.add("White");
		l.add("Green");
		l.add("Yellow");
		
		System.out.println(l);
		l.add(0,"Grey");
		System.out.println(l);
	}
}

/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection2
[Red, Black, White, Green, Yellow]
[Grey, Red, Black, White, Green, Yellow]

C:\CdacDiwaliOffer22\Collection>

*/

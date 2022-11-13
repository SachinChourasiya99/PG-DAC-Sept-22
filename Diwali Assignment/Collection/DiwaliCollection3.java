/* 3. Write a Java program to retrieve an element (at a specified index) from a given array list. */

import java.util.*;

class DiwaliCollection3
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("Red");
		l.add("Black");
		l.add("White");
		l.add("Green");
		l.add("Yellow");
		Object j = l.get(2);
		
		System.out.println(j);
	}
}

/*

Output :


C:\CdacDiwaliOffer22\Collection>java DiwaliCollection3
White

C:\CdacDiwaliOffer22\Collection>

*/






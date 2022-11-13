/* 25. Write a Java program to get the value of a specified key in a map. */

import java.util.*;

class DiwaliCollection25
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1 = new HashMap<>();
		h1.put(1, "Black");
		h1.put(2, "Green");
		h1.put(3, "White");
		h1.put(4, "Blue");
		h1.put(5, "Yellow");
	
		String res = h1.get(4);
		System.out.println("Value of key is : "+res);

	}
}

/*
Output :
C:\CdacDiwaliOffer22\Collection>java DiwaliCollection25
Value of key is : Blue

C:\CdacDiwaliOffer22\Collection>

*/
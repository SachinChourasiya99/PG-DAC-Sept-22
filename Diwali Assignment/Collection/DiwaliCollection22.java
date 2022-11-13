/* 22. Write a Java program to count the number of key-value (size) mappings in a map. */

import java.util.*;

class DiwaliCollection22
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1 = new HashMap<>();
		h1.put(1, "Black");
		h1.put(2, "Green");
		h1.put(3, "White");
		h1.put(4, "Blue");
		h1.put(5, "Yellow");
		System.out.println("Size of the Hash Map : "+h1.size());
		
	}
}

/* 
Output :


C:\CdacDiwaliOffer22\Collection>java DiwaliCollection22
Size of the Hash Map : 5

C:\CdacDiwaliOffer22\Collection>

*/
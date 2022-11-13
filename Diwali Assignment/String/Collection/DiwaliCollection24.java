/* 24. Write a Java program to check whether a map contains key-value mappings (empty) or not. */

import java.util.*;

class DiwaliCollection24
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
		
		boolean res = h1.isEmpty();
		System.out.println("Is map is empty or not : "+res);
		
		h1.clear();
		res = h1.isEmpty();
		System.out.println("Is map is empty or not : "+res);

	}
}

/*
Output : 

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection24
Size of the Hash Map : 5
Is map is empty or not : false
Is map is empty or not : true

C:\CdacDiwaliOffer22\Collection>


*/
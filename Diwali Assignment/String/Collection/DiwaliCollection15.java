/* 15. Write a Java program to iterate through all elements in a hash list. */

import java.util.*;

class DiwaliCollection15
{
	public static void main(String[] args)
	{
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h1.add(6);
		h1.add(7);
		
		Iterator<Integer> i = h1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection15
1
2
3
4
5
6
7

C:\CdacDiwaliOffer22\Collection>

*/
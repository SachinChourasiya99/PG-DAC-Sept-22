/* 17. Write a Java program to convert a hash set to an array. */

import java.util.*;

class DiwaliCollection17
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
		
		System.out.println("Original HashSet : "+h1);
		
		Integer[] a1 = new Integer[h1.size()];
		h1.toArray(a1);
		
		System.out.println("Array elements : ");
		for(Integer i : a1)
		{
			System.out.println(i);
		}
		
	}
}

/*
Output : 

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection17
Original HashSet : [1, 2, 3, 4, 5, 6, 7]
Array elements :
1
2
3
4
5
6
7

C:\CdacDiwaliOffer22\Collection>

*/
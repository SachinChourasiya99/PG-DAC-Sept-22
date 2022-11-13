/* 20. Write a Java program to find the numbers less than 7 in a tree set. */

import java.util.*;

class DiwaliCollection20
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(4);
		t1.add(8);
		t1.add(2);
		t1.add(7);
		t1.add(1);
	
		System.out.println("Tree Set : "+t1);
		
		TreeSet<Integer> t2 = new TreeSet<>();
		t2 = (TreeSet)t1.headSet(7);
		
		Iterator iter;
		iter = t2.iterator();
		
		System.out.println("Tree Set : ");
		while(iter.hasNext())
		{
			System.out.println(iter.next()+ " ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection20
Tree Set : [1, 2, 4, 7, 8]
Tree Set :
1
2
4

C:\CdacDiwaliOffer22\Collection>

*/
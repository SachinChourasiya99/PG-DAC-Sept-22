/* 18. Write a Java program to compare two sets and retain elements which are same on both sets. */

import java.util.*;

class DiwaliCollection18
{
	public static void main(String[] args)
	{
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(7);
		h1.add(6);
		h1.add(7);
		
		System.out.println("First HashSet : "+h1);
		
		HashSet<Integer> h2 = new HashSet<>();
		h2.add(62);
		h2.add(51);
		h2.add(42);
		h2.add(35);
		h2.add(26);
		h2.add(12);
		h2.add(07);
		
		System.out.println("Second HashSet : "+h2);
		
		h1.retainAll(h2);
		System.out.println("After retain HashSet : "+h1);
	
	}
}

/*
Output : 

C:\CdacDiwaliOffer22\Collection>javac DiwaliCollection18.java

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection18
First HashSet : [1, 2, 3, 4, 6, 7]
Second HashSet : [51, 35, 7, 42, 26, 12, 62]
After retain HashSet : [7]

C:\CdacDiwaliOffer22\Collection>

*/
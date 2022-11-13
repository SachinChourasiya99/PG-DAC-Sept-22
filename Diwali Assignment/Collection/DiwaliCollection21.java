/* 21. Write a Java program to remove all the elements from a priority queue. */

import java.util.*;

class DiwaliCollection21
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		p1.add(45);
		p1.add(81);
		p1.add(2);
		p1.add(72);
		p1.add(10);
		
		System.out.println("Priority Queue : "+p1);
		p1.clear();
		
		System.out.println("After removeAll Priority Queue : "+p1);
		
	}
}

/* 
Output :


C:\CdacDiwaliOffer22\Collection>javac DiwaliCollection21.java

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection21
Priority Queue : [2, 10, 45, 81, 72]
After removeAll Priority Queue : []

C:\CdacDiwaliOffer22\Collection>

*/
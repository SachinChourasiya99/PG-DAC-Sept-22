/* 23. Write a Java program to convert a priority queue to an array containing all of the elements of the queue. */

import java.util.*;

class DiwaliCollection23
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
		
		List<Integer> a1 = new ArrayList<Integer>(p1);
		System.out.println("Array : "+a1);
	}
}	

/*
Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection23
Priority Queue : [2, 10, 45, 81, 72]
Array : [2, 10, 45, 81, 72]

C:\CdacDiwaliOffer22\Collection>

*/
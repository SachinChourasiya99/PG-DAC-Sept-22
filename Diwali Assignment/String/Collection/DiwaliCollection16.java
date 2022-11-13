/* 16. Write a Java program to empty an hash set. */

import java.util.*;

class DiwaliCollection16
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
		h1.clear();
		System.out.println("Empty HashSet : "+h1);
	}
}
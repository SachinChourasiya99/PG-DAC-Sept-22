/* 19. Write a Java program to create a new tree set, add some colors (string) and print out the tree set. */

import java.util.*;

class DiwaliCollection19
{
	public static void main(String[] args)
	{
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Red");
		t1.add("Blue");
		t1.add("Black");
		t1.add("Yellow");
		t1.add("Green");
		
		System.out.println("Tree Set : "+t1);
		
	}
}
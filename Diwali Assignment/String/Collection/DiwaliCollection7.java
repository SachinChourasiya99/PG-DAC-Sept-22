/* 7. Write a Java program to print all the elements of a ArrayList using the position of the elements. */

import java.util.*;

class DiwaliCollection7
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
	    		
		System.out.println("Original ArrayList : "+l);
		
		System.out.println("Original ArrayList With Order : ");
		
		for(int i=0; i<l.size(); i++)
			System.out.println(l.get(i)+"--->"+i);
			
	}
}

/*

Output :

C:\CdacDiwaliOffer22\Collection>java DiwaliCollection7
Original ArrayList : [10, 20, 30, 40, 50]
Original ArrayList With Order :
10--->0
20--->1
30--->2
40--->3
50--->4

C:\CdacDiwaliOffer22\Collection>

*/








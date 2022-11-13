/* 22. How to convert Array to TreeSet in java ?  */

import java.util.*;
 
public class DiwaliArray22 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer[] arr=new Integer[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		TreeSet<Integer> t = new TreeSet<Integer>();
	   
		for(int a : arr)
		{
			t.add(a);
		}
		
		System.out.println("TreeSet contains: " + t);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray22
Enter Array Size :5
Enter Array Elements :37
77
8
5

2
TreeSet contains: [2, 5, 8, 37, 77]

C:\CdacDiwaliOffer22\Array>

*/
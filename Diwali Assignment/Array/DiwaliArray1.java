/* 1. Write a program to print elements of Array ? */

import java.util.*;

class DiwaliArray1
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
	}
	
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray1
Enter Array Size :5
Enter Array Elements :33
22
11
88
66
Array Elements are :33   22   11   88   66
C:\CdacDiwaliOffer22\Array>

*/
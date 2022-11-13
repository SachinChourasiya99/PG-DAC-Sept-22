/* 24. Write a Program to sort String on their length in Java? Your method should accept an 
array of String and return a sorted array based upon the length of String. Don't forget to 
write unit tests for your solution. */

import java.util.*;
class DiwaliString24
{
	static void sort(String []s, int n)
	{
		for (int i=1 ;i<n; i++)
		{
			String temp = s[i];

			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length())
			{
				s[j+1] = s[j];
				j--;
			}
			s[j+1] = temp;
		}
	}
	static void printArraystring(String str[], int n)
	{
		for (int i=0; i<n; i++)
			System.out.print(str[i]+" ");
	}

	public static void main(String args[])
	{
		
		String []arr = {"coders","are","we"};
		System.out.print("before sorting : ");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("After sorting : ");
		int n = arr.length;
		sort(arr,n);
		printArraystring(arr, n);
		
	}
}

/*
Output :
C:\CdacDiwaliOffer22\String>javac DiwaliString24.java

C:\CdacDiwaliOffer22\String>java DiwaliString24
before sorting : coders are we
After sorting : we are coders
C:\CdacDiwaliOffer22\String>

*/
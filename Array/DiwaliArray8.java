/* 8. Write a program which takes an array of integers and prints the running average of 3 
consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...) */

import java.util.*;

class DiwaliArray8
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
		int sum=0;
		int avg=0;
		
		int arr2[]=new int[size-2];
		for(int i=0;i<size-2;i++)
		{
			sum=arr[i]+arr[i+1]+arr[i+2];
			avg=sum/3;
			arr2[i]=avg;
		}
		
		System.out.print("Running average of 3 consecutive integers :");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"   ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray8
Enter Array Size :5
Enter Array Elements :5
14
35
89
140
Running average of 3 consecutive integers :18   46   88
C:\CdacDiwaliOffer22\Array>


*/
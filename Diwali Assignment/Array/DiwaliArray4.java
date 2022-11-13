/* 4. Write a program to reverse an Array in java. */

import java.util.*;

class DiwaliArray4
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
		int[] temp=new int[size];
		int j=0;
		for(int i=size-1;i>=0;i--)
		{
			temp[j]=arr[i];
			j++;
		}
		System.out.print("Reverse Array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=temp[i];
			System.out.print(arr[i]+"  ");
			
		}
	}
}

/*
Output :
C:\CdacDiwaliOffer22\Array>java DiwaliArray4
Enter Array Size :5
Enter Array Elements :7
54
8
3
5
Reverse Array :5  3  8  54  7
C:\CdacDiwaliOffer22\Array>

*/

/* 3. Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number? */

import java.util.*;

class DiwaliArray3
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Sum value :");
		int sum=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if((arr[i]+arr[j]) == sum)
				{
					System.out.print("["+arr[i]+","+arr[j]+"]");
				}
			}

		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray3
Enter Array Size : 5
Enter Array Elements : 6
4
2
1
4
Enter Sum value :6
[4,2][2,4][2,4][4,2]
C:\CdacDiwaliOffer22\Array>

*/
/* 18. How to find duplicate elements in a given Array. */

import java.util.*;

class DiwaliArray18
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
		int k=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					temp[k]=arr[i];
					k++;
				}
			}
		}
		if(k==0)
		{
			System.out.print("Array not contain any duplicate element.");
		}
		else
		{
			System.out.print("Duplicate elements = ");
			for(int i=0;i<k;i++)
			{
				System.out.print(temp[i]+"   ");
			}
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray18
Enter Array Size :5
Enter Array Elements :1
2
3
4
5
Array not contain any duplicate element.

C:\CdacDiwaliOffer22\Array>java DiwaliArray18
Enter Array Size :5
Enter Array Elements :1
21
3
1
3
Duplicate elements = 1   3
C:\CdacDiwaliOffer22\Array>

*/
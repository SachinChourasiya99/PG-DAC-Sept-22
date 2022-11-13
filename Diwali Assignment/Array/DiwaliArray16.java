/* 16. Given two arrays, find the intersection between them? */

import java.util.*;

class DiwaliArray16
{
	public static void main(String[] args)
	{
		System.out.print("Enter First Array Size :");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.print("Enter First Array Elements :");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter Second Array Size :");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.print("Enter Second Array Elements :");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] temp=new int[size1];
		int k=0;
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					temp[k]=arr1[i];
					k++;
				}
			}
		}
		System.out.print("InterSection = ");
		for(int i=0;i<k;i++)
		{
			System.out.print(temp[i]+"   ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray16
Enter First Array Size :5
Enter First Array Elements :1
2
3
45
5
Enter Second Array Size :5
Enter Second Array Elements :5
4
3
2
88
InterSection = 2   3   5
C:\CdacDiwaliOffer22\Array>

*/
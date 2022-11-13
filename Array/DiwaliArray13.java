/* 13. Write a program to sort an Array in Java ? */

import java.util.*;

class DiwaliArray13
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
		for (int i=0;i<size;i++)   
		{  
			for (int j=i+1;j<size;j++)   
			{  
				int temp = 0;  
				if(arr[i]>arr[j])   
				{  
					temp=arr[i];  
					arr[i]=arr[j];  
					arr[j]=temp;  
				}  
			}
		}  
		System.out.print("Sorted Array Elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray13
Enter Array Size :6
Enter Array Elements :5
3
32
554
212
534
Sorted Array Elements are :3   5   32   212   534   554
C:\CdacDiwaliOffer22\Array>

*/
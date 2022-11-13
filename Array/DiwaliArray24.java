/* 24. Write a program to find second largest element in a given Array in java? */

import java.util.*;

class DiwaliArray24
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
		int temp=0;
		for(int i=0;i<size;i++)   
        {  
            for(int j=i+1;j<size;j++)   
            {  
                if(arr[i]>arr[j])   
                {  
                    temp=arr[i];  
                    arr[i]=arr[j];  
                    arr[j]=temp;  
                }  
            }  
        } 
		System.out.print("Second largest = "+arr[size-2]);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray24
Enter Array Size :5
Enter Array Elements :2
56
2
88
5
Second largest = 56
C:\CdacDiwaliOffer22\Array>

*/
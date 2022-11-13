/* 7. Write a program to merge two arrays of integers by reading one number at a time from 
each array until one of the array is exhausted, and then concatenating the remaining 
numbers.
Input: [23,60,94,3,102] and [42,16,74]
Output: [23,42,60,16,94,74,3,102] */ 

import java.util.*;

class DiwaliArray7
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
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int merge=size1+size2;
        int arr3[] = new int[merge];
       	int i=0;
		int j=0;
		int k=0;
		
		while (i<size1 && j<size2)
        {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
		
        while (i<size1)
            arr3[k++] = arr1[i++];
		
		while (j<size2)
            arr3[k++] = arr2[j++];   
		 
     
        System.out.println("Array after merging");
        for (i=0;i<merge;i++)
            System.out.print(arr3[i] + " ");
    }
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray7
Enter First Array Size :5
Enter First Array Elements :3
2
6
21
8
Enter Second Array Size :5
Enter Array Elements :333
74
3
7
2
Array after merging
3 333 2 74 6 3 21 7 8 2
C:\CdacDiwaliOffer22\Array>

*/
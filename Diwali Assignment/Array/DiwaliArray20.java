/* 20. How do you separate zeros and non-zeros in a given Array in java? */

import java.util.*;

class DiwaliArray20
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter Array Elements : ");
		int[] op=new int[size];
		int k=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				op[k]=arr[i];
				k++;
			}
		}
		System.out.print("Array Elements are : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		System.out.print("After seperation array elements are : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(op[i]+"   ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray20
Enter Array Size :5
Enter Array Elements : 1
2
0
6
0
Array Elements are : 1   2   0   6   0
After seperation array elements are : 1   2   6   0   0
C:\CdacDiwaliOffer22\Array>


*/
/* 19. Write a program to sum all the values of a given Array in java?  */

import java.util.*;

class DiwaliArray19
{
	public static void main(String[] args)
	{
		System.out.print("Enter Array Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.print("Enter Array Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("Sum of array element = "+sum);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray19
Enter Array Size :5
Enter Array Elements :88
5
3
7
2
Sum of array element = 105
C:\CdacDiwaliOffer22\Array>

*/
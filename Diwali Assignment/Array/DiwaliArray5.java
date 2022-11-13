/* 5. Find out smallest and largest number in a given Array? */

import java.util.*;

class DiwaliArray5
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
		int min=arr[0]; 
		int max=arr[0];
        for(int i=1;i<size;i++) 
		{
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];  
        }
		System.out.println(" Largest = "+max);
		System.out.println(" Smallest = "+min);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray5
Enter Array Size :5
Enter Array Elements :4
2
66
2
77
 Largest = 77
 Smallest = 2

C:\CdacDiwaliOffer22\Array>

*/
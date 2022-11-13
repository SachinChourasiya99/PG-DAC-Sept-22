/* 2. Write a Java program to check the equality of two arrays? */

import java.util.*;

class DiwaliArray2
{
	public static void main(String[] args)
	{ 
		System.out.print("Enter First Arrays Size :");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.print("Enter First Array Elements :");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("Enter Second Arrays Size :");
		int size2=sc.nextInt();
		int count=0;
		if(size2==size1)
		{
			int[] arr2=new int[size2];
			System.out.print("Enter Second Array Elements :");
			for(int i=0;i<size2;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			for(int i=0;i<size1;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("Array Not Equal");
					break;
				}
				else
				{
					count++;
				}
			}
			if(count==size1)
			{
				System.out.println("Array Equal");	
			}
			
		}
		else
		{
			System.out.println("Array Not Equal");		
		}
	}	
}

/* 
Output : 

C:\CdacDiwaliOffer22\Array>java DiwaliArray2
Enter First Arrays Size :5
Enter First Array Elements :4
5
3
2
1
Enter Second Arrays Size :5
Enter Second Array Elements :4
55
3
2
4
Array Not Equal

C:\CdacDiwaliOffer22\Array>

C:\CdacDiwaliOffer22\Array>java DiwaliArray2
Enter First Arrays Size :5
Enter First Array Elements :5
4
3
2
1
Enter Second Arrays Size :5
Enter Second Array Elements :5
4
3
2
1
Array Equal

C:\CdacDiwaliOffer22\Array>

C:\CdacDiwaliOffer22\Array>java DiwaliArray2
Enter First Arrays Size :4
Enter First Array Elements :3
4
2

4
Enter Second Arrays Size :2
Array Not Equal

C:\CdacDiwaliOffer22\Array>

*/
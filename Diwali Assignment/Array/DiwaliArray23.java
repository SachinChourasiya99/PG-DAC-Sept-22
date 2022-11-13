/* 23. How to convert ArrayList to String Array in java? */

import java.util.*;  
public class DiwaliArray23 
{  
	public static void main(String[] args)   
	{     
		ArrayList<String> list= new ArrayList<String>();
		System.out.print("Enter ArrayList Size :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++)
		{
			String str=sc.nextLine();
			list.add(str);
		}
		
		String arr[] = new String[list.size()];                
		for(int j=0;j<list.size();j++)
		{  
			arr[j]=list.get(j);  
		}  
		
		System.out.println("After converion of arraylist to string array");
		for(String k : arr)  
		{  
			System.out.println(k);   
		}  
	}  
}  

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray23
Enter ArrayList Size :5
Enter Elements :
Hello, Dosto
How
are
you
!
After converion of arraylist to string array
Hello, Dosto
How
are
you
!

C:\CdacDiwaliOffer22\Array>

*/
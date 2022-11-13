/* 10. Java Program to Swap Objects using Swap() Method. */

import java.util.*;

class SwapObject
{
	int num;
}

class DiwaliClass10
{
	static void swap(SwapObject s1,SwapObject s2)
	{
		int temp;
		
		temp=s1.num;
		s1.num=s2.num;
		s2.num=temp;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SwapObject s1=new SwapObject();
		SwapObject s2=new SwapObject();
		System.out.print("Enter value of number for first objet :");
		s1.num=sc.nextInt();
		System.out.print("Enter value of number for second objet :");
		s2.num=sc.nextInt();
		
		System.out.println("===========Before Swapping=============");
		System.out.println("Value of object 1 number :"+s1.num);
		System.out.println("Value of object 2 number :"+s2.num);
		swap(s1,s2);
		System.out.println("===========After Swapping=============");
		System.out.println("Value of object 1 number :"+s1.num);
		System.out.println("Value of object 2 number :"+s2.num);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass10.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass10
Enter value of number for first objet :545
Enter value of number for second objet :234
===========Before Swapping=============
Value of object 1 number :545
Value of object 2 number :234
===========After Swapping=============
Value of object 1 number :234
Value of object 2 number :545

C:\CdacDiwaliOffer22\ClassObject>

*/
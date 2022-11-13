/* 9. Java Program to Implement the Passing and Returning Objects. */

import java.util.*;
class First
{
	int a;
	First(int a)
	{
		this.a=a;
	}
}

class Second
{
	int b;
	Second(int b)
	{
		this.b=b;
	}
}

class Addition
{
	int sum;
	Addition(First f,Second s)
	{
		sum=f.a+s.b;
	}
	void show()
	{
		System.out.println("Sum = "+sum);
	}
	
	
}
class DiwaliClass9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a = sc.nextInt();
		First f = new First(a);
		System.out.print("Enter Second Number = ");
		int b = sc.nextInt();
		Second s = new Second(b);
		Addition c = new Addition(f,s);
		c.show();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass9.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass9
Enter First Number = 4
Enter Second Number = 8
Sum = 12

C:\CdacDiwaliOffer22\ClassObject>

*/
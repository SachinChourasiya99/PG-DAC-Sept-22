/* 24. Java Program to Demonstrate Usage of a Static Variable in the Test Class. */

class Count
{
	static int count=0;
	Count()
	{
		count++;
		System.out.println("Object Created.");
	}
	
	static void count()
	{
		System.out.println("Total "+count+" Object Created.");
	}
}

public class DiwaliClass24
{
	public static void main(String[] args)
	{
		System.out.println("Here We use a static variable to count the total object created.");
		Count o1=new Count();
		Count o2=new Count();
		Count o3=new Count();
		Count.count();
		Count o4=new Count();
		Count o5=new Count();
		Count.count();
	}	
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass24.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass24
Here We use a static variable to count the total object created.
Object Created.
Object Created.
Object Created.
Total 3 Object Created.
Object Created.
Object Created.
Total 5 Object Created.

C:\CdacDiwaliOffer22\ClassObject>

*/
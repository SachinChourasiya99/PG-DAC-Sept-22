/* 4. Java Program to Illustrates Use of Static Inner Class. */

class Outer
{
	StatInner i;
	Outer()
	{
		System.out.println("This is Outer Constructor");
		i=new StatInner();
	}
	
	static class StatInner
	{
		StatInner()
		{
			System.out.println("This is Static Inner Constructor");
		}
		void StatInnerMethod()
		{
			System.out.println("This is Static Inner class method");
		}
		static void StaticInnerMethodofStatIn()
		{
			System.out.println("This is static method of Static Inner class method");
		}
	}
}

class DiwaliClass4
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.i.StatInnerMethod();
		o.i.StaticInnerMethodofStatIn();

	}
	
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass4.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass4
This is Outer Constructor
This is Static Inner Constructor
This is Static Inner class method
This is static method of Static Inner class method

C:\CdacDiwaliOffer22\ClassObject>

*/
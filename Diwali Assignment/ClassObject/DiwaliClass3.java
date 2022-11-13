/* 3. Java Program to Illustrates Use of Instance Inner Class. */

class Outer
{
	Inner i;
	Outer()
	{
		System.out.println("This is Outer Constructor");
		i=new Inner();
	}
	class Inner
	{
		Inner()
		{
			System.out.println("This is Inner Constructor");
		}
		void InnerMethod()
		{
			System.out.println("This is Inner class method");
		}
	}
}

class DiwaliClass3
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.i.InnerMethod();
	}
	
}

/* 
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass3.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass3
This is Outer Constructor
This is Inner Constructor
This is Inner class method

C:\CdacDiwaliOffer22\ClassObject>

*/

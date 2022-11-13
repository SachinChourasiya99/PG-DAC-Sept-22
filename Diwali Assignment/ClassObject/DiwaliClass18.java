/* 18. Java Program to Illustrates Use of Chaining Constructor. */

class One
{
	One()
	{
		System.out.println("Default Constructor of One class");
	}
	
	One(int a)
	{
		this();
		System.out.println("Parameterized Constructor of One class. a="+a);
	}
}

class Two extends One
{
	Two()
	{
		this(10,20);
		System.out.println("Default Constructor of Two class");
	}
	
	Two(int a,int b)
	{
		super(a);
		System.out.println("Parameterized Constructor of Two class. b="+b);
	}
}

class DiwaliClass18
{
	public static void main(String[] args)
	{
		Two t=new Two();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass18.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass18
Default Constructor of One class
Parameterized Constructor of One class. a=10
Parameterized Constructor of Two class. b=20
Default Constructor of Two class

C:\CdacDiwaliOffer22\ClassObject>

*/
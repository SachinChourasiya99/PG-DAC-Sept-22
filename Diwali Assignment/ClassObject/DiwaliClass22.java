/* 22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static 
Method. */

class DiwaliClass22
{
	static int a=1;
	int b=2;
	
	static void Staticget()
	{
		a++;
		System.out.println("a = "+a);	
	}
	
	void NonStatget()
	{
		b++;
		System.out.println("b = "+b);
		
	}
	public static void main(String[] args)
	{
		Staticget();
		DiwaliClass22 c = new DiwaliClass22();
		c.NonStatget();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass22.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass22
a = 2
b = 3

C:\CdacDiwaliOffer22\ClassObject>

*/
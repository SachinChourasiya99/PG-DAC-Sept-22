/* 23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class. */

class Test
{
	int a=100;
	static int b=100;
	Test()
	{
		b++;
	}
}

class DiwaliClass23
{
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(" Instance variable = "+t.a);
		System.out.println(" Static variable = "+t.b);
		
		Test t1=new Test();
		System.out.println(" Instance variable = "+t1.a);
		System.out.println(" Static variable = "+t1.b);
		
		Test t2=new Test();
		System.out.println(" Instance variable = "+t2.a);
		System.out.println(" Static variable = "+t2.b);
	}
	
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass23.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass23
 Instance variable = 100
 Static variable = 101
 Instance variable = 100
 Static variable = 102
 Instance variable = 100
 Static variable = 103

C:\CdacDiwaliOffer22\ClassObject>
 
*/

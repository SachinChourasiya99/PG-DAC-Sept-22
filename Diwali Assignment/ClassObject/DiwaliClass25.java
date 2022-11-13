/* 25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method. */

class CheckBlock
{
	static
	{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is non static block");
	}
	static
	{
		System.out.println("This is secod static block");
	}
	
	{
		System.out.println("This is second non static block");
	}

}

class DiwaliClass25
{
	public static void main(String[] args)
	{
		CheckBlock c = new CheckBlock();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass25.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass25
This is static block
This is secod static block
This is non static block
This is second non static block

C:\CdacDiwaliOffer22\ClassObject>

*/
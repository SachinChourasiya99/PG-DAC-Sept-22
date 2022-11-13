/* 1. Java Program to Illustrate Use of All Features of Abstract Class
2. Java Program to Illustrates Use of Abstract Class and Method.  */

abstract class Bank1
{    
	Bank1()
	{
		System.out.println("Welcome to Banking Sector");
	}
	abstract void display();
	double rate;
	abstract void setRate();
}    
class SBI extends Bank1
{   
	SBI()
	{
		System.out.println("This is SBI bank");
	}
	
	void setRate()
	{
		rate=7.5;
	}
	void display()
	{
		System.out.println("Rate of interest = "+rate);
	}
	
	
}    
	
class PNB extends Bank1
{    
	PNB()
	{
		System.out.println("This is PNB bank");
	}
	void setRate()
	{
		rate=9.5;
	}
	void display()
	{
		System.out.println("Rate of interest = "+rate);
	}
}    
		 
class DiwaliClass1_2
{    
	public static void main(String args[])
	{    
		Bank1 b = new SBI();  
		b.setRate();
		b.display();
		b = new PNB();  
		b.setRate();
		b.display();
	}
} 

/*
Output : 
C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass1_2.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass1_2
Welcome to Banking Sector
This is SBI bank
Rate of interest = 7.5
Welcome to Banking Sector
This is PNB bank
Rate of interest = 9.5

C:\CdacDiwaliOffer22\ClassObject>

*/
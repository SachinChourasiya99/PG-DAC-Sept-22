/* 21. Java Program to Allocate and Initialize Super Class Members using Constructor. */

class SuperClass
{
	int id;
	String name;
	SuperClass(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void prints()
	{
		System.out.println("ID     = "+id);	
		System.out.println("Name   = "+name);
	}
}

class BaseClass extends SuperClass
{
	int salary;
	BaseClass(int id,String name,int salary)
	{
		super(id,name);
		this.salary=salary;
	}
	void print()
	{
		prints();
		System.out.println("Salary = "+salary);
	}
}

class DiwaliClass21
{
	public static void main(String[] args)
	{
		BaseClass b=new BaseClass(1,"Sachin",70000);
		b.print();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass21.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass21
ID     = 1
Name   = Sachin
Salary = 70000

C:\CdacDiwaliOffer22\ClassObject>

*/
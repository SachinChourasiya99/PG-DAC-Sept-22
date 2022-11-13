/* 19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor. */

class Employee
{
	String name;
	int id;
	int salary;
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void print()
	{
		System.out.println("ID     = "+id);	
		System.out.println("Name   = "+name);
		System.out.println("Salary = "+salary);
	}
}

class DiwaliClass19
{
	public static void main(String[] args)
	{
		Employee e = new Employee(1,"Sachin",75000);
		e.print();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass19.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass19
ID     = 1
Name   = Sachin
Salary = 75000

C:\CdacDiwaliOffer22\ClassObject>

*/
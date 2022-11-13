/* 11. Java Program to Illustrate Use of Methods in a Class. */

import java.util.*;
public class DiwaliClass11
{
	int a,b;
	DiwaliClass11(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void Addition()
    {
        int c=a+b;
        System.out.println("Addition = "+c);
    }
    void Subtraction()
    {
        int c=a-b;
        System.out.println("Subtraction = "+c);
    }
    void Multiplication()
    {
        int c=a*b;
        System.out.println("Multiplication = "+c);
    }
    void Division()
    {
        int c=a/b;
        System.out.println("Division = "+c);
    }
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number = ");
		int a=sc.nextInt();
		System.out.print("Enter Second number = ");
		int b=sc.nextInt();
		DiwaliClass11 m=new DiwaliClass11(a,b);
        m.Addition();
        m.Subtraction();
        m.Multiplication();
        m.Division();
    }
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass11.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass11
Enter First number = 8
Enter Second number = 2
Addition = 10
Subtraction = 6
Multiplication = 16
Division = 4 

C:\CdacDiwaliOffer22\ClassObject>

*/

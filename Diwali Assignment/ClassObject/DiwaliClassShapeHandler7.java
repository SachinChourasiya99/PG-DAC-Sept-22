/* 7. Java Program to Implement Shape Interface using Circle and Rectangle Class. */

import java.util.*;

interface IShape
{
	
	Scanner sc=new Scanner(System.in);
	public void getData();
	public void calArea();
	public void showArea();
}

class Rectangle implements IShape
{
	double length,breadth,area;
	public void getData()
	{
		System.out.print(" Enter Length & Breadth :");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	public void calArea()
	{
		area=length*breadth;
	}
	
	public void showArea()
	{
		System.out.println(" Area of Rectangle = "+area);
	}
}

class Circle implements IShape
{
	double radius, area ;
	
	public void getData()
	{
		System.out.print(" Enter Radius :");
		radius=sc.nextDouble();
	}
	public void calArea()
	{
		area=3.14*radius*radius;
	}
	
	public void showArea()
	{
		System.out.println(" Area Circle = "+area);
	}
}

public class DiwaliClassShapeHandler7
{
	public static void main(String[] args)
	{
		
		Rectangle r=new Rectangle();
		r.getData();
		r.calArea();
		r.showArea();
		
		Circle c=new Circle();
		c.getData();
		c.calArea();
		c.showArea();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClassShapeHandler7.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClassShapeHandler7
 Enter Length & Breadth :5 22
 Area of Rectangle = 110.0
 Enter Radius :6
 Area Circle = 113.03999999999999

C:\CdacDiwaliOffer22\ClassObject>

*/
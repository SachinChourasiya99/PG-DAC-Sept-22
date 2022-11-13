/* 13. Java Program to Create a Method without Parameters and Return Type. */

class DiwaliClass13
{
	int a,b,sum;
	DiwaliClass13(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		DiwaliClass13 m = new DiwaliClass13(110,207);
		m.add();
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass13.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass13
110 + 207 = 317

C:\CdacDiwaliOffer22\ClassObject>

*/
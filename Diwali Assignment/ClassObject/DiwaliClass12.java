/* 12. Java Program to Create a Method without Parameters and with Return Type. */

class DiwaliClass12
{
	int a,b;
	DiwaliClass12(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		return a+b;
	}
	
	
	public static void main(String[] args)
	{
		DiwaliClass12 m = new DiwaliClass12(100,220);
		int sum = m.add();
		System.out.println(m.a+" + "+m.b+" = "+sum);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass12.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass12
100 + 220 = 320

C:\CdacDiwaliOffer22\ClassObject>

*/
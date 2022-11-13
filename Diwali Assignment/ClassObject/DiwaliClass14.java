/* 14. Java Program to Create a Method with 2 Parameters and without Return Type. */

class DiwaliClass14
{
	int a,b,sum;
	
	void add(int a,int b)
	{
		sum=a+b;
		System.out.println(a+" + "+b+" = "+sum);
	}
	
	
	public static void main(String[] args)
	{
		DiwaliClass14 m=new DiwaliClass14();
		m.add(102,260);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass14.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass14
102 + 260 = 362

C:\CdacDiwaliOffer22\ClassObject>

*/
/* 16. Java Program to Illustrate Use of Final Keyword.
17. Java Program to Illustrate Use of Constructor.  */

class FinalBank
{
	final String welcome="Welcome to Banking Sector";
	FinalBank()
	{
		System.out.println(welcome);
	}

}

class Banks extends FinalBank
{
	Banks(String bank)
	{
		System.out.println("This is "+bank+" bank");
	}
}

final class Branch extends Banks
{
	Branch(String bank,String br)
	{
		super(bank);
		System.out.println("This is "+br+" branch");
	}
}

public class DiwaliClass16_17
{
	public static void main(String[] args)
	{
		Branch b1=new Branch("SBI","Pune");
	}
}

/*
Output :

C:\CdacDiwaliOffer22\ClassObject>javac DiwaliClass16_17.java

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClass16_17
Welcome to Banking Sector
This is SBI bank
This is Pune branch 

C:\CdacDiwaliOffer22\ClassObject>

*/
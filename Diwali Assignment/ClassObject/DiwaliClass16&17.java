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

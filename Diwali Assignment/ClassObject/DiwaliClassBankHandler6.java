/* 6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it */

class Bank
{
    int p,r,n;
    Bank(int p,int r,int n)
	{
		this.p=p;
		this.r=r;
		this.n=n;
	}
	
    void interest()
	{
        Interest in=new Interest();
        in.display();
    }
    class Interest 
    {
        void display() 
        {
            int interest = (p*r*n)/100;
            System.out.println("Interest for "+p+" rs with "+r+"% rate for "+n+" years =: Rs. " +interest);
        }
    }
}
public class DiwaliClassBankHandler6 
{
    public static void main(String args[]) 
    {
        Bank b=new Bank(1000,5,4);
        b.interest();
    }
}

/* 
Output :

C:\CdacDiwaliOffer22\ClassObject>java DiwaliClassBankHandler6
Interest for 1000 rs with 5% rate for 4 years =: Rs. 200

C:\CdacDiwaliOffer22\ClassObject>

*/
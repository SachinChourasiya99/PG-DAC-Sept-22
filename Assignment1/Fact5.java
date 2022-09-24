import java.util.Scanner;

class Fact5{
 public static void main(String []args){
	 
  Scanner num=new Scanner(System.in);
  int c = num.nextInt();
  System.out.println("Enter a Number For Factorial : "+c);
	 
	for(int i=1;i<=c;i++)
	{
	  if(c%i==0)
	 System.out.println("Factorial of "+c+" is: "+i);
	 //System.out.println("-------------------");
	}
 }
}  
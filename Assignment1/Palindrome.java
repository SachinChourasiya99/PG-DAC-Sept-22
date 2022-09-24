import java.util.Scanner;

class Palindrome{
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number : ");
	 int a=sc.nextInt();
	 int b;
     int c=a;
    
	while(a>0){
		b=a%10;
		a=a/10;
		System.out.print(b);	
	} 
	if(c==b){
		System.out.println("Number is Palindrome : "+c);
	}
	else
		System.out.println("Number is not Palindrom");
 }	  
}
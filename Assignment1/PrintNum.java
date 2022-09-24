import java.util.Scanner;

class PrintRevNum{
 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number : ");
	 int a=sc.nextInt();
	 int b;
    
    
	while(a>0){r
		b=a%10;
		a=a/10;
		System.out.print(" "+b);
		
	}
   
 
 }	  
}
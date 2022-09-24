import java.util.Scanner;

class DigitSum{
 public static void main(String args[]){
	int c,sum=0;
    Scanner a= new Scanner(System.in);
	int b=a.nextInt();
	System.out.println("Enter a number is : "+b);
	
	while(b>0){
		c=b%10;
	    sum=sum+c;
        b=b/10;	
	}
	System.out.println("Enter a number is : "+sum);		
	
   
 }	  
} 
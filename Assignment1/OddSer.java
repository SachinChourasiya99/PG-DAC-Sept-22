import java.util.Scanner;

class OddSer{
 public static void main(String []args){
  int b;
  Scanner a= new Scanner(System.in);
  int num = a.nextInt();
  System.out.println("Enter Number : " +num);
  
  if(num%2==1){
    for(b=num;b<=100;b=b+2){
		System.out.println("Odd Series : "+b);
	}
  }
  else{
   System.out.println("Not Odd Number!");
  }
 }
}
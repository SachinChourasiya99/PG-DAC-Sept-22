import java.util.Scanner;

class EvenSer{
 public static void main(String []args){
  int b;
  Scanner a= new Scanner(System.in);
  int num = a.nextInt();
  System.out.println("Enter Number : " +num);
  
  if(num%2==0){
    for(b=num;b<=100;b=b+2){
		System.out.println("Even Series : "+b);
	}
  }
  else{
   System.out.println("Not Even Number!");
  }
 }
}
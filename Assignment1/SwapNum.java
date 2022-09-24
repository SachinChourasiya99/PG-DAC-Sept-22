import java.util.Scanner;

class SwapNum{
	
 public static void main(String []args){
  int num,num1;
  Scanner a=new Scanner(System.in);
  num=a.nextInt();
  System.out.println("Enter a 1st Number is : "+num);
  
  num1=a.nextInt(); 
  System.out.println("Enter a 2nd Number is : "+num1);
  
  num=num+num1;
  num1=num-num1;
  num=num-num1;

  System.out.println("After Swapping 1st Number is "+num+ " and 2nd Number is "+num1);
  	  
  }

}
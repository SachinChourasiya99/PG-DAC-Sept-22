import java.util.Scanner;

class Facto{
 public static void main(String []args){
  
  Scanner a=new Scanner(System.in);
  System.out.print("Enter a Number : ");
  int b=a.nextInt();
  
  for(int i=1;i<=b;i++){
   if(b%i==0){
    System.out.print(i+" ");
   }
  }
  
 
}
}
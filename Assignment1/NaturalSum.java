import java.util.Scanner;

class NaturalSum{
 public static void main(String []args){
   Scanner a= new Scanner(System.in);
   int b=a.nextInt();
   int c=0;
   System.out.println("Enter Number : "+b);
   int i=1;
   while(i<=b){
     c=c+i;
	 i++;
   }
   System.out.println("Sum : "+c);
 }
}
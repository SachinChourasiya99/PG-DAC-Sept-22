import java.util.Scanner;

class LeapYear{
 public static void main(String []args){
  Scanner s= new Scanner(System.in);
  int year= s.nextInt();
  System.out.println("Enter Year : "+year);
  if(year%400==0 || (year%100!=0 && year%4==0)){
    System.out.println(year+" is leap year !");
  }
  else{
    System.out.println(year+" is not leap year !");
  }
 }
}
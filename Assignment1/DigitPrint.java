import java.util.*;
//import java.io.*;
 
class DigitPrint{
 
    public static void main(String[] args)
    {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int b=a.nextInt();
        //int number = 110102;
        String c = Integer.toString(b);
 
        for (int i = 0; i < c.length(); i++) {
		
            System.out.println(c.charAt(i));
        }
    }
}
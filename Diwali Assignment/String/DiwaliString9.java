/* 9. How to convert numeric String to an int? */

import java.util.*;
class DiwaliString9
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String str =sc.nextLine();
		int i=Integer.parseInt(str);
		System.out.print("Srting to Integer = "+i);
		
    }
}

/*
Output :
C:\CdacDiwaliOffer22\String>java DiwaliString9
Enter String : 75476238
Srting to Integer = 75476238
C:\CdacDiwaliOffer22\String>

*/
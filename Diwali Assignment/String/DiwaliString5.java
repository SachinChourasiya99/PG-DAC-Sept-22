/* 5. How to check if a String contains only digits?  */

import java.util.*;

class DiwaliString5 
{
    public static boolean onlyDigits(String str,int n)
    {
        for(int i=0;i<n;i++) 
		{
            if(str.charAt(i)<'0' || str.charAt(i)>'9') 
			{
                return false;
            }
        }
        return true;
    }
	
	
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String str =sc.nextLine();
        int len = str.length();
        System.out.println("String contains only digit : "+onlyDigits(str,len));
    }
}

/*
Output :

C:\CdacDiwaliOffer22\String>java DiwaliString5
Enter String : Scahin237
String contains only digit : false

C:\CdacDiwaliOffer22\String>java DiwaliString5
Enter String : 747jay8752348
String contains only digit : false

C:\CdacDiwaliOffer22\String>java DiwaliString5
Enter String : 346
String contains only digit : true

C:\CdacDiwaliOffer22\String>

*/
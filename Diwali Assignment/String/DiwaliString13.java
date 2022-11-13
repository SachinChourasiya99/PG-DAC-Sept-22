/* 13. How to find all permutations of String? */

import java.util.*;
class DiwaliString13
{
	static void display(String str, String res)
	{
		if(str.length() == 0)
		{
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char r1 = str.charAt(i);
			String r2 = str.substring(0,i) + str.substring(i+1);
			display(r2,res+r1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();;
		display(s,"");
	}
}

/*
Output :

C:\CdacDiwaliOffer22\String>java DiwaliString13
Enter String : DAD
DAD
DDA
ADD
ADD
DDA
DAD

C:\CdacDiwaliOffer22\String>

*/

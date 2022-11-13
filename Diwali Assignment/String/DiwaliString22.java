/* 22. Write a program to find the longest palindrome in a string? */

import java.util.*;
public class DiwaliString22 
{
	static int longestPalSubstr(String str)
	{
		int n = str.length();
		if (n < 2)
			return n; 

		int maxLength = 1,start=0;
		int low, high;
		for (int i = 0; i < n; i++) 
		{
			low = i - 1;
			high = i + 1;
			while ( high < n && str.charAt(high) == str.charAt(i)) 								
				high++;
		
			while ( low >= 0 && str.charAt(low) == str.charAt(i)) 					
				low--;
		
			while (low >= 0 && high < n && str.charAt(low) == str.charAt(high))
			{
				low--;
				high++;
			}
			int length = high - low - 1;
			if (maxLength < length)
			{
				maxLength = length;
				start=low+1;
			}
		}	
		System.out.print("Longest palindrome substring is : ");
		System.out.println(str.substring(start, start + maxLength ));
		return maxLength;	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String str =sc.nextLine();
		System.out.println("Length is : "+longestPalSubstr(str));
	}
}

/*
Output :

C:\CdacDiwaliOffer22\String>java DiwaliString22
Enter String : Lal
Longest palindrome substring is : L
Length is : 1

C:\CdacDiwaliOffer22\String>java DiwaliString22
Enter String : LAL
Longest palindrome substring is : LAL
Length is : 3

C:\CdacDiwaliOffer22\String>

*/

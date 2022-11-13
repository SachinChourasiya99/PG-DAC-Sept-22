/* 3. How to check if two Strings are anagrams of each other? */

import java.util.*;

class DiwaliString3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second String: ");
		String str2 = sc.nextLine();
		
		if(str1.length()==str2.length()) 
		{
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);
			
			if(Arrays.equals(char1, char2))
			{
				System.out.println(str1 + " and " + str2 + " are anagram.");
			}
			else 
			{
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
		else 
		{
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\String>java DiwaliString3
Enter first String: seek
Enter second String: kees
seek and kees are anagram.

C:\CdacDiwaliOffer22\String>java DiwaliString3
Enter first String: seek
Enter second String: keep
seek and keep are not anagram.

C:\CdacDiwaliOffer22\String>

*/
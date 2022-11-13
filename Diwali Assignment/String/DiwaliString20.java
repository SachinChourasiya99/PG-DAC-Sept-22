/* 20. Write a program to remove a given character from String? */

import java.util.*;
class DiwaliString20
{
	static void removeChar(String s, char c)
	{
		int j, count = 0, n = s.length();
		char []t = s.toCharArray();
		for (int i = j = 0; i < n; i++)
		{
			if (t[i] != c)
			t[j++] = t[i];
			else
				count++;
		}
		while(count > 0)
		{
			t[j++] = '\0';
			count--;
		}
		System.out.println(t);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String st =sc.nextLine();
		System.out.print("Enter Character : ");
		char c=sc.nextLine().charAt(0);
		removeChar(st,c);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\String>javac DiwaliString20.java

C:\CdacDiwaliOffer22\String>java DiwaliString20
Enter String : Sachin Chourasiya
Enter Character : a
Schin Choursiy

C:\CdacDiwaliOffer22\String>

*/
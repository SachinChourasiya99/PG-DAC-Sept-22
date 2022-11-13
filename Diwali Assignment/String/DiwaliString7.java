/* 7. You need to write a program to print all duplicate character and their count in Java. For 
example, if given String is "Programming" then your program should print
g : 2
r : 2
m : 2  */

import java.util.*;
public class DiwaliString7 
{
	static final int NO_OF_CHARS = 256;

	static void fillCharCounts(String str, int[] count)
	{
		for (int i=0;i<str.length();i++)
			count[str.charAt(i)]++;
	}
	static void printDups(String str)
	{
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str, count);
		for (int i = 0; i < NO_OF_CHARS; i++)
			if (count[i] > 1)
				System.out.println((char)(i)+" -> count = " + count[i]);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String str =sc.nextLine();
		printDups(str);
	}
}

/*
Output :

C:\CdacDiwaliOffer22\String>java DiwaliString7
Enter String : Sachin Chourasiya
a -> count = 3
h -> count = 2
i -> count = 2

C:\CdacDiwaliOffer22\String>java DiwaliString7
Enter String : sachin chourasiya
a -> count = 3
c -> count = 2
h -> count = 2
i -> count = 2
s -> count = 2

C:\CdacDiwaliOffer22\String>

*/
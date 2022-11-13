/* 8. How to count the occurrence of a given character in String? */

import java.util.*;
class DiwaliString8
{
    public static int count(String s, char c)
    {
        int res = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == c)
				res++;
        }
        return res;
    }
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
        String str =sc.nextLine();
		System.out.print("Enter Character : ");
		char c=sc.nextLine().charAt(0);
        System.out.println(c+" occurs -> "+count(str, c)+" times.");
    }
}

/*
Output :

C:\CdacDiwaliOffer22\String>javac DiwaliString8.java

C:\CdacDiwaliOffer22\String>java DiwaliString8
Enter String : sachin chourasiya
Enter Character : c
c occurs -> 2 times.

C:\CdacDiwaliOffer22\String>java DiwaliString8
Enter String : sachin
Enter Character : b
b occurs -> 0 times.

C:\CdacDiwaliOffer22\String>

*/

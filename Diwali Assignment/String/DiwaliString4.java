/* 4. How to program to print the first non repeated character from String?  */

import java.util.*;

class DiwaliString4 
{
    static char count[] = new char[500];
	
    static void getCharCountArray(String str)
    {
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)]++;
    }
 
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index=-1;
 
        for (int i=0;i<str.length();i++) 
		{
            if (count[str.charAt(i)]==1) 
			{
                index=i;
                break;
            }
        }
        return index;
    }
	
	
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any String : ");
		String str=sc.nextLine();  
        int index=firstNonRepeating(str);
		
		if(index==-1)
			System.out.println("Either all characters are repeating or String is empty");
		System.out.println("First non-repeating character is "+str.charAt(index));
    }
}

/* 
Output :

C:\CdacDiwaliOffer22\String>javac DiwaliString4.java

C:\CdacDiwaliOffer22\String>java DiwaliString4
Enter Any String : sachin chourasiya
First non-repeating character is n

C:\CdacDiwaliOffer22\String>

*/
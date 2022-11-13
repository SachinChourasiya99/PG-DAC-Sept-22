/* 6. How to find duplicate characters in a String?  */

import java.util.*;

class DiwaliString6 
{  
	public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any String : ");
		String str1=sc.nextLine();  
		int count;  
		  
		char ch[] = str1.toCharArray();  
		  
		System.out.print("Duplicate characters in a given string : ");  
		for(int i=0;i<ch.length;i++) 
		{  
			count=1;  
			for(int j=i+1;j<ch.length;j++) 
			{  
				if(ch[i] == ch[j] && ch[i]!=' ') 
				{  
					count++;   
					ch[j]='0';  
				}  
			}  
			
			if(count > 1 && ch[i]!='0')
				System.out.print(ch[i]+"  ");
		}  
	}  
} 

/*
Output :

C:\CdacDiwaliOffer22\String>javac DiwaliString6.java

C:\CdacDiwaliOffer22\String>java DiwaliString6
Enter Any String : Sachin Chourasiya
Duplicate characters in a given string : a  h  i
C:\CdacDiwaliOffer22\String>

*/

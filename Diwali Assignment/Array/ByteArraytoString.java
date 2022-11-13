/* 11. How to convert a byte array to String? */

import java.util.*;
public class DiwaliArray11
{  
	public static void main(String args[])   
	{    
		System.out.print("Enter String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		byte[] bytes=str.getBytes();  
		System.out.println("Given String in Bytes = "+bytes);  
		String s=new String(bytes);     
		System.out.println("Given String in BytestoString = "+s);    	
	}  
}  

/*
Output :

C:\CdacDiwaliOffer22\Array>java ByteArraytoString
Enter String:Sachin
Given String in Bytes = [B@55f96302
Given String in BytestoString = Sachin

C:\CdacDiwaliOffer22\Array>java ByteArraytoString
Enter String:Jay
Given String in Bytes = [B@55f96302
Given String in BytestoString = Jay

C:\CdacDiwaliOffer22\Array>

*/
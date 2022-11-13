/* 9. Write a program which generates the series 1,4,27,16,125,36 */

import java.util.*;

class DiwaliArray9
{
	public static void main(String[] args)
	{
		System.out.print("Enter Number upto which you want to print series :");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			if(i%2==1)
				System.out.print((i*i*i)+"  ");
			else
				System.out.print((i*i)+"  ");
		}
	}
}

/*
Output :

C:\CdacDiwaliOffer22\Array>java DiwaliArray9
Enter Number upto which you want to print series :8
1  4  27  16  125  36  343  64
C:\CdacDiwaliOffer22\Array>

*/
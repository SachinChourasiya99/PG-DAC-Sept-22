/* Logical Coding Question 1 */

class Logical1
{
	public static void main(String[] args)
	{
		int i,j,k;
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
			
			for(k=1; k<=i; k++)
			{
				if(i==3 && j==2)
				{
					System.out.print(" ");
				}
				
				else if((i==4 && j==2) || (i==4 && j==3))
				{
					System.out.print(" ");
				}
				
				else
				{
					System.out.print("* ");
				}
				
				if(i==5)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
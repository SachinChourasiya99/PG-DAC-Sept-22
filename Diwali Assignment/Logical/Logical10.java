/* Logical Coding Question 10 */

class Logical10
{
	public static void main(String[] args)
	{	
			
		for(char i='A'; i<='F'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
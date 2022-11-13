/* Logical Coding Question 12 */

class Logical12
{
	public static void main(String[] args)
	{	
			
		for(char i='A'; i<='F'; i++)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
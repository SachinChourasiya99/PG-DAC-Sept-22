/* Logical Coding Question 22 */

class Logical22
{
	public static void main(String[] args)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7-i; j++)
			{
				System.out.print(1);
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
/* Logical Coding Question 23 */

class Logical23
{
	public static void main(String[] args)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(i%2==1)
				{
					if(j%2==1)
						System.out.print("1");
					else
						System.out.print("0");
				}
				else
				{
					if(j%2==1)
						System.out.print("0");
					else
						System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
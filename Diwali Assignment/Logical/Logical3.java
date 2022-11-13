/* Logical Coding Question 3 */

class Logical3
{
	public static void main(String[] args)
	{
		int i,j,z=1;
		
		for(i=1; i<=5; i++)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print(" "+z);
				z++;
			}
			System.out.println();
		}
	}
}
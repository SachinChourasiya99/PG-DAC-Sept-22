/* Logical Coding Question 4 */

class Logical4
{
   public static void main(String[] args)
   {
      int n;
      for(int i=0; i<5; i++)
      {
         for(int j=5; j>i; j--)
         {
            System.out.print(" ");
         }
         n=1;
         for(int k=0; k<=i; k++)
         {
            System.out.print(n+ " ");
            n = n*(i-k)/(k+1);
         }
         System.out.println();
      }
   }
}

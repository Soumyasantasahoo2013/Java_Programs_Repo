/*
 *              1
 *            a b
 *          2 3 4
 *        c d e f
 *      5 6 7 8 9    
 */

package Part_5_Pattern_Programs;

public class Program3 {

	public static void main(String[]args)
	{
		int n=5;
		int k=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					if(i%2==0)
					{
						System.out.print(k++);
					}
					else
					{
						System.out.print(ch++);
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

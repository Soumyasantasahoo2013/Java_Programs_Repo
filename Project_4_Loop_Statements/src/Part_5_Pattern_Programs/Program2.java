/*
 *     a b c d e
 *     a b c d
 *     a b c
 *     a b
 *     a
 */

package Part_5_Pattern_Programs;

public class Program2 {
	
	public static void main(String[]args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			char ch='a';
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					System.out.print(ch++ +" ");
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

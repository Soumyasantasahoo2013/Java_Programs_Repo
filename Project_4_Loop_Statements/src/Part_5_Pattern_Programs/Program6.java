/*
 *   1  a  2  b  3
 *   c  4  d  5  e
 *   6  f  7  g  8
 *   h  9  i  10 j
 *   11 k  12 l  13
 */

package Part_5_Pattern_Programs;

public class Program6 {
	
	public static void main(String[]args)
	{
		int n=5;
		int k=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(k++ +"  ");
				}
				else
				{
					System.out.print(ch++ +"  ");
				}
			}
			System.out.println();
		}
	}

}

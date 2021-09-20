/*
 *      1 a b c d
 *      1 2 a b c
 *      1 2 3 a b
 *      1 2 3 4 a
 */

package Part_5_Pattern_Programs;

public class Program5 {

	public static void main(String[]args)
	{
		int n=5;
		int m=4;
		for(int i=0;i<m;i++)
		{
			int k=1;
			char ch='a';
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(k++ +" ");
				}
				else if(i<j)
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}

}

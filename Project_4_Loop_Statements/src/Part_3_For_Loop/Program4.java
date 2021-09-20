/*
 * WAJP to print no.s upto n starting from 1
 * in the order of 1,2,3,....n+1,n
 */

package Part_3_For_Loop;

public class Program4 {
	
	public static void main(String[]args)
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i!=n)
			{
				System.out.print(",");
			}
		}
	}

}

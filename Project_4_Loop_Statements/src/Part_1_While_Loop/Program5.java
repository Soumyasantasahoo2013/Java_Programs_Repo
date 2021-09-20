/*
 * WAJP to generate & print all the no.s divisible by 
 * 6 & 7 between the range of m & n
 */

package Part_1_While_Loop;

public class Program5 {
	
	public static void main(String[]args)
	{
		int m=-7;
		int n=7;
		if(m<=n)
		{
			while(m<=n)
			{
				if(m%6==0 || m%7==0)
				{
					System.out.println(m);
				}
				m++;
			}
		}
		else
		{
			System.out.println("m should be less than or equals to n");
		}
	}

}

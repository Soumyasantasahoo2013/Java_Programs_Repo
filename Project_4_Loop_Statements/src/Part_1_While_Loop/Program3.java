//WAJP to generate & print no.s between 'm' & 'n'

package Part_1_While_Loop;

public class Program3 {
	
	public static void main(String[]args)
	{
		int m=5;
		int n=10;
		if(m<=n)
		{
			while(m<=n)
			{
				System.out.println(m++);
			}
		}
		else
		{
			System.out.println("m should be less than or equals to n");
		}
	}

}

//WAJP to print all the even no.s between m & n

package Part_1_While_Loop;

public class Program4 {
	
	public static void main(String[]args)
	{
		int m=5;
		int n=10;
		if(m<=n)
		{
			while(m<=n)
			{
				if(m%2==0)
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

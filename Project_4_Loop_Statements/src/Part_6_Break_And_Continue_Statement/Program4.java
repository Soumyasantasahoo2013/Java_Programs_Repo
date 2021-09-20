package Part_6_Break_And_Continue_Statement;

public class Program4 {
	
	public static void main(String[]args)
	{
		for(int i=0;i<=2;i++)
		{
			System.out.print("*");
			if(i==1)
			{
				continue;
			}
			System.out.println("*");
		}
	}

}

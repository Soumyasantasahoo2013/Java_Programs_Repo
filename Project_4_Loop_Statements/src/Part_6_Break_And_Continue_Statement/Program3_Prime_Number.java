package Part_6_Break_And_Continue_Statement;

public class Program3_Prime_Number {
	
	public static void main(String[]args)
	{
		boolean isPrime=true;
		int n=8;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(n+" is Prime Number");
		}
		else
		{
			System.out.println(n+" is not a Prime Number");
		}
	}

}

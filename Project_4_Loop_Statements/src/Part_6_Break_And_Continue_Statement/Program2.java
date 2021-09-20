/*
 * Break statement should be the last statement in a Block
 * If we use any Statement after Break statement then we 
 * will get Unreachable code Exception.
 */


package Part_6_Break_And_Continue_Statement;

public class Program2 {
	
	public static void main(String[] args) 
	{
		System.out.println("Main Begin !");
		for (int i = 0 ; i <= 2  ; i++  )
		{
			System.out.println( i ) ;
			break ; 
			System.out.println( i ); // CTE 
		}
		System.out.println("Main end!");
	}

}

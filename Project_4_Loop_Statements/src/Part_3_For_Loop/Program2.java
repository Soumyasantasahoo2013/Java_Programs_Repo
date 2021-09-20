/*
 * --> The initialization & update segments are optional
 * --> Condition is also optional. By default it is considered as true. Hence it becomes infinite loop
 */

package Part_3_For_Loop;

public class Program2 {
	
	public static void main(String[]args)
	{
		int i=0;
		for( ; ; )
		{
			System.out.println(i);
		}
	}
	
}

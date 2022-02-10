package Examples;
import java.util.*;

public class Example3 
{
	//declare variables
	private float a;
	private float b;
	
	public static void main(String[] args)
	{
		Example3 e = new Example3();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		e.a = sc.nextFloat();
		
		System.out.print("Enter your Second  number: ");
		e.b = sc.nextFloat();
		sc.close();
		
		float z = e.a + e.b;
		System.out.print("Total: " + z);

	}
}

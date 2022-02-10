package Examples;

public class Example2 
{
	//declare variables
	int a;
	int b;
	
	//declare function
	public void add()
	{
		System.out.print(a+b);
	}
	
	//main function
	public static void main(String args[])
	{
		Example2 z = new Example2(); //create instance of class called "z"
		//initialize variables a and b, in instance z, as 5 and 7
		z.a = 5;
		z.b = 7;
		
		Example2 w = new Example2(); //create instance of class called "w"
		//initialize variables a and b, in instance w, as 78 and 99
		w.a = 78;
		w.b = 99;
		
		System.out.print("The first sum = ");
		//call add function for z instance
		z.add();
		
		System.out.print("\nThe second sum = ");
		//call add function for w instance
		w.add();
	}

}

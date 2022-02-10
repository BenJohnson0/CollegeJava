package Geometry;

public class toTest 
{

	public static void main(String[] args) 
	{
		Circle c = new Circle(5);
		double cArea = c.area();
		System.out.println(cArea);
		
		Rectangle r = new Rectangle(5, 10);
		double rArea = r.area();
		System.out.println(rArea);

	}

}

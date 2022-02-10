package Geometry;
public class Circle extends Shape 
{
	public static final double pi = 3.141592; 	
	protected double radius;	
	
	public Circle(double radius) {
		
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area()
	   {  
			return pi*radius*radius;
		}

	
	
}
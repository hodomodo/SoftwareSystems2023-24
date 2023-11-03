package lab1;

public class Driver
{
	public static void main(String [] args)
	{
		
		Rectangle r1 = new Rectangle(4, 5);
		
		r1.setWidth(100);
		r1.setHeight(50);
		System.out.println("Number of Sides: " + r1.getSides());
		System.out.println("Height: " + r1.getHeight());
		System.out.println("Width: " + r1.getWidth());
		System.out.println("The area of this Rectangle is " + r1.getArea());
		
		System.out.println("");
		
		Circle c1 = new Circle(5);
		System.out.println("Number of Sides: " + c1.getSides());
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("The area of this Circle is " + c1.getArea());
			
		System.out.println("");
		
		Ellipse e1 = new Ellipse(4, 5);
		System.out.println("Number of Sides: " + e1.getSides());
		System.out.println("Width: " + e1.getWidth());
		System.out.println("Height: " + e1.getHeight());
		System.out.println("The area of this Ellipse is " + e1.getArea());
	
	}

	
}

package lab1;

public class Circle extends Shape
{
	private int radius;
	private int pi = 3;
	
	public Circle(int radius) 
	{
		super(0);
		this.radius = radius;
	}
	
	public int getArea()
	{
		return radius*radius*pi;
	}

	public int getRadius()
	{
		return radius;	
	}
	
    public void setRadius(int radius) {
        this.radius = radius;
    }
	
}

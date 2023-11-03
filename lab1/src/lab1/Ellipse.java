package lab1;

public class Ellipse extends Rectangle
{

	public Ellipse(int width, int height)
	{
		super((int) width, (int)height);
	}
	
	public int getArea()
	{
		return (int) (Math.PI*super.getWidth()*super.getHeight());
	}
	
	public int getSides()
	{
		return 0;
	}
    
}

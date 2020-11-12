package week5.lab5;

public class Circle extends Point
{
	public Circle()
	{ 	
		this(0,0,0);	
	}
	
	public Circle(int x, int y, int z) 
	{
		super(x,y);
		setRadius(z);
	}

	int radius = 0;

	public int getRadius() 
	{
		return radius;
	}

	public void setRadius(int radius) 
	{
		this.radius = radius;
	}

	public String toString()
	{
		return("Radius : "+getRadius());
	}

}

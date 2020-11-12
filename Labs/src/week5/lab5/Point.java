package week5.lab5;

public class Point 
{
	
	protected int x = 0;
	protected int y = 0;

	public Point(int i, int j) 
	{
		super();
		setX(x);
		setY(y);
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}

	public String toString()
	{
		return("X : "+ getX() +" || Y : " + getY() );
	}
}

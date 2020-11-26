package week7.lab8;

public class Triangle extends TwoDShape{
	
	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(String name, String colour, double base,  Double height) {
		super(name, colour);
		setBase(base);
		setHeight(height);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nBase = " + base + "\nHeight = ");
	}
	
	
	

}

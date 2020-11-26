package week7.lab8;

public class Cylinder extends ThreeDShape {
	
	private double radius;
	private double height;
	
	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
		setRadius(radius);
		setHeight(height);
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2)*height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return(super.toString() + "\nRadius = " + radius + "\nHeight = " + height);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * Math.PI*radius*height;
	}
	

}

package week3.lab2b;

public class Rectangle {
	
	//variables
	private float length;
	private float width;	
	
	//constructors 
	public Rectangle() {
	setLength(1.0f);
	setWidth(1.0f);
	}
	//getters and setters
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length>0.0 && length <=40.0) {
			this.length = length;
		}
		else {
			System.out.println("Length must be between 0.0 and 40.0");
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width){
		if(width>0.0 && width <=40.0){
		this.width = width;
		}
		else {
			System.out.println("Width must be between 0.0 amd 40.0");}
		}
	
	//toString
		@Override
		public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
		
 } //main
		
		//misc methods
			public float getArea(){
			return length * width;
	}
			public float getPerimeter() {
				return (length + width) * 2;
			
			}
			
			public void printRectangle() {
				String w = "*";
				
				for(int i=0;i<width-1;i++) {
					w+="*";
			}
				System.out.println(w);
				
				for(int j=0;j<length-2;j++){
				System.out.print("*");
				for(int x=0;x<width-2;x++){
					System.out.print("");			//can't get one side of rectangle over?
					}
					System.out.println("*");
				}
				System.out.println(w);
	}		
}				

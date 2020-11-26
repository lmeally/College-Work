package week6.lab7;

public class Cow extends Animal {

	public Cow(String type, int age, char gender) {
		super(type, age, gender);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("This cow is eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cow is sleeping");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Mooo");
	}

	@Override
	public String toString() {
		return "Cow: " + super.toString();
	}
	
	

}

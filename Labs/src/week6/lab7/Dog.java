package week6.lab7;

public class Dog extends Animal{

	public Dog(String type, int age, char gender) {
		super(type, age, gender);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animal is eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Animal is sleeping");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof woof");
	}

	@Override
	public String toString() {
		return "Dog: " + super.toString();
	}
	
	
	
	

}

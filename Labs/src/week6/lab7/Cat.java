package week6.lab7;

public class Cat extends Animal{
	
	public Cat(String type, int age, char gender) {
		super(type, age, gender);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("This cat is eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("This cat is sleeping");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cat: " + super.toString();
	}
	
	
	
}

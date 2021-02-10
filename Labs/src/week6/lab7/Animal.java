package week6.lab7;

public class Animal {
	//variables
	private String type;
	private int age;
	private char gender;
	
	//constructors
	public Animal(String type, int age, char gender) {
		setType(type);
		setAge(age);
		setGender(gender);
	}
	
	//getters & setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	public void makeSound() {
		System.out.println("A generic animal sound");
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
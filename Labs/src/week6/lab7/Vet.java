package week6.lab7;

public class Vet {

	private String name;

	public Vet(String name) {
		setName(name);
}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void vaccinate(Animal a) {
		System.out.println("The dog");
		System.out.println("The dog has been vaccinated " + a.toString());
		
		if(a instanceof Dog) {
			System.out.println("The dog");
			System.out.println("The dog has been vaccinated " + a.toString());
		}
		else if(a instanceof Cat) {
			System.out.println("The cat");
			System.out.println("The cat has been vaccinated " + a.toString());
		}

	}
	
	public void vacinnateMe(Animal[]animal) {
		for(Animal a: animal) {
			System.out.println(this.name + " is vaccinating the ");
			System.out.println(a.getClass().getName());
			System.out.println("The " + a.getClass().getName() + "has been vaccinated" + a.toString());
		}
	}
	
}

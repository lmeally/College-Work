package week5.lab4;

public class Address {
	//test
	//variables
	private String street;
	private String city_town;
	private String county;
	
	
	//constructors
	public Address(String street, String city_town, String county) {
		super();
		setStreet(street);
		setCity_town(city_town);setCounty(county);
	}
	//getters & setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity_town() {
		return city_town;
	}
	public void setCity_town(String city_town) {
		this.city_town = city_town;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	//toString
	@Override
	public String toString() {
		return "Address [street=" + getStreet() + street + ", city_town=" + getCity_town() + city_town + ", county=" + getCounty() + county + "]";
	}
	
	//End class

}

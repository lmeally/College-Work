package week4.CA1RevisionAttempt;

public class Item {
	
	//variables
	private int ItemID;
	private static int nextItemID=0;
	private String name; 
	private String type;
	private String date;
	private char status;
	private double price;
	private static int noOfsalesItems=0;
	
	//constructors 
	public Item(String name, String type, String date, double price) {
		++nextItemID;
		setItemID(nextItemID);
		setName(name);
		setType(type);
		setDate(date);
		setPrice(price);
		setStatus('A');
		noOfsalesItems++;
	}
	//getters & setters 
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static int getNoOfsalesItems() {
		return noOfsalesItems;
	}
	
	
	//misc methods
	
	public void statusUpdate(){
		setStatus('S');
	}
	//to string
	@Override
	public String toString() {
		return "Item [ItemID=" + ItemID + ", name=" + name + ", type=" + type + ", date=" + date + ", status=" + status
				+ ", price=" + price + "]";
	}
	
	
	
	

}

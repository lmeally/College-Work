package week8.lab9;

public class LibaryPOS {

	public static void main(String[] args) {
		
		Book b = new Book("Pearson", "Java Programming", 200);
		
		CD c = new CD("Faithless", "faithless 2.0", 12);
		
		LibaryItem[] items = new LibaryItem[2];
		
		items[0] = b;
		items[1] = c;
		
		for(LibaryItem i: items)System.out.println(i);
		
		double totalLoanPrice =0;
		
		for(LibaryItem x: items)totalLoanPrice+=x.calculatePrice();
		System.out.println("Total Price : " + totalLoanPrice);
		
		

	}

}

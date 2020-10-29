package week4.CA1RevisionAttempt;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		item[] items = new Item[3];
		
		for(int x=0;<=2;x++){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter name");
		String name = in.nextLine();
		
		System.out.println("Please enter type");
		String type = in nextLine();
		
		System.out.println("Please enter date");
		String date = in.nextLine();
		
		System.out.println("Please enter price");
		double price = in.nextDouble();
		
		Item i = new Item(name,type,date,price);
		
		if(x==1)i.statusUpdate();
		
		items[x]=i;
		
		System.out.println("No. of items created: " + Item.getNoOfsalesItems());
		
		
		
		
		
		
		}

		
	}
  }

package hust.soict.dsai.aims.cart;
//import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
//import hust.soict.dsai.aims.media.Track;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Cart {

	public static ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public void addMedia(Media item) {
		itemsOrdered.add(item);
		System.out.println("Item has been added to cart!");
	}
	
	public void removeMedia(Media item) {
		int L = itemsOrdered.size();
		int pos = 0;
		for (int i = 0; i < L; i++) {
			if (itemsOrdered.get(i) == item) {
				pos = i;
				break;
			}
		}
		itemsOrdered.remove(pos);
	}
	
	
	public float totalCost() {
		float cost = 0;
		for (Media ptr : itemsOrdered) {
			cost = cost + ptr.getCost();
		}
		return cost;
	}
	
	public void invoice() {
		int length = 0;
		for (Media ptr : itemsOrdered) {
			if (ptr != null) length++;
		}
		float total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items");
		
		for (int i = 0; i < length; i++) {
			System.out.println((i+1) + " - " + itemsOrdered.get(i).getTitle() 
									 + " - " + itemsOrdered.get(i).getCategory() +
									 //+ " - " + itemsOrdered.get(i).getDirector() 
									 //+ " - " + itemsOrdered.get(i).getLength() + 
									 " - " + itemsOrdered.get(i).getCost() +"$");
			total = total + itemsOrdered.get(i).getCost();
		}
		System.out.println("Total cost: " + total +"$");
		System.out.println("***************************************************");
		
	}

	public ObservableList<Media> getItemsOrdered() {
		// TODO Auto-generated method stub
		ObservableList<Media> items = itemsOrdered;
		return items;
	}
}

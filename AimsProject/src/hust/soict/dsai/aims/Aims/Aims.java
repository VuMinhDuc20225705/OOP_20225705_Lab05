package hust.soict.dsai.aims.Aims;

import java.util.Scanner;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Harry Potter", "Fantasy", 11.95f);
		book1.addAuthor("J.K. Rowling");
		
		Book book2 = new Book("The Hunger Games", "Fantasy", 13.95f);
		book2.addAuthor("Suzanne Collins");
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star Wars", "Sci-fi", "George Lucas", 140, 9.45f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animation", "Rob Minkoff", 88, 12.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Toy Story", "Animation", "John Lassetter", 81, 6.49f);
		
		CompactDisc cd1 = new CompactDisc("Suyt 1", "Ngot", 4.95f);
		Track track1 = new Track("01 Chuyen Do Dang", 212);
		cd1.addTrack(track1);
		Track track2 = new Track("02 Mo Lam Ma", 178);
		cd1.addTrack(track2);
		Track track3 = new Track("03 Hay La", 203);
		cd1.addTrack(track3);
		Track track4 = new Track("04 Thap Huong 05 Hoa Vang", 229);
		cd1.addTrack(track4);
		
		// Open new instance of store
		Store store = new Store();
		store.addMedia(book1);
		store.addMedia(book2);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.addMedia(cd1);
		
		//Cart cart = new Cart();
		//cart.addMedia(dvd1);
		//cart.addMedia(cd1);
		//cart.addMedia(book1);
		
		new StoreScreen(store);
	}
	
	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
}

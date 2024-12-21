package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsinStore = 
			new ArrayList<Media>();
	
	
	public ArrayList<Media> getItemsInStore() {
		@SuppressWarnings("unchecked")
		ArrayList<Media> items = (ArrayList<Media>) itemsinStore.clone();
		return items;
	}
	
	public void addMedia(Media media) {
		itemsinStore.add(media);
	}
	
	public void removeMedia(Media media) {
		for (Media ptr : itemsinStore) {
			int i = 0;
			if (ptr.getTitle() == media.getTitle()) itemsinStore.remove(i);
			else i++;
		}
	}
}

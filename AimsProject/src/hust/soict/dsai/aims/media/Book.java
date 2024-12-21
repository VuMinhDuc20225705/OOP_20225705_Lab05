package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>(); 
	
	

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String author) {
		this.authors.add(author);
	}
	
	public Book(String title) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
	}

	public Book(String title, String category, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public Book(String title, String category, ArrayList<String> authors, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setCategory(category);
		this.setAuthors(authors);
		this.setCost(cost);
	}
}

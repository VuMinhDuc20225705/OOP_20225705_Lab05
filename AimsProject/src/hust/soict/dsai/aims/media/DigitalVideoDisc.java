package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	
	
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public DigitalVideoDisc(String title) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}

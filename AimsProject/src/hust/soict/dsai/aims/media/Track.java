package hust.soict.dsai.aims.media;

public class Track {
	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		// TODO Auto-generated constructor stub
		this.setTitle(title);
		this.setLength(length);
	}
	
	public Track(String title) {
		// TODO Auto-generated constructor stub
		this.setTitle(title);
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}

}

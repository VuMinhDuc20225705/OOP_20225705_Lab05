package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public CompactDisc(String title, String category, String artist, ArrayList<Track> tracks, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setCategory(category);
		this.setArtist(artist);
		this.setCost(cost);
		int length = 0;
		for (Track ptr : tracks) {
			length =+ ptr.getLength();
		}
		this.setLength(length);
	}
	
	public CompactDisc(String title, String artist, float cost) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
		this.setArtist(artist);
		this.setCost(cost);
	}
	
	public CompactDisc(String title) {
		// TODO Auto-generated constructor stub
		this.setId(getId() + 1);
		this.setTitle(title);
	}
	
	public void addTrack(Track track) {
		this.getTracks().add(track);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing CD: " + this.getTitle());
		for (Track ptr : this.getTracks()) {
			System.out.println("Playing track: " + ptr.getTitle());
			System.out.println("Track length: " + ptr.getLength());
		}
	}

}

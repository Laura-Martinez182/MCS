package model;
public class Song {
	private String artist;
	private String title;
	private String date;
	private int duration;
	private Genre genre;
	
	public Song (String artist, String title, String date, int duration, Genre genre) {
		this.artist = artist;
		this.title = title;
		this.date = date; 
		this.duration = duration;
		this.genre = genre;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist (String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle (String title) {
		this.title = title;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public void setDuration (int duration) {
		this.duration = duration;
	}
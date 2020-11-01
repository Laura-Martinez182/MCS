package model;
public class Publicpl extends Playlist {
	private Calification calification;
	private int limit;
	
	public Publicpl (String name, int duration, Genre playlistGenre, Calification calification) {
		super(name,duration,playlistGenre);
		this.calification = calification;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit (int limit2) {
		limit = limit + limit2;
	}
		
	
}


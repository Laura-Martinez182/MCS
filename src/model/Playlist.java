package model;
public class Playlist {
	private String playlistName;
	private int duration;
	private Genre playlistGenre;
	
	public Playlist (String playlistName, int duration, Genre playlistGenre) {
		this.playlistName = playlistName;
		this.duration = duration;
		this.playlistGenre = playlistGenre;
	}


	public String getPlaylistName() {
			return playlistName;
		}
		
		public void setPlaylistName (String playlistName) {
			this.playlistName = playlistName;
		}
		
	
	public int getDuration() {
			return duration;
		}
		
		public void setDuration (int duration) {
			this.duration = duration;
		}
		
	public Genre getPlaylistGenre() {
			return playlistGenre;
		}
		
		public void setPlaylistGenre (Genre playlistGenre) {
			this.playlistGenre = playlistGenre;
		}
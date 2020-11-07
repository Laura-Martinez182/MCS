package model;
public class Playlist {
	private String playlistName;
	private int duration;
	private String playlistGenre;
	protected final static int SIZE_PLAYLIST = 20;
    protected Playlist[] playL;

	
	public Playlist (String playlistName, int duration, String playlistGenre) {
		this.playlistName = playlistName;
		this.duration = duration;
		this.playlistGenre = playlistGenre;
		playL = new Playlist[SIZE_PLAYLIST];
	}

		/**
		*This method saves the name of the playlist.
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The name of the playlist have been saved.
		*/

	public String getPlaylistName() {
			return playlistName;
		}
		
		/**
		*This method change the name of the playlist
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The new name of the playlist have been saved.
		*@param playlistName it is the name of the playlist created. playlistName != null
		*/
		public void setPlaylistName (String playlistName) {
			this.playlistName = playlistName;
		}
		
	/**
		*This method saves the duration of the playlist according to the songs added.
		*<b>pre: </b> The user has to enter the duration of each song added.
		*<b>post: </b> The duration of the playlist have been uptaded.
		*/
	public int getDuration() {
			return duration;
		}
		
		public void setDuration (int duration) {
			this.duration = duration;
		}
		/**
		*This method saves the variety of genres of the songs of a playlist 
		*<b>pre: </b> The user has to enter the genres of each song added.
		*<b>post: </b> The genre of the playlist have been uptaded.
		*/
	public String getPlaylistGenre() {
			return playlistGenre;
		}
		
	public void setPlaylistGenre (String playlistGenre) {
			this.playlistGenre = playlistGenre;
		}
		
	/**
		*This method shows the data of each playlist.
		*<b>pre: </b> The user has to enter the title of the playlist, the duration of each song added and the genre of each song added. 
		*<b>post: </b> The data will be shown.
		*/
	 public String showPlayList() {
        String contents = "";

        contents = "-------------------PlayList-----------------------\n";
        contents += "Titulo : " + getPlaylistName() + "\n";
        contents += "Duracion: " + getDuration() + "\n";
        contents += "Genero: " + getPlaylistGenre() + "\n";

        for (int i = 0; i < SIZE_PLAYLIST; i++) {
            if (playL[i] != null) {
                contents += playL[i].showPlayList();
            }

        }
        return contents;
    }
}
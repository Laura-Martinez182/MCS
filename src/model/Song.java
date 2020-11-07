package model;
public class Song {
	public final static int SIZE_SONG = 30;
	private String title;
	private String artist;
	private String date;
	private int duration;
	private Genre genre;
	private String gen;
    public Song[] addSong;


	
	public Song (String title, String artist, String date, int duration, String gen) {
		this.title = title;		
		this.artist = artist;
		this.date = date; 
		this.duration = duration;
		this.genre = genre;
		genre = Genre.UNKNOWN;
        addSong = new Song[SIZE_SONG];
    }
		/**
		*This method saves the title of the songs
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The title have been saved.
		*/
	public String getTitle() {
		return title;
	}
	
	/**
		*This method change the title of the songs
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The new title have been saved.
		*@param title it is the name of the song. title != null
		*/
	public void setTitle (String title) {
		this.title = title;
	}
	/**
		*This method saves the artist of the songs
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The artist have been saved.
		*/
	public String getArtist() {
		return artist;
	}
	/**
		*This method change the artist of the songs
		*<b>pre: </b> The user has to enter a string.
		*<b>post: </b> The new artist have been saved.
		*@param artist it is the artist of the song. artist != null
		*/
	public void setArtist (String artist) {
		this.artist = artist;
	}
	/**
		*This method saves the duration of the songs
		*<b>pre: </b> The user has to enter an int.
		*<b>post: </b> The duration have been saved.
		*/
	public int getDuration(){
		return duration;
	}
	/**
		*This method change the duration of the songs
		*<b>pre: </b> The user has to enter an int.
		*<b>post: </b> The new duration have been saved.
		*@param duration it is the duration of the song. duration > 0
		*/
	public void setDuration (int duration) {
		this.duration = duration;
	}
	
	/**
		*This method saves the date of release of the songs
		*<b>pre: </b> The user has to enter an string.
		*<b>post: </b> The date have been saved.
		*/
	public String getDate() {
		return date;
	}
	/**
		*This method change the date of release of the songs
		*<b>pre: </b> The user has to enter an string
		*<b>post: </b> The new date have been saved.
		*@param date it is the date of release of the song. date != null
		*/
	public void setDate (String date) {
		this.date = date;
	}
	/**
		*This method saves the genre of the songs
		*<b>pre: </b> The user has to enter an string.
		*<b>post: </b> The genre have been saved.
		*/
    public String getGen() {
        return gen;
    }
	/**
		*This method change the genre of the songs
		*<b>pre: </b> The user has to enter an string
		*<b>post: </b> The new genre have been saved.
		*@param genre it is the genre of the song. genre != null
		*/

    public void setGen(String gen) {
        this.gen = gen;
    }
	
	/**
		*This method shows the data of each song.
		*<b>pre: </b> The user has to enter the title, the artist, the date of release, the duration and the genre
		*<b>post: </b> The data will be shown.
		*/
	
	public String showSong() {
        String contents = "";
        contents = "-------------------Song-----------------------\n";
        contents += "Titulo : " + getTitle() + "\n";
        contents += "Artista: " + getArtist() + "\n";
		contents += "Fecha: " + getDate() + "\n";
        contents += "Duracion: " + getDuration() + "\n";
        contents += "Genenro: " + getGen() + "\n";

        for (int i = 0; i < SIZE_SONG; i++) {
            if (addSong[i] != null) {
                contents += addSong[i].showSong();
            }

        }
        return contents;
    }       
}



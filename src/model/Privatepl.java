package model;
public class Privatepl extends Playlist {
	
	public Privatepl (String playlistName, int duration, String playlistGenre) {
		super(playlistName,duration,playlistGenre);
	}
		/**
		*This method shows the data of the playlist.
		*<b>pre: </b> The user has to enter the title of the playlist, the duration of each song added and the genre of each song added. 
		*<b>post: </b> The data will be shown.
		*/
	public String showPlayList() {
        String contents = "";
        contents = "-------------------Playlist-----------------------\n";
        contents += "Titulo : " + getPlaylistName() + "\n";
        contents += "Duracion: " + getDuration() + "\n";
        contents += "Genero: " + getPlaylistGenre() + "\n";

        for (int i = 0; i < SIZE_PLAYLIST; i++) {
            if (playL[i] != null) {
                contents += playL[i];
            }

        }
        return contents;
    }

}
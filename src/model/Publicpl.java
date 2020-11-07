package model;
public class Publicpl extends Playlist {
	private float calification =0;
	private String state;

	//Constructor
	public Publicpl (String playlistName, int duration, String playlistGenre, String userName, int calification) {
		super(playlistName,duration,playlistGenre);
		this.calification = calification;
	}
	

	public void calcProm(float n1, float n2, float n3) {
       calification = (n1 + n2 + n3) / 3;
    }
	/**
		*This method saves the calification 
		*<b>pre: </b> The user has to enter a number between 1 and 5 according to their opinion.
		*<b>post: </b> The option choosen will be saved and it will save the calification
		*/
    public void calificationState(float prom) {
	
		String state = "";
        if (calification == 0) {
            state = ("Calificacion en terrible");
        } else if (calification == 1) {
           state = ("Calificaion en Mal");
        } else if (calification == 3) {
            state = ("Calificaion en Neutral");
        } else if (calification == 4) {
            state = ("Calificaion en Bueno");
        } else if (calification == 5) {
           state = ("Calificaion en Excelente");
        }
    }
		/**
		*This method shows the calification 
		*<b>pre: </b> The user has to enter a number between 1 and 5 according to their opinion.
		*<b>post: </b> The option choosen will be saved and it will save the calification
		*/
    public void showProm() {
           System.out.println("Su promedio es "+calification);
           System.out.println(state);
    }

}



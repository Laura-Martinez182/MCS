package model;
public class Restrictedpl extends Playlist {
	User u;
	
	public Restrictedpl (String playlistName, int duration, String playlistGenre) {
		super(playlistName,duration,playlistGenre);
	}
	

    public void showUser() {
        for (User usuario : u.userZ) {
            System.out.println("Nombre:" + usuario.getUserName()
                    + "\nContraseña:" + usuario.getPassword()
                    + "\nAge:" + usuario.getAge()
                    + "\nCategory:" + usuario.getUserCategory());
        }

    }
}